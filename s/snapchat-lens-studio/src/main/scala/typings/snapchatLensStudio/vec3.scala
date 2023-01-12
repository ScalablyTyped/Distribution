package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A three dimensional vector.
  * Lens Studio v1.0.0+
  */
trait vec3 extends StObject {
  
  /** Returns the vector plus vec. */
  def add(vec: vec3): vec3
  
  /** Returns the angle in radians between the vector and vec. */
  def angleTo(vec: vec3): Double
  
  /** Alternate name for the z component. */
  var b: Double
  
  /** Returns a copy of the vector with its length clamped to length. */
  def clampLength(length: Double): vec3
  
  /** Returns the cross product of the vector and vec */
  def cross(vec: vec3): vec3
  
  /** Returns the distance between the vector and the vector vec. */
  def distance(vec: vec3): Double
  
  /** Returns the division of the vector by the vector vec. */
  def div(vec: vec3): vec3
  
  /** Returns the dot product of the vector and vec. */
  def dot(vec: vec3): Double
  
  /** Returns whether this is equal to vec. */
  def equal(vec: vec3): Boolean
  
  /** Alternate name for the y component. */
  var g: Double
  
  /** Returns the length of the vector. */
  var length: Double
  
  /** Returns the squared length of the vector. */
  var lengthSquared: Double
  
  /** Returns a copy of the vector moved towards the point point by the amount magnitude. */
  def moveTowards(point: vec3, magnitude: Double): vec3
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  def mult(vec: vec3): vec3
  
  /** Returns a copy of the vector with its length scaled to 1. */
  def normalize(): vec3
  
  /** Returns a copy of the vector projected onto the vector vec. */
  def project(vec: vec3): vec3
  
  /** Projects the vector onto the plane represented by the normal normal. */
  def projectOnPlane(normal: vec3): vec3
  
  /** Alternate name for the x component. */
  var r: Double
  
  /** Returns a copy of the vector reflected across the plane defined by the normal vec. */
  def reflect(vec: vec3): vec3
  
  /** Returns a copy of the vector rotated towards the point point by amount. */
  def rotateTowards(point: vec3, amount: Double): vec3
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  def scale(vec: vec3): vec3
  
  /** Returns the vector minus vec. */
  def sub(vec: vec3): vec3
  
  /** Multiplies the components by the number scale. */
  def uniformScale(scale: Double): vec3
  
  /** x component of the vec3. */
  var x: Double
  
  /** y component of the vec3. */
  var y: Double
  
  /** z component of the vec3. */
  var z: Double
}
object vec3 {
  
  inline def apply(
    add: vec3 => vec3,
    angleTo: vec3 => Double,
    b: Double,
    clampLength: Double => vec3,
    cross: vec3 => vec3,
    distance: vec3 => Double,
    div: vec3 => vec3,
    dot: vec3 => Double,
    equal: vec3 => Boolean,
    g: Double,
    length: Double,
    lengthSquared: Double,
    moveTowards: (vec3, Double) => vec3,
    mult: vec3 => vec3,
    normalize: () => vec3,
    project: vec3 => vec3,
    projectOnPlane: vec3 => vec3,
    r: Double,
    reflect: vec3 => vec3,
    rotateTowards: (vec3, Double) => vec3,
    scale: vec3 => vec3,
    sub: vec3 => vec3,
    uniformScale: Double => vec3,
    x: Double,
    y: Double,
    z: Double
  ): vec3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), angleTo = js.Any.fromFunction1(angleTo), b = b.asInstanceOf[js.Any], clampLength = js.Any.fromFunction1(clampLength), cross = js.Any.fromFunction1(cross), distance = js.Any.fromFunction1(distance), div = js.Any.fromFunction1(div), dot = js.Any.fromFunction1(dot), equal = js.Any.fromFunction1(equal), g = g.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lengthSquared = lengthSquared.asInstanceOf[js.Any], moveTowards = js.Any.fromFunction2(moveTowards), mult = js.Any.fromFunction1(mult), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), projectOnPlane = js.Any.fromFunction1(projectOnPlane), r = r.asInstanceOf[js.Any], reflect = js.Any.fromFunction1(reflect), rotateTowards = js.Any.fromFunction2(rotateTowards), scale = js.Any.fromFunction1(scale), sub = js.Any.fromFunction1(sub), uniformScale = js.Any.fromFunction1(uniformScale), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[vec3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vec3] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: vec3 => vec3): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAngleTo(value: vec3 => Double): Self = StObject.set(x, "angleTo", js.Any.fromFunction1(value))
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setClampLength(value: Double => vec3): Self = StObject.set(x, "clampLength", js.Any.fromFunction1(value))
    
    inline def setCross(value: vec3 => vec3): Self = StObject.set(x, "cross", js.Any.fromFunction1(value))
    
    inline def setDistance(value: vec3 => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
    
    inline def setDiv(value: vec3 => vec3): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setDot(value: vec3 => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEqual(value: vec3 => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthSquared(value: Double): Self = StObject.set(x, "lengthSquared", value.asInstanceOf[js.Any])
    
    inline def setMoveTowards(value: (vec3, Double) => vec3): Self = StObject.set(x, "moveTowards", js.Any.fromFunction2(value))
    
    inline def setMult(value: vec3 => vec3): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: () => vec3): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setProject(value: vec3 => vec3): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
    
    inline def setProjectOnPlane(value: vec3 => vec3): Self = StObject.set(x, "projectOnPlane", js.Any.fromFunction1(value))
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setReflect(value: vec3 => vec3): Self = StObject.set(x, "reflect", js.Any.fromFunction1(value))
    
    inline def setRotateTowards(value: (vec3, Double) => vec3): Self = StObject.set(x, "rotateTowards", js.Any.fromFunction2(value))
    
    inline def setScale(value: vec3 => vec3): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setSub(value: vec3 => vec3): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setUniformScale(value: Double => vec3): Self = StObject.set(x, "uniformScale", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
