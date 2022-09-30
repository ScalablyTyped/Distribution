package typings.reactWidgets

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.anon.Century
import typings.reactWidgets.anon.Date
import typings.reactWidgets.anon.MoveBack
import typings.reactWidgets.anon.MoveForward
import typings.reactWidgets.localizationMod.DateFormats
import typings.reactWidgets.messagesMod.UserProvidedMessages
import typings.reactWidgets.monthMod.RenderDayProp
import typings.reactWidgets.reactWidgetsStrings.left_
import typings.reactWidgets.reactWidgetsStrings.right_
import typings.reactWidgets.sharedMod.InferFormat
import typings.reactWidgets.sharedMod.WidgetHTMLProps
import typings.reactWidgets.slideTransitionGroupMod.SlideTransitionGroupProps
import typings.reactWidgets.slideTransitionGroupMod.default
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  object default {
    
    /**
      * @public
      */
    inline def apply(
      hasIdAutoFocusBorderedViewsTabIndexDisabledReadOnlyClassNameValueDefaultValueOnChangePCurrentDateDefaultCurrentDateOnCurrentDateChangeMinMaxViewDefaultViewOnViewChangeOnKeyDownOnNavigateRenderDayMessagesFormatsElementProps: CalendarProps[Any]
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasIdAutoFocusBorderedViewsTabIndexDisabledReadOnlyClassNameValueDefaultValueOnChangePCurrentDateDefaultCurrentDateOnCurrentDateChangeMinMaxViewDefaultViewOnViewChangeOnKeyDownOnNavigateRenderDayMessagesFormatsElementProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof SlideTransitionGroup` */
    @JSImport("react-widgets/cjs/Calendar", "default.Transition")
    @js.native
    open class Transition protected ()
      extends typings.reactWidgets.slideTransitionGroupMod.default {
      def this(args: SlideTransitionGroupProps) = this()
    }
    /* was `typeof SlideTransitionGroup` */
    object Transition {
      
      /* static member */
      object defaultProps {
        
        @JSImport("react-widgets/cjs/Calendar", "default.Transition.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-widgets/cjs/Calendar", "default.Transition.defaultProps.direction")
        @js.native
        def direction: String = js.native
        inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      }
      
      /* static member */
      object propTypes {
        
        @JSImport("react-widgets/cjs/Calendar", "default.Transition.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-widgets/cjs/Calendar", "default.Transition.propTypes.direction")
        @js.native
        def direction: Requireable[String] = js.native
        inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
        
        @JSImport("react-widgets/cjs/Calendar", "default.Transition.propTypes.onTransitionEnd")
        @js.native
        def onTransitionEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
        inline def onTransitionEnd_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("react-widgets/cjs/Calendar", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-widgets/cjs/Calendar", "default.move")
    @js.native
    def move: js.Function5[
        /* date */ js.Date, 
        /* min */ js.Date, 
        /* max */ js.Date, 
        /* view */ View, 
        /* direction */ Direction, 
        js.Date
      ] = js.native
    inline def move_=(
      x: js.Function5[
          /* date */ js.Date, 
          /* min */ js.Date, 
          /* max */ js.Date, 
          /* view */ View, 
          /* direction */ Direction, 
          js.Date
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("move")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.culture")
      @js.native
      def culture: Requireable[String] = js.native
      inline def culture_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("culture")(x.asInstanceOf[js.Any])
      
      /**
        * Default current date at which the calendar opens. If none is provided, opens at today's date or the `value` date (if any).
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.currentDate")
      @js.native
      def currentDate: Requireable[js.Date] = js.native
      inline def currentDate_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['disabled', ['new Date()']]
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /**
        * Show or hide the Calendar footer.
        *
        * @example ['prop', ['footer', true]]
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.footer")
      @js.native
      def footer: Requireable[Boolean] = js.native
      inline def footer_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.formats")
      @js.native
      def formats: Requireable[InferProps[Century]] = js.native
      inline def formats_=(x: Requireable[InferProps[Century]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
      
      /**
        * The maximum date that the Calendar can navigate to.
        *
        * @example ['prop', ['max', 'new Date()']]
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.max")
      @js.native
      def max: Requireable[js.Date] = js.native
      inline def max_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.messages")
      @js.native
      def messages: Requireable[InferProps[MoveForward]] = js.native
      inline def messages_=(x: Requireable[InferProps[MoveForward]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
      
      /**
        * The minimum date that the Calendar can navigate from.
        *
        * @example ['prop', ['min', 'new Date()']]
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.min")
      @js.native
      def min: Requireable[js.Date] = js.native
      inline def min_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      /** Specify the navigate into the future header icon */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.navigateNextIcon")
      @js.native
      def navigateNextIcon: Requireable[ReactNodeLike] = js.native
      inline def navigateNextIcon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigateNextIcon")(x.asInstanceOf[js.Any])
      
      /** Specify the navigate into the past header icon */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.navigatePrevIcon")
      @js.native
      def navigatePrevIcon: Requireable[ReactNodeLike] = js.native
      inline def navigatePrevIcon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigatePrevIcon")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['onChangePicker', [ ['new Date()'] ]]
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /**
        * Change event Handler that is called when the currentDate is changed. The handler is called with the currentDate object.
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.onCurrentDateChange")
      @js.native
      def onCurrentDateChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCurrentDateChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDateChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.onKeyDown")
      @js.native
      def onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyDown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      /**
        * Callback fired when the Calendar navigates between views, or forward and backwards in time.
        *
        * @type function(date: ?Date, direction: string, view: string)
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.onNavigate")
      @js.native
      def onNavigate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onNavigate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNavigate")(x.asInstanceOf[js.Any])
      
      /**
        * A callback fired when the `view` changes.
        *
        * @controllable view
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.onViewChange")
      @js.native
      def onViewChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onViewChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['readOnly', ['new Date()']]
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.readOnly")
      @js.native
      def readOnly: Requireable[Boolean] = js.native
      inline def readOnly_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      /**
        * Provide a custom component to render the days of the month. The Component is provided the following props
        *
        * - `date`: a `Date` object for the day of the month to render
        * - `label`: a formatted `string` of the date to render. To adjust the format of the `label` string use the `dateFormat` prop, listed below.
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.renderDay")
      @js.native
      def renderDay: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def renderDay_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderDay")(x.asInstanceOf[js.Any])
      
      /** @ignore */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.tabIndex")
      @js.native
      def tabIndex: Requireable[Any] = js.native
      inline def tabIndex_=(x: Requireable[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
      
      /**
        * The selected Date.
        *
        * ```tsx live
        * import { Calendar } from 'react-widgets';
        *
        * <Calendar value={new Date()} />
        * ```
        * @example false
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.value")
      @js.native
      def value: Requireable[js.Date] = js.native
      inline def value_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the currently displayed calendar view. Use `defaultView` to set a unique starting view.
        *
        * @type {("month"|"year"|"decade"|"century")}
        * @controllable onViewChange
        */
      inline def view(props: Any, args: Any*): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("view")(scala.List(props.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error | Null]
      
      /**
        * Defines a list of views the Calendar can traverse through, starting with the
        * first in the list to the last.
        *
        * @type array<"month"|"year"|"decade"|"century">
        */
      @JSImport("react-widgets/cjs/Calendar", "default.propTypes.views")
      @js.native
      def views: Requireable[js.Array[js.UndefOr[View | Null]]] = js.native
      inline def views_=(x: Requireable[js.Array[js.UndefOr[View | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
    }
  }
  
  object Calendar {
    
    /* was `typeof SlideTransitionGroup` */
    type Transition = default
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactWidgets.sharedMod.WidgetProps because var conflicts: className, id, tabIndex. Inlined autoFocus, messages */ trait CalendarProps[TLocalizer]
    extends StObject
       with WidgetHTMLProps[HTMLDivElement] {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var currentDate: js.UndefOr[js.Date] = js.undefined
    
    var defaultCurrentDate: js.UndefOr[js.Date] = js.undefined
    
    var defaultValue: js.UndefOr[js.Date] = js.undefined
    
    var defaultView: js.UndefOr[View] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[DateFormats[InferFormat[TLocalizer]]] = js.undefined
    
    var max: js.UndefOr[js.Date] = js.undefined
    
    var messages: js.UndefOr[MoveBack | UserProvidedMessages] = js.undefined
    
    var min: js.UndefOr[js.Date] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* nextValue */ js.Date, Unit]] = js.undefined
    
    var onCurrentDateChange: js.UndefOr[js.Function1[/* nextDate */ js.Date, Unit]] = js.undefined
    
    var onNavigate: js.UndefOr[
        js.Function3[/* date */ js.Date, /* slideDirection */ SlideDirection, /* nextView */ View, Unit]
      ] = js.undefined
    
    var onViewChange: js.UndefOr[js.Function1[/* nextView */ View, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderDay: js.UndefOr[RenderDayProp] = js.undefined
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
    
    var view: js.UndefOr[View] = js.undefined
    
    var views: js.UndefOr[js.Array[View]] = js.undefined
  }
  object CalendarProps {
    
    inline def apply[TLocalizer](): CalendarProps[TLocalizer] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarProps[TLocalizer]]
    }
    
    extension [Self <: CalendarProps[?], TLocalizer](x: Self & CalendarProps[TLocalizer]) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setCurrentDate(value: js.Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
      
      inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
      
      inline def setDefaultCurrentDate(value: js.Date): Self = StObject.set(x, "defaultCurrentDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrentDateUndefined: Self = StObject.set(x, "defaultCurrentDate", js.undefined)
      
      inline def setDefaultValue(value: js.Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultView(value: View): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormats(value: DateFormats[InferFormat[TLocalizer]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMessages(value: MoveBack | UserProvidedMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: /* nextValue */ js.Date => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCurrentDateChange(value: /* nextDate */ js.Date => Unit): Self = StObject.set(x, "onCurrentDateChange", js.Any.fromFunction1(value))
      
      inline def setOnCurrentDateChangeUndefined: Self = StObject.set(x, "onCurrentDateChange", js.undefined)
      
      inline def setOnNavigate(value: (/* date */ js.Date, /* slideDirection */ SlideDirection, /* nextView */ View) => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction3(value))
      
      inline def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
      
      inline def setOnViewChange(value: /* nextView */ View => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction1(value))
      
      inline def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderDay(value: Date => ReactNode): Self = StObject.set(x, "renderDay", js.Any.fromFunction1(value))
      
      inline def setRenderDayUndefined: Self = StObject.set(x, "renderDay", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setViews(value: js.Array[View]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: View*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.DOWN
    - typings.reactWidgets.reactWidgetsStrings.UP
    - typings.reactWidgets.reactWidgetsStrings.LEFT
    - typings.reactWidgets.reactWidgetsStrings.RIGHT
  */
  trait Direction extends StObject
  object Direction {
    
    inline def DOWN: typings.reactWidgets.reactWidgetsStrings.DOWN = "DOWN".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.DOWN]
    
    inline def LEFT: typings.reactWidgets.reactWidgetsStrings.LEFT = "LEFT".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.LEFT]
    
    inline def RIGHT: typings.reactWidgets.reactWidgetsStrings.RIGHT = "RIGHT".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.RIGHT]
    
    inline def UP: typings.reactWidgets.reactWidgetsStrings.UP = "UP".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.UP]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.bottom
    - typings.reactWidgets.reactWidgetsStrings.top
    - typings.reactWidgets.reactWidgetsStrings.left_
    - typings.reactWidgets.reactWidgetsStrings.right_
  */
  trait SlideDirection extends StObject
  object SlideDirection {
    
    inline def bottom: typings.reactWidgets.reactWidgetsStrings.bottom = "bottom".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.bottom]
    
    inline def left: left_ = "left".asInstanceOf[left_]
    
    inline def right: right_ = "right".asInstanceOf[right_]
    
    inline def top: typings.reactWidgets.reactWidgetsStrings.top = "top".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.month
    - typings.reactWidgets.reactWidgetsStrings.year
    - typings.reactWidgets.reactWidgetsStrings.decade
    - typings.reactWidgets.reactWidgetsStrings.century
  */
  trait View extends StObject
  object View {
    
    inline def century: typings.reactWidgets.reactWidgetsStrings.century = "century".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.century]
    
    inline def decade: typings.reactWidgets.reactWidgetsStrings.decade = "decade".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.decade]
    
    inline def month: typings.reactWidgets.reactWidgetsStrings.month = "month".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.month]
    
    inline def year: typings.reactWidgets.reactWidgetsStrings.year = "year".asInstanceOf[typings.reactWidgets.reactWidgetsStrings.year]
  }
}
