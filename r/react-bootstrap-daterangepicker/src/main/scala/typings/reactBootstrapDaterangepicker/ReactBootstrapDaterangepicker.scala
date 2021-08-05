package typings.reactBootstrapDaterangepicker

import typings.daterangepicker.mod.Options
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapDaterangepicker {
  
  type DateRangePicker = Component[Props, js.Object, js.Any]
  
  type EventHandler = js.Function2[/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any], js.Any]
  
  trait Props
    extends StObject
       with Options {
    
    var containerClass: js.UndefOr[String] = js.undefined
    
    var containerStyles: js.UndefOr[CSSProperties] = js.undefined
    
    var onApply: js.UndefOr[EventHandler] = js.undefined
    
    var onCancel: js.UndefOr[EventHandler] = js.undefined
    
    var onEvent: js.UndefOr[EventHandler] = js.undefined
    
    var onHide: js.UndefOr[EventHandler] = js.undefined
    
    var onHideCalendar: js.UndefOr[EventHandler] = js.undefined
    
    var onShow: js.UndefOr[EventHandler] = js.undefined
    
    var onShowCalendar: js.UndefOr[EventHandler] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      inline def setContainerStyles(value: CSSProperties): Self = StObject.set(x, "containerStyles", value.asInstanceOf[js.Any])
      
      inline def setContainerStylesUndefined: Self = StObject.set(x, "containerStyles", js.undefined)
      
      inline def setOnApply(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onApply", js.Any.fromFunction2(value))
      
      inline def setOnApplyUndefined: Self = StObject.set(x, "onApply", js.undefined)
      
      inline def setOnCancel(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnEvent(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
      
      inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      inline def setOnHide(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      inline def setOnHideCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onHideCalendar", js.Any.fromFunction2(value))
      
      inline def setOnHideCalendarUndefined: Self = StObject.set(x, "onHideCalendar", js.undefined)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      inline def setOnShowCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onShowCalendar", js.Any.fromFunction2(value))
      
      inline def setOnShowCalendarUndefined: Self = StObject.set(x, "onShowCalendar", js.undefined)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    }
  }
}
