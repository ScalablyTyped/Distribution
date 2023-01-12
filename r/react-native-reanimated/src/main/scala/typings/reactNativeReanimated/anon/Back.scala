package typings.reactNativeReanimated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back extends StObject {
  
  def back(t: Any): Any
  
  def bezier(): `1`
  
  def bezierFn(t: Any): Any
  
  def bounce(t: Any): Any
  
  def circle(t: Any): Any
  
  def cubic(t: Any): Any
  
  def ease(t: Any): Any
  
  def elastic(t: Any): Any
  
  def exp(t: Any): Any
  
  def in(t: Any): Any
  
  def inOut(t: Any): Any
  
  def linear(t: Any): Any
  
  def out(t: Any): Any
  
  def poly(t: Any): Any
  
  def quad(t: Any): Any
  
  def sin(t: Any): Any
}
object Back {
  
  inline def apply(
    back: Any => Any,
    bezier: () => `1`,
    bezierFn: Any => Any,
    bounce: Any => Any,
    circle: Any => Any,
    cubic: Any => Any,
    ease: Any => Any,
    elastic: Any => Any,
    exp: Any => Any,
    in: Any => Any,
    inOut: Any => Any,
    linear: Any => Any,
    out: Any => Any,
    poly: Any => Any,
    quad: Any => Any,
    sin: Any => Any
  ): Back = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), bezier = js.Any.fromFunction0(bezier), bezierFn = js.Any.fromFunction1(bezierFn), bounce = js.Any.fromFunction1(bounce), circle = js.Any.fromFunction1(circle), cubic = js.Any.fromFunction1(cubic), ease = js.Any.fromFunction1(ease), elastic = js.Any.fromFunction1(elastic), exp = js.Any.fromFunction1(exp), in = js.Any.fromFunction1(in), inOut = js.Any.fromFunction1(inOut), linear = js.Any.fromFunction1(linear), out = js.Any.fromFunction1(out), poly = js.Any.fromFunction1(poly), quad = js.Any.fromFunction1(quad), sin = js.Any.fromFunction1(sin))
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
    
    inline def setBack(value: Any => Any): Self = StObject.set(x, "back", js.Any.fromFunction1(value))
    
    inline def setBezier(value: () => `1`): Self = StObject.set(x, "bezier", js.Any.fromFunction0(value))
    
    inline def setBezierFn(value: Any => Any): Self = StObject.set(x, "bezierFn", js.Any.fromFunction1(value))
    
    inline def setBounce(value: Any => Any): Self = StObject.set(x, "bounce", js.Any.fromFunction1(value))
    
    inline def setCircle(value: Any => Any): Self = StObject.set(x, "circle", js.Any.fromFunction1(value))
    
    inline def setCubic(value: Any => Any): Self = StObject.set(x, "cubic", js.Any.fromFunction1(value))
    
    inline def setEase(value: Any => Any): Self = StObject.set(x, "ease", js.Any.fromFunction1(value))
    
    inline def setElastic(value: Any => Any): Self = StObject.set(x, "elastic", js.Any.fromFunction1(value))
    
    inline def setExp(value: Any => Any): Self = StObject.set(x, "exp", js.Any.fromFunction1(value))
    
    inline def setIn(value: Any => Any): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setInOut(value: Any => Any): Self = StObject.set(x, "inOut", js.Any.fromFunction1(value))
    
    inline def setLinear(value: Any => Any): Self = StObject.set(x, "linear", js.Any.fromFunction1(value))
    
    inline def setOut(value: Any => Any): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
    
    inline def setPoly(value: Any => Any): Self = StObject.set(x, "poly", js.Any.fromFunction1(value))
    
    inline def setQuad(value: Any => Any): Self = StObject.set(x, "quad", js.Any.fromFunction1(value))
    
    inline def setSin(value: Any => Any): Self = StObject.set(x, "sin", js.Any.fromFunction1(value))
  }
}
