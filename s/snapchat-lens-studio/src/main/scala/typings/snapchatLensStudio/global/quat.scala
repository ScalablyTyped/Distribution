package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A quaternion, used to represent rotation. */
@JSGlobal("quat")
@js.native
open class quat protected ()
  extends StObject
     with typings.snapchatLensStudio.quat {
  /** Creates a new quat. */
  def this(w: Double, x: Double, y: Double, z: Double) = this()
  
  /** Returns the dot product of the two quats. */
  /* CompleteClass */
  override def dot(quat: typings.snapchatLensStudio.quat): Double = js.native
  
  /** Returns whether this quat and b are equal. */
  /* CompleteClass */
  override def equal(b: typings.snapchatLensStudio.quat): Boolean = js.native
  
  /** Returns the rotation angle of the quat. */
  /* CompleteClass */
  override def getAngle(): Double = js.native
  
  /** Returns the rotation axis of the quat. */
  /* CompleteClass */
  override def getAxis(): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns an inverted version of the quat. */
  /* CompleteClass */
  override def invert(): typings.snapchatLensStudio.quat = js.native
  
  /** Returns the product of this quat and b. */
  /* CompleteClass */
  override def multiply(b: typings.snapchatLensStudio.quat): typings.snapchatLensStudio.quat = js.native
  
  /** Returns the result of rotating direction vector vec3 by this quat. */
  /* CompleteClass */
  override def multiplyVec3(vec3: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Normalizes the quat. */
  /* CompleteClass */
  override def normalize(): Unit = js.native
  
  /** Returns an euler angle representation of the quat, in radians. */
  /* CompleteClass */
  override def toEulerAngles(): typings.snapchatLensStudio.vec3 = js.native
  
  /** w component of the quat. */
  /* CompleteClass */
  var w: Double = js.native
  
  /** x component of the quat. */
  /* CompleteClass */
  var x: Double = js.native
  
  /** y component of the quat. */
  /* CompleteClass */
  var y: Double = js.native
  
  /** z component of the quat. */
  /* CompleteClass */
  var z: Double = js.native
}
object quat {
  
  @JSGlobal("quat")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns a new quat with angle angle and axis axis. */
  /* static member */
  inline def angleAxis(angle: Double, axis: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.quat = (^.asInstanceOf[js.Dynamic].applyDynamic("angleAxis")(angle.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns the angle between a and b. */
  /* static member */
  inline def angleBetween(a: typings.snapchatLensStudio.quat, b: typings.snapchatLensStudio.quat): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleBetween")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** Returns a new quat using the euler angles x, y, z ( radians: in). */
  /* static member */
  inline def fromEulerAngles(x: Double, y: Double, z: Double): typings.snapchatLensStudio.quat = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEulerAngles")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns a new quat using the euler angle eulerVec ( radians: in). */
  /* static member */
  inline def fromEulerVec(eulerVec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.quat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEulerVec")(eulerVec.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns a new quat linearly interpolated between a and b. */
  /* static member */
  inline def lerp(a: typings.snapchatLensStudio.quat, b: typings.snapchatLensStudio.quat, t: Double): typings.snapchatLensStudio.quat = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns a new quat with a forward vector forward and up vector up. */
  /* static member */
  inline def lookAt(forward: typings.snapchatLensStudio.vec3, up: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.quat = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(forward.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns the identity quaternion. */
  /* static member */
  inline def quatIdentity(): typings.snapchatLensStudio.quat = ^.asInstanceOf[js.Dynamic].applyDynamic("quatIdentity")().asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns a rotation quat between direction vectors from and to. */
  /* static member */
  inline def rotationFromTo(from: typings.snapchatLensStudio.vec3, to: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.quat = (^.asInstanceOf[js.Dynamic].applyDynamic("rotationFromTo")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.quat]
  
  /** Returns a new quat spherically linearly interpolated between a and b. */
  /* static member */
  inline def slerp(a: typings.snapchatLensStudio.quat, b: typings.snapchatLensStudio.quat, t: Double): typings.snapchatLensStudio.quat = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.quat]
}
