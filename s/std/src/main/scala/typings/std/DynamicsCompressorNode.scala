package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Inherits properties from its parent, AudioNode. */
@js.native
trait DynamicsCompressorNode extends AudioNode {
  val attack: AudioParam = js.native
  val knee: AudioParam = js.native
  val ratio: AudioParam = js.native
  val reduction: Double = js.native
  val release: AudioParam = js.native
  val threshold: AudioParam = js.native
}

