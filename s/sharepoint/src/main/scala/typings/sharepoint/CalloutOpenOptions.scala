package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutOpenOptions extends js.Object {
  
  /** Callout will be closed on blur */
  var closeCalloutOnBlur: Boolean = js.native
  
  /** HTML event name, e.g. "click" */
  var event: String = js.native
  
  /** Close button will be shown within the callout window */
  var showCloseButton: Boolean = js.native
}
object CalloutOpenOptions {
  
  @scala.inline
  def apply(closeCalloutOnBlur: Boolean, event: String, showCloseButton: Boolean): CalloutOpenOptions = {
    val __obj = js.Dynamic.literal(closeCalloutOnBlur = closeCalloutOnBlur.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], showCloseButton = showCloseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOpenOptions]
  }
  
  @scala.inline
  implicit class CalloutOpenOptionsOps[Self <: CalloutOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseCalloutOnBlur(value: Boolean): Self = this.set("closeCalloutOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
  }
}
