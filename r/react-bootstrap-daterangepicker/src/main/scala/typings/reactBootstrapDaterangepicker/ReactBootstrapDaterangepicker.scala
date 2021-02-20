package typings.reactBootstrapDaterangepicker

import typings.daterangepicker.mod.Options
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapDaterangepicker {
  
  type DateRangePicker = Component[Props, js.Object, js.Any]
  
  type EventHandler = js.Function2[/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any], js.Any]
  
  @js.native
  trait Props extends Options {
    
    var containerClass: js.UndefOr[String] = js.native
    
    var containerStyles: js.UndefOr[CSSProperties] = js.native
    
    var onApply: js.UndefOr[EventHandler] = js.native
    
    var onCancel: js.UndefOr[EventHandler] = js.native
    
    var onEvent: js.UndefOr[EventHandler] = js.native
    
    var onHide: js.UndefOr[EventHandler] = js.native
    
    var onHideCalendar: js.UndefOr[EventHandler] = js.native
    
    var onShow: js.UndefOr[EventHandler] = js.native
    
    var onShowCalendar: js.UndefOr[EventHandler] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
      
      @scala.inline
      def setContainerStyles(value: CSSProperties): Self = StObject.set(x, "containerStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStylesUndefined: Self = StObject.set(x, "containerStyles", js.undefined)
      
      @scala.inline
      def setOnApply(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onApply", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnApplyUndefined: Self = StObject.set(x, "onApply", js.undefined)
      
      @scala.inline
      def setOnCancel(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnEvent(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      @scala.inline
      def setOnHide(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHideCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onHideCalendar", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHideCalendarUndefined: Self = StObject.set(x, "onHideCalendar", js.undefined)
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "onShowCalendar", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnShowCalendarUndefined: Self = StObject.set(x, "onShowCalendar", js.undefined)
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    }
  }
}
