package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
trait VRFrameData extends js.Object {
  val leftProjectionMatrix: Float32Array
  val leftViewMatrix: Float32Array
  val pose: VRPose
  val rightProjectionMatrix: Float32Array
  val rightViewMatrix: Float32Array
  val timestamp: Double
}

object VRFrameData {
  @scala.inline
  def apply(
    leftProjectionMatrix: Float32Array,
    leftViewMatrix: Float32Array,
    pose: VRPose,
    rightProjectionMatrix: Float32Array,
    rightViewMatrix: Float32Array,
    timestamp: Double
  ): VRFrameData = {
    val __obj = js.Dynamic.literal(leftProjectionMatrix = leftProjectionMatrix.asInstanceOf[js.Any], leftViewMatrix = leftViewMatrix.asInstanceOf[js.Any], pose = pose.asInstanceOf[js.Any], rightProjectionMatrix = rightProjectionMatrix.asInstanceOf[js.Any], rightViewMatrix = rightViewMatrix.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRFrameData]
  }
}

