package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.ConfigshouldCancelWhenOut
import typings.reactNativeGestureHandler.anon.DisallowInterruption
import typings.reactNativeGestureHandler.anon.PartialenabledbooleanminP
import typings.reactNativeGestureHandler.webHammerGestureHandlerMod.HammerInputExt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pressGestureHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/PressGestureHandler", JSImport.Default)
  @js.native
  open class default () extends PressGestureHandler
  
  @js.native
  trait PressGestureHandler
    extends typings.reactNativeGestureHandler.discreteGestureHandlerMod.default {
    
    /* private */ var initialEvent: Any = js.native
    
    def maxDist: js.UndefOr[Double] = js.native
    
    def minDurationMs: Any = js.native
    
    def onGestureStart(ev: HammerInputExt): Unit = js.native
    
    def sendGestureStartedEvent(ev: HammerInputExt): Unit = js.native
    
    def shouldDelayTouchForEvent(hasPointerType: HammerInputExt): Boolean = js.native
    
    var shouldDelayTouches: Boolean = js.native
    
    def simulateCancelEvent(inputData: HammerInputExt): Unit = js.native
    
    def updateGestureConfig(
      hasShouldActivateOnStartDisallowInterruptionShouldCancelWhenOutsideMinDurationMsMaxDistMinPointersMaxPointersProps: DisallowInterruption
    ): PartialenabledbooleanminP = js.native
    
    def updateHasCustomActivationCriteria(hasShouldCancelWhenOutsideMaxDistSq: ConfigshouldCancelWhenOut): Boolean = js.native
    
    /* private */ var visualFeedbackTimer: Any = js.native
  }
}
