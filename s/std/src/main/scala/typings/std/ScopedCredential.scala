package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedCredential extends StObject {
  
  val id: ArrayBuffer
  
  val `type`: ScopedCredentialType
}
object ScopedCredential {
  
  inline def apply(id: ArrayBuffer, `type`: ScopedCredentialType): ScopedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredential]
  }
  
  extension [Self <: ScopedCredential](x: Self) {
    
    inline def setId(value: ArrayBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: ScopedCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
