package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariExtensionGlobalPage extends StObject {
  
  var contentWindow: Window
}
object SafariExtensionGlobalPage {
  
  inline def apply(contentWindow: Window): SafariExtensionGlobalPage = {
    val __obj = js.Dynamic.literal(contentWindow = contentWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariExtensionGlobalPage]
  }
  
  extension [Self <: SafariExtensionGlobalPage](x: Self) {
    
    inline def setContentWindow(value: Window): Self = StObject.set(x, "contentWindow", value.asInstanceOf[js.Any])
  }
}
