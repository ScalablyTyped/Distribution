package typings.reactNativeReanimated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutableValueMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/MutableValue", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with MutableValue[T] {
    def this(value: T, setter: js.Function1[/* value */ T, Unit]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/MutableValue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/MutableValue", "default.MUTABLE_ID")
    @js.native
    def MUTABLE_ID: Double = js.native
    inline def MUTABLE_ID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUTABLE_ID")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MutableValue[T] extends StObject {
    
    var _animation: Null = js.native
    
    var _id: Double = js.native
    
    var _listeners: js.Array[js.Function0[Unit]] = js.native
    
    def _setValue(newValue: T): Unit = js.native
    
    def _setter(value: T): Unit = js.native
    
    def _triggerListener(): Unit = js.native
    
    var _value: T = js.native
    
    def addListener(listener: js.Function0[Unit]): Unit = js.native
    
    def value: T = js.native
    def value_=(nextValue: T): Unit = js.native
  }
}
