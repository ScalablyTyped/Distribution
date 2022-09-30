package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A quaternion, used to represent rotation. */
trait quat extends StObject {
  
  /** Returns the dot product of the two quats. */
  def dot(quat: quat): Double
  
  /** Returns whether this quat and b are equal. */
  def equal(b: quat): Boolean
  
  /** Returns the rotation angle of the quat. */
  def getAngle(): Double
  
  /** Returns the rotation axis of the quat. */
  def getAxis(): vec3
  
  /** Returns an inverted version of the quat. */
  def invert(): quat
  
  /** Returns the product of this quat and b. */
  def multiply(b: quat): quat
  
  /** Returns the result of rotating direction vector vec3 by this quat. */
  def multiplyVec3(vec3: vec3): vec3
  
  /** Normalizes the quat. */
  def normalize(): Unit
  
  /** Returns an euler angle representation of the quat, in radians. */
  def toEulerAngles(): vec3
  
  /** w component of the quat. */
  var w: Double
  
  /** x component of the quat. */
  var x: Double
  
  /** y component of the quat. */
  var y: Double
  
  /** z component of the quat. */
  var z: Double
}
object quat {
  
  inline def apply(
    dot: quat => Double,
    equal: quat => Boolean,
    getAngle: () => Double,
    getAxis: () => vec3,
    invert: () => quat,
    multiply: quat => quat,
    multiplyVec3: vec3 => vec3,
    normalize: () => Unit,
    toEulerAngles: () => vec3,
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): quat = {
    val __obj = js.Dynamic.literal(dot = js.Any.fromFunction1(dot), equal = js.Any.fromFunction1(equal), getAngle = js.Any.fromFunction0(getAngle), getAxis = js.Any.fromFunction0(getAxis), invert = js.Any.fromFunction0(invert), multiply = js.Any.fromFunction1(multiply), multiplyVec3 = js.Any.fromFunction1(multiplyVec3), normalize = js.Any.fromFunction0(normalize), toEulerAngles = js.Any.fromFunction0(toEulerAngles), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[quat]
  }
  
  extension [Self <: quat](x: Self) {
    
    inline def setDot(value: quat => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEqual(value: quat => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setGetAngle(value: () => Double): Self = StObject.set(x, "getAngle", js.Any.fromFunction0(value))
    
    inline def setGetAxis(value: () => vec3): Self = StObject.set(x, "getAxis", js.Any.fromFunction0(value))
    
    inline def setInvert(value: () => quat): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
    
    inline def setMultiply(value: quat => quat): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyVec3(value: vec3 => vec3): Self = StObject.set(x, "multiplyVec3", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setToEulerAngles(value: () => vec3): Self = StObject.set(x, "toEulerAngles", js.Any.fromFunction0(value))
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
