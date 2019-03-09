package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "MocapModel")
@js.native
class MocapModel protected () extends js.Object {
  def this(model: Model, frames: js.Array[_]) = this()
  def this(model: Model, frames: js.Array[_], frameDelay: scala.Double) = this()
  def applyFrameTransforms(frameIndex: scala.Double): scala.Double = js.native
}

