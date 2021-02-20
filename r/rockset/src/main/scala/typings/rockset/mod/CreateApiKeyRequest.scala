package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiKeyRequest extends StObject {
  
  // descriptive label
  var name: String = js.native
}
object CreateApiKeyRequest {
  
  @scala.inline
  def apply(name: String): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  
  @scala.inline
  implicit class CreateApiKeyRequestMutableBuilder[Self <: CreateApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
