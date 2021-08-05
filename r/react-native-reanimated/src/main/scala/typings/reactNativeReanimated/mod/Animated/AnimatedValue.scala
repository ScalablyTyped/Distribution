package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedValue[T /* <: Value */]
  extends StObject
     with AnimatedNode[T] {
  
  def interpolate(config: InterpolationConfig): AnimatedNode[Double]
  
  def setValue(value: Adaptable[T]): Unit
}
object AnimatedValue {
  
  inline def apply[T /* <: Value */](
    Space__value: T,
    interpolate: InterpolationConfig => AnimatedNode[Double],
    isNativelyInitialized: () => Boolean,
    setValue: Adaptable[T] => Unit
  ): AnimatedValue[T] = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction1(interpolate), isNativelyInitialized = js.Any.fromFunction0(isNativelyInitialized), setValue = js.Any.fromFunction1(setValue))
    __obj.updateDynamic(" __value")(Space__value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedValue[T]]
  }
  
  extension [Self <: AnimatedValue[?], T /* <: Value */](x: Self & AnimatedValue[T]) {
    
    inline def setInterpolate(value: InterpolationConfig => AnimatedNode[Double]): Self = StObject.set(x, "interpolate", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: Adaptable[T] => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
