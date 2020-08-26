package typings.reactSelect.selectMod

import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactSelect.anon.Count
import typings.reactSelect.anon.InputValue
import typings.reactSelect.componentsMod.SelectComponentsConfig
import typings.reactSelect.filtersMod.Option
import typings.reactSelect.stylesMod.StylesConfig
import typings.reactSelect.themeMod.ThemeConfig
import typings.reactSelect.typesMod.ActionMeta
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ key in string ]: any} */ @js.native
trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  /* Aria label (for assistive tech) */
  var `aria-label`: js.UndefOr[String] = js.native
  /* HTML ID of an element that should be used as the label (for assistive tech) */
  var `aria-labelledby`: js.UndefOr[String] = js.native
  /* Focus the control when it is mounted */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /* Remove the currently focused option when the user presses backspace */
  var backspaceRemovesValue: js.UndefOr[Boolean] = js.native
  /* Remove focus from the input when the user selects an option (handy for dismissing the keyboard on touch devices) */
  var blurInputOnSelect: js.UndefOr[Boolean] = js.native
  /* When the user reaches the top/bottom of the menu, prevent scroll on the scroll-parent  */
  var captureMenuScroll: js.UndefOr[Boolean] = js.native
  /* className attribute applied to the outer component */
  var className: js.UndefOr[String] = js.native
  /* classNamePrefix attribute used as a base for inner component classNames */
  var classNamePrefix: js.UndefOr[String | Null] = js.native
  /*
    If `true`, close the select menu when the user scrolls the document/body.
    If a function, takes a standard javascript `ScrollEvent` you return a boolean:
    `true` => The menu closes
    `false` => The menu stays open
    This is useful when you have a scrollable modal and want to portal the menu out,
    but want to avoid graphical issues.
    */
  var closeMenuOnScroll: js.UndefOr[Boolean | EventListener] = js.native
  /* Close the select menu when the user selects an option */
  var closeMenuOnSelect: js.UndefOr[Boolean] = js.native
  /*
    This complex object includes all the compositional components that are used
    in `react-select`. If you wish to overwrite a component, pass in an object
    with the appropriate namespace.
    If you only wish to restyle a component, we recommend using the `styles` prop
    instead. For a list of the components that can be passed in, and the shape
    that will be passed to them, see [the components docs](/api#components)
    */
  var components: js.UndefOr[SelectComponentsConfig[OptionType]] = js.native
  /* Whether the value of the select, e.g. SingleValue, should be displayed in the control. */
  var controlShouldRenderValue: js.UndefOr[Boolean] = js.native
  var defaultInputValue: js.UndefOr[String] = js.native
  var defaultMenuIsOpen: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[ValueType[OptionType]] = js.native
  /* Delimiter used to join multiple values into a single HTML Input value */
  var delimiter: js.UndefOr[String] = js.native
  /* Clear all values when the user presses escape AND the menu is closed */
  var escapeClearsValue: js.UndefOr[Boolean] = js.native
  /* Custom method to filter whether an option should be displayed in the menu */
  var filterOption: js.UndefOr[(js.Function2[/* option */ Option, /* rawInput */ String, Boolean]) | Null] = js.native
  /* Formats group labels in the menu as React components */
  var formatGroupLabel: js.UndefOr[typings.reactSelect.builtinsMod.formatGroupLabel[OptionType]] = js.native
  /* Formats option labels in the menu and control as React components */
  var formatOptionLabel: js.UndefOr[
    js.Function2[
      /* option */ OptionType, 
      /* labelMeta */ FormatOptionLabelMeta[OptionType], 
      ReactNode
    ]
  ] = js.native
  /* Resolves option data to a string to be displayed as the label by components */
  var getOptionLabel: js.UndefOr[typings.reactSelect.builtinsMod.getOptionLabel[OptionType]] = js.native
  /* Resolves option data to a string to compare options and specify value attributes */
  var getOptionValue: js.UndefOr[typings.reactSelect.builtinsMod.getOptionValue[OptionType]] = js.native
  /* Hide the selected option from the menu */
  var hideSelectedOptions: js.UndefOr[Boolean] = js.native
  /* The id to set on the SelectContainer component. */
  var id: js.UndefOr[String] = js.native
  /* The id of the search input */
  var inputId: js.UndefOr[String] = js.native
  /* The value of the search input */
  var inputValue: js.UndefOr[String] = js.native
  /* Define an id prefix for the select components e.g. {your-id}-value */
  var instanceId: js.UndefOr[Double | String] = js.native
  /* Is the select value clearable */
  var isClearable: js.UndefOr[Boolean] = js.native
  /* Is the select disabled */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /* Is the select in a state of loading (async) */
  var isLoading: js.UndefOr[Boolean] = js.native
  /* Support multiple selected options */
  var isMulti: js.UndefOr[Boolean] = js.native
  /* Override the built-in logic to detect whether an option is disabled */
  var isOptionDisabled: js.UndefOr[
    js.Function2[/* option */ OptionType, /* options */ OptionsType[OptionType], Boolean]
  ] = js.native
  /* Override the built-in logic to detect whether an option is selected */
  var isOptionSelected: js.UndefOr[
    js.Function2[/* option */ OptionType, /* options */ OptionsType[OptionType], Boolean]
  ] = js.native
  /* Is the select direction right-to-left */
  var isRtl: js.UndefOr[Boolean] = js.native
  /* Whether to enable search functionality */
  var isSearchable: js.UndefOr[Boolean] = js.native
  /* Async: Text to display when loading options */
  var loadingMessage: js.UndefOr[js.Function1[/* obj */ InputValue, String | Null]] = js.native
  /* Maximum height of the menu before scrolling */
  var maxMenuHeight: js.UndefOr[Double] = js.native
  /* Whether the menu is open */
  var menuIsOpen: js.UndefOr[Boolean] = js.native
  /* Default placement of the menu in relation to the control. 'auto' will flip
    when there isn't enough space below the control. */
  var menuPlacement: js.UndefOr[MenuPlacement] = js.native
  /* Whether the menu should use a portal, and where it should attach */
  var menuPortalTarget: js.UndefOr[HTMLElement | Null] = js.native
  /* The CSS position value of the menu, when "fixed" extra layout management is required */
  var menuPosition: js.UndefOr[MenuPosition] = js.native
  /* Whether to block scroll events when the menu is open */
  var menuShouldBlockScroll: js.UndefOr[Boolean] = js.native
  /* Whether the menu should be scrolled into view when it opens */
  var menuShouldScrollIntoView: js.UndefOr[Boolean] = js.native
  /* Minimum height of the menu before flipping */
  var minMenuHeight: js.UndefOr[Double] = js.native
  /* Name of the HTML Input (optional - without this, no input will be rendered) */
  var name: js.UndefOr[String] = js.native
  /* Text to display when there are no options */
  var noOptionsMessage: js.UndefOr[js.Function1[/* obj */ InputValue, String | Null]] = js.native
  /* Handle blur events on the control */
  var onBlur: js.UndefOr[FocusEventHandler] = js.native
  /* Handle change events on the select */
  var onChange: js.UndefOr[
    js.Function2[/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType], Unit]
  ] = js.native
  /* Handle focus events on the control */
  var onFocus: js.UndefOr[FocusEventHandler] = js.native
  /* Handle change events on the input */
  var onInputChange: js.UndefOr[js.Function2[/* newValue */ String, /* actionMeta */ InputActionMeta, Unit]] = js.native
  /* Handle key down events on the select */
  var onKeyDown: js.UndefOr[KeyboardEventHandler] = js.native
  /* Handle the menu closing */
  var onMenuClose: js.UndefOr[js.Function0[Unit]] = js.native
  /* Handle the menu opening */
  var onMenuOpen: js.UndefOr[js.Function0[Unit]] = js.native
  /* Fired when the user scrolls to the bottom of the menu */
  var onMenuScrollToBottom: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.native
  /* Fired when the user scrolls to the top of the menu */
  var onMenuScrollToTop: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLElement, Event], Unit]] = js.native
  /* Allows control of whether the menu is opened when the Select is clicked */
  var openMenuOnClick: js.UndefOr[Boolean] = js.native
  /* Allows control of whether the menu is opened when the Select is focused */
  var openMenuOnFocus: js.UndefOr[Boolean] = js.native
  /* Array of options that populate the select menu */
  var options: js.UndefOr[GroupedOptionsType[OptionType] | OptionsType[OptionType]] = js.native
  /* Number of options to jump in menu when page{up|down} keys are used */
  var pageSize: js.UndefOr[Double] = js.native
  /* Placeholder text for the select value */
  var placeholder: js.UndefOr[ReactNode] = js.native
  /* Status to relay to screen readers */
  var screenReaderStatus: js.UndefOr[js.Function1[/* obj */ Count, String]] = js.native
  /* Style modifier methods */
  var styles: js.UndefOr[StylesConfig] = js.native
  /* Sets the tabIndex attribute on the input */
  var tabIndex: js.UndefOr[String | Null] = js.native
  /* Select the currently focused option when the user presses tab */
  var tabSelectsValue: js.UndefOr[Boolean] = js.native
  /* Theme modifier method */
  var theme: js.UndefOr[ThemeConfig] = js.native
  /* The value of the select; reflected by the selected option */
  var value: js.UndefOr[ValueType[OptionType]] = js.native
}

