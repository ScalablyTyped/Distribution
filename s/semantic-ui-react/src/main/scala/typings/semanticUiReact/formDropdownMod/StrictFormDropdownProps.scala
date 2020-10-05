package typings.semanticUiReact.formDropdownMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.semanticUiReact.dropdownDropdownMod.DropdownOnSearchChangeData
import typings.semanticUiReact.dropdownDropdownMod.DropdownProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.formFieldMod.StrictFormFieldProps
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.semanticUiReact.dropdownDropdownMod.StrictDropdownProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined additionLabel, additionPosition, allowAdditions, basic, button, clearable, closeOnBlur, closeOnEscape, closeOnChange, compact, deburr, defaultOpen, defaultSearchQuery, defaultSelectedLabel, defaultUpward, defaultValue, direction, floating, fluid, header, icon, item, labeled, lazyLoad, loading, minCharacters, multiple, noResultsMessage, onAddItem, onBlur, onChange, onClick, onClose, onFocus, onLabelClick, onMouseDown, onOpen, onSearchChange, open, openOnFocus, options, placeholder, pointing, renderLabel, scrolling, search, searchInput, searchQuery, selectOnBlur, selectOnNavigation, selectedLabel, selection, simple, tabIndex, text, trigger, value, upward, wrapSelection */ @js.native
trait StrictFormDropdownProps extends StrictFormFieldProps {
  /** Label prefixed to an option added by a user. */
  var additionLabel: js.UndefOr[Double | String | ReactNode] = js.native
  /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
  var additionPosition: js.UndefOr[top | bottom] = js.native
  /**
    * Allow user additions to the list of options (boolean).
    * Requires the use of `selection`, `options` and `search`.
    */
  var allowAdditions: js.UndefOr[Boolean] = js.native
  /** A Dropdown can reduce its complexity. */
  var basic: js.UndefOr[Boolean] = js.native
  /** Format the Dropdown to appear as a button. */
  var button: js.UndefOr[Boolean] = js.native
  /** Using the clearable setting will let users remove their selection from a dropdown. */
  var clearable: js.UndefOr[Boolean] = js.native
  /** Whether or not the menu should close when the dropdown is blurred. */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the menu should close when a value is selected from the dropdown.
    * By default, multiple selection dropdowns will remain open on change, while single
    * selection dropdowns will close on change.
    */
  var closeOnChange: js.UndefOr[Boolean] = js.native
  /** Whether or not the dropdown should close when the escape key is pressed. */
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  /** A compact dropdown has no minimum width. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Whether or not the dropdown should strip diacritics in options and input search */
  var deburr: js.UndefOr[Boolean] = js.native
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[Boolean] = js.native
  /** Initial value of searchQuery. */
  var defaultSearchQuery: js.UndefOr[String] = js.native
  /** Currently selected label in multi-select. */
  var defaultSelectedLabel: js.UndefOr[Double | String] = js.native
  /** Initial value of upward. */
  var defaultUpward: js.UndefOr[Boolean] = js.native
  /** Initial value or value array if multiple. */
  var defaultValue: js.UndefOr[String | Double | Boolean | js.Array[Boolean]] = js.native
  /** A dropdown menu can open to the left or to the right. */
  var direction: js.UndefOr[left | right] = js.native
  /** Individual fields may display an error state along with a message. */
  @JSName("error")
  var error_StrictFormDropdownProps: js.UndefOr[js.Any] = js.native
  /** A dropdown menu can contain floated content. */
  var floating: js.UndefOr[Boolean] = js.native
  /** A dropdown can take the full width of its parent */
  var fluid: js.UndefOr[Boolean] = js.native
  /** A dropdown menu can contain a header. */
  var header: js.UndefOr[ReactNode] = js.native
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.native
  /** A dropdown can be formatted as a Menu item. */
  var item: js.UndefOr[Boolean] = js.native
  /** A dropdown can be labeled. */
  var labeled: js.UndefOr[Boolean] = js.native
  /** A dropdown can defer rendering its options until it is open. */
  var lazyLoad: js.UndefOr[Boolean] = js.native
  /** A dropdown can show that it is currently loading data. */
  var loading: js.UndefOr[Boolean] = js.native
  /** The minimum characters for a search to begin showing results. */
  var minCharacters: js.UndefOr[Double] = js.native
  /** A selection dropdown can allow multiple selections. */
  var multiple: js.UndefOr[Boolean] = js.native
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[ReactNode] = js.native
  /**
    * Called when a user adds a new item. Use this to update the options list.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and the new item's value.
    */
  var onAddItem: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on blur.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBlur: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when the user attempts to change the value.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed value.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when a close event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on focus.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onFocus: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called when a multi-select label is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All label props.
    */
  var onLabelClick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
  ] = js.native
  /**
    * Called on mousedown.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* data */ DropdownProps, 
      Unit
    ]
  ] = js.native
  /**
    * Called when an open event happens.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onOpen: js.UndefOr[
    js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
  ] = js.native
  /**
    * Called on search input change.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props, includes current value of searchQuery.
    */
  var onSearchChange: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[HTMLElement, Event], 
      /* data */ DropdownOnSearchChangeData, 
      Unit
    ]
  ] = js.native
  /** Controls whether or not the dropdown menu is displayed. */
  var open: js.UndefOr[Boolean] = js.native
  /** Whether or not the menu should open when the dropdown is focused. */
  var openOnFocus: js.UndefOr[Boolean] = js.native
  /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
  var options: js.UndefOr[js.Array[DropdownItemProps]] = js.native
  /** Placeholder text. */
  var placeholder: js.UndefOr[String] = js.native
  /** A dropdown can be formatted so that its menu is pointing. */
  var pointing: js.UndefOr[
    Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
  ] = js.native
  /**
    * Mapped over the active items and returns shorthand for the active item Labels.
    * Only applies to `multiple` Dropdowns.
    *
    * @param {object} item - A currently active dropdown item.
    * @param {number} index - The current index.
    * @param {object} defaultLabelProps - The default props for an active item Label.
    * @returns {*} Shorthand for a Label.
    */
  var renderLabel: js.UndefOr[
    js.Function3[
      /* item */ DropdownItemProps, 
      /* index */ Double, 
      /* defaultLabelProps */ LabelProps, 
      _
    ]
  ] = js.native
  /** A dropdown can have its menu scroll. */
  var scrolling: js.UndefOr[Boolean] = js.native
  /**
    * A selection dropdown can allow a user to search through a large list of choices.
    * Pass a function here to replace the default search.
    */
  var search: js.UndefOr[
    js.Function2[
      /* options */ js.Array[DropdownItemProps], 
      /* value */ String, 
      js.Array[DropdownItemProps] | Boolean
    ]
  ] = js.native
  /** A shorthand for a search input. */
  var searchInput: js.UndefOr[js.Any] = js.native
  /** Current value of searchQuery. Creates a controlled component. */
  var searchQuery: js.UndefOr[String] = js.native
  /** Define whether the highlighted item should be selected on blur. */
  var selectOnBlur: js.UndefOr[Boolean] = js.native
  /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
  var selectOnNavigation: js.UndefOr[Boolean] = js.native
  /** Currently selected label in multi-select. */
  var selectedLabel: js.UndefOr[Double | String] = js.native
  /** A dropdown can be used to select between choices in a form. */
  var selection: js.UndefOr[js.Any] = js.native
  /** A simple dropdown can open without Javascript. */
  var simple: js.UndefOr[Boolean] = js.native
  /** A dropdown can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.native
  /** The text displayed in the dropdown, usually for the active item. */
  var text: js.UndefOr[String] = js.native
  /** Custom element to trigger the menu to become visible. Takes place of 'text'. */
  var trigger: js.UndefOr[ReactNode] = js.native
  /** Controls whether the dropdown will open upward. */
  var upward: js.UndefOr[Boolean] = js.native
  /** Current value or value array if multiple. Creates a controlled component. */
  var value: js.UndefOr[Boolean | Double | String | js.Array[String]] = js.native
  /**
    * A dropdown will go to the last element when ArrowUp is pressed on the first,
    * or go to the first when ArrowDown is pressed on the last( aka infinite selection )
    */
  var wrapSelection: js.UndefOr[Boolean] = js.native
}

