package typings.reactDndTouchBackend

import typings.reactDndTouchBackend.reactDndTouchBackendStrings.contextmenu
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.keydown
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mousedown
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mousemove
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.mouseup
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchend
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchmove
import typings.reactDndTouchBackend.reactDndTouchBackendStrings.touchstart
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesMod {
  
  @js.native
  sealed trait ListenerType extends StObject
  @JSImport("react-dnd-touch-backend/dist/interfaces", "ListenerType")
  @js.native
  object ListenerType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListenerType & String] = js.native
    
    @js.native
    sealed trait keyboard
      extends StObject
         with ListenerType
    /* "keyboard" */ val keyboard: typings.reactDndTouchBackend.distInterfacesMod.ListenerType.keyboard & String = js.native
    
    @js.native
    sealed trait mouse
      extends StObject
         with ListenerType
    /* "mouse" */ val mouse: typings.reactDndTouchBackend.distInterfacesMod.ListenerType.mouse & String = js.native
    
    @js.native
    sealed trait touch
      extends StObject
         with ListenerType
    /* "touch" */ val touch: typings.reactDndTouchBackend.distInterfacesMod.ListenerType.touch & String = js.native
  }
  
  trait AngleRange extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object AngleRange {
    
    inline def apply(end: Double, start: Double): AngleRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngleRange]
    }
    
    extension [Self <: AngleRange](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
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
    
    inline def apply(): EventName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventName]
    }
    
    extension [Self <: EventName](x: Self) {
      
      inline def setContextmenu(value: contextmenu): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      inline def setEnd(value: mouseup | touchend): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setKeydown(value: keydown): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      inline def setMove(value: mousemove | touchmove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setStart(value: mousedown | touchstart): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait TouchBackendContext extends StObject {
    
    var document: js.UndefOr[Document] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object TouchBackendContext {
    
    inline def apply(): TouchBackendContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TouchBackendContext]
    }
    
    extension [Self <: TouchBackendContext](x: Self) {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait TouchBackendOptions extends StObject {
    
    var delay: Double
    
    var delayMouseStart: Double
    
    var delayTouchStart: Double
    
    var enableHoverOutsideTarget: Boolean
    
    var enableKeyboardEvents: Boolean
    
    var enableMouseEvents: Boolean
    
    var enableTouchEvents: Boolean
    
    var getDropTargetElementsAtPoint: js.UndefOr[
        js.Function3[
          /* x */ Double, 
          /* y */ Double, 
          /* dropTargets */ js.Array[HTMLElement], 
          js.Array[HTMLElement]
        ]
      ] = js.undefined
    
    var ignoreContextMenu: Boolean
    
    var rootElement: js.UndefOr[Node] = js.undefined
    
    var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.undefined
    
    var touchSlop: Double
  }
  object TouchBackendOptions {
    
    inline def apply(
      delay: Double,
      delayMouseStart: Double,
      delayTouchStart: Double,
      enableHoverOutsideTarget: Boolean,
      enableKeyboardEvents: Boolean,
      enableMouseEvents: Boolean,
      enableTouchEvents: Boolean,
      ignoreContextMenu: Boolean,
      touchSlop: Double
    ): TouchBackendOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], delayMouseStart = delayMouseStart.asInstanceOf[js.Any], delayTouchStart = delayTouchStart.asInstanceOf[js.Any], enableHoverOutsideTarget = enableHoverOutsideTarget.asInstanceOf[js.Any], enableKeyboardEvents = enableKeyboardEvents.asInstanceOf[js.Any], enableMouseEvents = enableMouseEvents.asInstanceOf[js.Any], enableTouchEvents = enableTouchEvents.asInstanceOf[js.Any], ignoreContextMenu = ignoreContextMenu.asInstanceOf[js.Any], touchSlop = touchSlop.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchBackendOptions]
    }
    
    extension [Self <: TouchBackendOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayMouseStart(value: Double): Self = StObject.set(x, "delayMouseStart", value.asInstanceOf[js.Any])
      
      inline def setDelayTouchStart(value: Double): Self = StObject.set(x, "delayTouchStart", value.asInstanceOf[js.Any])
      
      inline def setEnableHoverOutsideTarget(value: Boolean): Self = StObject.set(x, "enableHoverOutsideTarget", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyboardEvents(value: Boolean): Self = StObject.set(x, "enableKeyboardEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchEvents(value: Boolean): Self = StObject.set(x, "enableTouchEvents", value.asInstanceOf[js.Any])
      
      inline def setGetDropTargetElementsAtPoint(
        value: (/* x */ Double, /* y */ Double, /* dropTargets */ js.Array[HTMLElement]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getDropTargetElementsAtPoint", js.Any.fromFunction3(value))
      
      inline def setGetDropTargetElementsAtPointUndefined: Self = StObject.set(x, "getDropTargetElementsAtPoint", js.undefined)
      
      inline def setIgnoreContextMenu(value: Boolean): Self = StObject.set(x, "ignoreContextMenu", value.asInstanceOf[js.Any])
      
      inline def setRootElement(value: Node): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
      
      inline def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
      
      inline def setScrollAngleRanges(value: js.Array[AngleRange]): Self = StObject.set(x, "scrollAngleRanges", value.asInstanceOf[js.Any])
      
      inline def setScrollAngleRangesUndefined: Self = StObject.set(x, "scrollAngleRanges", js.undefined)
      
      inline def setScrollAngleRangesVarargs(value: AngleRange*): Self = StObject.set(x, "scrollAngleRanges", js.Array(value*))
      
      inline def setTouchSlop(value: Double): Self = StObject.set(x, "touchSlop", value.asInstanceOf[js.Any])
    }
  }
}
