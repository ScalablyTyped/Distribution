package typings.relayDashRuntime.libUtilReaderNodeMod

import typings.relayDashRuntime.Anon_Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderPaginationMetadata extends js.Object {
  val backward: Anon_Count | Null
  val forward: Anon_Count | Null
  val path: js.Array[String]
}

object ReaderPaginationMetadata {
  @scala.inline
  def apply(path: js.Array[String], backward: Anon_Count = null, forward: Anon_Count = null): ReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (backward != null) __obj.updateDynamic("backward")(backward.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationMetadata]
  }
}

