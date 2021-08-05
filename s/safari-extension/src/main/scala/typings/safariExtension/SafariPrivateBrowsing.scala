package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafariPrivateBrowsing extends StObject {
  
  var enabled: Boolean
}
object SafariPrivateBrowsing {
  
  inline def apply(enabled: Boolean): SafariPrivateBrowsing = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafariPrivateBrowsing]
  }
  
  extension [Self <: SafariPrivateBrowsing](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
