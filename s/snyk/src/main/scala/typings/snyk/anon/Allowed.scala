package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowed extends StObject {
  
  var allowed: Boolean
  
  var reason: String
}
object Allowed {
  
  inline def apply(allowed: Boolean, reason: String): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
  
  extension [Self <: Allowed](x: Self) {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
