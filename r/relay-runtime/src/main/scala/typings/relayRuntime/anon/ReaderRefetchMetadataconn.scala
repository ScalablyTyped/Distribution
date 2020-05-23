package typings.relayRuntime.anon

import typings.relayRuntime.readerNodeMod.ReaderPaginationMetadata
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderRefetchMetadata & {  connection  :relay-runtime.relay-runtime/lib/util/ReaderNode.ReaderPaginationMetadata} */
trait ReaderRefetchMetadataconn extends js.Object {
  val connection: (js.UndefOr[ReaderPaginationMetadata | Null]) with ReaderPaginationMetadata
  val fragmentPathInResult: js.Array[String]
  val operation: String | ConcreteRequest
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
}

