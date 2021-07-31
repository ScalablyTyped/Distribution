package typings.reactDndTouchBackend

import typings.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.keydown
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mousedown
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mousemove
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mouseup
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchend
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchmove
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchstart
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  sealed trait ListenerType extends StObject
  @JSImport("react-dnd-touch-backend/lib/interfaces", "ListenerType")
  @js.native
  object ListenerType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListenerType & String] = js.native
    
    @js.native
    sealed trait keyboard
      extends StObject
         with ListenerType
    /* "keyboard" */ val keyboard: typings.reactDndTouchBackend.interfacesMod.ListenerType.keyboard & String = js.native
    
    @js.native
    sealed trait mouse
      extends StObject
         with ListenerType
    /* "mouse" */ val mouse: typings.reactDndTouchBackend.interfacesMod.ListenerType.mouse & String = js.native
    
    @js.native
    sealed trait touch
      extends StObject
         with ListenerType
    /* "touch" */ val touch: typings.reactDndTouchBackend.interfacesMod.ListenerType.touch & String = js.native
  }
  
  trait AngleRange extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object AngleRange {
    
    @scala.inline
    def apply(end: Double, start: Double): AngleRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngleRange]
    }
    
    @scala.inline
    implicit class AngleRangeMutableBuilder[Self <: AngleRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventName extends StObject {
    
    var contextmenu: js.UndefOr[typings.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu] = js.undefined
    
    var end: js.UndefOr[mouseup | touchend] = js.undefined
    
    var keydown: js.UndefOr[typings.reactDndTouchBackend.reactDndTouchBackendStrings.keydown] = js.undefined
    
    var move: js.UndefOr[mousemove | touchmove] = js.undefined
    
    var start: js.UndefOr[mousedown | touchstart] = js.undefined
  }
  object EventName {
    
    @scala.inline
    def apply(): EventName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventName]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContextmenu(value: contextmenu): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      @scala.inline
      def setEnd(value: mouseup | touchend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setKeydown(value: keydown): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      @scala.inline
      def setMove(value: mousemove | touchmove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      @scala.inline
      def setStart(value: mousedown | touchstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait TouchBackendContext extends StObject {
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object TouchBackendContext {
    
    @scala.inline
    def apply(): TouchBackendContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchBackendContext]
    }
    
    @scala.inline
    implicit class TouchBackendContextMutableBuilder[Self <: TouchBackendContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait TouchBackendOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var delayMouseStart: js.UndefOr[Double] = js.undefined
    
    var delayTouchStart: js.UndefOr[Double] = js.undefined
    
    var enableHoverOutsideTarget: js.UndefOr[Boolean] = js.undefined
    
    var enableKeyboardEvents: js.UndefOr[Boolean] = js.undefined
    
    var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
    
    var enableTouchEvents: js.UndefOr[Boolean] = js.undefined
    
    var getDropTargetElementsAtPoint: js.UndefOr[
        js.Function3[
          /* x */ Double, 
          /* y */ Double, 
          /* dropTargets */ js.Array[HTMLElement], 
          js.Array[HTMLElement]
        ]
      ] = js.undefined
    
    var ignoreContextMenu: js.UndefOr[Boolean] = js.undefined
    
    var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.undefined
    
    var touchSlop: js.UndefOr[Double] = js.undefined
  }
  object TouchBackendOptions {
    
    @scala.inline
    def apply(): TouchBackendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchBackendOptions]
    }
    
    @scala.inline
    implicit class TouchBackendOptionsMutableBuilder[Self <: TouchBackendOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMouseStart(value: Double): Self = StObject.set(x, "delayMouseStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayMouseStartUndefined: Self = StObject.set(x, "delayMouseStart", js.undefined)
      
      @scala.inline
      def setDelayTouchStart(value: Double): Self = StObject.set(x, "delayTouchStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTouchStartUndefined: Self = StObject.set(x, "delayTouchStart", js.undefined)
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEnableHoverOutsideTarget(value: Boolean): Self = StObject.set(x, "enableHoverOutsideTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHoverOutsideTargetUndefined: Self = StObject.set(x, "enableHoverOutsideTarget", js.undefined)
      
      @scala.inline
      def setEnableKeyboardEvents(value: Boolean): Self = StObject.set(x, "enableKeyboardEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableKeyboardEventsUndefined: Self = StObject.set(x, "enableKeyboardEvents", js.undefined)
      
      @scala.inline
      def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseEventsUndefined: Self = StObject.set(x, "enableMouseEvents", js.undefined)
      
      @scala.inline
      def setEnableTouchEvents(value: Boolean): Self = StObject.set(x, "enableTouchEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTouchEventsUndefined: Self = StObject.set(x, "enableTouchEvents", js.undefined)
      
      @scala.inline
      def setGetDropTargetElementsAtPoint(
        value: (/* x */ Double, /* y */ Double, /* dropTargets */ js.Array[HTMLElement]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getDropTargetElementsAtPoint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetDropTargetElementsAtPointUndefined: Self = StObject.set(x, "getDropTargetElementsAtPoint", js.undefined)
      
      @scala.inline
      def setIgnoreContextMenu(value: Boolean): Self = StObject.set(x, "ignoreContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreContextMenuUndefined: Self = StObject.set(x, "ignoreContextMenu", js.undefined)
      
      @scala.inline
      def setScrollAngleRanges(value: js.Array[AngleRange]): Self = StObject.set(x, "scrollAngleRanges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollAngleRangesUndefined: Self = StObject.set(x, "scrollAngleRanges", js.undefined)
      
      @scala.inline
      def setScrollAngleRangesVarargs(value: AngleRange*): Self = StObject.set(x, "scrollAngleRanges", js.Array(value :_*))
      
      @scala.inline
      def setTouchSlop(value: Double): Self = StObject.set(x, "touchSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchSlopUndefined: Self = StObject.set(x, "touchSlop", js.undefined)
    }
  }
}
