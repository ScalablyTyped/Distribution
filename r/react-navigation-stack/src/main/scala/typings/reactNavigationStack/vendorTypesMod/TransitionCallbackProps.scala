package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionCallbackProps extends js.Object {
  
  var closing: Boolean = js.native
}
object TransitionCallbackProps {
  
  @scala.inline
  def apply(closing: Boolean): TransitionCallbackProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionCallbackProps]
  }
  
  @scala.inline
  implicit class TransitionCallbackPropsOps[Self <: TransitionCallbackProps] (val x: Self) extends AnyVal {
    
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
    def setClosing(value: Boolean): Self = this.set("closing", value.asInstanceOf[js.Any])
  }
}