object StrictFormDropdownProps {
  @scala.inline
  def apply(): StrictFormDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormDropdownProps]
  }
  @scala.inline
  implicit class StrictFormDropdownPropsOps[Self <: StrictFormDropdownProps] (val x: Self) extends AnyVal {
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
    def setAdditionLabel(value: Double | String | ReactNode): Self = this.set("additionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionLabel: Self = this.set("additionLabel", js.undefined)
    @scala.inline
    def setAdditionPosition(value: top | bottom): Self = this.set("additionPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionPosition: Self = this.set("additionPosition", js.undefined)
    @scala.inline
    def setAllowAdditions(value: Boolean): Self = this.set("allowAdditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAdditions: Self = this.set("allowAdditions", js.undefined)
    @scala.inline
    def setBasic(value: Boolean): Self = this.set("basic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasic: Self = this.set("basic", js.undefined)
    @scala.inline
    def setButton(value: Boolean): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setClearable(value: Boolean): Self = this.set("clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearable: Self = this.set("clearable", js.undefined)
    @scala.inline
    def setCloseOnBlur(value: Boolean): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnBlur: Self = this.set("closeOnBlur", js.undefined)
    @scala.inline
    def setCloseOnChange(value: Boolean): Self = this.set("closeOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnChange: Self = this.set("closeOnChange", js.undefined)
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDeburr(value: Boolean): Self = this.set("deburr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeburr: Self = this.set("deburr", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultSearchQuery(value: String): Self = this.set("defaultSearchQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSearchQuery: Self = this.set("defaultSearchQuery", js.undefined)
    @scala.inline
    def setDefaultSelectedLabel(value: Double | String): Self = this.set("defaultSelectedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedLabel: Self = this.set("defaultSelectedLabel", js.undefined)
    @scala.inline
    def setDefaultUpward(value: Boolean): Self = this.set("defaultUpward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultUpward: Self = this.set("defaultUpward", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: Boolean*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: String | Double | Boolean | js.Array[Boolean]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirection(value: left | right): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    @scala.inline
    def setHeader(value: ReactNode): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setIcon(value: js.Any): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setItem(value: Boolean): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLabeled(value: Boolean): Self = this.set("labeled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabeled: Self = this.set("labeled", js.undefined)
    @scala.inline
    def setLazyLoad(value: Boolean): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCharacters: Self = this.set("minCharacters", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setNoResultsMessage(value: ReactNode): Self = this.set("noResultsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResultsMessage: Self = this.set("noResultsMessage", js.undefined)
    @scala.inline
    def setOnAddItem(value: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = this.set("onAddItem", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAddItem: Self = this.set("onAddItem", js.undefined)
    @scala.inline
    def setOnBlur(value: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = this.set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnClick(value: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClose(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnFocus(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = this.set("onFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnLabelClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = this.set("onLabelClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLabelClick: Self = this.set("onLabelClick", js.undefined)
    @scala.inline
    def setOnMouseDown(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ DropdownProps) => Unit): Self = this.set("onMouseDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnOpen(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = this.set("onOpen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOnSearchChange(
      value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownOnSearchChangeData) => Unit
    ): Self = this.set("onSearchChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearchChange: Self = this.set("onSearchChange", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOpenOnFocus(value: Boolean): Self = this.set("openOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnFocus: Self = this.set("openOnFocus", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: DropdownItemProps*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[DropdownItemProps]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPointing(
      value: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
    ): Self = this.set("pointing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointing: Self = this.set("pointing", js.undefined)
    @scala.inline
    def setRenderLabel(value: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => _): Self = this.set("renderLabel", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRenderLabel: Self = this.set("renderLabel", js.undefined)
    @scala.inline
    def setScrolling(value: Boolean): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    @scala.inline
    def setSearch(
      value: (/* options */ js.Array[DropdownItemProps], /* value */ String) => js.Array[DropdownItemProps] | Boolean
    ): Self = this.set("search", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSearchInput(value: js.Any): Self = this.set("searchInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchInput: Self = this.set("searchInput", js.undefined)
    @scala.inline
    def setSearchQuery(value: String): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchQuery: Self = this.set("searchQuery", js.undefined)
    @scala.inline
    def setSelectOnBlur(value: Boolean): Self = this.set("selectOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnBlur: Self = this.set("selectOnBlur", js.undefined)
    @scala.inline
    def setSelectOnNavigation(value: Boolean): Self = this.set("selectOnNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectOnNavigation: Self = this.set("selectOnNavigation", js.undefined)
    @scala.inline
    def setSelectedLabel(value: Double | String): Self = this.set("selectedLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedLabel: Self = this.set("selectedLabel", js.undefined)
    @scala.inline
    def setSelection(value: js.Any): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
    @scala.inline
    def setTabIndex(value: Double | String): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTrigger(value: ReactNode): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setUpward(value: Boolean): Self = this.set("upward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpward: Self = this.set("upward", js.undefined)
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Boolean | Double | String | js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWrapSelection(value: Boolean): Self = this.set("wrapSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapSelection: Self = this.set("wrapSelection", js.undefined)
  }
  
}

