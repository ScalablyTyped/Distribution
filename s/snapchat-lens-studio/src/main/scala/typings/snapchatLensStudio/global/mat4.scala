package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A 4x4 matrix. */
@JSGlobal("mat4")
@js.native
/** Creates a new mat4, defaulting to identity values. */
open class mat4 ()
  extends StObject
     with typings.snapchatLensStudio.mat4 {
  
  /** Returns the result of adding the two matrices together. */
  /* CompleteClass */
  override def add(mat: typings.snapchatLensStudio.mat4): typings.snapchatLensStudio.mat4 = js.native
  
  /** The first column of the matrix. */
  /* CompleteClass */
  var column0: typings.snapchatLensStudio.vec4 = js.native
  
  /** The second column of the matrix. */
  /* CompleteClass */
  var column1: typings.snapchatLensStudio.vec4 = js.native
  
  /** The third column of the matrix. */
  /* CompleteClass */
  var column2: typings.snapchatLensStudio.vec4 = js.native
  
  /** The fourth column of the matrix. */
  /* CompleteClass */
  var column3: typings.snapchatLensStudio.vec4 = js.native
  
  /** Returns a string representation of the matrix. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Returns the determinant of the matrix. */
  /* CompleteClass */
  override def determinant(): Double = js.native
  
  /** Returns the result of dividing the two matrices. */
  /* CompleteClass */
  override def div(mat: typings.snapchatLensStudio.mat4): typings.snapchatLensStudio.mat4 = js.native
  
  /** Returns whether the two matrices are equal. */
  /* CompleteClass */
  override def equal(mat: typings.snapchatLensStudio.mat4): Boolean = js.native
  
  /** Returns an euler angle representation of this matrix’s rotation, in radians. */
  /* CompleteClass */
  override def extractEulerAngles(): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the inverse of the matrix. */
  /* CompleteClass */
  override def inverse(): typings.snapchatLensStudio.mat4 = js.native
  
  /** Returns the result of multiplying the two matrices. */
  /* CompleteClass */
  override def mult(mat: typings.snapchatLensStudio.mat4): typings.snapchatLensStudio.mat4 = js.native
  
  /** Returns the direction vector multiplied by this matrix. */
  /* CompleteClass */
  override def multiplyDirection(direction: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the point point multiplied by this matrix. */
  /* CompleteClass */
  override def multiplyPoint(point: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns the result of scalar multiplying the matrix. */
  /* CompleteClass */
  override def multiplyScalar(scalar: Double): typings.snapchatLensStudio.mat4 = js.native
  
  /** Returns the vector multiplied by this matrix. */
  /* CompleteClass */
  override def multiplyVector(vector: typings.snapchatLensStudio.vec4): typings.snapchatLensStudio.vec4 = js.native
  
  /** Returns the result of subtracting the two matrices. */
  /* CompleteClass */
  override def sub(mat: typings.snapchatLensStudio.mat4): typings.snapchatLensStudio.mat4 = js.native
  
  /** Returns the transpose of this matrix. */
  /* CompleteClass */
  override def transpose(): typings.snapchatLensStudio.mat4 = js.native
}
object mat4 {
  
  @JSGlobal("mat4")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns the two matrices multiplied component-wise. */
  /* static member */
  inline def compMult(arg1: typings.snapchatLensStudio.mat4, arg2: typings.snapchatLensStudio.mat4): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("compMult")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with translation  rotation: translation, rotation, and scale scale. */
  /* static member */
  inline def compose(
    translation: typings.snapchatLensStudio.vec3,
    rotation: typings.snapchatLensStudio.quat,
    scale: typings.snapchatLensStudio.vec3
  ): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(translation.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with the specified euler angles ( radians: in). */
  /* static member */
  inline def fromEulerAngles(euler: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEulerAngles")(euler.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with x euler angle xAngle ( radians: in). */
  /* static member */
  inline def fromEulerX(xAngle: Double): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEulerX")(xAngle.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with y euler angle yAngle ( radians: in). */
  /* static member */
  inline def fromEulerY(yAngle: Double): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEulerY")(yAngle.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with z euler angle zAngle ( radians: in). */
  /* static member */
  inline def fromEulerZ(zAngle: Double): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEulerZ")(zAngle.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with rotation rotation. */
  /* static member */
  inline def fromRotation(rotation: typings.snapchatLensStudio.quat): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRotation")(rotation.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with scale scale. */
  /* static member */
  inline def fromScale(scale: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromScale")(scale.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix with the translation translation. */
  /* static member */
  inline def fromTranslation(translation: typings.snapchatLensStudio.vec3): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTranslation")(translation.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns the identity matrix. */
  /* static member */
  inline def identity(): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix generated using the provided arguments. */
  /* static member */
  inline def lookAt(
    eye: typings.snapchatLensStudio.vec3,
    center: typings.snapchatLensStudio.vec3,
    up: typings.snapchatLensStudio.vec3
  ): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("lookAt")(eye.asInstanceOf[js.Any], center.asInstanceOf[js.Any], up.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix using the provided vectors. */
  /* static member */
  inline def makeBasis(
    x: typings.snapchatLensStudio.vec3,
    y: typings.snapchatLensStudio.vec3,
    z: typings.snapchatLensStudio.vec3
  ): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBasis")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix generated using the provided arguments. */
  /* static member */
  inline def orthographic(left: Double, right: Double, bottom: Double, top: Double, zNear: Double, zFar: Double): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("orthographic")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], top.asInstanceOf[js.Any], zNear.asInstanceOf[js.Any], zFar.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns the outer product of the two matrices. */
  /* static member */
  inline def outerProduct(arg1: typings.snapchatLensStudio.vec4, arg2: typings.snapchatLensStudio.vec4): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("outerProduct")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a new matrix generated using the provided arguments. */
  /* static member */
  inline def perspective(fovY: Double, aspect: Double, zNear: Double, zFar: Double): typings.snapchatLensStudio.mat4 = (^.asInstanceOf[js.Dynamic].applyDynamic("perspective")(fovY.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], zNear.asInstanceOf[js.Any], zFar.asInstanceOf[js.Any])).asInstanceOf[typings.snapchatLensStudio.mat4]
  
  /** Returns a matrix with all zero values. */
  /* static member */
  inline def zero(): typings.snapchatLensStudio.mat4 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.snapchatLensStudio.mat4]
}
