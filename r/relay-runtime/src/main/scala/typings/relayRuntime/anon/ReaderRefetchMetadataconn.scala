package typings.relayRuntime.anon

import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderRefetchMetadata & {  connection :relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderPaginationMetadata} */
@js.native
trait ReaderRefetchMetadataconn extends StObject {
  
  val connection: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata = js.native
  
  val fragmentPathInResult: js.Array[String] = js.native
  
  val identifierField: js.UndefOr[String | Null] = js.native
  
  val operation: String | ConcreteRequest = js.native
}
object ReaderRefetchMetadataconn {
  
  @scala.inline
  def apply(
    connection: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata,
    fragmentPathInResult: js.Array[String],
    operation: String | ConcreteRequest
  ): ReaderRefetchMetadataconn = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadataconn]
  }
  
  @scala.inline
  implicit class ReaderRefetchMetadataconnMutableBuilder[Self <: ReaderRefetchMetadataconn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentPathInResult(value: js.Array[String]): Self = StObject.set(x, "fragmentPathInResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentPathInResultVarargs(value: String*): Self = StObject.set(x, "fragmentPathInResult", js.Array(value :_*))
    
    @scala.inline
    def setIdentifierField(value: String): Self = StObject.set(x, "identifierField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierFieldNull: Self = StObject.set(x, "identifierField", null)
    
    @scala.inline
    def setIdentifierFieldUndefined: Self = StObject.set(x, "identifierField", js.undefined)
    
    @scala.inline
    def setOperation(value: String | ConcreteRequest): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
