package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A 2x2 matrix. */
trait mat2 extends StObject {
  
  /** Returns the result of adding the two matrices together. */
  def add(mat: mat2): mat2
  
  /** The first column of the matrix. */
  var column0: vec2
  
  /** The second column of the matrix. */
  var column1: vec2
  
  /** Returns a string representation of the matrix. */
  var description: String
  
  /** Returns the determinant of the matrix. */
  def determinant(): Double
  
  /** Returns the result of dividing the two matrices. */
  def div(mat: mat2): mat2
  
  /** Returns whether the two matrices are equal. */
  def equal(mat: mat2): Boolean
  
  /** Returns the inverse of the matrix. */
  def inverse(): mat2
  
  /** Returns the result of multiplying the two matrices. */
  def mult(mat: mat2): mat2
  
  /** Returns the result of scalar multiplying the matrix. */
  def multiplyScalar(scalar: Double): mat2
  
  /** Returns the result of subtracting the two matrices. */
  def sub(mat: mat2): mat2
  
  /** Returns the transpose of this matrix. */
  def transpose(): mat2
}
object mat2 {
  
  inline def apply(
    add: mat2 => mat2,
    column0: vec2,
    column1: vec2,
    description: String,
    determinant: () => Double,
    div: mat2 => mat2,
    equal: mat2 => Boolean,
    inverse: () => mat2,
    mult: mat2 => mat2,
    multiplyScalar: Double => mat2,
    sub: mat2 => mat2,
    transpose: () => mat2
  ): mat2 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), column0 = column0.asInstanceOf[js.Any], column1 = column1.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], determinant = js.Any.fromFunction0(determinant), div = js.Any.fromFunction1(div), equal = js.Any.fromFunction1(equal), inverse = js.Any.fromFunction0(inverse), mult = js.Any.fromFunction1(mult), multiplyScalar = js.Any.fromFunction1(multiplyScalar), sub = js.Any.fromFunction1(sub), transpose = js.Any.fromFunction0(transpose))
    __obj.asInstanceOf[mat2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: mat2] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: mat2 => mat2): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setColumn0(value: vec2): Self = StObject.set(x, "column0", value.asInstanceOf[js.Any])
    
    inline def setColumn1(value: vec2): Self = StObject.set(x, "column1", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDeterminant(value: () => Double): Self = StObject.set(x, "determinant", js.Any.fromFunction0(value))
    
    inline def setDiv(value: mat2 => mat2): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setEqual(value: mat2 => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setInverse(value: () => mat2): Self = StObject.set(x, "inverse", js.Any.fromFunction0(value))
    
    inline def setMult(value: mat2 => mat2): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setMultiplyScalar(value: Double => mat2): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
    
    inline def setSub(value: mat2 => mat2): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setTranspose(value: () => mat2): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
  }
}
