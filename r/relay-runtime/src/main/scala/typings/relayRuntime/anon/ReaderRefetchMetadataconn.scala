package typings.relayRuntime.anon

import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderRefetchMetadata & {  connection :relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderPaginationMetadata} */
@js.native
trait ReaderRefetchMetadataconn extends js.Object {
  
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
  implicit class ReaderRefetchMetadataconnOps[Self <: ReaderRefetchMetadataconn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnection(value: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentPathInResultVarargs(value: String*): Self = this.set("fragmentPathInResult", js.Array(value :_*))
    
    @scala.inline
    def setFragmentPathInResult(value: js.Array[String]): Self = this.set("fragmentPathInResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String | ConcreteRequest): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierField(value: String): Self = this.set("identifierField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifierField: Self = this.set("identifierField", js.undefined)
    
    @scala.inline
    def setIdentifierFieldNull: Self = this.set("identifierField", null)
  }
}
