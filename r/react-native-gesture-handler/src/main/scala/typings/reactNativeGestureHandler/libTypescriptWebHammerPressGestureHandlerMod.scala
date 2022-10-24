package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.ConfigshouldCancelWhenOut
import typings.reactNativeGestureHandler.anon.DisallowInterruption
import typings.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import typings.reactNativeGestureHandler.libTypescriptWebHammerGestureHandlerMod.HammerInputExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHammerPressGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/PressGestureHandler", JSImport.Default)
  @js.native
  open class default () extends PressGestureHandler
  
  @js.native
  trait PressGestureHandler
    extends typings.reactNativeGestureHandler.libTypescriptWebHammerDiscreteGestureHandlerMod.default {
    
    /* private */ var initialEvent: Any = js.native
    
    def maxDist: js.UndefOr[Double] = js.native
    
    def minDurationMs: Any = js.native
    
    def onGestureStart(ev: HammerInputExt): Unit = js.native
    
    def sendGestureStartedEvent(ev: HammerInputExt): Unit = js.native
    
    def shouldDelayTouchForEvent(param0: HammerInputExt): Boolean = js.native
    
    var shouldDelayTouches: Boolean = js.native
    
    def simulateCancelEvent(inputData: HammerInputExt): Unit = js.native
    
    def updateGestureConfig(param0: DisallowInterruption): PartialenabledbooleanminP = js.native
    
    def updateHasCustomActivationCriteria(param0: ConfigshouldCancelWhenOut): Boolean = js.native
    
    /* private */ var visualFeedbackTimer: Any = js.native
  }
}
