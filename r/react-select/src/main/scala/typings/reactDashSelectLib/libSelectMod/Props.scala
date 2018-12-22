package typings
package reactDashSelectLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props[OptionType] extends js.Object {
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
  var menuPortalTarget: js.UndefOr[reactLib.HTMLElement | scala.Null] = js.undefined
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
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  /* Fired when the user scrolls to the top of the menu */
  var onMenuScrollToTop: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
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

