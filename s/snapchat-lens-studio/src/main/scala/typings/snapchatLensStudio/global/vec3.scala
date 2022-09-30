package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A three dimensional vector.
  * Lens Studio v1.0.0+
  */
@JSGlobal("vec3")
@js.native
open class vec3 protected ()
  extends StObject
     with typings.snapchatLensStudio.vec3 {
  def this(x: Double, y: Double, z: Double) = this()
  
  /** Returns the vector plus vec. */
  /* CompleteClass */
  override def add(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the angle in radians between the vector and vec. */
  /* CompleteClass */
  override def angleTo(vec: typings.snapchatLensStudio.vec3): Double = js.native
  
  /** Alternate name for the z component. */
  /* CompleteClass */
  var b: Double = js.native
  
  /** Returns a copy of the vector with its length clamped to length. */
  /* CompleteClass */
  override def clampLength(length: Double): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the cross product of the vector and vec */
  /* CompleteClass */
  override def cross(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the distance between the vector and the vector vec. */
  /* CompleteClass */
  override def distance(vec: typings.snapchatLensStudio.vec3): Double = js.native
  
  /** Returns the division of the vector by the vector vec. */
  /* CompleteClass */
  override def div(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the dot product of the vector and vec. */
  /* CompleteClass */
  override def dot(vec: typings.snapchatLensStudio.vec3): Double = js.native
  
  /** Returns whether this is equal to vec. */
  /* CompleteClass */
  override def equal(vec: typings.snapchatLensStudio.vec3): Boolean = js.native
  
  /** Alternate name for the y component. */
  /* CompleteClass */
  var g: Double = js.native
  
  /** Returns the length of the vector. */
  /* CompleteClass */
  var length: Double = js.native
  
  /** Returns the squared length of the vector. */
  /* CompleteClass */
  var lengthSquared: Double = js.native
  
  /** Returns a copy of the vector moved towards the point point by the amount magnitude. */
  /* CompleteClass */
  override def moveTowards(point: typings.snapchatLensStudio.vec3, magnitude: Double): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  /* CompleteClass */
  override def mult(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns a copy of the vector with its length scaled to 1. */
  /* CompleteClass */
  override def normalize(): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns a copy of the vector projected onto the vector vec. */
  /* CompleteClass */
  override def project(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Projects the vector onto the plane represented by the normal normal. */
  /* CompleteClass */
  override def projectOnPlane(normal: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Alternate name for the x component. */
  /* CompleteClass */
  var r: Double = js.native
  
  /** Returns a copy of the vector reflected across the plane defined by the normal vec. */
  /* CompleteClass */
  override def reflect(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns a copy of the vector rotated towards the point point by amount. */
  /* CompleteClass */
  override def rotateTowards(point: typings.snapchatLensStudio.vec3, amount: Double): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  /* CompleteClass */
  override def scale(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the vector minus vec. */
  /* CompleteClass */
  override def sub(vec: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Multiplies the components by the number scale. */
  /* CompleteClass */
  override def uniformScale(scale: Double): typings.snapchatLensStudio.vec3 = js.native
  
  /** x component of the vec3. */
  /* CompleteClass */
  var x: Double = js.native
  
  /** y component of the vec3. */
  /* CompleteClass */
  var y: Double = js.native
  
  /** z component of the vec3. */
  /* CompleteClass */
  var z: Double = js.native
}
object vec3 {
  
  @JSGlobal("vec3")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns the vector (0, 0, -1). */
  /* static member */
  inline def back(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, -1, 0). */
  /* static member */
  inline def down(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, 0, 1). */
  /* static member */
  inline def forward(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns the vector (-1, 0, 0). */
  /* static member */
  inline def left(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("left")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Linearly interpolates between the two vectors vecA and vecB by the factor t. */
  /* static member */
  inline def lerp(vecA: typings.snapchatLensStudio.vec3, vecB: typings.snapchatLensStudio.vec3, t: Double): typings.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns a new vector containing the largest value of each component in the two vectors. */
  /* static member */
  inline def max(vecA: typings.snapchatLensStudio.vec3, vecB: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns a new vector containing the smallest value of each component in the two vectors. */
  /* static member */
  inline def min(vecA: typings.snapchatLensStudio.vec3, vecB: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns the vector (1, 1, 1). */
  /* static member */
  inline def one(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Makes the vectors vecA and vecB normalized and orthogonal to each other. */
  /* static member */
  inline def orthonormalize(vecA: typings.snapchatLensStudio.vec3, vecB: typings.snapchatLensStudio.vec3): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("orthonormalize")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Returns the vector (1, 0, 0). */
  /* static member */
  inline def right(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("right")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Spherically interpolates between the two vectors vecA and vecB by the factor t. */
  /* static member */
  inline def slerp(vecA: typings.snapchatLensStudio.vec3, vecB: typings.snapchatLensStudio.vec3, t: Double): typings.snapchatLensStudio.vec3 = (^.asInstanceOf[js.Dynamic].applyDynamic("slerp")(vecA.asInstanceOf[js.Any], vecB.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, 1, 0). */
  /* static member */
  inline def up(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[typings.snapchatLensStudio.vec3]
  
  /** Returns the vector (0, 0, 0). */
  /* static member */
  inline def zero(): typings.snapchatLensStudio.vec3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.snapchatLensStudio.vec3]
}
