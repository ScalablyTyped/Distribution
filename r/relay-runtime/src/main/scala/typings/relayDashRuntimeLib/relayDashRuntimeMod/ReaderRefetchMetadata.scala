package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRefetchMetadata extends js.Object {
  val connection: js.UndefOr[ReaderPaginationMetadata | scala.Null] = js.undefined
  val fragmentPathInResult: js.Array[java.lang.String]
  val operation: java.lang.String | ConcreteRequest
}

object ReaderRefetchMetadata {
  @scala.inline
  def apply(
    fragmentPathInResult: js.Array[java.lang.String],
    operation: java.lang.String | ConcreteRequest,
    connection: ReaderPaginationMetadata = null
  ): ReaderRefetchMetadata = {
    val __obj = js.Dynamic.literal(fragmentPathInResult = fragmentPathInResult, operation = operation.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[ReaderRefetchMetadata]
  }
}

