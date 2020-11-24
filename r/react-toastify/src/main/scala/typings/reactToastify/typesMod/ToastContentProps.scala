package typings.reactToastify.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastContentProps extends js.Object {
  
  var closeToast: js.UndefOr[js.Function0[Unit]] = js.native
}
object ToastContentProps {
  
  @scala.inline
  def apply(): ToastContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastContentProps]
  }
  
  @scala.inline
  implicit class ToastContentPropsOps[Self <: ToastContentProps] (val x: Self) extends AnyVal {
    
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
    def setCloseToast(value: () => Unit): Self = this.set("closeToast", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCloseToast: Self = this.set("closeToast", js.undefined)
  }
}
