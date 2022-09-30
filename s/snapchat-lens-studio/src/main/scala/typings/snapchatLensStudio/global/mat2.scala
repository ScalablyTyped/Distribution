package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A 2x2 matrix. */
@JSGlobal("mat2")
@js.native
/** Creates a new mat2, defaulting to identity values. */
open class mat2 ()
  extends StObject
     with typings.snapchatLensStudio.mat2 {
  
  /** Returns the result of adding the two matrices together. */
  /* CompleteClass */
  override def add(mat: typings.snapchatLensStudio.mat2): typings.snapchatLensStudio.mat2 = js.native
  
  /** The first column of the matrix. */
  /* CompleteClass */
  var column0: typings.snapchatLensStudio.vec2 = js.native
  
  /** The second column of the matrix. */
  /* CompleteClass */
  var column1: typings.snapchatLensStudio.vec2 = js.native
  
  /** Returns a string representation of the matrix. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Returns the determinant of the matrix. */
  /* CompleteClass */
  override def determinant(): Double = js.native
  
  /** Returns the result of dividing the two matrices. */
  /* CompleteClass */
  override def div(mat: typings.snapchatLensStudio.mat2): typings.snapchatLensStudio.mat2 = js.native
  
  /** Returns whether the two matrices are equal. */
  /* CompleteClass */
  override def equal(mat: typings.snapchatLensStudio.mat2): Boolean = js.native
  
  /** Returns the inverse of the matrix. */
  /* CompleteClass */
  override def inverse(): typings.snapchatLensStudio.mat2 = js.native
  
  /** Returns the result of multiplying the two matrices. */
  /* CompleteClass */
  override def mult(mat: typings.snapchatLensStudio.mat2): typings.snapchatLensStudio.mat2 = js.native
  
  /** Returns the result of scalar multiplying the matrix. */
  /* CompleteClass */
  override def multiplyScalar(scalar: Double): typings.snapchatLensStudio.mat2 = js.native
  
  /** Returns the result of subtracting the two matrices. */
  /* CompleteClass */
  override def sub(mat: typings.snapchatLensStudio.mat2): typings.snapchatLensStudio.mat2 = js.native
  
  /** Returns the transpose of this matrix. */
  /* CompleteClass */
  override def transpose(): typings.snapchatLensStudio.mat2 = js.native
}
object mat2 {
  
  @JSGlobal("mat2")
  @js.native
  val ^ : js.Any = js.native
  
  /** Returns the identity matrix. */
  /* static member */
  inline def identity(): typings.snapchatLensStudio.mat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")().asInstanceOf[typings.snapchatLensStudio.mat2]
  
  /** Returns a matrix with all zero values. */
  /* static member */
  inline def zero(): typings.snapchatLensStudio.mat2 = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typings.snapchatLensStudio.mat2]
}
