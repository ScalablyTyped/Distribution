package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutOpenOptions extends StObject {
  
  /** Callout will be closed on blur */
  var closeCalloutOnBlur: Boolean
  
  /** HTML event name, e.g. "click" */
  var event: String
  
  /** Close button will be shown within the callout window */
  var showCloseButton: Boolean
}
object CalloutOpenOptions {
  
  inline def apply(closeCalloutOnBlur: Boolean, event: String, showCloseButton: Boolean): CalloutOpenOptions = {
    val __obj = js.Dynamic.literal(closeCalloutOnBlur = closeCalloutOnBlur.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], showCloseButton = showCloseButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOpenOptions]
  }
  
  extension [Self <: CalloutOpenOptions](x: Self) {
    
    inline def setCloseCalloutOnBlur(value: Boolean): Self = StObject.set(x, "closeCalloutOnBlur", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
  }
}
