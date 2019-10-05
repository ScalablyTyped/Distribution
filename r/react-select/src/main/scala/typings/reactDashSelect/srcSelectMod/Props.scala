package typings.reactDashSelect.srcSelectMod

import typings.react.Event
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.reactDashSelect.Anon_Count
import typings.reactDashSelect.Anon_InputValue
import typings.reactDashSelect.srcComponentsMod.SelectComponentsConfig
import typings.reactDashSelect.srcFiltersMod.Option
import typings.reactDashSelect.srcStylesMod.StylesConfig
import typings.reactDashSelect.srcThemeMod.ThemeConfig
import typings.reactDashSelect.srcTypesMod.ActionMeta
import typings.reactDashSelect.srcTypesMod.FocusEventHandler
import typings.reactDashSelect.srcTypesMod.GroupType
import typings.reactDashSelect.srcTypesMod.GroupedOptionsType
import typings.reactDashSelect.srcTypesMod.InputActionMeta
import typings.reactDashSelect.srcTypesMod.KeyboardEventHandler
import typings.reactDashSelect.srcTypesMod.MenuPlacement
import typings.reactDashSelect.srcTypesMod.MenuPosition
import typings.reactDashSelect.srcTypesMod.OptionTypeBase
import typings.reactDashSelect.srcTypesMod.OptionsType
import typings.reactDashSelect.srcTypesMod.ValueType
import typings.std.EventListener
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in string ]: any} */ trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
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
  var formatGroupLabel: js.UndefOr[typings.reactDashSelect.srcBuiltinsMod.formatGroupLabel[OptionType]] = js.undefined
  /* Formats option labels in the menu and control as React components */
  var formatOptionLabel: js.UndefOr[
    js.Function2[
      /* option */ OptionType, 
      /* labelMeta */ FormatOptionLabelMeta[OptionType], 
      ReactNode
    ]
  ] = js.undefined
  /* Resolves option data to a string to be displayed as the label by components */
  var getOptionLabel: js.UndefOr[typings.reactDashSelect.srcBuiltinsMod.getOptionLabel[OptionType]] = js.undefined
  /* Resolves option data to a string to compare options and specify value attributes */
  var getOptionValue: js.UndefOr[typings.reactDashSelect.srcBuiltinsMod.getOptionValue[OptionType]] = js.undefined
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
  var loadingMessage: js.UndefOr[js.Function1[/* obj */ Anon_InputValue, String | Null]] = js.undefined
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
  var noOptionsMessage: js.UndefOr[js.Function1[/* obj */ Anon_InputValue, String | Null]] = js.undefined
  /* Handle blur events on the control */
  var onBlur: js.UndefOr[FocusEventHandler] = js.undefined
  /* Handle change events on the select */
  var onChange: js.UndefOr[js.Function2[/* value */ ValueType[OptionType], /* action */ ActionMeta, Unit]] = js.undefined
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
  var screenReaderStatus: js.UndefOr[js.Function1[/* obj */ Anon_Count, String]] = js.undefined
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

