package typings.relayRuntime.anon

import typings.relayRuntime.libUtilReaderNodeMod.ReaderRefetchMetadata
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentRefPathInResponse extends StObject {
  
  var fragmentRefPathInResponse: js.Array[String | Double]
  
  var identifierField: js.UndefOr[String | Null] = js.undefined
  
  var refetchMetadata: ReaderRefetchMetadata
  
  var refetchableRequest: ConcreteRequest
}
object FragmentRefPathInResponse {
  
  inline def apply(
    fragmentRefPathInResponse: js.Array[String | Double],
    refetchMetadata: ReaderRefetchMetadata,
    refetchableRequest: ConcreteRequest
  ): FragmentRefPathInResponse = {
    val __obj = js.Dynamic.literal(fragmentRefPathInResponse = fragmentRefPathInResponse.asInstanceOf[js.Any], refetchMetadata = refetchMetadata.asInstanceOf[js.Any], refetchableRequest = refetchableRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentRefPathInResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FragmentRefPathInResponse] (val x: Self) extends AnyVal {
    
    inline def setFragmentRefPathInResponse(value: js.Array[String | Double]): Self = StObject.set(x, "fragmentRefPathInResponse", value.asInstanceOf[js.Any])
    
    inline def setFragmentRefPathInResponseVarargs(value: (String | Double)*): Self = StObject.set(x, "fragmentRefPathInResponse", js.Array(value*))
    
    inline def setIdentifierField(value: String): Self = StObject.set(x, "identifierField", value.asInstanceOf[js.Any])
    
    inline def setIdentifierFieldNull: Self = StObject.set(x, "identifierField", null)
    
    inline def setIdentifierFieldUndefined: Self = StObject.set(x, "identifierField", js.undefined)
    
    inline def setRefetchMetadata(value: ReaderRefetchMetadata): Self = StObject.set(x, "refetchMetadata", value.asInstanceOf[js.Any])
    
    inline def setRefetchableRequest(value: ConcreteRequest): Self = StObject.set(x, "refetchableRequest", value.asInstanceOf[js.Any])
  }
}
