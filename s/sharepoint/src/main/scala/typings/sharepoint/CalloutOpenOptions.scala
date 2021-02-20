package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutOpenOptions extends StObject {
  
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
  implicit class CalloutOpenOptionsMutableBuilder[Self <: CalloutOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseCalloutOnBlur(value: Boolean): Self = StObject.set(x, "closeCalloutOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
  }
}
