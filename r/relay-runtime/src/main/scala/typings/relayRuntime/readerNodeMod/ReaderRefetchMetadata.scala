package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderRefetchMetadata extends StObject {
  
  val connection: js.UndefOr[ReaderPaginationMetadata | Null] = js.native
  
  val fragmentPathInResult: js.Array[String] = js.native
  
  val identifierField: js.UndefOr[String | Null] = js.native
  
  val operation: String | ConcreteRequest = js.native
}
object ReaderRefetchMetadata {
  
  @scala.inline
  def apply(fragmentPathInResult: js.Array[String], operation: String | ConcreteRequest): ReaderRefetchMetadata = {
    val __obj = js.Dynamic.literal(fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadata]
  }
  
  @scala.inline
  implicit class ReaderRefetchMetadataMutableBuilder[Self <: ReaderRefetchMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: ReaderPaginationMetadata): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
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
