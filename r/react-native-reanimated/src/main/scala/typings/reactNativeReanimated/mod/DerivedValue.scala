package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-reanimated.react-native-reanimated.Animated.DerivedValue<T> */
trait DerivedValue[T] extends StObject {
  
  val value: T
}
object DerivedValue {
  
  inline def apply[T](value: T): DerivedValue[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedValue[T]]
  }
  
  extension [Self <: DerivedValue[?], T](x: Self & DerivedValue[T]) {
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
