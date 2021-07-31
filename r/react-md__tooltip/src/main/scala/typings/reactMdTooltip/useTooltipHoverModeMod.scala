package typings.reactMdTooltip

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTooltipHoverModeMod {
  
  @JSImport("@react-md/tooltip/types/useTooltipHoverMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tooltip/types/useTooltipHoverMode", "HoverModeActions")
  @js.native
  val HoverModeActions: Context[HoverModeActionsContext] = js.native
  
  @JSImport("@react-md/tooltip/types/useTooltipHoverMode", "HoverModeDelay")
  @js.native
  val HoverModeDelay: Context[Double] = js.native
  
  @JSImport("@react-md/tooltip/types/useTooltipHoverMode", "HoverModeEnabled")
  @js.native
  val HoverModeEnabled: Context[Boolean] = js.native
  
  @scala.inline
  def useTooltipHoverModeActions(): HoverModeActionsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHoverModeActions")().asInstanceOf[HoverModeActionsContext]
  
  @scala.inline
  def useTooltipHoverModeDelay(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHoverModeDelay")().asInstanceOf[Double]
  
  @scala.inline
  def useTooltipHoverModeEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHoverModeEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def useTooltipHoverModeState(defaultDelay: Double, delayTimeout: Double): TooltipHoverModeState = (^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipHoverModeState")(defaultDelay.asInstanceOf[js.Any], delayTimeout.asInstanceOf[js.Any])).asInstanceOf[TooltipHoverModeState]
  
  trait HoverModeActionsContext extends StObject {
    
    def enable(): Unit
    
    def startDisableTimer(): Unit
  }
  object HoverModeActionsContext {
    
    @scala.inline
    def apply(enable: () => Unit, startDisableTimer: () => Unit): HoverModeActionsContext = {
      val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), startDisableTimer = js.Any.fromFunction0(startDisableTimer))
      __obj.asInstanceOf[HoverModeActionsContext]
    }
    
    @scala.inline
    implicit class HoverModeActionsContextMutableBuilder[Self <: HoverModeActionsContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartDisableTimer(value: () => Unit): Self = StObject.set(x, "startDisableTimer", js.Any.fromFunction0(value))
    }
  }
  
  trait TooltipHoverModeState extends StObject {
    
    /**
      * The current delay before a tooltip should become visible.
      */
    var delay: Double
    
    /**
      * This will enable the immediate tooltip visibility functionality by updating
      * the `delay` state to be `0`. This should normally be called once a tooltip
      * becomes visible.
      */
    def enable(): Unit
    
    /**
      * Whenever a tooltip loses its visibility, this function could be called to
      * start a timer that will disable the immediate tooltip visibility once
      * complete. If another tooltip becomes visible, this timeout is automatically
      * cleared by the `enable` function.
      */
    def startDisableTimer(): Unit
  }
  object TooltipHoverModeState {
    
    @scala.inline
    def apply(delay: Double, enable: () => Unit, startDisableTimer: () => Unit): TooltipHoverModeState = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), startDisableTimer = js.Any.fromFunction0(startDisableTimer))
      __obj.asInstanceOf[TooltipHoverModeState]
    }
    
    @scala.inline
    implicit class TooltipHoverModeStateMutableBuilder[Self <: TooltipHoverModeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStartDisableTimer(value: () => Unit): Self = StObject.set(x, "startDisableTimer", js.Any.fromFunction0(value))
    }
  }
}