object Props {
  @scala.inline
  def apply[/* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType](): Props[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[OptionType]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: typings.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with Props[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def `setAria-labelledby`(value: String): Self = this.set("aria-labelledby", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-labelledby`: Self = this.set("aria-labelledby", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setBackspaceRemovesValue(value: Boolean): Self = this.set("backspaceRemovesValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackspaceRemovesValue: Self = this.set("backspaceRemovesValue", js.undefined)
    @scala.inline
    def setBlurInputOnSelect(value: Boolean): Self = this.set("blurInputOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurInputOnSelect: Self = this.set("blurInputOnSelect", js.undefined)
    @scala.inline
    def setCaptureMenuScroll(value: Boolean): Self = this.set("captureMenuScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureMenuScroll: Self = this.set("captureMenuScroll", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassNamePrefix(value: String): Self = this.set("classNamePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNamePrefix: Self = this.set("classNamePrefix", js.undefined)
    @scala.inline
    def setClassNamePrefixNull: Self = this.set("classNamePrefix", null)
    @scala.inline
    def setCloseMenuOnScrollFunction1(value: /* evt */ Event => Unit): Self = this.set("closeMenuOnScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setCloseMenuOnScroll(value: Boolean | EventListener): Self = this.set("closeMenuOnScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseMenuOnScroll: Self = this.set("closeMenuOnScroll", js.undefined)
    @scala.inline
    def setCloseMenuOnSelect(value: Boolean): Self = this.set("closeMenuOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseMenuOnSelect: Self = this.set("closeMenuOnSelect", js.undefined)
    @scala.inline
    def setComponents(value: SelectComponentsConfig[OptionType]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setControlShouldRenderValue(value: Boolean): Self = this.set("controlShouldRenderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlShouldRenderValue: Self = this.set("controlShouldRenderValue", js.undefined)
    @scala.inline
    def setDefaultInputValue(value: String): Self = this.set("defaultInputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInputValue: Self = this.set("defaultInputValue", js.undefined)
    @scala.inline
    def setDefaultMenuIsOpen(value: Boolean): Self = this.set("defaultMenuIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMenuIsOpen: Self = this.set("defaultMenuIsOpen", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: OptionType*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: ValueType[OptionType]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEscapeClearsValue(value: Boolean): Self = this.set("escapeClearsValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeClearsValue: Self = this.set("escapeClearsValue", js.undefined)
    @scala.inline
    def setFilterOption(value: (/* option */ Option, /* rawInput */ String) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setFilterOptionNull: Self = this.set("filterOption", null)
    @scala.inline
    def setFormatGroupLabel(value: /* group */ GroupType[OptionType] => ReactNode): Self = this.set("formatGroupLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatGroupLabel: Self = this.set("formatGroupLabel", js.undefined)
    @scala.inline
    def setFormatOptionLabel(value: (/* option */ OptionType, /* labelMeta */ FormatOptionLabelMeta[OptionType]) => ReactNode): Self = this.set("formatOptionLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatOptionLabel: Self = this.set("formatOptionLabel", js.undefined)
    @scala.inline
    def setGetOptionLabel(value: OptionType => String): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetOptionLabel: Self = this.set("getOptionLabel", js.undefined)
    @scala.inline
    def setGetOptionValue(value: OptionType => String): Self = this.set("getOptionValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetOptionValue: Self = this.set("getOptionValue", js.undefined)
    @scala.inline
    def setHideSelectedOptions(value: Boolean): Self = this.set("hideSelectedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSelectedOptions: Self = this.set("hideSelectedOptions", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setInstanceId(value: Double | String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setIsClearable(value: Boolean): Self = this.set("isClearable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClearable: Self = this.set("isClearable", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    @scala.inline
    def setIsMulti(value: Boolean): Self = this.set("isMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMulti: Self = this.set("isMulti", js.undefined)
    @scala.inline
    def setIsOptionDisabled(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self = this.set("isOptionDisabled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsOptionDisabled: Self = this.set("isOptionDisabled", js.undefined)
    @scala.inline
    def setIsOptionSelected(value: (/* option */ OptionType, /* options */ OptionsType[OptionType]) => Boolean): Self = this.set("isOptionSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIsOptionSelected: Self = this.set("isOptionSelected", js.undefined)
    @scala.inline
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRtl: Self = this.set("isRtl", js.undefined)
    @scala.inline
    def setIsSearchable(value: Boolean): Self = this.set("isSearchable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSearchable: Self = this.set("isSearchable", js.undefined)
    @scala.inline
    def setLoadingMessage(value: /* obj */ InputValue => String | Null): Self = this.set("loadingMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadingMessage: Self = this.set("loadingMessage", js.undefined)
    @scala.inline
    def setMaxMenuHeight(value: Double): Self = this.set("maxMenuHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMenuHeight: Self = this.set("maxMenuHeight", js.undefined)
    @scala.inline
    def setMenuIsOpen(value: Boolean): Self = this.set("menuIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuIsOpen: Self = this.set("menuIsOpen", js.undefined)
    @scala.inline
    def setMenuPlacement(value: MenuPlacement): Self = this.set("menuPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPlacement: Self = this.set("menuPlacement", js.undefined)
    @scala.inline
    def setMenuPortalTarget(value: HTMLElement): Self = this.set("menuPortalTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPortalTarget: Self = this.set("menuPortalTarget", js.undefined)
    @scala.inline
    def setMenuPortalTargetNull: Self = this.set("menuPortalTarget", null)
    @scala.inline
    def setMenuPosition(value: MenuPosition): Self = this.set("menuPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuPosition: Self = this.set("menuPosition", js.undefined)
    @scala.inline
    def setMenuShouldBlockScroll(value: Boolean): Self = this.set("menuShouldBlockScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuShouldBlockScroll: Self = this.set("menuShouldBlockScroll", js.undefined)
    @scala.inline
    def setMenuShouldScrollIntoView(value: Boolean): Self = this.set("menuShouldScrollIntoView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuShouldScrollIntoView: Self = this.set("menuShouldScrollIntoView", js.undefined)
    @scala.inline
    def setMinMenuHeight(value: Double): Self = this.set("minMenuHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMenuHeight: Self = this.set("minMenuHeight", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoOptionsMessage(value: /* obj */ InputValue => String | Null): Self = this.set("noOptionsMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNoOptionsMessage: Self = this.set("noOptionsMessage", js.undefined)
    @scala.inline
    def setOnBlur(value: /* event */ FocusEvent[HTMLElement] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ ValueType[OptionType], /* action */ ActionMeta[OptionType]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnFocus(value: /* event */ FocusEvent[HTMLElement] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnInputChange(value: (/* newValue */ String, /* actionMeta */ InputActionMeta) => Unit): Self = this.set("onInputChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnMenuClose(value: () => Unit): Self = this.set("onMenuClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuClose: Self = this.set("onMenuClose", js.undefined)
    @scala.inline
    def setOnMenuOpen(value: () => Unit): Self = this.set("onMenuOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuOpen: Self = this.set("onMenuOpen", js.undefined)
    @scala.inline
    def setOnMenuScrollToBottom(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = this.set("onMenuScrollToBottom", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMenuScrollToBottom: Self = this.set("onMenuScrollToBottom", js.undefined)
    @scala.inline
    def setOnMenuScrollToTop(value: /* event */ SyntheticEvent[HTMLElement, Event] => Unit): Self = this.set("onMenuScrollToTop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMenuScrollToTop: Self = this.set("onMenuScrollToTop", js.undefined)
    @scala.inline
    def setOpenMenuOnClick(value: Boolean): Self = this.set("openMenuOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMenuOnClick: Self = this.set("openMenuOnClick", js.undefined)
    @scala.inline
    def setOpenMenuOnFocus(value: Boolean): Self = this.set("openMenuOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenMenuOnFocus: Self = this.set("openMenuOnFocus", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: (GroupType[OptionType] | OptionType)*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: GroupedOptionsType[OptionType] | OptionsType[OptionType]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setScreenReaderStatus(value: /* obj */ Count => String): Self = this.set("screenReaderStatus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScreenReaderStatus: Self = this.set("screenReaderStatus", js.undefined)
    @scala.inline
    def setStyles(value: StylesConfig): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTabIndex(value: String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTabIndexNull: Self = this.set("tabIndex", null)
    @scala.inline
    def setTabSelectsValue(value: Boolean): Self = this.set("tabSelectsValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabSelectsValue: Self = this.set("tabSelectsValue", js.undefined)
    @scala.inline
    def setThemeFunction1(value: /* theme */ Theme => Theme): Self = this.set("theme", js.Any.fromFunction1(value))
    @scala.inline
    def setTheme(value: ThemeConfig): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValueVarargs(value: OptionType*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: ValueType[OptionType]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

