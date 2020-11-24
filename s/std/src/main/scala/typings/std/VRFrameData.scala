package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This WebVR API interface represents all the information needed to render a single frame of a VR scene; constructed by VRDisplay.getFrameData(). */
@js.native
trait VRFrameData extends js.Object {
  
  val leftProjectionMatrix: Float32Array = js.native
  
  val leftViewMatrix: Float32Array = js.native
  
  val pose: VRPose = js.native
  
  val rightProjectionMatrix: Float32Array = js.native
  
  val rightViewMatrix: Float32Array = js.native
  
  val timestamp: Double = js.native
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
  
  @scala.inline
  implicit class VRFrameDataOps[Self <: VRFrameData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLeftProjectionMatrix(value: Float32Array): Self = this.set("leftProjectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftViewMatrix(value: Float32Array): Self = this.set("leftViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPose(value: VRPose): Self = this.set("pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightProjectionMatrix(value: Float32Array): Self = this.set("rightProjectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightViewMatrix(value: Float32Array): Self = this.set("rightViewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
