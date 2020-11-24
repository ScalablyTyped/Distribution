package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface represents the pose of a WebVR controller at a given timestamp (which includes orientation, position, velocity, and acceleration information.) */
@js.native
trait GamepadPose extends js.Object {
  
  val angularAcceleration: Float32Array | Null = js.native
  
  val angularVelocity: Float32Array | Null = js.native
  
  val hasOrientation: scala.Boolean = js.native
  
  val hasPosition: scala.Boolean = js.native
  
  val linearAcceleration: Float32Array | Null = js.native
  
  val linearVelocity: Float32Array | Null = js.native
  
  val orientation: Float32Array | Null = js.native
  
  val position: Float32Array | Null = js.native
}
object GamepadPose {
  
  @scala.inline
  def apply(hasOrientation: scala.Boolean, hasPosition: scala.Boolean): GamepadPose = {
    val __obj = js.Dynamic.literal(hasOrientation = hasOrientation.asInstanceOf[js.Any], hasPosition = hasPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadPose]
  }
  
  @scala.inline
  implicit class GamepadPoseOps[Self <: GamepadPose] (val x: Self) extends AnyVal {
    
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
    def setHasOrientation(value: scala.Boolean): Self = this.set("hasOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPosition(value: scala.Boolean): Self = this.set("hasPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAcceleration(value: Float32Array): Self = this.set("angularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAccelerationNull: Self = this.set("angularAcceleration", null)
    
    @scala.inline
    def setAngularVelocity(value: Float32Array): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityNull: Self = this.set("angularVelocity", null)
    
    @scala.inline
    def setLinearAcceleration(value: Float32Array): Self = this.set("linearAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearAccelerationNull: Self = this.set("linearAcceleration", null)
    
    @scala.inline
    def setLinearVelocity(value: Float32Array): Self = this.set("linearVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearVelocityNull: Self = this.set("linearVelocity", null)
    
    @scala.inline
    def setOrientation(value: Float32Array): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = this.set("orientation", null)
    
    @scala.inline
    def setPosition(value: Float32Array): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
}
