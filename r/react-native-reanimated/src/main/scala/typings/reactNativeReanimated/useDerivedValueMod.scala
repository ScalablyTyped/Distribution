package typings.reactNativeReanimated

import typings.reactNativeReanimated.hookCommonTypesMod.DependencyList
import typings.reactNativeReanimated.reanimated2CommonTypesMod.BasicWorkletFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDerivedValueMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useDerivedValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDerivedValue[T](processor: BasicWorkletFunction[T], dependencies: DependencyList): DerivedValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDerivedValue")(processor.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[DerivedValue[T]]
  
  /* Inlined std.Readonly<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.SharedValue<T>> */
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
}
