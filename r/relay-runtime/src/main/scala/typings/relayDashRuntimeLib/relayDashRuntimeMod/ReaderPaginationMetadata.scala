package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderPaginationMetadata extends js.Object {
  val backward: relayDashRuntimeLib.Anon_Count | scala.Null
  val forward: relayDashRuntimeLib.Anon_Count | scala.Null
  val path: js.Array[java.lang.String]
}

object ReaderPaginationMetadata {
  @scala.inline
  def apply(
    path: js.Array[java.lang.String],
    backward: relayDashRuntimeLib.Anon_Count = null,
    forward: relayDashRuntimeLib.Anon_Count = null
  ): ReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(path = path)
    if (backward != null) __obj.updateDynamic("backward")(backward)
    if (forward != null) __obj.updateDynamic("forward")(forward)
    __obj.asInstanceOf[ReaderPaginationMetadata]
  }
}

