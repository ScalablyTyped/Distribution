package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A 3x3 matrix. */
@JSGlobal("mat3")
@js.native
/** Creates a new mat3, defaulting to identity values. */
open class mat3 ()
  extends StObject
     with typings.snapchatLensStudio.mat3 {
  
  /** Returns the result of adding the two matrices together. */
  /* CompleteClass */
  override def add(mat: typings.snapchatLensStudio.mat3): typings.snapchatLensStudio.mat3 = js.native
  
  /** The first column of the matrix. */
  /* CompleteClass */
  var column0: typings.snapchatLensStudio.vec3 = js.native
  
  /** The second column of the matrix. */
  /* CompleteClass */
  var column1: typings.snapchatLensStudio.vec3 = js.native
  
  /** The third column of the matrix. */
  /* CompleteClass */
  var column2: typings.snapchatLensStudio.vec3 = js.native
  
  /** Returns a string representation of the matrix. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Returns the determinant of the matrix. */
  /* CompleteClass */
  override def determinant(): Double = js.native
  
  /** Returns the result of dividing the two matrices. */
  /* CompleteClass */
  override def div(mat: typings.snapchatLensStudio.mat3): typings.snapchatLensStudio.mat3 = js.native
  
  /** Returns whether the two matrices are equal. */
  /* CompleteClass */
  override def equal(mat: typings.snapchatLensStudio.mat3): Boolean = js.native
  
  /** Returns the inverse of the matrix. */
  /* CompleteClass */
  override def inverse(): typings.snapchatLensStudio.mat3 = js.native
  
  /** Returns the result of multiplying the two matrices. */
  /* CompleteClass */
  override def mult(mat: typings.snapchatLensStudio.mat3): typings.snapchatLensStudio.mat3 = js.native
  
  /** Returns the result of scalar multiplying the matrix. */
  /* CompleteClass */
  override def multiplyScalar(scalar: Double): typings.snapchatLensStudio.mat3 = js.native
  
  /** Returns the result of subtracting the two matrices. */
  /* CompleteClass */
  override def sub(mat: typings.snapchatLensStudio.mat3): typings.snapchatLensStudio.mat3 = js.native
  
  /** Returns the transpose of this matrix. */
  /* CompleteClass */
  override def transpose(): typings.snapchatLensStudio.mat3 = js.native
}
object mat3 {
  
  @JSGlobal("mat3")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns the identity matrix. */
  /* static member */
  inline def identity(): typings.snapchatLensStudio.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[typings.snapchatLensStudio.mat3]
  
  /** Returns a matrix representing the specified rotation. */
  /* static member */
  inline def makeFromRotation(arg1: typings.snapchatLensStudio.quat): typings.snapchatLensStudio.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFromRotation")(arg1.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.mat3]
  
  /** Returns a matrix with all zero values. */
  /* static member */
  inline def zero(): typings.snapchatLensStudio.mat3 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.snapchatLensStudio.mat3]
}
