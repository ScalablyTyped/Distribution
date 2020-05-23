package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRefetchMetadata extends js.Object {
  val connection: js.UndefOr[ReaderPaginationMetadata | Null] = js.undefined
  val fragmentPathInResult: js.Array[String]
  val operation: String | ConcreteRequest
}

object ReaderRefetchMetadata {
  @scala.inline
  def apply(
    fragmentPathInResult: js.Array[String],
    operation: String | ConcreteRequest,
    connection: js.UndefOr[Null | ReaderPaginationMetadata] = js.undefined
  ): ReaderRefetchMetadata = {
    val __obj = js.Dynamic.literal(fragmentPathInResult = fragmentPathInResult.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    if (!js.isUndefined(connection)) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderRefetchMetadata]
  }
}

