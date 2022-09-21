package typings.reactNativeCommunityCliDoctor.anon

import typings.ora.mod.Ora
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var command: String
  
  var error: js.Error
  
  var healthcheck: String
  
  var loader: js.UndefOr[Ora] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Error {
  
  inline def apply(command: String, error: js.Error, healthcheck: String): Error = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], healthcheck = healthcheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHealthcheck(value: String): Self = StObject.set(x, "healthcheck", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Ora): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
