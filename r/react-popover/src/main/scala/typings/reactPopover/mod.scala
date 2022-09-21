package typings.reactPopover

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PopoverProps, js.Object, Any]
  
  type Popover = Component[PopoverProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPopover.reactPopoverStrings.above
    - typings.reactPopover.reactPopoverStrings.right
    - typings.reactPopover.reactPopoverStrings.below
    - typings.reactPopover.reactPopoverStrings.left
    - typings.reactPopover.reactPopoverStrings.row
    - typings.reactPopover.reactPopoverStrings.column
    - typings.reactPopover.reactPopoverStrings.start
    - typings.reactPopover.reactPopoverStrings.end
  */
  trait PopoverPlace extends StObject
  object PopoverPlace {
    
    inline def above: typings.reactPopover.reactPopoverStrings.above = "above".asInstanceOf[typings.reactPopover.reactPopoverStrings.above]
    
    inline def below: typings.reactPopover.reactPopoverStrings.below = "below".asInstanceOf[typings.reactPopover.reactPopoverStrings.below]
    
    inline def column: typings.reactPopover.reactPopoverStrings.column = "column".asInstanceOf[typings.reactPopover.reactPopoverStrings.column]
    
    inline def end: typings.reactPopover.reactPopoverStrings.end = "end".asInstanceOf[typings.reactPopover.reactPopoverStrings.end]
    
    inline def left: typings.reactPopover.reactPopoverStrings.left = "left".asInstanceOf[typings.reactPopover.reactPopoverStrings.left]
    
    inline def right: typings.reactPopover.reactPopoverStrings.right = "right".asInstanceOf[typings.reactPopover.reactPopoverStrings.right]
    
    inline def row: typings.reactPopover.reactPopoverStrings.row = "row".asInstanceOf[typings.reactPopover.reactPopoverStrings.row]
    
    inline def start: typings.reactPopover.reactPopoverStrings.start = "start".asInstanceOf[typings.reactPopover.reactPopoverStrings.start]
  }
  
  trait PopoverProps extends StObject {
    
    var appendTarget: js.UndefOr[Element] = js.undefined
    
    var body: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var enterExitTransitionDurationMs: js.UndefOr[Double] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var onOuterAction: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var place: js.UndefOr[PopoverPlace] = js.undefined
    
    var preferPlace: js.UndefOr[PopoverPlace] = js.undefined
    
    var refreshIntervalMs: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.UndefOr[ReactElement] = js.undefined
    
    var tipSize: js.UndefOr[Double] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setAppendTarget(value: Element): Self = StObject.set(x, "appendTarget", value.asInstanceOf[js.Any])
      
      inline def setAppendTargetUndefined: Self = StObject.set(x, "appendTarget", js.undefined)
      
      inline def setBody(value: ReactNode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnterExitTransitionDurationMs(value: Double): Self = StObject.set(x, "enterExitTransitionDurationMs", value.asInstanceOf[js.Any])
      
      inline def setEnterExitTransitionDurationMsUndefined: Self = StObject.set(x, "enterExitTransitionDurationMs", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setOnOuterAction(value: /* event */ Event => Unit): Self = StObject.set(x, "onOuterAction", js.Any.fromFunction1(value))
      
      inline def setOnOuterActionUndefined: Self = StObject.set(x, "onOuterAction", js.undefined)
      
      inline def setPlace(value: PopoverPlace): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      inline def setPreferPlace(value: PopoverPlace): Self = StObject.set(x, "preferPlace", value.asInstanceOf[js.Any])
      
      inline def setPreferPlaceUndefined: Self = StObject.set(x, "preferPlace", js.undefined)
      
      inline def setRefreshIntervalMs(value: Double): Self = StObject.set(x, "refreshIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalMsUndefined: Self = StObject.set(x, "refreshIntervalMs", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTipSize(value: Double): Self = StObject.set(x, "tipSize", value.asInstanceOf[js.Any])
      
      inline def setTipSizeUndefined: Self = StObject.set(x, "tipSize", js.undefined)
    }
  }
}
