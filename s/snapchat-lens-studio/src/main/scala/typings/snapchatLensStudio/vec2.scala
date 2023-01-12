package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A two dimensional vector.
  * Lens Studio v1.0.0+
  */
trait vec2 extends StObject {
  
  /** Returns the vector plus vec. */
  def add(vec: vec2): vec2
  
  /** Returns the angle between the vector and vec. */
  def angleTo(vec: vec2): Double
  
  /** Returns a copy of the vector with its length clamped to length. */
  def clampLength(length: Double): vec2
  
  /** Returns the distance between the vector and the vector vec. */
  def distance(vec: vec2): Double
  
  /** Returns the division of the vector by the vector vec. */
  def div(vec: vec2): vec2
  
  /** Returns the dot product of the vector and vec. */
  def dot(vec: vec2): Double
  
  /** Returns whether this is equal to vec. */
  def equal(vec: vec2): Boolean
  
  /** Alternate name for the y component. */
  var g: Double
  
  /** Returns the length of the vector. */
  var length: Double
  
  /** Returns the squared length of the vector. */
  var lengthSquared: Double
  
  /** Returns a copy of the vector moved towards the point point by the amount magnitude. */
  def moveTowards(point: vec2, magnitude: Double): vec2
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  def mult(vec: vec2): vec2
  
  /** Returns a copy of the vector with its length scaled to 1. */
  def normalize(): vec2
  
  /** Returns a copy of the vector projected onto the vector vec. */
  def project(vec: vec2): vec2
  
  /** Projects the vector onto the plane represented by the normal normal. */
  def projectOnPlane(normal: vec2): vec2
  
  /** Alternate name for the x component. */
  var r: Double
  
  /** Returns a copy of the vector reflected across the plane defined by the normal vec. */
  def reflect(vec: vec2): vec2
  
  /** Returns the component-wise multiplication product of the vector and vec. */
  def scale(vec: vec2): vec2
  
  /** Returns the vector minus vec. */
  def sub(vec: vec2): vec2
  
  /** Multiplies the components by the number scale. */
  def uniformScale(scale: Double): vec2
  
  /** x component of the vec2. */
  var x: Double
  
  /** y component of the vec2. */
  var y: Double
}
object vec2 {
  
  inline def apply(
    add: vec2 => vec2,
    angleTo: vec2 => Double,
    clampLength: Double => vec2,
    distance: vec2 => Double,
    div: vec2 => vec2,
    dot: vec2 => Double,
    equal: vec2 => Boolean,
    g: Double,
    length: Double,
    lengthSquared: Double,
    moveTowards: (vec2, Double) => vec2,
    mult: vec2 => vec2,
    normalize: () => vec2,
    project: vec2 => vec2,
    projectOnPlane: vec2 => vec2,
    r: Double,
    reflect: vec2 => vec2,
    scale: vec2 => vec2,
    sub: vec2 => vec2,
    uniformScale: Double => vec2,
    x: Double,
    y: Double
  ): vec2 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), angleTo = js.Any.fromFunction1(angleTo), clampLength = js.Any.fromFunction1(clampLength), distance = js.Any.fromFunction1(distance), div = js.Any.fromFunction1(div), dot = js.Any.fromFunction1(dot), equal = js.Any.fromFunction1(equal), g = g.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], lengthSquared = lengthSquared.asInstanceOf[js.Any], moveTowards = js.Any.fromFunction2(moveTowards), mult = js.Any.fromFunction1(mult), normalize = js.Any.fromFunction0(normalize), project = js.Any.fromFunction1(project), projectOnPlane = js.Any.fromFunction1(projectOnPlane), r = r.asInstanceOf[js.Any], reflect = js.Any.fromFunction1(reflect), scale = js.Any.fromFunction1(scale), sub = js.Any.fromFunction1(sub), uniformScale = js.Any.fromFunction1(uniformScale), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[vec2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vec2] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: vec2 => vec2): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAngleTo(value: vec2 => Double): Self = StObject.set(x, "angleTo", js.Any.fromFunction1(value))
    
    inline def setClampLength(value: Double => vec2): Self = StObject.set(x, "clampLength", js.Any.fromFunction1(value))
    
    inline def setDistance(value: vec2 => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
    
    inline def setDiv(value: vec2 => vec2): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setDot(value: vec2 => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEqual(value: vec2 => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthSquared(value: Double): Self = StObject.set(x, "lengthSquared", value.asInstanceOf[js.Any])
    
    inline def setMoveTowards(value: (vec2, Double) => vec2): Self = StObject.set(x, "moveTowards", js.Any.fromFunction2(value))
    
    inline def setMult(value: vec2 => vec2): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setNormalize(value: () => vec2): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    inline def setProject(value: vec2 => vec2): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
    
    inline def setProjectOnPlane(value: vec2 => vec2): Self = StObject.set(x, "projectOnPlane", js.Any.fromFunction1(value))
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setReflect(value: vec2 => vec2): Self = StObject.set(x, "reflect", js.Any.fromFunction1(value))
    
    inline def setScale(value: vec2 => vec2): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setSub(value: vec2 => vec2): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setUniformScale(value: Double => vec2): Self = StObject.set(x, "uniformScale", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
