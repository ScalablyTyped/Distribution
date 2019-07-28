package typings.pumpify.pumpifyMod

import typings.duplexify.duplexifyMod.Duplexify
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pumpify extends Duplexify {
  def setPipeline(streams: Stream*): Unit = js.native
  def setPipeline(streams: js.Array[Stream]): Unit = js.native
}

