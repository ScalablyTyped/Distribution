package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelayResolverError extends StObject {
  
  var error: js.Error
  
  var field: FieldLocation
}
object RelayResolverError {
  
  inline def apply(error: js.Error, field: FieldLocation): RelayResolverError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelayResolverError]
  }
  
  extension [Self <: RelayResolverError](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldLocation): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
