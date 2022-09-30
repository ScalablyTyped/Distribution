package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mocksMutableValueMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/@/mocks/MutableValue", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MutableValue {
    def this(value: Any) = this()
  }
  
  @js.native
  trait MutableValue extends StObject {
    
    def value: Any = js.native
    def value_=(nextValue: Any): Unit = js.native
  }
}
