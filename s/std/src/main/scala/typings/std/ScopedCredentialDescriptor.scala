package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedCredentialDescriptor extends StObject {
  
  var id: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null
  
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  
  var `type`: ScopedCredentialType
}
object ScopedCredentialDescriptor {
  
  inline def apply(`type`: ScopedCredentialType): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
  
  extension [Self <: ScopedCredentialDescriptor](x: Self) {
    
    inline def setId(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    inline def setType(value: ScopedCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
