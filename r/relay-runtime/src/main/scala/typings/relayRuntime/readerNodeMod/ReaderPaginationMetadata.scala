package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderPaginationMetadata extends js.Object {
  val backward: Count | Null
  val forward: Count | Null
  val path: js.Array[String]
}

object ReaderPaginationMetadata {
  @scala.inline
  def apply(path: js.Array[String], backward: Count = null, forward: Count = null): ReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderPaginationMetadata]
  }
}

