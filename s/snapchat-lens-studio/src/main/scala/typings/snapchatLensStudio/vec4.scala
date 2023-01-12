package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A four dimensional vector.
  * Lens Studio v1.0.0+
  */
trait vec4 extends StObject {
  
  /** Alternate name for the w component. */
  var a: Double
  
  /** Returns the vector plus vec. */
  def add(vec: vec4): vec4
  
  /** Returns the angle between the vector and vec. */
  def angleTo(vec: vec4): Double
  
  /** Alternate name for the z component. */
  var b: Double
  
  /** Returns a copy of the vector with its length clamped to length. */
  def clampLength(length: Double): vec4
  
  /** Returns the distance between the vector and the vector vec. */
  def distance(vec: vec4): Double
  
  /** Returns the division of the vector by the vector vec. */
  def div(vec: vec4): vec4
  
  /** Returns the dot product of the vector and vec. */
  def dot(vec: vec4): Double
  
  /** Returns whether this is equal to vec. */
  def equal(vec: vec4): Boolean
  
  /** Alternate name for the y component. */
  var g: Double
  
  /** Returns the length of the vector. */
  var length: Double
  
  /** Returns the squared length of the vector. */
  var lengthSquared: Double
  
  /** Returns a copy of the vector moved towards the point point by the amount magnitude. */
  def moveTowards(point: vec4, magnitude: Double): vec4
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  def mult(vec: vec4): vec4
  
  /** Returns a copy of the vector with its length scaled to 1. */
  def normalize(): vec4
  
  /** Returns a copy of the vector projected onto the vector vec. */
  def project(vec: vec4): vec4
  
  /** Projects the vector onto the plane represented by the normal normal. */
  def projectOnPlane(normal: vec4): vec4
  
  /** Alternate name for the x component. */
  var r: Double
  
  /** Returns a copy of the vector reflected across the plane defined by the normal vec. */
  def reflect(vec: vec4): vec4
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  def scale(vec: vec4): vec4
  
  /** Returns the vector minus vec. */
  def sub(vec: vec4): vec4
  
  /** Multiplies the components by the number scale. */
  def uniformScale(scale: Double): vec4
  
  /** w component of the vec4. */
  var w: Double
  
  /** x component of the vec4. */
  var x: Double
  
  /** y component of the vec4. */
  var y: Double
  
  /** z component of the vec4. */
  var z: Double
}
object vec4 {
  
  inline def apply(
    a: Double,
    add: vec4 => vec4,
    angleTo: vec4 => Double,
    b: Double,
    clampLength: Double => vec4,
    distance: vec4 => Double,
    div: vec4 => vec4,
    dot: vec4 => Double,
    equal: vec4 => Boolean,
    g: Double,
    length: Double,
    lengthSquared: Double,
    moveTowards: (vec4, Double) => vec4,
    mult: vec4 => vec4,
    normalize: () => vec4,
    project: vec4 => vec4,
    projectOnPlane: vec4 => vec4,
    r: Double,
    reflect: vec4 => vec4,
    scale: vec4 => vec4,
    sub: vec4 => vec4,
    uniformScale: Double => vec4,
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): vec4 = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), angleTo = js.Any.fromFunction1(angleTo), b = b.asInstanceOf[js.Any], clampLength = js.Any.fromFunction1(clampLength), distance = js.Any.fromFunction1(distance), div = js.Any.fromFunction1(div), dot = js.Any.fromFunction1(dot), equal = js.Any.fromFunction1(equal), g = g.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lengthSquared = lengthSquared.asInstanceOf[js.Any], moveTowards = js.Any.fromFunction2(moveTowards), mult = js.Any.fromFunction1(mult), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), projectOnPlane = js.Any.fromFunction1(projectOnPlane), r = r.asInstanceOf[js.Any], reflect = js.Any.fromFunction1(reflect), scale = js.Any.fromFunction1(scale), sub = js.Any.fromFunction1(sub), uniformScale = js.Any.fromFunction1(uniformScale), w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[vec4]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vec4] (val x: Self) extends AnyVal {
    
    inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAdd(value: vec4 => vec4): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAngleTo(value: vec4 => Double): Self = StObject.set(x, "angleTo", js.Any.fromFunction1(value))
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setClampLength(value: Double => vec4): Self = StObject.set(x, "clampLength", js.Any.fromFunction1(value))
    
    inline def setDistance(value: vec4 => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
    
    inline def setDiv(value: vec4 => vec4): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setDot(value: vec4 => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEqual(value: vec4 => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthSquared(value: Double): Self = StObject.set(x, "lengthSquared", value.asInstanceOf[js.Any])
    
    inline def setMoveTowards(value: (vec4, Double) => vec4): Self = StObject.set(x, "moveTowards", js.Any.fromFunction2(value))
    
    inline def setMult(value: vec4 => vec4): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: () => vec4): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setProject(value: vec4 => vec4): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
    
    inline def setProjectOnPlane(value: vec4 => vec4): Self = StObject.set(x, "projectOnPlane", js.Any.fromFunction1(value))
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setReflect(value: vec4 => vec4): Self = StObject.set(x, "reflect", js.Any.fromFunction1(value))
    
    inline def setScale(value: vec4 => vec4): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setSub(value: vec4 => vec4): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setUniformScale(value: Double => vec4): Self = StObject.set(x, "uniformScale", js.Any.fromFunction1(value))
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
