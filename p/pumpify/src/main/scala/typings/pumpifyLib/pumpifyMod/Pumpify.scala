package typings
package pumpifyLib.pumpifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pumpify
  extends duplexifyLib.duplexifyMod.duplexifyNs.Duplexify {
  def setPipeline(streams: nodeLib.streamMod.Stream*): scala.Unit = js.native
  def setPipeline(streams: js.Array[nodeLib.streamMod.Stream]): scala.Unit = js.native
}

