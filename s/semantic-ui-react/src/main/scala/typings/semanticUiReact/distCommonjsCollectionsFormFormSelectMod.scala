package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.semanticUiReact.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps
import typings.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownOnSearchChangeData
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownProps
import typings.semanticUiReact.semanticUiReactStrings.`bottom left`
import typings.semanticUiReact.semanticUiReactStrings.`bottom right`
import typings.semanticUiReact.semanticUiReactStrings.`top left`
import typings.semanticUiReact.semanticUiReactStrings.`top right`
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsFormFormSelectMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormSelect", JSImport.Default)
  @js.native
  val default: FC[FormSelectProps] = js.native
  
  trait FormSelectProps
    extends StObject
       with StrictFormSelectProps
       with /* key */ StringDictionary[Any]
  object FormSelectProps {
    
    inline def apply(options: js.Array[DropdownItemProps]): FormSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSelectProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.semanticUiReact.distCommonjsModulesDropdownDropdownMod.StrictDropdownProps because var conflicts: as, children, className, disabled, error, `inline`, options. Inlined additionLabel, additionPosition, allowAdditions, basic, button, clearable, closeOnBlur, closeOnEscape, closeOnChange, compact, deburr, defaultOpen, defaultSearchQuery, defaultSelectedLabel, defaultUpward, defaultValue, direction, floating, fluid, header, icon, item, labeled, lazyLoad, loading, minCharacters, multiple, noResultsMessage, onAddItem, onBlur, onChange, onClick, onClose, onFocus, onLabelClick, onMouseDown, onOpen, onSearchChange, open, openOnFocus, placeholder, pointing, renderLabel, scrolling, search, searchInput, searchQuery, selectOnBlur, selectOnNavigation, selectedLabel, selection, simple, tabIndex, text, trigger, value, upward, wrapSelection
  - typings.semanticUiReact.distCommonjsAddonsSelectSelectMod.StrictSelectProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined options */ trait StrictFormSelectProps
    extends StObject
       with StrictFormFieldProps {
    
    /** Label prefixed to an option added by a user. */
    var additionLabel: js.UndefOr[Double | String | ReactNode] = js.undefined
    
    /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
    var additionPosition: js.UndefOr[top | bottom] = js.undefined
    
    /**
      * Allow user additions to the list of options (boolean).
      * Requires the use of `selection`, `options` and `search`.
      */
    var allowAdditions: js.UndefOr[Boolean] = js.undefined
    
    /** A Dropdown can reduce its complexity. */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** Format the Dropdown to appear as a button. */
    var button: js.UndefOr[Boolean] = js.undefined
    
    /** Using the clearable setting will let users remove their selection from a dropdown. */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not the menu should close when the dropdown is blurred. */
    var closeOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the menu should close when a value is selected from the dropdown.
      * By default, multiple selection dropdowns will remain open on change, while single
      * selection dropdowns will close on change.
      */
    var closeOnChange: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not the dropdown should close when the escape key is pressed. */
    var closeOnEscape: js.UndefOr[Boolean] = js.undefined
    
    /** A compact dropdown has no minimum width. */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not the dropdown should strip diacritics in options and input search */
    var deburr: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value of open. */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value of searchQuery. */
    var defaultSearchQuery: js.UndefOr[String] = js.undefined
    
    /** Currently selected label in multi-select. */
    var defaultSelectedLabel: js.UndefOr[Double | String] = js.undefined
    
    /** Initial value of upward. */
    var defaultUpward: js.UndefOr[Boolean] = js.undefined
    
    /** Initial value or value array if multiple. */
    var defaultValue: js.UndefOr[String | Double | Boolean | (js.Array[Double | String | Boolean])] = js.undefined
    
    /** A dropdown menu can open to the left or to the right. */
    var direction: js.UndefOr[left | right] = js.undefined
    
    /** Individual fields may display an error state along with a message. */
    @JSName("error")
    var error_StrictFormSelectProps: js.UndefOr[Any] = js.undefined
    
    /** A dropdown menu can contain floated content. */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown can take the full width of its parent */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown menu can contain a header. */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[Any] = js.undefined
    
    /** A dropdown can be formatted as a Menu item. */
    var item: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown can be labeled. */
    var labeled: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown can defer rendering its options until it is open. */
    var lazyLoad: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown can show that it is currently loading data. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /** The minimum characters for a search to begin showing results. */
    var minCharacters: js.UndefOr[Double] = js.undefined
    
    /** A selection dropdown can allow multiple selections. */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /** Message to display when there are no results. */
    var noResultsMessage: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Called when a user adds a new item. Use this to update the options list.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and the new item's value.
      */
    var onAddItem: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
    /**
      * Called on blur.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onBlur: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLElement, Element], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
    /**
      * Called when the user attempts to change the value.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and proposed value.
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
          /* data */ DropdownProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClose: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
    /**
      * Called on focus.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onFocus: js.UndefOr[
        js.Function2[/* event */ FocusEvent[HTMLElement, Element], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
    /**
      * Called when a multi-select label is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All label props.
      */
    var onLabelClick: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps, Unit]
      ] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
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
      ] = js.undefined
    
    /** Controls whether or not the dropdown menu is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not the menu should open when the dropdown is focused. */
    var openOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
    var options: js.Array[DropdownItemProps]
    
    /** Placeholder text. */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** A dropdown can be formatted so that its menu is pointing. */
    var pointing: js.UndefOr[
        Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
      ] = js.undefined
    
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
          Any
        ]
      ] = js.undefined
    
    /** A dropdown can have its menu scroll. */
    var scrolling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A selection dropdown can allow a user to search through a large list of choices.
      * Pass a function here to replace the default search.
      */
    var search: js.UndefOr[
        Boolean | (js.Function2[
          /* options */ js.Array[DropdownItemProps], 
          /* value */ String, 
          js.Array[DropdownItemProps]
        ])
      ] = js.undefined
    
    /** A shorthand for a search input. */
    var searchInput: js.UndefOr[Any] = js.undefined
    
    /** Current value of searchQuery. Creates a controlled component. */
    var searchQuery: js.UndefOr[String] = js.undefined
    
    /** Define whether the highlighted item should be selected on blur. */
    var selectOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
    var selectOnNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Currently selected label in multi-select. */
    var selectedLabel: js.UndefOr[Double | String] = js.undefined
    
    /** A dropdown can be used to select between choices in a form. */
    var selection: js.UndefOr[Any] = js.undefined
    
    /** A simple dropdown can open without Javascript. */
    var simple: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown can receive focus. */
    var tabIndex: js.UndefOr[Double | String] = js.undefined
    
    /** The text displayed in the dropdown, usually for the active item. */
    var text: js.UndefOr[String] = js.undefined
    
    /** Custom element to trigger the menu to become visible. Takes place of 'text'. */
    var trigger: js.UndefOr[ReactNode] = js.undefined
    
    /** Controls whether the dropdown will open upward. */
    var upward: js.UndefOr[Boolean] = js.undefined
    
    /** Current value or value array if multiple. Creates a controlled component. */
    var value: js.UndefOr[Boolean | Double | String | (js.Array[Boolean | Double | String])] = js.undefined
    
    /**
      * A dropdown will go to the last element when ArrowUp is pressed on the first,
      * or go to the first when ArrowDown is pressed on the last( aka infinite selection )
      */
    var wrapSelection: js.UndefOr[Boolean] = js.undefined
  }
  object StrictFormSelectProps {
    
    inline def apply(options: js.Array[DropdownItemProps]): StrictFormSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictFormSelectProps]
    }
    
    extension [Self <: StrictFormSelectProps](x: Self) {
      
      inline def setAdditionLabel(value: Double | String | ReactNode): Self = StObject.set(x, "additionLabel", value.asInstanceOf[js.Any])
      
      inline def setAdditionLabelUndefined: Self = StObject.set(x, "additionLabel", js.undefined)
      
      inline def setAdditionPosition(value: top | bottom): Self = StObject.set(x, "additionPosition", value.asInstanceOf[js.Any])
      
      inline def setAdditionPositionUndefined: Self = StObject.set(x, "additionPosition", js.undefined)
      
      inline def setAllowAdditions(value: Boolean): Self = StObject.set(x, "allowAdditions", value.asInstanceOf[js.Any])
      
      inline def setAllowAdditionsUndefined: Self = StObject.set(x, "allowAdditions", js.undefined)
      
      inline def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      inline def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      inline def setCloseOnChange(value: Boolean): Self = StObject.set(x, "closeOnChange", value.asInstanceOf[js.Any])
      
      inline def setCloseOnChangeUndefined: Self = StObject.set(x, "closeOnChange", js.undefined)
      
      inline def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setDeburr(value: Boolean): Self = StObject.set(x, "deburr", value.asInstanceOf[js.Any])
      
      inline def setDeburrUndefined: Self = StObject.set(x, "deburr", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultSearchQuery(value: String): Self = StObject.set(x, "defaultSearchQuery", value.asInstanceOf[js.Any])
      
      inline def setDefaultSearchQueryUndefined: Self = StObject.set(x, "defaultSearchQuery", js.undefined)
      
      inline def setDefaultSelectedLabel(value: Double | String): Self = StObject.set(x, "defaultSelectedLabel", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedLabelUndefined: Self = StObject.set(x, "defaultSelectedLabel", js.undefined)
      
      inline def setDefaultUpward(value: Boolean): Self = StObject.set(x, "defaultUpward", value.asInstanceOf[js.Any])
      
      inline def setDefaultUpwardUndefined: Self = StObject.set(x, "defaultUpward", js.undefined)
      
      inline def setDefaultValue(value: String | Double | Boolean | (js.Array[Double | String | Boolean])): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: (Double | String | Boolean)*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDirection(value: left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setLabeled(value: Boolean): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
      
      inline def setLabeledUndefined: Self = StObject.set(x, "labeled", js.undefined)
      
      inline def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      inline def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoResultsMessage(value: ReactNode): Self = StObject.set(x, "noResultsMessage", value.asInstanceOf[js.Any])
      
      inline def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
      
      inline def setOnAddItem(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onAddItem", js.Any.fromFunction2(value))
      
      inline def setOnAddItemUndefined: Self = StObject.set(x, "onAddItem", js.undefined)
      
      inline def setOnBlur(value: (/* event */ FocusEvent[HTMLElement, Element], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnClose(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFocus(value: (/* event */ FocusEvent[HTMLElement, Element], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnLabelClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = StObject.set(x, "onLabelClick", js.Any.fromFunction2(value))
      
      inline def setOnLabelClickUndefined: Self = StObject.set(x, "onLabelClick", js.undefined)
      
      inline def setOnMouseDown(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnOpen(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnSearchChange(
        value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownOnSearchChangeData) => Unit
      ): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction2(value))
      
      inline def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownItemProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: DropdownItemProps*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPointing(
        value: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
      ): Self = StObject.set(x, "pointing", value.asInstanceOf[js.Any])
      
      inline def setPointingUndefined: Self = StObject.set(x, "pointing", js.undefined)
      
      inline def setRenderLabel(
        value: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => Any
      ): Self = StObject.set(x, "renderLabel", js.Any.fromFunction3(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSearch(
        value: Boolean | (js.Function2[
              /* options */ js.Array[DropdownItemProps], 
              /* value */ String, 
              js.Array[DropdownItemProps]
            ])
      ): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchFunction2(
        value: (/* options */ js.Array[DropdownItemProps], /* value */ String) => js.Array[DropdownItemProps]
      ): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      inline def setSearchInput(value: Any): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
      
      inline def setSearchInputUndefined: Self = StObject.set(x, "searchInput", js.undefined)
      
      inline def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelectOnBlur(value: Boolean): Self = StObject.set(x, "selectOnBlur", value.asInstanceOf[js.Any])
      
      inline def setSelectOnBlurUndefined: Self = StObject.set(x, "selectOnBlur", js.undefined)
      
      inline def setSelectOnNavigation(value: Boolean): Self = StObject.set(x, "selectOnNavigation", value.asInstanceOf[js.Any])
      
      inline def setSelectOnNavigationUndefined: Self = StObject.set(x, "selectOnNavigation", js.undefined)
      
      inline def setSelectedLabel(value: Double | String): Self = StObject.set(x, "selectedLabel", value.asInstanceOf[js.Any])
      
      inline def setSelectedLabelUndefined: Self = StObject.set(x, "selectedLabel", js.undefined)
      
      inline def setSelection(value: Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setUpward(value: Boolean): Self = StObject.set(x, "upward", value.asInstanceOf[js.Any])
      
      inline def setUpwardUndefined: Self = StObject.set(x, "upward", js.undefined)
      
      inline def setValue(value: Boolean | Double | String | (js.Array[Boolean | Double | String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Boolean | Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setWrapSelection(value: Boolean): Self = StObject.set(x, "wrapSelection", value.asInstanceOf[js.Any])
      
      inline def setWrapSelectionUndefined: Self = StObject.set(x, "wrapSelection", js.undefined)
    }
  }
  
  type _To = FC[FormSelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsFormFormSelectMod.foo` */
  override def _to: FC[FormSelectProps] = default
}
