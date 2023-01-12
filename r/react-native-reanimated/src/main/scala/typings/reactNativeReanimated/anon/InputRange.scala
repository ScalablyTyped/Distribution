package typings.reactNativeReanimated.anon

import typings.reactNativeReanimated.mod.Animated.Adaptable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputRange[T /* <: String | Double */] extends StObject {
  
  var inputRange: js.Array[Adaptable[Double]]
  
  var outputColorRange: js.Array[Adaptable[T]]
}
object InputRange {
  
  inline def apply[T /* <: String | Double */](inputRange: js.Array[Adaptable[Double]], outputColorRange: js.Array[Adaptable[T]]): InputRange[T] = {
    val __obj = js.Dynamic.literal(inputRange = inputRange.asInstanceOf[js.Any], outputColorRange = outputColorRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRange[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputRange[?], T /* <: String | Double */] (val x: Self & InputRange[T]) extends AnyVal {
    
    inline def setInputRange(value: js.Array[Adaptable[Double]]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
    
    inline def setInputRangeVarargs(value: Adaptable[Double]*): Self = StObject.set(x, "inputRange", js.Array(value*))
    
    inline def setOutputColorRange(value: js.Array[Adaptable[T]]): Self = StObject.set(x, "outputColorRange", value.asInstanceOf[js.Any])
    
    inline def setOutputColorRangeVarargs(value: Adaptable[T]*): Self = StObject.set(x, "outputColorRange", js.Array(value*))
  }
}
