package typings.reactWidgets

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.anon.Century
import typings.reactWidgets.anon.MoveForward
import typings.reactWidgets.anon.PartialMessages
import typings.reactWidgets.calendarMod.CalendarProps
import typings.reactWidgets.calendarMod.Direction
import typings.reactWidgets.calendarMod.View
import typings.reactWidgets.datePickerMod.DatePickerHandle
import typings.reactWidgets.datePickerMod.DatePickerProps
import typings.reactWidgets.localizationMod.FormatterOverrides
import typings.reactWidgets.localizationMod.Localizer
import typings.reactWidgets.localizationMod.ProviderProps
import typings.reactWidgets.numberPickerMod.NumberPickerProps
import typings.reactWidgets.slideDownTransitionMod.default
import typings.reactWidgets.slideTransitionGroupMod.SlideTransitionGroupProps
import typings.reactWidgets.timeInputMod.TimeInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-widgets/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Calendar {
    
    /**
      * @public
      */
    inline def apply(
      hasIdAutoFocusBorderedViewsTabIndexDisabledReadOnlyClassNameValueDefaultValueOnChangePCurrentDateDefaultCurrentDateOnCurrentDateChangeMinMaxViewDefaultViewOnViewChangeOnKeyDownOnNavigateRenderDayMessagesFormatsElementProps: CalendarProps[Any]
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasIdAutoFocusBorderedViewsTabIndexDisabledReadOnlyClassNameValueDefaultValueOnChangePCurrentDateDefaultCurrentDateOnCurrentDateChangeMinMaxViewDefaultViewOnViewChangeOnKeyDownOnNavigateRenderDayMessagesFormatsElementProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs", "Calendar")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof SlideTransitionGroup` */
    @JSImport("react-widgets/cjs", "Calendar.Transition")
    @js.native
    open class Transition protected ()
      extends typings.reactWidgets.calendarMod.default.Transition {
      def this(args: SlideTransitionGroupProps) = this()
    }
    /* was `typeof SlideTransitionGroup` */
    object Transition {
      
      /* static member */
      object defaultProps {
        
        @JSImport("react-widgets/cjs", "Calendar.Transition.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-widgets/cjs", "Calendar.Transition.defaultProps.direction")
        @js.native
        def direction: String = js.native
        inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      }
      
      /* static member */
      object propTypes {
        
        @JSImport("react-widgets/cjs", "Calendar.Transition.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-widgets/cjs", "Calendar.Transition.propTypes.direction")
        @js.native
        def direction: Requireable[String] = js.native
        inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
        
        @JSImport("react-widgets/cjs", "Calendar.Transition.propTypes.onTransitionEnd")
        @js.native
        def onTransitionEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
        inline def onTransitionEnd_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("react-widgets/cjs", "Calendar.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-widgets/cjs", "Calendar.move")
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
      
      @JSImport("react-widgets/cjs", "Calendar.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/cjs", "Calendar.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "Calendar.propTypes.culture")
      @js.native
      def culture: Requireable[String] = js.native
      inline def culture_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("culture")(x.asInstanceOf[js.Any])
      
      /**
        * Default current date at which the calendar opens. If none is provided, opens at today's date or the `value` date (if any).
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.currentDate")
      @js.native
      def currentDate: Requireable[js.Date] = js.native
      inline def currentDate_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentDate")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['disabled', ['new Date()']]
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /**
        * Show or hide the Calendar footer.
        *
        * @example ['prop', ['footer', true]]
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.footer")
      @js.native
      def footer: Requireable[Boolean] = js.native
      inline def footer_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "Calendar.propTypes.formats")
      @js.native
      def formats: Requireable[InferProps[Century]] = js.native
      inline def formats_=(x: Requireable[InferProps[Century]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
      
      /**
        * The maximum date that the Calendar can navigate to.
        *
        * @example ['prop', ['max', 'new Date()']]
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.max")
      @js.native
      def max: Requireable[js.Date] = js.native
      inline def max_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "Calendar.propTypes.messages")
      @js.native
      def messages: Requireable[InferProps[MoveForward]] = js.native
      inline def messages_=(x: Requireable[InferProps[MoveForward]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
      
      /**
        * The minimum date that the Calendar can navigate from.
        *
        * @example ['prop', ['min', 'new Date()']]
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.min")
      @js.native
      def min: Requireable[js.Date] = js.native
      inline def min_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
      
      /** Specify the navigate into the future header icon */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.navigateNextIcon")
      @js.native
      def navigateNextIcon: Requireable[ReactNodeLike] = js.native
      inline def navigateNextIcon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigateNextIcon")(x.asInstanceOf[js.Any])
      
      /** Specify the navigate into the past header icon */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.navigatePrevIcon")
      @js.native
      def navigatePrevIcon: Requireable[ReactNodeLike] = js.native
      inline def navigatePrevIcon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navigatePrevIcon")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['onChangePicker', [ ['new Date()'] ]]
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /**
        * Change event Handler that is called when the currentDate is changed. The handler is called with the currentDate object.
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.onCurrentDateChange")
      @js.native
      def onCurrentDateChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCurrentDateChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDateChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "Calendar.propTypes.onKeyDown")
      @js.native
      def onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyDown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      /**
        * Callback fired when the Calendar navigates between views, or forward and backwards in time.
        *
        * @type function(date: ?Date, direction: string, view: string)
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.onNavigate")
      @js.native
      def onNavigate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onNavigate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNavigate")(x.asInstanceOf[js.Any])
      
      /**
        * A callback fired when the `view` changes.
        *
        * @controllable view
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.onViewChange")
      @js.native
      def onViewChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onViewChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onViewChange")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['readOnly', ['new Date()']]
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.readOnly")
      @js.native
      def readOnly: Requireable[Boolean] = js.native
      inline def readOnly_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      /**
        * Provide a custom component to render the days of the month. The Component is provided the following props
        *
        * - `date`: a `Date` object for the day of the month to render
        * - `label`: a formatted `string` of the date to render. To adjust the format of the `label` string use the `dateFormat` prop, listed below.
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.renderDay")
      @js.native
      def renderDay: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def renderDay_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderDay")(x.asInstanceOf[js.Any])
      
      /** @ignore */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.tabIndex")
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
      @JSImport("react-widgets/cjs", "Calendar.propTypes.value")
      @js.native
      def value: Requireable[js.Date] = js.native
      inline def value_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the currently displayed calendar view. Use `defaultView` to set a unique starting view.
        *
        * @type {("month"|"year"|"decade"|"century")}
        * @controllable onViewChange
        */
      inline def view(props: Any, args: Any*): js.Error | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("view")(List(props.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error | Null]
      
      /**
        * Defines a list of views the Calendar can traverse through, starting with the
        * first in the list to the last.
        *
        * @type array<"month"|"year"|"decade"|"century">
        */
      @JSImport("react-widgets/cjs", "Calendar.propTypes.views")
      @js.native
      def views: Requireable[js.Array[js.UndefOr[View | Null]]] = js.native
      inline def views_=(x: Requireable[js.Array[js.UndefOr[View | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("views")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ---
    * shortcuts:
    *   - { key: alt + down arrow, label: open combobox }
    *   - { key: alt + up arrow, label: close combobox }
    *   - { key: down arrow, label: move focus to next item }
    *   - { key: up arrow, label: move focus to previous item }
    *   - { key: home, label: move focus to first item }
    *   - { key: end, label: move focus to last item }
    *   - { key: enter, label: select focused item }
    *   - { key: any key, label: search list for item starting with key }
    * ---
    *
    * Select an item from the list, or input a custom value. The Combobox can also make suggestions as you type.
    * @public
    */
  @JSImport("react-widgets/cjs", "Combobox")
  @js.native
  val Combobox: typings.reactWidgets.comboboxMod.Combobox = js.native
  
  /**
    * ---
    * subtitle: DatePicker, TimePicker
    * localized: true
    * shortcuts:
    *   - { key: alt + down arrow, label:  open calendar or time }
    *   - { key: alt + up arrow, label: close calendar or time }
    *   - { key: down arrow, label: move focus to next item }
    *   - { key: up arrow, label: move focus to previous item }
    *   - { key: home, label: move focus to first item }
    *   - { key: end, label: move focus to last item }
    *   - { key: enter, label: select focused item }
    *   - { key: any key, label: search list for item starting with key }
    * ---
    *
    * @public
    * @extends Calendar
    */
  @JSImport("react-widgets/cjs", "DatePicker")
  @js.native
  val DatePicker: ForwardRefExoticComponent[DatePickerProps[Any] & RefAttributes[DatePickerHandle]] = js.native
  
  /**
    * ---
    * subtitle: DatePicker, TimePicker
    * localized: true
    * shortcuts:
    *   - { key: alt + down arrow, label:  open calendar or time }
    *   - { key: alt + up arrow, label: close calendar or time }
    *   - { key: down arrow, label: move focus to next item }
    *   - { key: up arrow, label: move focus to previous item }
    *   - { key: home, label: move focus to first item }
    *   - { key: end, label: move focus to last item }
    *   - { key: enter, label: select focused item }
    *   - { key: any key, label: search list for item starting with key }
    * ---
    *
    * @public
    * @extends Calendar
    */
  @JSImport("react-widgets/cjs", "DateTimePicker")
  @js.native
  val DateTimePicker: ForwardRefExoticComponent[DatePickerProps[Any] & RefAttributes[DatePickerHandle]] = js.native
  
  /**
    * A `<select>` replacement for single value lists.
    * @public
    */
  @JSImport("react-widgets/cjs", "DropdownList")
  @js.native
  val DropdownList: typings.reactWidgets.dropdownListMod.DropdownList = js.native
  
  @JSImport("react-widgets/cjs", "Listbox")
  @js.native
  val Listbox: typings.reactWidgets.listboxMod.Listbox = js.native
  
  object Localization {
    
    inline def apply(hasDateNumberMessagesChildren: ProviderProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasDateNumberMessagesChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs", "Localization")
    @js.native
    val ^ : js.Any = js.native
    
    inline def useLocalizer(): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")().asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: Unit, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: PartialMessages): Localizer[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any]).asInstanceOf[Localizer[Any, Any]]
    inline def useLocalizer(messages: PartialMessages, formats: FormatterOverrides[Any, Any]): Localizer[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalizer")(messages.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Localizer[Any, Any]]
  }
  
  /**
    * ---
    * shortcuts:
    *   - { key: left arrow, label: move focus to previous tag }
    *   - { key: right arrow, label: move focus to next tag }
    *   - { key: delete, deselect focused tag }
    *   - { key: backspace, deselect next tag }
    *   - { key: alt + up arrow, label: close Multiselect }
    *   - { key: down arrow, label: open Multiselect, and move focus to next item }
    *   - { key: up arrow, label: move focus to previous item }
    *   - { key: home, label: move focus to first item }
    *   - { key: end, label: move focus to last item }
    *   - { key: enter, label: select focused item }
    *   - { key: ctrl + enter, label: create new tag from current searchTerm }
    *   - { key: any key, label: search list for item starting with key }
    * ---
    *
    * A select listbox alternative.
    *
    * @public
    */
  @JSImport("react-widgets/cjs", "Multiselect")
  @js.native
  val Multiselect: typings.reactWidgets.multiselectMod.Multiselect = js.native
  
  /**
    * ---
    * localized: true
    * shortcuts:
    *   - { key: down arrow, label: decrement value }
    *   - { key: up arrow, label: increment value }
    *   - { key: home, label: set value to minimum value, if finite }
    *   - { key: end, label: set value to maximum value, if finite }
    * ---
    *
    * @public
    */
  inline def NumberPicker(uncontrolledProps: NumberPickerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NumberPicker")(uncontrolledProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-widgets/cjs", "SlideDownTransition")
  @js.native
  open class SlideDownTransition () extends default
  object SlideDownTransition {
    
    /* static member */
    object propTypes {
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.dropUp")
      @js.native
      def dropUp: Requireable[Boolean] = js.native
      inline def dropUp_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropUp")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.in")
      @js.native
      def in: Validator[Boolean] = js.native
      inline def in_=(x: Validator[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("in")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.innerClassName")
      @js.native
      def innerClassName: Requireable[String] = js.native
      inline def innerClassName_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerClassName")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.onEntered")
      @js.native
      def onEntered: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEntered_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntered")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.onEntering")
      @js.native
      def onEntering: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onEntering_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEntering")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.onExit")
      @js.native
      def onExit: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onExit_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideDownTransition.propTypes.onExited")
      @js.native
      def onExited: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onExited_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExited")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("react-widgets/cjs", "SlideTransitionGroup")
  @js.native
  open class SlideTransitionGroup protected ()
    extends typings.reactWidgets.slideTransitionGroupMod.default {
    def this(args: SlideTransitionGroupProps) = this()
  }
  object SlideTransitionGroup {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-widgets/cjs", "SlideTransitionGroup.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/cjs", "SlideTransitionGroup.defaultProps.direction")
      @js.native
      def direction: String = js.native
      inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("react-widgets/cjs", "SlideTransitionGroup.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/cjs", "SlideTransitionGroup.propTypes.direction")
      @js.native
      def direction: Requireable[String] = js.native
      inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "SlideTransitionGroup.propTypes.onTransitionEnd")
      @js.native
      def onTransitionEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onTransitionEnd_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTransitionEnd")(x.asInstanceOf[js.Any])
    }
  }
  
  object TimeInput {
    
    inline def apply(uncontrolledProps: TimeInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(uncontrolledProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/cjs", "TimeInput")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-widgets/cjs", "TimeInput.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/cjs", "TimeInput.defaultProps.emptyCharacter")
      @js.native
      def emptyCharacter: String = js.native
      inline def emptyCharacter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyCharacter")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "TimeInput.defaultProps.hoursAddon")
      @js.native
      def hoursAddon: String = js.native
      inline def hoursAddon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoursAddon")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "TimeInput.defaultProps.padValues")
      @js.native
      def padValues: Boolean = js.native
      inline def padValues_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padValues")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/cjs", "TimeInput.defaultProps.precision")
      @js.native
      def precision: String = js.native
      inline def precision_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("precision")(x.asInstanceOf[js.Any])
    }
    
    object propTypes {
      
      @JSImport("react-widgets/cjs", "TimeInput.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The default date used to construct a new time when the `value` is empty
        *
        * @default new Date()
        **/
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.datePart")
      @js.native
      def datePart: Requireable[js.Date] = js.native
      inline def datePart_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("datePart")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['disabled', ['new Date()']]
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** The string character used to pad empty, or cleared values */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.emptyCharacter")
      @js.native
      def emptyCharacter: Requireable[String] = js.native
      inline def emptyCharacter_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyCharacter")(x.asInstanceOf[js.Any])
      
      /**
        * The seperator between hours and minutes
        * @default ':'
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.hoursAddon")
      @js.native
      def hoursAddon: Requireable[ReactNodeLike] = js.native
      inline def hoursAddon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hoursAddon")(x.asInstanceOf[js.Any])
      
      /**
        * The seperator between hours and minutes
        * @default '.'
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.millisecondsAddon")
      @js.native
      def millisecondsAddon: Requireable[ReactNodeLike] = js.native
      inline def millisecondsAddon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("millisecondsAddon")(x.asInstanceOf[js.Any])
      
      /**
        * The seperator between hours and minutes
        * @default ':'
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.minutesAddon")
      @js.native
      def minutesAddon: Requireable[ReactNodeLike] = js.native
      inline def minutesAddon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minutesAddon")(x.asInstanceOf[js.Any])
      
      /** Hide the input clear button */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.noClearButton")
      @js.native
      def noClearButton: Requireable[Boolean] = js.native
      inline def noClearButton_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noClearButton")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['onChangePicker', [ ['new Date()'] ]]
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /** Time part values will be padded by `0` */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.padValues")
      @js.native
      def padValues: Requireable[Boolean] = js.native
      inline def padValues_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padValues")(x.asInstanceOf[js.Any])
      
      /** Controls how precise of a time can be input **/
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.precision")
      @js.native
      def precision: Validator[String] = js.native
      inline def precision_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("precision")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['readOnly', ['new Date()']]
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.readOnly")
      @js.native
      def readOnly: Requireable[Boolean] = js.native
      inline def readOnly_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
      
      /**
        * The seperator between hours and minutes
        * @default ':'
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.secondsAddon")
      @js.native
      def secondsAddon: Requireable[ReactNodeLike] = js.native
      inline def secondsAddon_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondsAddon")(x.asInstanceOf[js.Any])
      
      /**
        * Use a 12 hour clock (with AM/PM) instead of 24 hour one.
        * The configured localizer may provide a default value .
        **/
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.use12HourClock")
      @js.native
      def use12HourClock: Requireable[Boolean] = js.native
      inline def use12HourClock_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("use12HourClock")(x.asInstanceOf[js.Any])
      
      /**
        * @example ['valuePicker', [ ['new Date()'] ]]
        */
      @JSImport("react-widgets/cjs", "TimeInput.propTypes.value")
      @js.native
      def value: Requireable[js.Date] = js.native
      inline def value_=(x: Requireable[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
}