object Props {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backspaceRemovesValue: js.UndefOr[Boolean] = js.undefined,
    blurInputOnSelect: js.UndefOr[Boolean] = js.undefined,
    captureMenuScroll: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classNamePrefix: String = null,
    closeMenuOnScroll: Boolean | EventListener = null,
    closeMenuOnSelect: js.UndefOr[Boolean] = js.undefined,
    components: SelectComponentsConfig[OptionType] = null,
    controlShouldRenderValue: js.UndefOr[Boolean] = js.undefined,
    defaultInputValue: String = null,
    defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: ValueType[OptionType] = null,
    delimiter: String = null,
    escapeClearsValue: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* option */ Option, /* rawInput */ String) => Boolean = null,
    formatGroupLabel: /* group */ GroupType[OptionType] => ReactNode = null,
    formatOptionLabel: (/* option */ OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => ReactNode = null,
    getOptionLabel: OptionType => String = null,
    getOptionValue: OptionType => String = null,
    hideSelectedOptions: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputId: String = null,
    inputValue: String = null,
    instanceId: Double | String = null,
    isClearable: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    isMulti: js.UndefOr[Boolean] = js.undefined,
    isOptionDisabled: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean = null,
    isOptionSelected: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    isSearchable: js.UndefOr[Boolean] = js.undefined,
    loadingMessage: /* obj */ Anon_InputValue => String | Null = null,
    maxMenuHeight: Int | Double = null,
    menuIsOpen: js.UndefOr[Boolean] = js.undefined,
    menuPlacement: MenuPlacement = null,
    menuPortalTarget: HTMLElement = null,
    menuPosition: MenuPosition = null,
    menuShouldBlockScroll: js.UndefOr[Boolean] = js.undefined,
    menuShouldScrollIntoView: js.UndefOr[Boolean] = js.undefined,
    minMenuHeight: Int | Double = null,
    name: String = null,
    noOptionsMessage: /* obj */ Anon_InputValue => String | Null = null,
    onBlur: /* event */ FocusEvent[HTMLElement] => Unit = null,
    onChange: (/* value */ ValueType[OptionType], /* action */ ActionMeta) => Unit = null,
    onFocus: /* event */ FocusEvent[HTMLElement] => Unit = null,
    onInputChange: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit = null,
    onKeyDown: /* event */ KeyboardEvent[HTMLElement] => Unit = null,
    onMenuClose: () => Unit = null,
    onMenuOpen: () => Unit = null,
    onMenuScrollToBottom: /* event */ SyntheticEvent[HTMLElement, Event] => Unit = null,
    onMenuScrollToTop: /* event */ SyntheticEvent[HTMLElement, Event] => Unit = null,
    openMenuOnClick: js.UndefOr[Boolean] = js.undefined,
    openMenuOnFocus: js.UndefOr[Boolean] = js.undefined,
    options: GroupedOptionsType[OptionType] | OptionsType[OptionType] = null,
    pageSize: Int | Double = null,
    placeholder: ReactNode = null,
    screenReaderStatus: /* obj */ Anon_Count => String = null,
    styles: StylesConfig = null,
    tabIndex: String = null,
    tabSelectsValue: js.UndefOr[Boolean] = js.undefined,
    theme: ThemeConfig = null,
    value: ValueType[OptionType] = null
  ): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(backspaceRemovesValue)) __obj.updateDynamic("backspaceRemovesValue")(backspaceRemovesValue)
    if (!js.isUndefined(blurInputOnSelect)) __obj.updateDynamic("blurInputOnSelect")(blurInputOnSelect)
    if (!js.isUndefined(captureMenuScroll)) __obj.updateDynamic("captureMenuScroll")(captureMenuScroll)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix)
    if (closeMenuOnScroll != null) __obj.updateDynamic("closeMenuOnScroll")(closeMenuOnScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(closeMenuOnSelect)) __obj.updateDynamic("closeMenuOnSelect")(closeMenuOnSelect)
    if (components != null) __obj.updateDynamic("components")(components)
    if (!js.isUndefined(controlShouldRenderValue)) __obj.updateDynamic("controlShouldRenderValue")(controlShouldRenderValue)
    if (defaultInputValue != null) __obj.updateDynamic("defaultInputValue")(defaultInputValue)
    if (!js.isUndefined(defaultMenuIsOpen)) __obj.updateDynamic("defaultMenuIsOpen")(defaultMenuIsOpen)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(escapeClearsValue)) __obj.updateDynamic("escapeClearsValue")(escapeClearsValue)
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (formatGroupLabel != null) __obj.updateDynamic("formatGroupLabel")(js.Any.fromFunction1(formatGroupLabel))
    if (formatOptionLabel != null) __obj.updateDynamic("formatOptionLabel")(js.Any.fromFunction2(formatOptionLabel))
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (getOptionValue != null) __obj.updateDynamic("getOptionValue")(js.Any.fromFunction1(getOptionValue))
    if (!js.isUndefined(hideSelectedOptions)) __obj.updateDynamic("hideSelectedOptions")(hideSelectedOptions)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputId != null) __obj.updateDynamic("inputId")(inputId)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(isClearable)) __obj.updateDynamic("isClearable")(isClearable)
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (!js.isUndefined(isMulti)) __obj.updateDynamic("isMulti")(isMulti)
    if (isOptionDisabled != null) __obj.updateDynamic("isOptionDisabled")(js.Any.fromFunction2(isOptionDisabled))
    if (isOptionSelected != null) __obj.updateDynamic("isOptionSelected")(js.Any.fromFunction2(isOptionSelected))
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (!js.isUndefined(isSearchable)) __obj.updateDynamic("isSearchable")(isSearchable)
    if (loadingMessage != null) __obj.updateDynamic("loadingMessage")(js.Any.fromFunction1(loadingMessage))
    if (maxMenuHeight != null) __obj.updateDynamic("maxMenuHeight")(maxMenuHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(menuIsOpen)) __obj.updateDynamic("menuIsOpen")(menuIsOpen)
    if (menuPlacement != null) __obj.updateDynamic("menuPlacement")(menuPlacement)
    if (menuPortalTarget != null) __obj.updateDynamic("menuPortalTarget")(menuPortalTarget)
    if (menuPosition != null) __obj.updateDynamic("menuPosition")(menuPosition)
    if (!js.isUndefined(menuShouldBlockScroll)) __obj.updateDynamic("menuShouldBlockScroll")(menuShouldBlockScroll)
    if (!js.isUndefined(menuShouldScrollIntoView)) __obj.updateDynamic("menuShouldScrollIntoView")(menuShouldScrollIntoView)
    if (minMenuHeight != null) __obj.updateDynamic("minMenuHeight")(minMenuHeight.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (noOptionsMessage != null) __obj.updateDynamic("noOptionsMessage")(js.Any.fromFunction1(noOptionsMessage))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onMenuClose != null) __obj.updateDynamic("onMenuClose")(js.Any.fromFunction0(onMenuClose))
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(js.Any.fromFunction0(onMenuOpen))
    if (onMenuScrollToBottom != null) __obj.updateDynamic("onMenuScrollToBottom")(js.Any.fromFunction1(onMenuScrollToBottom))
    if (onMenuScrollToTop != null) __obj.updateDynamic("onMenuScrollToTop")(js.Any.fromFunction1(onMenuScrollToTop))
    if (!js.isUndefined(openMenuOnClick)) __obj.updateDynamic("openMenuOnClick")(openMenuOnClick)
    if (!js.isUndefined(openMenuOnFocus)) __obj.updateDynamic("openMenuOnFocus")(openMenuOnFocus)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (screenReaderStatus != null) __obj.updateDynamic("screenReaderStatus")(js.Any.fromFunction1(screenReaderStatus))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (!js.isUndefined(tabSelectsValue)) __obj.updateDynamic("tabSelectsValue")(tabSelectsValue)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
}

