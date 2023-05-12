package typings.reactCalendar

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactCalendar.distCjsSharedTypesMod.Action
import typings.reactCalendar.distCjsSharedTypesMod.NavigationLabelArgs
import typings.reactCalendar.distCjsSharedTypesMod.NavigationLabelFunc
import typings.reactCalendar.distCjsSharedTypesMod.RangeType
import typings.reactCalendar.reactCalendarStrings.assertive
import typings.reactCalendar.reactCalendarStrings.off
import typings.reactCalendar.reactCalendarStrings.polite
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsCalendarNavigationMod {
  
  object default {
    
    inline def apply(param0: NavigationProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-calendar/dist/cjs/Calendar/Navigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.activeStartDate")
      @js.native
      def activeStartDate: Validator[js.Date] = js.native
      inline def activeStartDate_=(x: Validator[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.drillUp")
      @js.native
      def drillUp: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def drillUp_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drillUp")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.formatMonthYear")
      @js.native
      def formatMonthYear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatMonthYear_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMonthYear")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.formatYear")
      @js.native
      def formatYear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def formatYear_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatYear")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.locale")
      @js.native
      def locale: Requireable[String] = js.native
      inline def locale_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.maxDate")
      @js.native
      def maxDate: Requireable[js.Date] = js.native
      inline def maxDate_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.minDate")
      @js.native
      def minDate: Requireable[js.Date] = js.native
      inline def minDate_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.navigationAriaLabel")
      @js.native
      def navigationAriaLabel: Requireable[String] = js.native
      inline def navigationAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.navigationAriaLive")
      @js.native
      def navigationAriaLive: Requireable[String] = js.native
      inline def navigationAriaLive_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationAriaLive")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.navigationLabel")
      @js.native
      def navigationLabel: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def navigationLabel_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigationLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.next2AriaLabel")
      @js.native
      def next2AriaLabel: Requireable[String] = js.native
      inline def next2AriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next2AriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.next2Label")
      @js.native
      def next2Label: Requireable[ReactNodeLike] = js.native
      inline def next2Label_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("next2Label")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.nextAriaLabel")
      @js.native
      def nextAriaLabel: Requireable[String] = js.native
      inline def nextAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.nextLabel")
      @js.native
      def nextLabel: Requireable[ReactNodeLike] = js.native
      inline def nextLabel_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.prev2AriaLabel")
      @js.native
      def prev2AriaLabel: Requireable[String] = js.native
      inline def prev2AriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prev2AriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.prev2Label")
      @js.native
      def prev2Label: Requireable[ReactNodeLike] = js.native
      inline def prev2Label_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prev2Label")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.prevAriaLabel")
      @js.native
      def prevAriaLabel: Requireable[String] = js.native
      inline def prevAriaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prevAriaLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.prevLabel")
      @js.native
      def prevLabel: Requireable[ReactNodeLike] = js.native
      inline def prevLabel_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prevLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.setActiveStartDate")
      @js.native
      def setActiveStartDate: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def setActiveStartDate_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setActiveStartDate")(x.asInstanceOf[js.Any])
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.showDoubleView")
      @js.native
      def showDoubleView: Requireable[Boolean] = js.native
      inline def showDoubleView_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDoubleView")(x.asInstanceOf[js.Any])
      
      inline def view(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("view")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
      
      @JSImport("react-calendar/dist/cjs/Calendar/Navigation", "default.propTypes.views")
      @js.native
      def views: Validator[js.Array[js.UndefOr[String | Null]]] = js.native
      inline def views_=(x: Validator[js.Array[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationProps extends StObject {
    
    var activeStartDate: js.Date
    
    def drillUp(): Unit
    
    var formatMonthYear: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var formatYear: js.UndefOr[js.Function2[/* locale */ js.UndefOr[String], /* date */ js.Date, String]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var navigationAriaLabel: js.UndefOr[String] = js.undefined
    
    var navigationAriaLive: js.UndefOr[off | polite | assertive] = js.undefined
    
    var navigationLabel: js.UndefOr[NavigationLabelFunc] = js.undefined
    
    var next2AriaLabel: js.UndefOr[String] = js.undefined
    
    var next2Label: js.UndefOr[ReactNode] = js.undefined
    
    var nextAriaLabel: js.UndefOr[String] = js.undefined
    
    var nextLabel: js.UndefOr[ReactNode] = js.undefined
    
    var prev2AriaLabel: js.UndefOr[String] = js.undefined
    
    var prev2Label: js.UndefOr[ReactNode] = js.undefined
    
    var prevAriaLabel: js.UndefOr[String] = js.undefined
    
    var prevLabel: js.UndefOr[ReactNode] = js.undefined
    
    def setActiveStartDate(nextActiveStartDate: js.Date, action: Action): Unit
    
    var showDoubleView: js.UndefOr[Boolean] = js.undefined
    
    var view: RangeType
    
    var views: js.Array[String]
  }
  object NavigationProps {
    
    inline def apply(
      activeStartDate: js.Date,
      drillUp: () => Unit,
      setActiveStartDate: (js.Date, Action) => Unit,
      view: RangeType,
      views: js.Array[String]
    ): NavigationProps = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], drillUp = js.Any.fromFunction0(drillUp), setActiveStartDate = js.Any.fromFunction2(setActiveStartDate), view = view.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationProps] (val x: Self) extends AnyVal {
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setDrillUp(value: () => Unit): Self = StObject.set(x, "drillUp", js.Any.fromFunction0(value))
      
      inline def setFormatMonthYear(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      inline def setFormatMonthYearUndefined: Self = StObject.set(x, "formatMonthYear", js.undefined)
      
      inline def setFormatYear(value: (/* locale */ js.UndefOr[String], /* date */ js.Date) => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction2(value))
      
      inline def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigationAriaLabel(value: String): Self = StObject.set(x, "navigationAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationAriaLabelUndefined: Self = StObject.set(x, "navigationAriaLabel", js.undefined)
      
      inline def setNavigationAriaLive(value: off | polite | assertive): Self = StObject.set(x, "navigationAriaLive", value.asInstanceOf[js.Any])
      
      inline def setNavigationAriaLiveUndefined: Self = StObject.set(x, "navigationAriaLive", js.undefined)
      
      inline def setNavigationLabel(value: /* param0 */ NavigationLabelArgs => ReactNode): Self = StObject.set(x, "navigationLabel", js.Any.fromFunction1(value))
      
      inline def setNavigationLabelUndefined: Self = StObject.set(x, "navigationLabel", js.undefined)
      
      inline def setNext2AriaLabel(value: String): Self = StObject.set(x, "next2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNext2AriaLabelUndefined: Self = StObject.set(x, "next2AriaLabel", js.undefined)
      
      inline def setNext2Label(value: ReactNode): Self = StObject.set(x, "next2Label", value.asInstanceOf[js.Any])
      
      inline def setNext2LabelUndefined: Self = StObject.set(x, "next2Label", js.undefined)
      
      inline def setNextAriaLabel(value: String): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextAriaLabelUndefined: Self = StObject.set(x, "nextAriaLabel", js.undefined)
      
      inline def setNextLabel(value: ReactNode): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setPrev2AriaLabel(value: String): Self = StObject.set(x, "prev2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrev2AriaLabelUndefined: Self = StObject.set(x, "prev2AriaLabel", js.undefined)
      
      inline def setPrev2Label(value: ReactNode): Self = StObject.set(x, "prev2Label", value.asInstanceOf[js.Any])
      
      inline def setPrev2LabelUndefined: Self = StObject.set(x, "prev2Label", js.undefined)
      
      inline def setPrevAriaLabel(value: String): Self = StObject.set(x, "prevAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevAriaLabelUndefined: Self = StObject.set(x, "prevAriaLabel", js.undefined)
      
      inline def setPrevLabel(value: ReactNode): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      inline def setSetActiveStartDate(value: (js.Date, Action) => Unit): Self = StObject.set(x, "setActiveStartDate", js.Any.fromFunction2(value))
      
      inline def setShowDoubleView(value: Boolean): Self = StObject.set(x, "showDoubleView", value.asInstanceOf[js.Any])
      
      inline def setShowDoubleViewUndefined: Self = StObject.set(x, "showDoubleView", js.undefined)
      
      inline def setView(value: RangeType): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViews(value: js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
}
