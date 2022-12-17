package typings.relayRuntime.anon

import typings.relayRuntime.libUtilReaderNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderRefetchMetadata & {  connection :relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderPaginationMetadata} */
trait ReaderRefetchMetadataconn extends StObject {
  
  val connection: js.UndefOr[ReaderPaginationMetadata | Null] = js.undefined
  
  val fragmentPathInResult: js.Array[String]
  
  val identifierField: js.UndefOr[String | Null] = js.undefined
  
  val operation: String | ConcreteRequest
}
object ReaderRefetchMetadataconn {
  
  inline def apply(fragmentPathInResult: js.Array[String], operation: String | ConcreteRequest): ReaderRefetchMetadataconn = {
    val __obj = js.Dynamic.literal(fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadataconn]
  }
  
  extension [Self <: ReaderRefetchMetadataconn](x: Self) {
    
    inline def setConnection(value: ReaderPaginationMetadata): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setFragmentPathInResult(value: js.Array[String]): Self = StObject.set(x, "fragmentPathInResult", value.asInstanceOf[js.Any])
    
    inline def setFragmentPathInResultVarargs(value: String*): Self = StObject.set(x, "fragmentPathInResult", js.Array(value*))
    
    inline def setIdentifierField(value: String): Self = StObject.set(x, "identifierField", value.asInstanceOf[js.Any])
    
    inline def setIdentifierFieldNull: Self = StObject.set(x, "identifierField", null)
    
    inline def setIdentifierFieldUndefined: Self = StObject.set(x, "identifierField", js.undefined)
    
    inline def setOperation(value: String | ConcreteRequest): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
