package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "MocapModel")
@js.native
class MocapModel protected () extends js.Object {
  def this(model: Model, frames: js.Array[_]) = this()
  def this(model: Model, frames: js.Array[_], frameDelay: Double) = this()
  def applyFrameTransforms(frameIndex: Double): Double = js.native
}

