package typings.reactAsync.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncProps[T] extends AsyncOptions[T] {
  
  var children: js.UndefOr[AsyncChildren[T]] = js.native
}
object AsyncProps {
  
  @scala.inline
  def apply[T](): AsyncProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncProps[T]]
  }
  
  @scala.inline
  implicit class AsyncPropsOps[Self <: AsyncProps[_], T] (val x: Self with AsyncProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenFunction1(value: /* state */ AsyncState[T, AbstractState[T]] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: AsyncChildren[T]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
}
