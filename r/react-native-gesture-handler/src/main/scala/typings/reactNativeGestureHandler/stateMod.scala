package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.interfacesMod._TouchNativeArgs
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`0`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`3`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  /* Inlined { readonly UNDETERMINED :0,  readonly FAILED :1,  readonly BEGAN :2,  readonly CANCELLED :3,  readonly ACTIVE :4,  readonly END :5}[keyof { readonly UNDETERMINED :0,  readonly FAILED :1,  readonly BEGAN :2,  readonly CANCELLED :3,  readonly ACTIVE :4,  readonly END :5}] */
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`3`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`0`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`5`
    - typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
  */
  trait State
    extends StObject
       with _TouchNativeArgs
  object State {
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.ACTIVE")
    @js.native
    val ACTIVE: `4` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.BEGAN")
    @js.native
    val BEGAN: `2` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.CANCELLED")
    @js.native
    val CANCELLED: `3` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.END")
    @js.native
    val END: `5` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.FAILED")
    @js.native
    val FAILED: `1` = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/State", "State.UNDETERMINED")
    @js.native
    val UNDETERMINED: `0` = js.native
  }
}
