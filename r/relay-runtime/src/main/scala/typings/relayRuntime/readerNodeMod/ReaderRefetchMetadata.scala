package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderRefetchMetadata extends js.Object {
  val connection: js.UndefOr[ReaderPaginationMetadata | Null] = js.native
  val fragmentPathInResult: js.Array[String] = js.native
  val operation: String | ConcreteRequest = js.native
}

object ReaderRefetchMetadata {
  @scala.inline
  def apply(fragmentPathInResult: js.Array[String], operation: String | ConcreteRequest): ReaderRefetchMetadata = {
    val __obj = js.Dynamic.literal(fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadata]
  }
  @scala.inline
  implicit class ReaderRefetchMetadataOps[Self <: ReaderRefetchMetadata] (val x: Self) extends AnyVal {
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
    def setFragmentPathInResultVarargs(value: String*): Self = this.set("fragmentPathInResult", js.Array(value :_*))
    @scala.inline
    def setFragmentPathInResult(value: js.Array[String]): Self = this.set("fragmentPathInResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: String | ConcreteRequest): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection(value: ReaderPaginationMetadata): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setConnectionNull: Self = this.set("connection", null)
  }
  
}

