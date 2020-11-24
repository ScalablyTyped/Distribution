package typings.reactAsync.mod

import typings.react.mod.ReactNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectedProps[T] extends js.Object {
  
  var children: js.UndefOr[RejectedChildren[T]] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
}
object RejectedProps {
  
  @scala.inline
  def apply[T](): RejectedProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectedProps[T]]
  }
  
  @scala.inline
  implicit class RejectedPropsOps[Self <: RejectedProps[_], T] (val x: Self with RejectedProps[T]) extends AnyVal {
    
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
    def setChildrenFunction2(value: (/* error */ Error, /* state */ AsyncRejected[T, AbstractState[T]]) => ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildren(value: RejectedChildren[T]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
  }
}
