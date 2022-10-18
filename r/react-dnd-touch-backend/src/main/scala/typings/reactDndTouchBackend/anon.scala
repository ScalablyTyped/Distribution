package typings.reactDndTouchBackend

import typings.reactDndTouchBackend.distInterfacesMod.AngleRange
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-dnd-touch-backend.react-dnd-touch-backend/dist/interfaces.TouchBackendOptions> */
  trait PartialTouchBackendOption extends StObject {
    
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
    
    var rootElement: js.UndefOr[Node] = js.undefined
    
    var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.undefined
    
    var touchSlop: js.UndefOr[Double] = js.undefined
  }
  object PartialTouchBackendOption {
    
    inline def apply(): PartialTouchBackendOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTouchBackendOption]
    }
    
    extension [Self <: PartialTouchBackendOption](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayMouseStart(value: Double): Self = StObject.set(x, "delayMouseStart", value.asInstanceOf[js.Any])
      
      inline def setDelayMouseStartUndefined: Self = StObject.set(x, "delayMouseStart", js.undefined)
      
      inline def setDelayTouchStart(value: Double): Self = StObject.set(x, "delayTouchStart", value.asInstanceOf[js.Any])
      
      inline def setDelayTouchStartUndefined: Self = StObject.set(x, "delayTouchStart", js.undefined)
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEnableHoverOutsideTarget(value: Boolean): Self = StObject.set(x, "enableHoverOutsideTarget", value.asInstanceOf[js.Any])
      
      inline def setEnableHoverOutsideTargetUndefined: Self = StObject.set(x, "enableHoverOutsideTarget", js.undefined)
      
      inline def setEnableKeyboardEvents(value: Boolean): Self = StObject.set(x, "enableKeyboardEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableKeyboardEventsUndefined: Self = StObject.set(x, "enableKeyboardEvents", js.undefined)
      
      inline def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseEventsUndefined: Self = StObject.set(x, "enableMouseEvents", js.undefined)
      
      inline def setEnableTouchEvents(value: Boolean): Self = StObject.set(x, "enableTouchEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchEventsUndefined: Self = StObject.set(x, "enableTouchEvents", js.undefined)
      
      inline def setGetDropTargetElementsAtPoint(
        value: (/* x */ Double, /* y */ Double, /* dropTargets */ js.Array[HTMLElement]) => js.Array[HTMLElement]
      ): Self = StObject.set(x, "getDropTargetElementsAtPoint", js.Any.fromFunction3(value))
      
      inline def setGetDropTargetElementsAtPointUndefined: Self = StObject.set(x, "getDropTargetElementsAtPoint", js.undefined)
      
      inline def setIgnoreContextMenu(value: Boolean): Self = StObject.set(x, "ignoreContextMenu", value.asInstanceOf[js.Any])
      
      inline def setIgnoreContextMenuUndefined: Self = StObject.set(x, "ignoreContextMenu", js.undefined)
      
      inline def setRootElement(value: Node): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
      
      inline def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
      
      inline def setScrollAngleRanges(value: js.Array[AngleRange]): Self = StObject.set(x, "scrollAngleRanges", value.asInstanceOf[js.Any])
      
      inline def setScrollAngleRangesUndefined: Self = StObject.set(x, "scrollAngleRanges", js.undefined)
      
      inline def setScrollAngleRangesVarargs(value: AngleRange*): Self = StObject.set(x, "scrollAngleRanges", js.Array(value*))
      
      inline def setTouchSlop(value: Double): Self = StObject.set(x, "touchSlop", value.asInstanceOf[js.Any])
      
      inline def setTouchSlopUndefined: Self = StObject.set(x, "touchSlop", js.undefined)
    }
  }
}
