package typings.reactMdUtils

import typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHoverUseHoverModeContextMod {
  
  @JSImport("@react-md/utils/types/hover/useHoverModeContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/hover/useHoverModeContext", "HoverModeContextProvider")
  @js.native
  val HoverModeContextProvider: Provider[HoverModeContext] = js.native
  
  inline def useHoverModeContext(): HoverModeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverModeContext")().asInstanceOf[HoverModeContext]
  
  trait HoverModeActions extends StObject {
    
    /**
      * A function that will disable the hover mode for all connected components.
      * This should normally be called after leaving a hoverable element or the
      * {@link UserInteractionMode} changes to `"touch"`.
      */
    def disableHoverMode(): Unit
    
    /**
      * A function that will enable the hover mode for all connected components.
      * This should normally be called after hovering over an element for the
      * {@link HoverModeContext.visibleInTime}.
      */
    def enableHoverMode(): Unit
    
    /**
      * A function that will start a timer for disabling the hover mode for all
      * connected components. This should normally be called after leaving a
      * hoverable element
      */
    def startDisableTimer(): Unit
  }
  object HoverModeActions {
    
    inline def apply(disableHoverMode: () => Unit, enableHoverMode: () => Unit, startDisableTimer: () => Unit): HoverModeActions = {
      val __obj = js.Dynamic.literal(disableHoverMode = js.Any.fromFunction0(disableHoverMode), enableHoverMode = js.Any.fromFunction0(enableHoverMode), startDisableTimer = js.Any.fromFunction0(startDisableTimer))
      __obj.asInstanceOf[HoverModeActions]
    }
    
    extension [Self <: HoverModeActions](x: Self) {
      
      inline def setDisableHoverMode(value: () => Unit): Self = StObject.set(x, "disableHoverMode", js.Any.fromFunction0(value))
      
      inline def setEnableHoverMode(value: () => Unit): Self = StObject.set(x, "enableHoverMode", js.Any.fromFunction0(value))
      
      inline def setStartDisableTimer(value: () => Unit): Self = StObject.set(x, "startDisableTimer", js.Any.fromFunction0(value))
    }
  }
  
  trait HoverModeContext
    extends StObject
       with HoverModeActions {
    
    /**
      * The amount of time (in ms) before the element being hovered should
      * switch the visibility from `false` to `true`.
      */
    var visibleInTime: Double
  }
  object HoverModeContext {
    
    inline def apply(
      disableHoverMode: () => Unit,
      enableHoverMode: () => Unit,
      startDisableTimer: () => Unit,
      visibleInTime: Double
    ): HoverModeContext = {
      val __obj = js.Dynamic.literal(disableHoverMode = js.Any.fromFunction0(disableHoverMode), enableHoverMode = js.Any.fromFunction0(enableHoverMode), startDisableTimer = js.Any.fromFunction0(startDisableTimer), visibleInTime = visibleInTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverModeContext]
    }
    
    extension [Self <: HoverModeContext](x: Self) {
      
      inline def setVisibleInTime(value: Double): Self = StObject.set(x, "visibleInTime", value.asInstanceOf[js.Any])
    }
  }
}
