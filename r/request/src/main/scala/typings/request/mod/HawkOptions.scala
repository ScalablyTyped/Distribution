package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HawkOptions extends StObject {
  
  var credentials: Any
}
object HawkOptions {
  
  inline def apply(credentials: Any): HawkOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HawkOptions]
  }
  
  extension [Self <: HawkOptions](x: Self) {
    
    inline def setCredentials(value: Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}
