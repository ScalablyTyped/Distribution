package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedCredentialDescriptor extends StObject {
  
  var id: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null = js.native
  
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  
  var `type`: ScopedCredentialType = js.native
}
object ScopedCredentialDescriptor {
  
  @scala.inline
  def apply(`type`: ScopedCredentialType): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
  
  @scala.inline
  implicit class ScopedCredentialDescriptorMutableBuilder[Self <: ScopedCredentialDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(
      value: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
    ): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ScopedCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
