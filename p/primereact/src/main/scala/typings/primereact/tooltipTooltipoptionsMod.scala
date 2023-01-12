package typings.primereact

import typings.primereact.primereactStrings.self
import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipoptionsMod {
  
  type TooltipAppendToType = js.UndefOr[self | HTMLElement | Null]
  
  trait TooltipEventParams extends StObject {
    
    var originalEvent: SyntheticEvent[Element, Event]
    
    var target: HTMLElement
  }
  object TooltipEventParams {
    
    inline def apply(originalEvent: SyntheticEvent[Element, Event], target: HTMLElement): TooltipEventParams = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipEventParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipEventParams] (val x: Self) extends AnyVal {
      
      inline def setOriginalEvent(value: SyntheticEvent[Element, Event]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.hover
    - typings.primereact.primereactStrings.focus
    - typings.primereact.primereactStrings.both
  */
  trait TooltipEventType extends StObject
  object TooltipEventType {
    
    inline def both: typings.primereact.primereactStrings.both = "both".asInstanceOf[typings.primereact.primereactStrings.both]
    
    inline def focus: typings.primereact.primereactStrings.focus = "focus".asInstanceOf[typings.primereact.primereactStrings.focus]
    
    inline def hover: typings.primereact.primereactStrings.hover = "hover".asInstanceOf[typings.primereact.primereactStrings.hover]
  }
  
  trait TooltipOptions extends StObject {
    
    var appendTo: js.UndefOr[TooltipAppendToType] = js.undefined
    
    var at: js.UndefOr[String] = js.undefined
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var baseZIndex: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var event: js.UndefOr[TooltipEventType] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var hideEvent: js.UndefOr[String] = js.undefined
    
    var mouseTrack: js.UndefOr[Boolean] = js.undefined
    
    var mouseTrackLeft: js.UndefOr[Double] = js.undefined
    
    var mouseTrackTop: js.UndefOr[Double] = js.undefined
    
    var my: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* e */ TooltipEventParams, Unit]] = js.undefined
    
    var position: js.UndefOr[TooltipPositionType] = js.undefined
    
    var showDelay: js.UndefOr[Double] = js.undefined
    
    var showEvent: js.UndefOr[String] = js.undefined
    
    var showOnDisabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var updateDelay: js.UndefOr[Double] = js.undefined
  }
  object TooltipOptions {
    
    inline def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
      
      inline def setAppendTo(value: TooltipAppendToType): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToNull: Self = StObject.set(x, "appendTo", null)
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setBaseZIndex(value: Double): Self = StObject.set(x, "baseZIndex", value.asInstanceOf[js.Any])
      
      inline def setBaseZIndexUndefined: Self = StObject.set(x, "baseZIndex", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEvent(value: TooltipEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setHideEvent(value: String): Self = StObject.set(x, "hideEvent", value.asInstanceOf[js.Any])
      
      inline def setHideEventUndefined: Self = StObject.set(x, "hideEvent", js.undefined)
      
      inline def setMouseTrack(value: Boolean): Self = StObject.set(x, "mouseTrack", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeft(value: Double): Self = StObject.set(x, "mouseTrackLeft", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackLeftUndefined: Self = StObject.set(x, "mouseTrackLeft", js.undefined)
      
      inline def setMouseTrackTop(value: Double): Self = StObject.set(x, "mouseTrackTop", value.asInstanceOf[js.Any])
      
      inline def setMouseTrackTopUndefined: Self = StObject.set(x, "mouseTrackTop", js.undefined)
      
      inline def setMouseTrackUndefined: Self = StObject.set(x, "mouseTrack", js.undefined)
      
      inline def setMy(value: String): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
      
      inline def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
      
      inline def setOnBeforeHide(value: /* e */ TooltipEventParams => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* e */ TooltipEventParams => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* e */ TooltipEventParams => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* e */ TooltipEventParams => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: TooltipPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setShowEvent(value: String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
      
      inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
      
      inline def setShowOnDisabled(value: Boolean): Self = StObject.set(x, "showOnDisabled", value.asInstanceOf[js.Any])
      
      inline def setShowOnDisabledUndefined: Self = StObject.set(x, "showOnDisabled", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
      
      inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.top
    - typings.primereact.primereactStrings.bottom
    - typings.primereact.primereactStrings.left
    - typings.primereact.primereactStrings.right
  */
  trait TooltipPositionType extends StObject
  object TooltipPositionType {
    
    inline def bottom: typings.primereact.primereactStrings.bottom = "bottom".asInstanceOf[typings.primereact.primereactStrings.bottom]
    
    inline def left: typings.primereact.primereactStrings.left = "left".asInstanceOf[typings.primereact.primereactStrings.left]
    
    inline def right: typings.primereact.primereactStrings.right = "right".asInstanceOf[typings.primereact.primereactStrings.right]
    
    inline def top: typings.primereact.primereactStrings.top = "top".asInstanceOf[typings.primereact.primereactStrings.top]
  }
}
