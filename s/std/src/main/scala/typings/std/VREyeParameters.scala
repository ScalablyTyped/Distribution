package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information required to correctly render a scene for a given eye, including field of view information. */
trait VREyeParameters extends js.Object {
  /** @deprecated */
  val fieldOfView: VRFieldOfView
  val offset: Float32Array
  val renderHeight: Double
  val renderWidth: Double
}

object VREyeParameters {
  @scala.inline
  def apply(fieldOfView: VRFieldOfView, offset: Float32Array, renderHeight: Double, renderWidth: Double): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
}

