package typings.relayRuntime.anon

import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionPathInFragmentData extends StObject {
  
  var connectionPathInFragmentData: js.Array[String | Double]
  
  var identifierField: js.UndefOr[String | Null] = js.undefined
  
  var paginationMetadata: ReaderPaginationMetadata
  
  var paginationRequest: ConcreteRequest
  
  var stream: Boolean
}
object ConnectionPathInFragmentData {
  
  inline def apply(
    connectionPathInFragmentData: js.Array[String | Double],
    paginationMetadata: ReaderPaginationMetadata,
    paginationRequest: ConcreteRequest,
    stream: Boolean
  ): ConnectionPathInFragmentData = {
    val __obj = js.Dynamic.literal(connectionPathInFragmentData = connectionPathInFragmentData.asInstanceOf[js.Any], paginationMetadata = paginationMetadata.asInstanceOf[js.Any], paginationRequest = paginationRequest.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionPathInFragmentData]
  }
  
  extension [Self <: ConnectionPathInFragmentData](x: Self) {
    
    inline def setConnectionPathInFragmentData(value: js.Array[String | Double]): Self = StObject.set(x, "connectionPathInFragmentData", value.asInstanceOf[js.Any])
    
    inline def setConnectionPathInFragmentDataVarargs(value: (String | Double)*): Self = StObject.set(x, "connectionPathInFragmentData", js.Array(value*))
    
    inline def setIdentifierField(value: String): Self = StObject.set(x, "identifierField", value.asInstanceOf[js.Any])
    
    inline def setIdentifierFieldNull: Self = StObject.set(x, "identifierField", null)
    
    inline def setIdentifierFieldUndefined: Self = StObject.set(x, "identifierField", js.undefined)
    
    inline def setPaginationMetadata(value: ReaderPaginationMetadata): Self = StObject.set(x, "paginationMetadata", value.asInstanceOf[js.Any])
    
    inline def setPaginationRequest(value: ConcreteRequest): Self = StObject.set(x, "paginationRequest", value.asInstanceOf[js.Any])
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
