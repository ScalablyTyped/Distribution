package typings.reactSelect

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.react.mod.TouchEvent
import typings.reactSelect.anon.ClearValue
import typings.reactSelect.anon.Context
import typings.reactSelect.anon.Count
import typings.reactSelect.anon.InputValue
import typings.reactSelect.componentsMod.PlaceholderOrValue
import typings.reactSelect.componentsMod.SelectComponents
import typings.reactSelect.componentsMod.SelectComponentsConfig
import typings.reactSelect.filtersMod.Option
import typings.reactSelect.reactSelectStrings.first
import typings.reactSelect.reactSelectStrings.group
import typings.reactSelect.reactSelectStrings.input
import typings.reactSelect.reactSelectStrings.last
import typings.reactSelect.reactSelectStrings.listbox
import typings.reactSelect.reactSelectStrings.next
import typings.reactSelect.reactSelectStrings.option
import typings.reactSelect.reactSelectStrings.previous
import typings.reactSelect.stylesMod.StylesConfig
import typings.reactSelect.themeMod.ThemeConfig
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.ActionTypes
import typings.reactSelect.typesMod.FocusDirection
import typings.reactSelect.typesMod.FocusEventHandler
import typings.reactSelect.typesMod.GroupType
import typings.reactSelect.typesMod.GroupedOptionsType
import typings.reactSelect.typesMod.InputActionMeta
import typings.reactSelect.typesMod.KeyboardEventHandler
import typings.reactSelect.typesMod.MenuPlacement
import typings.reactSelect.typesMod.MenuPosition
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.Theme
import typings.reactSelect.typesMod.ValueType
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("react-select/src/Select", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */] () extends Select[OptionType]
  /* static members */
  object default {
    
    @JSImport("react-select/src/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select/src/Select", "default.defaultProps")
    @js.native
    def defaultProps: Props[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: Props[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select/src/Select", "defaultProps")
  @js.native
  val defaultProps: Props[js.Any] = js.native
  
  type ElRef = Ref[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.menu
    - typings.reactSelect.reactSelectStrings.value
  */
  trait FormatOptionLabelContext extends StObject
  object FormatOptionLabelContext {
    
    @scala.inline
    def menu: typings.reactSelect.reactSelectStrings.menu = "menu".asInstanceOf[typings.reactSelect.reactSelectStrings.menu]
    
    @scala.inline
    def value: typings.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typings.reactSelect.reactSelectStrings.value]
  }
  
  trait FormatOptionLabelMeta[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var context: FormatOptionLabelContext
    
    var inputValue: String
    
    var selectValue: ValueType[OptionType]
  }
  object FormatOptionLabelMeta {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](context: FormatOptionLabelContext, inputValue: String): FormatOptionLabelMeta[OptionType] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptionLabelMeta[OptionType]]
    }
    
    @scala.inline
    implicit class FormatOptionLabelMetaMutableBuilder[Self <: FormatOptionLabelMeta[?], OptionType /* <: OptionTypeBase */] (val x: Self & FormatOptionLabelMeta[OptionType]) extends AnyVal {
      
      @scala.inline
      def setContext(value: FormatOptionLabelContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValue(value: ValueType[OptionType]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValueNull: Self = StObject.set(x, "selectValue", null)
      
      @scala.inline
      def setSelectValueUndefined: Self = StObject.set(x, "selectValue", js.undefined)
      
      @scala.inline
      def setSelectValueVarargs(value: OptionType*): Self = StObject.set(x, "selectValue", js.Array(value :_*))
    }
  }
  
  trait MenuOptions[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var focusable: js.Array[OptionType]
    
    var render: js.Array[OptionType]
  }
  object MenuOptions {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](focusable: js.Array[OptionType], render: js.Array[OptionType]): MenuOptions[OptionType] = {
      val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuOptions[OptionType]]
    }
    
    @scala.inline
    implicit class MenuOptionsMutableBuilder[Self <: MenuOptions[?], OptionType /* <: OptionTypeBase */] (val x: Self & MenuOptions[OptionType]) extends AnyVal {
      
      @scala.inline
      def setFocusable(value: js.Array[OptionType]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableVarargs(value: OptionType*): Self = StObject.set(x, "focusable", js.Array(value :_*))
      
      @scala.inline
      def setRender(value: js.Array[OptionType]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderVarargs(value: OptionType*): Self = StObject.set(x, "render", js.Array(value :_*))
    }
  }
  
  type MouseOrTouchEvent = (MouseEvent[HTMLElement, NativeMouseEvent]) | TouchEvent[HTMLElement]
  
  trait NamedProps[OptionType /* <: OptionTypeBase */] extends StObject {
    
    /* Aria label (for assistive tech) */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /* HTML ID of an element that should be used as the label (for assistive tech) */
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    /* Focus the control when it is mounted */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /* Remove the currently focused option when the user presses backspace */
    var backspaceRemovesValue: js.UndefOr[Boolean] = js.undefined
    
    /* Remove focus from the input when the user selects an option (handy for dismissing the keyboard on touch devices) */
    var blurInputOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /* When the user reaches the top/bottom of the menu, prevent scroll on the scroll-parent  */
    var captureMenuScroll: js.UndefOr[Boolean] = js.undefined
    
    /* className attribute applied to the outer component */
    var className: js.UndefOr[String] = js.undefined
    
    /* classNamePrefix attribute used as a base for inner component classNames */
    var classNamePrefix: js.UndefOr[String | Null] = js.undefined
    
    /*
      If `true`, close the select menu when the user scrolls the document/body.
      If a function, takes a standard javascript `ScrollEvent` you return a boolean:
      `true` => The menu closes
      `false` => The menu stays open
      This is useful when you have a scrollable modal and want to portal the menu out,
      but want to avoid graphical issues.
      */
    var closeMenuOnScroll: js.UndefOr[Boolean | EventListener] = js.undefined
    
    /* Close the select menu when the user selects an option */
    var closeMenuOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /*
      This complex object includes all the compositional components that are used
      in `react-select`. If you wish to overwrite a component, pass in an object
      with the appropriate namespace.
      If you only wish to restyle a component, we recommend using the `styles` prop
      instead. For a list of the components that can be passed in, and the shape
      that will be passed to them, see [the components docs](/api#components)
      */
    var components: js.UndefOr[SelectComponentsConfig[OptionType]] = js.undefined
    
    /* Whether the value of the select, e.g. SingleValue, should be displayed in the control. */
    var controlShouldRenderValue: js.UndefOr[Boolean] = js.undefined
    
    var defaultInputValue: js.UndefOr[String] = js.undefined
    
    var defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType[OptionType]] = js.undefined
    
    /* Delimiter used to join multiple values into a single HTML Input value */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /* Clear all values when the user presses escape AND the menu is closed */
    var escapeClearsValue: js.UndefOr[Boolean] = js.undefined
    
    /* Custom method to filter whether an option should be displayed in the menu */
    var filterOption: js.UndefOr[(js.Function2[/* option */ Option, /* rawInput */ String, Boolean]) | Null] = js.undefined
    
    /* Formats group labels in the menu as React components */
    var formatGroupLabel: js.UndefOr[typings.reactSelect.builtinsMod.formatGroupLabel[OptionType]] = js.undefined
    
    /* Formats option labels in the menu and control as React components */
    var formatOptionLabel: js.UndefOr[
        js.Function2[
          /* option */ OptionType, 
          /* labelMeta */ FormatOptionLabelMeta[OptionType], 
          ReactNode
        ]
      ] = js.undefined
    
    /* Resolves option data to a string to be displayed as the label by components */
    var getOptionLabel: js.UndefOr[typings.reactSelect.builtinsMod.getOptionLabel[OptionType]] = js.undefined
    
    /* Resolves option data to a string to compare options and specify value attributes */
    var getOptionValue: js.UndefOr[typings.reactSelect.builtinsMod.getOptionValue[OptionType]] = js.undefined
    
    /* Hide the selected option from the menu */
    var hideSelectedOptions: js.UndefOr[Boolean] = js.undefined
    
    /* The id to set on the SelectContainer component. */
    var id: js.UndefOr[String] = js.undefined
    
    /* The id of the search input */
    var inputId: js.UndefOr[String] = js.undefined
    
    /* The value of the search input */
    var inputValue: js.UndefOr[String] = js.undefined
    
    /* Define an id prefix for the select components e.g. {your-id}-value */
    var instanceId: js.UndefOr[Double | String] = js.undefined
    
    /* Is the select value clearable */
    var isClearable: js.UndefOr[Boolean] = js.undefined
    
    /* Is the select disabled */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /* Is the select in a state of loading (async) */
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    /* Support multiple selected options */
    var isMulti: js.UndefOr[Boolean] = js.undefined
    
    /* Override the built-in logic to detect whether an option is disabled */
    var isOptionDisabled: js.UndefOr[
        js.Function2[/* option */ OptionType, /* options */ OptionsType[OptionType], Boolean]
      ] = js.undefined
    
    /* Override the built-in logic to detect whether an option is selected */
    var isOptionSelected: js.UndefOr[
        js.Function2[/* option */ OptionType, /* options */ OptionsType[OptionType], Boolean]
      ] = js.undefined
    
    /* Is the select direction right-to-left */
    var isRtl: js.UndefOr[Boolean] = js.undefined
    
    /* Whether to enable search functionality */
    var isSearchable: js.UndefOr[Boolean] = js.undefined
    
    /* Async: Text to display when loading options */
    var loadingMessage: js.UndefOr[js.Function1[/* obj */ InputValue, String | Null]] = js.undefined
    
    /* Maximum height of the menu before scrolling */
    var maxMenuHeight: js.UndefOr[Double] = js.undefined
    
    /* Whether the menu is open */
    var menuIsOpen: js.UndefOr[Boolean] = js.undefined
    
    /* Default placement of the menu in relation to the control. 'auto' will flip
      when there isn't enough space below the control. */
    var menuPlacement: js.UndefOr[MenuPlacement] = js.undefined
    
    /* Whether the menu should use a portal, and where it should attach */
    var menuPortalTarget: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /* The CSS position value of the menu, when "fixed" extra layout management is required */
    var menuPosition: js.UndefOr[MenuPosition] = js.undefined
    
    /* Whether to block scroll events when the menu is open */
    var menuShouldBlockScroll: js.UndefOr[Boolean] = js.undefined
    
    /* Whether the menu should be scrolled into view when it opens */
    var menuShouldScrollIntoView: js.UndefOr[Boolean] = js.undefined
    
    /* Minimum height of the menu before flipping */
    var minMenuHeight: js.UndefOr[Double] = js.undefined
    
    /* Name of the HTML Input (optional - without this, no input will be rendered) */
    var name: js.UndefOr[String] = js.undefined
    
    /* Text to display when there are no options */
    var noOptionsMessage: js.UndefOr[js.Function1[/* obj */ InputValue, String | Null]] = js.undefined
    
    /* Handle blur events on the control */
    var onBlur: js.UndefOr[FocusEventHandler] = js.undefined
    
    /* Handle change events on the select */
    var onChange: js.UndefOr[
        js.Function2[/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType], Unit]
      ] = js.undefined
    
    /* Handle focus events on the control */
    var onFocus: js.UndefOr[FocusEventHandler] = js.undefined
    
    /* Handle change events on the input */
    var onInputChange: js.UndefOr[js.Function2[/* newValue */ String, /* actionMeta */ InputActionMeta, Unit]] = js.undefined
    
    /* Handle key down events on the select */
    var onKeyDown: js.UndefOr[KeyboardEventHandler] = js.undefined
    
    /* Handle the menu closing */
    var onMenuClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /* Handle the menu opening */
    var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /* Fired when the user scrolls to the bottom of the menu */
    var onMenuScrollToBottom: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.undefined
    
    /* Fired when the user scrolls to the top of the menu */
    var onMenuScrollToTop: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.undefined
    
    /* Allows control of whether the menu is opened when the Select is clicked */
    var openMenuOnClick: js.UndefOr[Boolean] = js.undefined
    
    /* Allows control of whether the menu is opened when the Select is focused */
    var openMenuOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /* Array of options that populate the select menu */
    var options: js.UndefOr[GroupedOptionsType[OptionType] | OptionsType[OptionType]] = js.undefined
    
    /* Number of options to jump in menu when page{up|down} keys are used */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /* Placeholder text for the select value */
    var placeholder: js.UndefOr[ReactNode] = js.undefined
    
    /* Status to relay to screen readers */
    var screenReaderStatus: js.UndefOr[js.Function1[/* obj */ Count, String]] = js.undefined
    
    /* Style modifier methods */
    var styles: js.UndefOr[StylesConfig] = js.undefined
    
    /* Sets the tabIndex attribute on the input */
    var tabIndex: js.UndefOr[String | Null] = js.undefined
    
    /* Select the currently focused option when the user presses tab */
    var tabSelectsValue: js.UndefOr[Boolean] = js.undefined
    
    /* Theme modifier method */
    var theme: js.UndefOr[ThemeConfig] = js.undefined
    
    /* The value of the select; reflected by the selected option */
    var value: js.UndefOr[ValueType[OptionType]] = js.undefined
  }
  object NamedProps {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): NamedProps[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NamedProps[OptionType]]
    }
    
    @scala.inline
    implicit class NamedPropsMutableBuilder[Self <: NamedProps[?], OptionType /* <: OptionTypeBase */] (val x: Self & NamedProps[OptionType]) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackspaceRemovesValue(value: Boolean): Self = StObject.set(x, "backspaceRemovesValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackspaceRemovesValueUndefined: Self = StObject.set(x, "backspaceRemovesValue", js.undefined)
      
      @scala.inline
      def setBlurInputOnSelect(value: Boolean): Self = StObject.set(x, "blurInputOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurInputOnSelectUndefined: Self = StObject.set(x, "blurInputOnSelect", js.undefined)
      
      @scala.inline
      def setCaptureMenuScroll(value: Boolean): Self = StObject.set(x, "captureMenuScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureMenuScrollUndefined: Self = StObject.set(x, "captureMenuScroll", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefixNull: Self = StObject.set(x, "classNamePrefix", null)
      
      @scala.inline
      def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseMenuOnScroll(value: Boolean | EventListener): Self = StObject.set(x, "closeMenuOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseMenuOnScrollFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "closeMenuOnScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseMenuOnScrollUndefined: Self = StObject.set(x, "closeMenuOnScroll", js.undefined)
      
      @scala.inline
      def setCloseMenuOnSelect(value: Boolean): Self = StObject.set(x, "closeMenuOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseMenuOnSelectUndefined: Self = StObject.set(x, "closeMenuOnSelect", js.undefined)
      
      @scala.inline
      def setComponents(value: SelectComponentsConfig[OptionType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setControlShouldRenderValue(value: Boolean): Self = StObject.set(x, "controlShouldRenderValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlShouldRenderValueUndefined: Self = StObject.set(x, "controlShouldRenderValue", js.undefined)
      
      @scala.inline
      def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
      
      @scala.inline
      def setDefaultMenuIsOpen(value: Boolean): Self = StObject.set(x, "defaultMenuIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMenuIsOpenUndefined: Self = StObject.set(x, "defaultMenuIsOpen", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: ValueType[OptionType]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: OptionType*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEscapeClearsValue(value: Boolean): Self = StObject.set(x, "escapeClearsValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeClearsValueUndefined: Self = StObject.set(x, "escapeClearsValue", js.undefined)
      
      @scala.inline
      def setFilterOption(value: (/* option */ Option, /* rawInput */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionNull: Self = StObject.set(x, "filterOption", null)
      
      @scala.inline
      def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      @scala.inline
      def setFormatGroupLabel(value: /* group */ GroupType[OptionType] => ReactNode): Self = StObject.set(x, "formatGroupLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatGroupLabelUndefined: Self = StObject.set(x, "formatGroupLabel", js.undefined)
      
      @scala.inline
      def setFormatOptionLabel(value: (/* option */ OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => ReactNode): Self = StObject.set(x, "formatOptionLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatOptionLabelUndefined: Self = StObject.set(x, "formatOptionLabel", js.undefined)
      
      @scala.inline
      def setGetOptionLabel(value: OptionType => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
      
      @scala.inline
      def setGetOptionValue(value: OptionType => String): Self = StObject.set(x, "getOptionValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionValueUndefined: Self = StObject.set(x, "getOptionValue", js.undefined)
      
      @scala.inline
      def setHideSelectedOptions(value: Boolean): Self = StObject.set(x, "hideSelectedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideSelectedOptionsUndefined: Self = StObject.set(x, "hideSelectedOptions", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Double | String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setIsClearable(value: Boolean): Self = StObject.set(x, "isClearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClearableUndefined: Self = StObject.set(x, "isClearable", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiUndefined: Self = StObject.set(x, "isMulti", js.undefined)
      
      @scala.inline
      def setIsOptionDisabled(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self = StObject.set(x, "isOptionDisabled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsOptionDisabledUndefined: Self = StObject.set(x, "isOptionDisabled", js.undefined)
      
      @scala.inline
      def setIsOptionSelected(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self = StObject.set(x, "isOptionSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsOptionSelectedUndefined: Self = StObject.set(x, "isOptionSelected", js.undefined)
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      @scala.inline
      def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: /* obj */ InputValue => String | Null): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setMaxMenuHeight(value: Double): Self = StObject.set(x, "maxMenuHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMenuHeightUndefined: Self = StObject.set(x, "maxMenuHeight", js.undefined)
      
      @scala.inline
      def setMenuIsOpen(value: Boolean): Self = StObject.set(x, "menuIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIsOpenUndefined: Self = StObject.set(x, "menuIsOpen", js.undefined)
      
      @scala.inline
      def setMenuPlacement(value: MenuPlacement): Self = StObject.set(x, "menuPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPlacementUndefined: Self = StObject.set(x, "menuPlacement", js.undefined)
      
      @scala.inline
      def setMenuPortalTarget(value: HTMLElement): Self = StObject.set(x, "menuPortalTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPortalTargetNull: Self = StObject.set(x, "menuPortalTarget", null)
      
      @scala.inline
      def setMenuPortalTargetUndefined: Self = StObject.set(x, "menuPortalTarget", js.undefined)
      
      @scala.inline
      def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      @scala.inline
      def setMenuShouldBlockScroll(value: Boolean): Self = StObject.set(x, "menuShouldBlockScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuShouldBlockScrollUndefined: Self = StObject.set(x, "menuShouldBlockScroll", js.undefined)
      
      @scala.inline
      def setMenuShouldScrollIntoView(value: Boolean): Self = StObject.set(x, "menuShouldScrollIntoView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuShouldScrollIntoViewUndefined: Self = StObject.set(x, "menuShouldScrollIntoView", js.undefined)
      
      @scala.inline
      def setMinMenuHeight(value: Double): Self = StObject.set(x, "minMenuHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinMenuHeightUndefined: Self = StObject.set(x, "minMenuHeight", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoOptionsMessage(value: /* obj */ InputValue => String | Null): Self = StObject.set(x, "noOptionsMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoOptionsMessageUndefined: Self = StObject.set(x, "noOptionsMessage", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputChange(value: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit): Self = StObject.set(x, "onInputChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMenuClose(value: () => Unit): Self = StObject.set(x, "onMenuClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMenuCloseUndefined: Self = StObject.set(x, "onMenuClose", js.undefined)
      
      @scala.inline
      def setOnMenuOpen(value: () => Unit): Self = StObject.set(x, "onMenuOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMenuOpenUndefined: Self = StObject.set(x, "onMenuOpen", js.undefined)
      
      @scala.inline
      def setOnMenuScrollToBottom(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onMenuScrollToBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuScrollToBottomUndefined: Self = StObject.set(x, "onMenuScrollToBottom", js.undefined)
      
      @scala.inline
      def setOnMenuScrollToTop(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = StObject.set(x, "onMenuScrollToTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMenuScrollToTopUndefined: Self = StObject.set(x, "onMenuScrollToTop", js.undefined)
      
      @scala.inline
      def setOpenMenuOnClick(value: Boolean): Self = StObject.set(x, "openMenuOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMenuOnClickUndefined: Self = StObject.set(x, "openMenuOnClick", js.undefined)
      
      @scala.inline
      def setOpenMenuOnFocus(value: Boolean): Self = StObject.set(x, "openMenuOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMenuOnFocusUndefined: Self = StObject.set(x, "openMenuOnFocus", js.undefined)
      
      @scala.inline
      def setOptions(value: GroupedOptionsType[OptionType] | OptionsType[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (GroupType[OptionType] | OptionType)*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setScreenReaderStatus(value: /* obj */ Count => String): Self = StObject.set(x, "screenReaderStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScreenReaderStatusUndefined: Self = StObject.set(x, "screenReaderStatus", js.undefined)
      
      @scala.inline
      def setStyles(value: StylesConfig): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexNull: Self = StObject.set(x, "tabIndex", null)
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTabSelectsValue(value: Boolean): Self = StObject.set(x, "tabSelectsValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabSelectsValueUndefined: Self = StObject.set(x, "tabSelectsValue", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeFunction1(value: /* theme */ Theme => Theme): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType[OptionType]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: OptionType*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in string ]: any} */ trait Props[OptionType /* <: OptionTypeBase */]
    extends StObject
       with NamedProps[OptionType]
  object Props {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](): Props[OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[OptionType]]
    }
  }
  
  @js.native
  trait Select[OptionType /* <: OptionTypeBase */]
    extends Component[Props[OptionType], State[OptionType], js.Any] {
    
    def announceAriaLiveContext(props: typings.reactSelect.anon.Event): Unit = js.native
    
    // ==============================
    // Helpers
    // ==============================
    def announceAriaLiveSelection(props: Context): Unit = js.native
    
    // Misc. Instance Properties
    // ------------------------------
    var blockOptionHover: Boolean = js.native
    
    def blur(): Unit = js.native
    
    def blurInput(): Unit = js.native
    
    // ==============================
    // Menu Options
    // ==============================
    def buildMenuOptions(props: Props[OptionType], selectValue: OptionsType[OptionType]): MenuOptions[OptionType] = js.native
    
    // Lifecycle
    // ------------------------------
    def cacheComponents(components: SelectComponents[OptionType]): Unit = js.native
    
    var clearFocusValueOnUpdate: Boolean = js.native
    
    def clearValue(): Unit = js.native
    
    var commonProps: js.Any = js.native
    
    // TODO
    var components: SelectComponents[OptionType] = js.native
    
    // ==============================
    // Renderers
    // ==============================
    def constructAriaLiveMessage(): String = js.native
    
    // Refs
    // ------------------------------
    var controlRef: ElRef = js.native
    
    def countOptions(): Double = js.native
    
    def filterOption(option: js.Object, inputValue: String): Boolean = js.native
    
    // aliased for consumers
    def focus(): Unit = js.native
    
    // ==============================
    // Methods
    // ==============================
    def focusInput(): Unit = js.native
    
    def focusOption(direction: FocusDirection): Unit = js.native
    
    @JSName("focusValue")
    def focusValue_next(direction: next): Unit = js.native
    @JSName("focusValue")
    def focusValue_previous(direction: previous): Unit = js.native
    
    var focusedOptionRef: ElRef = js.native
    
    var formatGroupLabel: typings.reactSelect.builtinsMod.formatGroupLabel[OptionType] = js.native
    
    def formatOptionLabel(data: OptionType, context: FormatOptionLabelContext): ReactNode = js.native
    
    def getActiveDescendentId(): js.Any = js.native
    
    // ==============================
    // Getters
    // ==============================
    def getCommonProps(): ClearValue[OptionType] = js.native
    
    def getControlRef(ref: HTMLElement): Unit = js.native
    
    @JSName("getElementId")
    def getElementId_group(element: group): String = js.native
    @JSName("getElementId")
    def getElementId_input(element: input): String = js.native
    @JSName("getElementId")
    def getElementId_listbox(element: listbox): String = js.native
    @JSName("getElementId")
    def getElementId_option(element: option): String = js.native
    
    def getFocusedOptionRef(ref: HTMLElement): Unit = js.native
    
    def getInputRef(ref: HTMLElement): Unit = js.native
    
    def getMenuListRef(ref: HTMLElement): Unit = js.native
    
    def getNextFocusedOption(options: OptionsType[OptionType]): OptionType = js.native
    
    def getNextFocusedValue(nextSelectValue: OptionsType[OptionType]): OptionType = js.native
    
    var getOptionLabel: typings.reactSelect.builtinsMod.getOptionLabel[OptionType] = js.native
    
    var getOptionValue: typings.reactSelect.builtinsMod.getOptionValue[OptionType] = js.native
    
    def getStyles(key: String, props: js.Object): js.Object = js.native
    
    // ==============================
    // Focus Handlers
    // ==============================
    def handleInputChange(event: KeyboardEvent[HTMLInputElement]): Unit = js.native
    
    var hasGroups: Boolean = js.native
    
    def hasOptions(): Boolean = js.native
    
    def hasValue(): Boolean = js.native
    
    var initialTouchX: Double = js.native
    
    var initialTouchY: Double = js.native
    
    var inputIsHiddenAfterUpdate: Boolean | Null = js.native
    
    var inputRef: ElRef = js.native
    
    var instancePrefix: String = js.native
    
    def isClearable(): Boolean = js.native
    
    def isOptionDisabled(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
    
    def isOptionSelected(option: OptionType, selectValue: OptionsType[OptionType]): Boolean = js.native
    
    var menuListRef: ElRef = js.native
    
    def onClearIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
    
    def onClearIndicatorTouchEnd(event: TouchEvent[HTMLElement]): Unit = js.native
    
    def onCompositionEnd(): Unit = js.native
    
    def onCompositionStart(): Unit = js.native
    
    def onControlMouseDown(event: MouseOrTouchEvent): Unit = js.native
    
    def onControlTouchEnd(event: TouchEvent[HTMLElement]): Unit = js.native
    
    def onDropdownIndicatorMouseDown(event: MouseOrTouchEvent): Unit = js.native
    
    def onDropdownIndicatorTouchEnd(event: TouchEvent[HTMLElement]): Unit = js.native
    
    def onInputBlur(event: FocusEvent[HTMLInputElement]): Unit = js.native
    
    def onInputChange(newValue: String, actionMeta: InputActionMeta): Unit = js.native
    
    def onInputFocus(event: FocusEvent[HTMLInputElement]): Unit = js.native
    
    // ==============================
    // Keyboard Handlers
    // ==============================
    def onKeyDown(event: KeyboardEvent[HTMLElement]): Unit = js.native
    
    def onMenuClose(): Unit = js.native
    
    // ==============================
    // Mouse Handlers
    // ==============================
    def onMenuMouseDown(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    def onMenuMouseMove(event: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    // ==============================
    // Consumer Handlers
    // ==============================
    def onMenuOpen(): Unit = js.native
    
    def onOptionHover(focusedOption: OptionType): Unit = js.native
    
    def onScroll(event: Event): Unit = js.native
    
    def onTouchEnd(event: typings.std.TouchEvent): Unit = js.native
    
    def onTouchMove(event: typings.std.TouchEvent): Unit = js.native
    
    def onTouchStart(event: typings.std.TouchEvent): Unit = js.native
    
    var openAfterFocus: Boolean = js.native
    
    @JSName("openMenu")
    def openMenu_first(focusOption: first): Unit = js.native
    @JSName("openMenu")
    def openMenu_last(focusOption: last): Unit = js.native
    
    def popValue(): Unit = js.native
    
    def removeValue(removedValue: OptionType): Unit = js.native
    
    def renderClearIndicator(): ReactNode = js.native
    
    def renderDropdownIndicator(): ReactNode = js.native
    
    def renderFormField(): ReactNode = js.native
    
    def renderIndicatorSeparator(): ReactNode = js.native
    
    def renderInput(): ReactNode = js.native
    
    def renderLiveRegion(): ReactNode = js.native
    
    def renderLoadingIndicator(): ReactNode = js.native
    
    def renderMenu(): ReactNode = js.native
    
    def renderPlaceholderOrValue(): PlaceholderOrValue[OptionType] | Null = js.native
    
    var scrollToFocusedOptionOnUpdate: Boolean = js.native
    
    def selectOption(newValue: OptionType): Unit = js.native
    
    def setValue(newValue: ValueType[OptionType], action: ActionTypes): Unit = js.native
    def setValue(newValue: ValueType[OptionType], action: ActionTypes, option: OptionType): Unit = js.native
    
    def shouldHideSelectedOptions(): Boolean = js.native
    
    // ==============================
    // Composition Handlers
    // ==============================
    def startListeningComposition(): Unit = js.native
    
    // ==============================
    // Touch Handlers
    // ==============================
    def startListeningToTouch(): Unit = js.native
    
    def stopListeningComposition(): Unit = js.native
    
    def stopListeningToTouch(): Unit = js.native
    
    var userIsDragging: Boolean | Null = js.native
  }
  
  type SelectComponentsProps = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in string ]: any}
    */ typings.reactSelect.reactSelectStrings.SelectComponentsProps & TopLevel[js.Any]
  
  trait State[OptionType /* <: OptionTypeBase */] extends StObject {
    
    var ariaLiveContext: String
    
    var ariaLiveSelection: String
    
    var focusedOption: OptionType | Null
    
    var focusedValue: OptionType | Null
    
    var inputIsHidden: Boolean
    
    var isComposing: Boolean
    
    var isFocused: Boolean
    
    var menuOptions: MenuOptions[OptionType]
    
    var selectValue: OptionsType[OptionType]
  }
  object State {
    
    @scala.inline
    def apply[OptionType /* <: OptionTypeBase */](
      ariaLiveContext: String,
      ariaLiveSelection: String,
      inputIsHidden: Boolean,
      isComposing: Boolean,
      isFocused: Boolean,
      menuOptions: MenuOptions[OptionType],
      selectValue: OptionsType[OptionType]
    ): State[OptionType] = {
      val __obj = js.Dynamic.literal(ariaLiveContext = ariaLiveContext.asInstanceOf[js.Any], ariaLiveSelection = ariaLiveSelection.asInstanceOf[js.Any], inputIsHidden = inputIsHidden.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], menuOptions = menuOptions.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any], focusedOption = null, focusedValue = null)
      __obj.asInstanceOf[State[OptionType]]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State[?], OptionType /* <: OptionTypeBase */] (val x: Self & State[OptionType]) extends AnyVal {
      
      @scala.inline
      def setAriaLiveContext(value: String): Self = StObject.set(x, "ariaLiveContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLiveSelection(value: String): Self = StObject.set(x, "ariaLiveSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedOption(value: OptionType): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedOptionNull: Self = StObject.set(x, "focusedOption", null)
      
      @scala.inline
      def setFocusedValue(value: OptionType): Self = StObject.set(x, "focusedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedValueNull: Self = StObject.set(x, "focusedValue", null)
      
      @scala.inline
      def setInputIsHidden(value: Boolean): Self = StObject.set(x, "inputIsHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuOptions(value: MenuOptions[OptionType]): Self = StObject.set(x, "menuOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValue(value: OptionsType[OptionType]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectValueVarargs(value: OptionType*): Self = StObject.set(x, "selectValue", js.Array(value :_*))
    }
  }
}
