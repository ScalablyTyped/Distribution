package typings
package reactDashSelectLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in string ]: any} */ trait Props[OptionType] extends js.Object {
  /* Aria label (for assistive tech) */
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  /* HTML ID of an element that should be used as the label (for assistive tech) */
  var `aria-labelledby`: js.UndefOr[java.lang.String] = js.undefined
  /* Focus the control when it is mounted */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /* Remove the currently focused option when the user presses backspace */
  var backspaceRemovesValue: js.UndefOr[scala.Boolean] = js.undefined
  /* Remove focus from the input when the user selects an option (handy for dismissing the keyboard on touch devices) */
  var blurInputOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /* When the user reaches the top/bottom of the menu, prevent scroll on the scroll-parent  */
  var captureMenuScroll: js.UndefOr[scala.Boolean] = js.undefined
  /* className attribute applied to the outer component */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /* classNamePrefix attribute used as a base for inner component classNames */
  var classNamePrefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /*
    If `true`, close the select menu when the user scrolls the document/body.
    If a function, takes a standard javascript `ScrollEvent` you return a boolean:
    `true` => The menu closes
    `false` => The menu stays open
    This is useful when you have a scrollable modal and want to portal the menu out,
    but want to avoid graphical issues.
    */
  var closeMenuOnScroll: js.UndefOr[scala.Boolean | stdLib.EventListener] = js.undefined
  /* Close the select menu when the user selects an option */
  var closeMenuOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /*
    This complex object includes all the compositional components that are used
    in `react-select`. If you wish to overwrite a component, pass in an object
    with the appropriate namespace.
    If you only wish to restyle a component, we recommend using the `styles` prop
    instead. For a list of the components that can be passed in, and the shape
    that will be passed to them, see [the components docs](/api#components)
    */
  var components: js.UndefOr[reactDashSelectLib.libComponentsMod.SelectComponentsConfig[OptionType]] = js.undefined
  /* Whether the value of the select, e.g. SingleValue, should be displayed in the control. */
  var controlShouldRenderValue: js.UndefOr[scala.Boolean] = js.undefined
  var defaultInputValue: js.UndefOr[java.lang.String] = js.undefined
  var defaultMenuIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[reactDashSelectLib.libTypesMod.ValueType[OptionType]] = js.undefined
  /* Delimiter used to join multiple values into a single HTML Input value */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /* Clear all values when the user presses escape AND the menu is closed */
  var escapeClearsValue: js.UndefOr[scala.Boolean] = js.undefined
  /* Custom method to filter whether an option should be displayed in the menu */
  var filterOption: js.UndefOr[
    (js.Function2[
      /* option */ reactDashSelectLib.libFiltersMod.Option, 
      /* rawInput */ java.lang.String, 
      scala.Boolean
    ]) | scala.Null
  ] = js.undefined
  /* Formats group labels in the menu as React components */
  var formatGroupLabel: js.UndefOr[reactDashSelectLib.libBuiltinsMod.formatGroupLabel[OptionType]] = js.undefined
  /* Formats option labels in the menu and control as React components */
  var formatOptionLabel: js.UndefOr[
    js.Function2[
      /* option */ OptionType, 
      /* labelMeta */ FormatOptionLabelMeta[OptionType], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  /* Resolves option data to a string to be displayed as the label by components */
  var getOptionLabel: js.UndefOr[reactDashSelectLib.libBuiltinsMod.getOptionLabel[OptionType]] = js.undefined
  /* Resolves option data to a string to compare options and specify value attributes */
  var getOptionValue: js.UndefOr[reactDashSelectLib.libBuiltinsMod.getOptionValue[OptionType]] = js.undefined
  /* Hide the selected option from the menu */
  var hideSelectedOptions: js.UndefOr[scala.Boolean] = js.undefined
  /* The id to set on the SelectContainer component. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /* The id of the search input */
  var inputId: js.UndefOr[java.lang.String] = js.undefined
  /* The value of the search input */
  var inputValue: js.UndefOr[java.lang.String] = js.undefined
  /* Define an id prefix for the select components e.g. {your-id}-value */
  var instanceId: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /* Is the select value clearable */
  var isClearable: js.UndefOr[scala.Boolean] = js.undefined
  /* Is the select disabled */
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Is the select in a state of loading (async) */
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  /* Support multiple selected options */
  var isMulti: js.UndefOr[scala.Boolean] = js.undefined
  /* Override the built-in logic to detect whether an option is disabled */
  var isOptionDisabled: js.UndefOr[
    js.Function2[
      /* option */ OptionType, 
      /* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], 
      scala.Boolean | reactDashSelectLib.reactDashSelectLibNumbers.`false`
    ]
  ] = js.undefined
  /* Override the built-in logic to detect whether an option is selected */
  var isOptionSelected: js.UndefOr[
    js.Function2[
      /* option */ OptionType, 
      /* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], 
      scala.Boolean
    ]
  ] = js.undefined
  /* Is the select direction right-to-left */
  var isRtl: js.UndefOr[scala.Boolean] = js.undefined
  /* Whether to enable search functionality */
  var isSearchable: js.UndefOr[scala.Boolean] = js.undefined
  /* Async: Text to display when loading options */
  var loadingMessage: js.UndefOr[
    js.Function1[/* obj */ reactDashSelectLib.Anon_InputValue, java.lang.String | scala.Null]
  ] = js.undefined
  /* Maximum height of the menu before scrolling */
  var maxMenuHeight: js.UndefOr[scala.Double] = js.undefined
  /* Whether the menu is open */
  var menuIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  /* Default placement of the menu in relation to the control. 'auto' will flip
    when there isn't enough space below the control. */
  var menuPlacement: js.UndefOr[reactDashSelectLib.libTypesMod.MenuPlacement] = js.undefined
  /* Whether the menu should use a portal, and where it should attach */
  var menuPortalTarget: js.UndefOr[stdLib.HTMLElement | scala.Null] = js.undefined
  /* The CSS position value of the menu, when "fixed" extra layout management is required */
  var menuPosition: js.UndefOr[reactDashSelectLib.libTypesMod.MenuPosition] = js.undefined
  /* Whether to block scroll events when the menu is open */
  var menuShouldBlockScroll: js.UndefOr[scala.Boolean] = js.undefined
  /* Whether the menu should be scrolled into view when it opens */
  var menuShouldScrollIntoView: js.UndefOr[scala.Boolean] = js.undefined
  /* Minimum height of the menu before flipping */
  var minMenuHeight: js.UndefOr[scala.Double] = js.undefined
  /* Name of the HTML Input (optional - without this, no input will be rendered) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /* Text to display when there are no options */
  var noOptionsMessage: js.UndefOr[
    js.Function1[/* obj */ reactDashSelectLib.Anon_InputValue, java.lang.String | scala.Null]
  ] = js.undefined
  /* Handle blur events on the control */
  var onBlur: js.UndefOr[reactDashSelectLib.libTypesMod.FocusEventHandler] = js.undefined
  /* Handle change events on the select */
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ reactDashSelectLib.libTypesMod.ValueType[OptionType], 
      /* action */ reactDashSelectLib.libTypesMod.ActionMeta, 
      scala.Unit
    ]
  ] = js.undefined
  /* Handle focus events on the control */
  var onFocus: js.UndefOr[reactDashSelectLib.libTypesMod.FocusEventHandler] = js.undefined
  /* Handle change events on the input */
  var onInputChange: js.UndefOr[
    js.Function2[
      /* newValue */ java.lang.String, 
      /* actionMeta */ reactDashSelectLib.libTypesMod.InputActionMeta, 
      scala.Unit
    ]
  ] = js.undefined
  /* Handle key down events on the select */
  var onKeyDown: js.UndefOr[reactDashSelectLib.libTypesMod.KeyboardEventHandler] = js.undefined
  /* Handle the menu closing */
  var onMenuClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* Handle the menu opening */
  var onMenuOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /* Fired when the user scrolls to the bottom of the menu */
  var onMenuScrollToBottom: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  /* Fired when the user scrolls to the top of the menu */
  var onMenuScrollToTop: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  /* Allows control of whether the menu is opened when the Select is clicked */
  var openMenuOnClick: js.UndefOr[scala.Boolean] = js.undefined
  /* Allows control of whether the menu is opened when the Select is focused */
  var openMenuOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /* Array of options that populate the select menu */
  var options: js.UndefOr[
    reactDashSelectLib.libTypesMod.GroupedOptionsType[OptionType] | reactDashSelectLib.libTypesMod.OptionsType[OptionType]
  ] = js.undefined
  /* Number of options to jump in menu when page{up|down} keys are used */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /* Placeholder text for the select value */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /* Status to relay to screen readers */
  var screenReaderStatus: js.UndefOr[js.Function1[/* obj */ reactDashSelectLib.Anon_Count, java.lang.String]] = js.undefined
  /* Style modifier methods */
  var styles: js.UndefOr[reactDashSelectLib.libStylesMod.StylesConfig] = js.undefined
  /* Sets the tabIndex attribute on the input */
  var tabIndex: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /* Select the currently focused option when the user presses tab */
  var tabSelectsValue: js.UndefOr[scala.Boolean] = js.undefined
  /* Theme modifier method */
  var theme: js.UndefOr[reactDashSelectLib.libThemeMod.ThemeConfig] = js.undefined
  /* The value of the select; reflected by the selected option */
  var value: js.UndefOr[reactDashSelectLib.libTypesMod.ValueType[OptionType]] = js.undefined
}

object Props {
  @scala.inline
  def apply[OptionType](
    `aria-label`: java.lang.String = null,
    `aria-labelledby`: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backspaceRemovesValue: js.UndefOr[scala.Boolean] = js.undefined,
    blurInputOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    captureMenuScroll: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classNamePrefix: java.lang.String = null,
    closeMenuOnScroll: scala.Boolean | stdLib.EventListener = null,
    closeMenuOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    components: reactDashSelectLib.libComponentsMod.SelectComponentsConfig[OptionType] = null,
    controlShouldRenderValue: js.UndefOr[scala.Boolean] = js.undefined,
    defaultInputValue: java.lang.String = null,
    defaultMenuIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: reactDashSelectLib.libTypesMod.ValueType[OptionType] = null,
    delimiter: java.lang.String = null,
    escapeClearsValue: js.UndefOr[scala.Boolean] = js.undefined,
    filterOption: (/* option */ reactDashSelectLib.libFiltersMod.Option, /* rawInput */ java.lang.String) => scala.Boolean = null,
    formatGroupLabel: reactDashSelectLib.libBuiltinsMod.formatGroupLabel[OptionType] = null,
    formatOptionLabel: (/* option */ OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => reactLib.reactMod.ReactNs.ReactNode = null,
    getOptionLabel: reactDashSelectLib.libBuiltinsMod.getOptionLabel[OptionType] = null,
    getOptionValue: reactDashSelectLib.libBuiltinsMod.getOptionValue[OptionType] = null,
    hideSelectedOptions: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputId: java.lang.String = null,
    inputValue: java.lang.String = null,
    instanceId: scala.Double | java.lang.String = null,
    isClearable: js.UndefOr[scala.Boolean] = js.undefined,
    isDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    isMulti: js.UndefOr[scala.Boolean] = js.undefined,
    isOptionDisabled: (/* option */ OptionType, /* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType]) => scala.Boolean | reactDashSelectLib.reactDashSelectLibNumbers.`false` = null,
    isOptionSelected: (/* option */ OptionType, /* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType]) => scala.Boolean = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    isSearchable: js.UndefOr[scala.Boolean] = js.undefined,
    loadingMessage: /* obj */ reactDashSelectLib.Anon_InputValue => java.lang.String | scala.Null = null,
    maxMenuHeight: scala.Int | scala.Double = null,
    menuIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    menuPlacement: reactDashSelectLib.libTypesMod.MenuPlacement = null,
    menuPortalTarget: stdLib.HTMLElement = null,
    menuPosition: reactDashSelectLib.libTypesMod.MenuPosition = null,
    menuShouldBlockScroll: js.UndefOr[scala.Boolean] = js.undefined,
    menuShouldScrollIntoView: js.UndefOr[scala.Boolean] = js.undefined,
    minMenuHeight: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    noOptionsMessage: /* obj */ reactDashSelectLib.Anon_InputValue => java.lang.String | scala.Null = null,
    onBlur: reactDashSelectLib.libTypesMod.FocusEventHandler = null,
    onChange: (/* value */ reactDashSelectLib.libTypesMod.ValueType[OptionType], /* action */ reactDashSelectLib.libTypesMod.ActionMeta) => scala.Unit = null,
    onFocus: reactDashSelectLib.libTypesMod.FocusEventHandler = null,
    onInputChange: (/* newValue */ java.lang.String, /* actionMeta */ reactDashSelectLib.libTypesMod.InputActionMeta) => scala.Unit = null,
    onKeyDown: reactDashSelectLib.libTypesMod.KeyboardEventHandler = null,
    onMenuClose: () => scala.Unit = null,
    onMenuOpen: () => scala.Unit = null,
    onMenuScrollToBottom: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLElement, reactLib.Event] => scala.Unit = null,
    onMenuScrollToTop: /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[stdLib.HTMLElement, reactLib.Event] => scala.Unit = null,
    openMenuOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    openMenuOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    options: reactDashSelectLib.libTypesMod.GroupedOptionsType[OptionType] | reactDashSelectLib.libTypesMod.OptionsType[OptionType] = null,
    pageSize: scala.Int | scala.Double = null,
    placeholder: java.lang.String = null,
    screenReaderStatus: /* obj */ reactDashSelectLib.Anon_Count => java.lang.String = null,
    styles: reactDashSelectLib.libStylesMod.StylesConfig = null,
    tabIndex: java.lang.String = null,
    tabSelectsValue: js.UndefOr[scala.Boolean] = js.undefined,
    theme: reactDashSelectLib.libThemeMod.ThemeConfig = null,
    value: reactDashSelectLib.libTypesMod.ValueType[OptionType] = null
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
    if (formatGroupLabel != null) __obj.updateDynamic("formatGroupLabel")(formatGroupLabel)
    if (formatOptionLabel != null) __obj.updateDynamic("formatOptionLabel")(js.Any.fromFunction2(formatOptionLabel))
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(getOptionLabel)
    if (getOptionValue != null) __obj.updateDynamic("getOptionValue")(getOptionValue)
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
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onMenuClose != null) __obj.updateDynamic("onMenuClose")(js.Any.fromFunction0(onMenuClose))
    if (onMenuOpen != null) __obj.updateDynamic("onMenuOpen")(js.Any.fromFunction0(onMenuOpen))
    if (onMenuScrollToBottom != null) __obj.updateDynamic("onMenuScrollToBottom")(js.Any.fromFunction1(onMenuScrollToBottom))
    if (onMenuScrollToTop != null) __obj.updateDynamic("onMenuScrollToTop")(js.Any.fromFunction1(onMenuScrollToTop))
    if (!js.isUndefined(openMenuOnClick)) __obj.updateDynamic("openMenuOnClick")(openMenuOnClick)
    if (!js.isUndefined(openMenuOnFocus)) __obj.updateDynamic("openMenuOnFocus")(openMenuOnFocus)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (screenReaderStatus != null) __obj.updateDynamic("screenReaderStatus")(js.Any.fromFunction1(screenReaderStatus))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (!js.isUndefined(tabSelectsValue)) __obj.updateDynamic("tabSelectsValue")(tabSelectsValue)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
}

