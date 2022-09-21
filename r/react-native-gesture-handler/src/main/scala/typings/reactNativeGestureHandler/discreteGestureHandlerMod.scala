package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discreteGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/DiscreteGestureHandler", JSImport.Default)
  @js.native
  abstract class default () extends DiscreteGestureHandler
  
  @js.native
  trait DiscreteGestureHandler
    extends typings.reactNativeGestureHandler.webHammerGestureHandlerMod.default {
    
    def shouldFailUnderCustomCriteria(hasXYDeltaXDeltaY: Any, hasMaxDeltaXMaxDeltaYMaxDistSqShouldCancelWhenOutside: Any): Boolean = js.native
    
    def transformNativeEvent(hasHasXY: Any): Y = js.native
  }
}
