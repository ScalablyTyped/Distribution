package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedCredential extends StObject {
  
  val id: ArrayBuffer
  
  val `type`: ScopedCredentialType
}
object ScopedCredential {
  
  @scala.inline
  def apply(id: ArrayBuffer, `type`: ScopedCredentialType): ScopedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredential]
  }
  
  @scala.inline
  implicit class ScopedCredentialMutableBuilder[Self <: ScopedCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ArrayBuffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ScopedCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
