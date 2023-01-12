package typings.relayRuntime.libStoreRelayStoreTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelayResolverError] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldLocation): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
