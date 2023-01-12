package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A 4x4 matrix. */
trait mat4 extends StObject {
  
  /** Returns the result of adding the two matrices together. */
  def add(mat: mat4): mat4
  
  /** The first column of the matrix. */
  var column0: vec4
  
  /** The second column of the matrix. */
  var column1: vec4
  
  /** The third column of the matrix. */
  var column2: vec4
  
  /** The fourth column of the matrix. */
  var column3: vec4
  
  /** Returns a string representation of the matrix. */
  var description: String
  
  /** Returns the determinant of the matrix. */
  def determinant(): Double
  
  /** Returns the result of dividing the two matrices. */
  def div(mat: mat4): mat4
  
  /** Returns whether the two matrices are equal. */
  def equal(mat: mat4): Boolean
  
  /** Returns an euler angle representation of this matrix’s rotation, in radians. */
  def extractEulerAngles(): vec3
  
  /** Returns the inverse of the matrix. */
  def inverse(): mat4
  
  /** Returns the result of multiplying the two matrices. */
  def mult(mat: mat4): mat4
  
  /** Returns the direction vector multiplied by this matrix. */
  def multiplyDirection(direction: vec3): vec3
  
  /** Returns the point point multiplied by this matrix. */
  def multiplyPoint(point: vec3): vec3
  
  /** Returns the result of scalar multiplying the matrix. */
  def multiplyScalar(scalar: Double): mat4
  
  /** Returns the vector multiplied by this matrix. */
  def multiplyVector(vector: vec4): vec4
  
  /** Returns the result of subtracting the two matrices. */
  def sub(mat: mat4): mat4
  
  /** Returns the transpose of this matrix. */
  def transpose(): mat4
}
object mat4 {
  
  inline def apply(
    add: mat4 => mat4,
    column0: vec4,
    column1: vec4,
    column2: vec4,
    column3: vec4,
    description: String,
    determinant: () => Double,
    div: mat4 => mat4,
    equal: mat4 => Boolean,
    extractEulerAngles: () => vec3,
    inverse: () => mat4,
    mult: mat4 => mat4,
    multiplyDirection: vec3 => vec3,
    multiplyPoint: vec3 => vec3,
    multiplyScalar: Double => mat4,
    multiplyVector: vec4 => vec4,
    sub: mat4 => mat4,
    transpose: () => mat4
  ): mat4 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), column0 = column0.asInstanceOf[js.Any], column1 = column1.asInstanceOf[js.Any], column2 = column2.asInstanceOf[js.Any], column3 = column3.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], determinant = js.Any.fromFunction0(determinant), div = js.Any.fromFunction1(div), equal = js.Any.fromFunction1(equal), extractEulerAngles = js.Any.fromFunction0(extractEulerAngles), inverse = js.Any.fromFunction0(inverse), mult = js.Any.fromFunction1(mult), multiplyDirection = js.Any.fromFunction1(multiplyDirection), multiplyPoint = js.Any.fromFunction1(multiplyPoint), multiplyScalar = js.Any.fromFunction1(multiplyScalar), multiplyVector = js.Any.fromFunction1(multiplyVector), sub = js.Any.fromFunction1(sub), transpose = js.Any.fromFunction0(transpose))
    __obj.asInstanceOf[mat4]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: mat4] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: mat4 => mat4): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setColumn0(value: vec4): Self = StObject.set(x, "column0", value.asInstanceOf[js.Any])
    
    inline def setColumn1(value: vec4): Self = StObject.set(x, "column1", value.asInstanceOf[js.Any])
    
    inline def setColumn2(value: vec4): Self = StObject.set(x, "column2", value.asInstanceOf[js.Any])
    
    inline def setColumn3(value: vec4): Self = StObject.set(x, "column3", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDeterminant(value: () => Double): Self = StObject.set(x, "determinant", js.Any.fromFunction0(value))
    
    inline def setDiv(value: mat4 => mat4): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setEqual(value: mat4 => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setExtractEulerAngles(value: () => vec3): Self = StObject.set(x, "extractEulerAngles", js.Any.fromFunction0(value))
    
    inline def setInverse(value: () => mat4): Self = StObject.set(x, "inverse", js.Any.fromFunction0(value))
    
    inline def setMult(value: mat4 => mat4): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setMultiplyDirection(value: vec3 => vec3): Self = StObject.set(x, "multiplyDirection", js.Any.fromFunction1(value))
    
    inline def setMultiplyPoint(value: vec3 => vec3): Self = StObject.set(x, "multiplyPoint", js.Any.fromFunction1(value))
    
    inline def setMultiplyScalar(value: Double => mat4): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
    
    inline def setMultiplyVector(value: vec4 => vec4): Self = StObject.set(x, "multiplyVector", js.Any.fromFunction1(value))
    
    inline def setSub(value: mat4 => mat4): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setTranspose(value: () => mat4): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
  }
}
