package typings.reactMdUtils

import typings.react.mod.Dispatch
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SetStateAction
import typings.reactMdUtils.anon.ReadonlyHoverModeEventHan
import typings.reactMdUtils.anon.ReadonlyHoverModeHoverEve
import typings.reactMdUtils.useHoverModeContextMod.HoverModeActions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHoverModeMod {
  
  @JSImport("@react-md/utils/types/hover/useHoverMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHoverMode(): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")().asInstanceOf[HoverModeHookReturnValue]
  inline def useHoverMode(hasDisabledDefaultVisibleExitVisibilityDelay: HoverModeOptions): HoverModeHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHoverMode")(hasDisabledDefaultVisibleExitVisibilityDelay.asInstanceOf[js.Any]).asInstanceOf[HoverModeHookReturnValue]
  
  trait HoverModeEventHandlers
    extends StObject
       with HoverModeHoverEventHandlers {
    
    /**
      * An optional event handler to merge with the hover mode visibility handler.
      * If this function calls `event.stopPropagation()`, the hover mode behavior
      * will be disabled.
      */
    def onClick[E /* <: HTMLElement */](event: MouseEvent[E, NativeMouseEvent]): Unit
  }
  object HoverModeEventHandlers {
    
    inline def apply(
      onClick: MouseEvent[Any, NativeMouseEvent] => Unit,
      onMouseEnter: MouseEvent[Any, NativeMouseEvent] => Unit,
      onMouseLeave: MouseEvent[Any, NativeMouseEvent] => Unit
    ): HoverModeEventHandlers = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave))
      __obj.asInstanceOf[HoverModeEventHandlers]
    }
    
    extension [Self <: HoverModeEventHandlers](x: Self) {
      
      inline def setOnClick(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  trait HoverModeHookReturnValue
    extends StObject
       with HoverModeActions
       with HoverModeEventHandlers {
    
    /**
      * Boolean if the hover mode is currently working.
      */
    var active: Boolean
    
    /**
      * Clears the current `onMouseEnter` visibility timer.
      *
      * @remarks \@since 5.0.0
      */
    def clearHoverTimeout(): Unit
    
    /**
      * A convenience prop that allows you to spread all the hover mode event
      * handlers onto a single component if no custom functionality is required.
      *
      * @remarks \@since 5.0.0
      */
    var handlers: ReadonlyHoverModeEventHan
    
    /**
      * A convenience prop that allows you to spread only the `onMouseEnter` and
      * `onMouseLeave` the hover mode event handlers onto a single component if no
      * custom functionality is required.
      *
      * @remarks \@since 5.0.0
      */
    var hoverHandlers: ReadonlyHoverModeHoverEve
    
    /**
      * A function to manually set the visibility state if you need even more
      * custom behavior.
      */
    var setVisible: Dispatch[SetStateAction[Boolean]]
    
    /**
      * Boolean if the the `visible` state is `true` because the user clicked an
      * element.
      */
    var stuck: Boolean
    
    /**
      * Boolean if the temporary element should be visible.
      */
    var visible: Boolean
  }
  object HoverModeHookReturnValue {
    
    inline def apply(
      active: Boolean,
      clearHoverTimeout: () => Unit,
      disableHoverMode: () => Unit,
      enableHoverMode: () => Unit,
      handlers: ReadonlyHoverModeEventHan,
      hoverHandlers: ReadonlyHoverModeHoverEve,
      onClick: MouseEvent[Any, NativeMouseEvent] => Unit,
      onMouseEnter: MouseEvent[Any, NativeMouseEvent] => Unit,
      onMouseLeave: MouseEvent[Any, NativeMouseEvent] => Unit,
      setVisible: SetStateAction[Boolean] => Unit,
      startDisableTimer: () => Unit,
      stuck: Boolean,
      visible: Boolean
    ): HoverModeHookReturnValue = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clearHoverTimeout = js.Any.fromFunction0(clearHoverTimeout), disableHoverMode = js.Any.fromFunction0(disableHoverMode), enableHoverMode = js.Any.fromFunction0(enableHoverMode), handlers = handlers.asInstanceOf[js.Any], hoverHandlers = hoverHandlers.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), setVisible = js.Any.fromFunction1(setVisible), startDisableTimer = js.Any.fromFunction0(startDisableTimer), stuck = stuck.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[HoverModeHookReturnValue]
    }
    
    extension [Self <: HoverModeHookReturnValue](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClearHoverTimeout(value: () => Unit): Self = StObject.set(x, "clearHoverTimeout", js.Any.fromFunction0(value))
      
      inline def setHandlers(value: ReadonlyHoverModeEventHan): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHoverHandlers(value: ReadonlyHoverModeHoverEve): Self = StObject.set(x, "hoverHandlers", value.asInstanceOf[js.Any])
      
      inline def setSetVisible(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      inline def setStuck(value: Boolean): Self = StObject.set(x, "stuck", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait HoverModeHoverEventHandlers extends StObject {
    
    /**
      * An optional event handler to merge with the hover mode visibility handler.
      * If this function calls `event.stopPropagation()`, the hover mode behavior
      * will be disabled.
      */
    def onMouseEnter[E /* <: HTMLElement */](event: MouseEvent[E, NativeMouseEvent]): Unit
    
    /**
      * An optional event handler to merge with the hover mode visibility handler.
      * If this function calls `event.stopPropagation()`, the hover mode behavior
      * will be disabled.
      */
    def onMouseLeave[E /* <: HTMLElement */](event: MouseEvent[E, NativeMouseEvent]): Unit
  }
  object HoverModeHoverEventHandlers {
    
    inline def apply(
      onMouseEnter: MouseEvent[Any, NativeMouseEvent] => Unit,
      onMouseLeave: MouseEvent[Any, NativeMouseEvent] => Unit
    ): HoverModeHoverEventHandlers = {
      val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave))
      __obj.asInstanceOf[HoverModeHoverEventHandlers]
    }
    
    extension [Self <: HoverModeHoverEventHandlers](x: Self) {
      
      inline def setOnMouseEnter(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeave(value: MouseEvent[Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    }
  }
  
  trait HoverModeOptions extends StObject {
    
    /**
      * Boolean if the element should start visible.
      *
      * @defaultValue `false`
      */
    var defaultVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the hover mode functionality should be disabled.
      *
      * @defaultValue `false`
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of time to wait once the mouse has left the element before
      * setting the visibility to `false`.
      *
      * @defaultValue {@link DEFAULT_HOVER_MODE_EXIT_TIME}
      */
    var exitVisibilityDelay: js.UndefOr[Double] = js.undefined
  }
  object HoverModeOptions {
    
    inline def apply(): HoverModeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverModeOptions]
    }
    
    extension [Self <: HoverModeOptions](x: Self) {
      
      inline def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExitVisibilityDelay(value: Double): Self = StObject.set(x, "exitVisibilityDelay", value.asInstanceOf[js.Any])
      
      inline def setExitVisibilityDelayUndefined: Self = StObject.set(x, "exitVisibilityDelay", js.undefined)
    }
  }
}
