package typings.reactJss.anon

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerRef extends js.Object {
  
  var innerRef: js.UndefOr[RefObject[_] | (js.Function1[/* instance */ js.Any, Unit])] = js.native
}
object InnerRef {
  
  @scala.inline
  def apply(): InnerRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InnerRef]
  }
  
  @scala.inline
  implicit class InnerRefOps[Self <: InnerRef] (val x: Self) extends AnyVal {
    
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
    def setInnerRefFunction1(value: /* instance */ js.Any => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: RefObject[_] | (js.Function1[/* instance */ js.Any, Unit])): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
  }
}
