package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.react.mod.SyntheticEvent
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import typings.semanticUiReact.dropdownSearchInputMod.DropdownSearchInputProps
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownDropdownMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DropdownProps, ComponentState, js.Any] {
    def this(props: DropdownProps) = this()
    def this(props: DropdownProps, context: js.Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown", JSImport.Default)
    @js.native
    val ^ : DropdownComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown", "default.Divider")
    @js.native
    class Divider protected ()
      extends Component[DropdownDividerProps, ComponentState, js.Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown", "default.Header")
    @js.native
    class Header protected ()
      extends Component[DropdownHeaderProps, ComponentState, js.Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown", "default.Item")
    @js.native
    class Item protected ()
      extends Component[DropdownItemProps, ComponentState, js.Any] {
      def this(props: DropdownItemProps) = this()
      def this(props: DropdownItemProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/Dropdown", "default.SearchInput")
    @js.native
    class SearchInput protected ()
      extends Component[DropdownSearchInputProps, ComponentState, js.Any] {
      def this(props: DropdownSearchInputProps) = this()
      def this(props: DropdownSearchInputProps, context: js.Any) = this()
    }
    
    type _To = DropdownComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: DropdownComponent = ^
  }
  
  @js.native
  trait DropdownComponent
    extends StObject
       with ComponentClass[DropdownProps, ComponentState] {
    
    var Divider: ComponentClass[DropdownDividerProps, ComponentState] = js.native
    
    var Header: ComponentClass[DropdownHeaderProps, ComponentState] = js.native
    
    var Item: ComponentClass[DropdownItemProps, ComponentState] = js.native
    
    var Menu: StatelessComponent[DropdownMenuProps] = js.native
    
    var SearchInput: ComponentClass[DropdownSearchInputProps, ComponentState] = js.native
  }
  
  trait DropdownOnSearchChangeData
    extends StObject
       with DropdownProps {
    
    @JSName("searchQuery")
    var searchQuery_DropdownOnSearchChangeData: String
  }
  object DropdownOnSearchChangeData {
    
    @scala.inline
    def apply(searchQuery: String): DropdownOnSearchChangeData = {
      val __obj = js.Dynamic.literal(searchQuery = searchQuery.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownOnSearchChangeData]
    }
    
    @scala.inline
    implicit class DropdownOnSearchChangeDataMutableBuilder[Self <: DropdownOnSearchChangeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropdownProps
    extends StObject
       with StrictDropdownProps
       with /* key */ StringDictionary[js.Any]
  object DropdownProps {
    
    @scala.inline
    def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
  }
  
  trait StrictDropdownProps extends StObject {
    
    /** Label prefixed to an option added by a user. */
    var additionLabel: js.UndefOr[Double | String | ReactNode] = js.undefined
    
    /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
    var additionPosition: js.UndefOr[top | bottom] = js.undefined
    
    /**
      * Allow user additions to the list of options (boolean).
      * Requires the use of `selection`, `options` and `search`.
      */
    var allowAdditions: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** A Dropdown can reduce its complexity. */
    var basic: js.UndefOr[Boolean] = js.undefined
    
    /** Format the Dropdown to appear as a button. */
    var button: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
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
    
    /** A disabled dropdown menu or item does not allow user interaction. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** An errored dropdown can alert a user to a problem. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown menu can contain floated content. */
    var floating: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown can take the full width of its parent */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** A dropdown menu can contain a header. */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[js.Any] = js.undefined
    
    /** A dropdown can be formatted to appear inline in other content. */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
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
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
      ] = js.undefined
    
    /**
      * Called on blur.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onBlur: js.UndefOr[
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
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
        js.Function2[/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps, Unit]
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
        js.Function2[/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps, Unit]
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
    var options: js.UndefOr[js.Array[DropdownItemProps]] = js.undefined
    
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
          js.Any
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
    var searchInput: js.UndefOr[js.Any] = js.undefined
    
    /** Current value of searchQuery. Creates a controlled component. */
    var searchQuery: js.UndefOr[String] = js.undefined
    
    /** Define whether the highlighted item should be selected on blur. */
    var selectOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
    var selectOnNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Currently selected label in multi-select. */
    var selectedLabel: js.UndefOr[Double | String] = js.undefined
    
    /** A dropdown can be used to select between choices in a form. */
    var selection: js.UndefOr[js.Any] = js.undefined
    
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
  object StrictDropdownProps {
    
    @scala.inline
    def apply(): StrictDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownProps]
    }
    
    @scala.inline
    implicit class StrictDropdownPropsMutableBuilder[Self <: StrictDropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionLabel(value: Double | String | ReactNode): Self = StObject.set(x, "additionLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionLabelUndefined: Self = StObject.set(x, "additionLabel", js.undefined)
      
      @scala.inline
      def setAdditionPosition(value: top | bottom): Self = StObject.set(x, "additionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionPositionUndefined: Self = StObject.set(x, "additionPosition", js.undefined)
      
      @scala.inline
      def setAllowAdditions(value: Boolean): Self = StObject.set(x, "allowAdditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAdditionsUndefined: Self = StObject.set(x, "allowAdditions", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBasic(value: Boolean): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      @scala.inline
      def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      @scala.inline
      def setCloseOnBlur(value: Boolean): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnBlurUndefined: Self = StObject.set(x, "closeOnBlur", js.undefined)
      
      @scala.inline
      def setCloseOnChange(value: Boolean): Self = StObject.set(x, "closeOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnChangeUndefined: Self = StObject.set(x, "closeOnChange", js.undefined)
      
      @scala.inline
      def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setDeburr(value: Boolean): Self = StObject.set(x, "deburr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeburrUndefined: Self = StObject.set(x, "deburr", js.undefined)
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setDefaultSearchQuery(value: String): Self = StObject.set(x, "defaultSearchQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSearchQueryUndefined: Self = StObject.set(x, "defaultSearchQuery", js.undefined)
      
      @scala.inline
      def setDefaultSelectedLabel(value: Double | String): Self = StObject.set(x, "defaultSelectedLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedLabelUndefined: Self = StObject.set(x, "defaultSelectedLabel", js.undefined)
      
      @scala.inline
      def setDefaultUpward(value: Boolean): Self = StObject.set(x, "defaultUpward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUpwardUndefined: Self = StObject.set(x, "defaultUpward", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | Boolean | (js.Array[Double | String | Boolean])): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (Double | String | Boolean)*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: left | right): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setItem(value: Boolean): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setLabeled(value: Boolean): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabeledUndefined: Self = StObject.set(x, "labeled", js.undefined)
      
      @scala.inline
      def setLazyLoad(value: Boolean): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNoResultsMessage(value: ReactNode): Self = StObject.set(x, "noResultsMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
      
      @scala.inline
      def setOnAddItem(value: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onAddItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAddItemUndefined: Self = StObject.set(x, "onAddItem", js.undefined)
      
      @scala.inline
      def setOnBlur(value: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* event */ KeyboardEvent[HTMLElement], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnFocus(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnLabelClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ LabelProps) => Unit): Self = StObject.set(x, "onLabelClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLabelClickUndefined: Self = StObject.set(x, "onLabelClick", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownProps) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnSearchChange(
        value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ DropdownOnSearchChangeData) => Unit
      ): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DropdownItemProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DropdownItemProps*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPointing(
        value: Boolean | left | right | top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)
      ): Self = StObject.set(x, "pointing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointingUndefined: Self = StObject.set(x, "pointing", js.undefined)
      
      @scala.inline
      def setRenderLabel(
        value: (/* item */ DropdownItemProps, /* index */ Double, /* defaultLabelProps */ LabelProps) => js.Any
      ): Self = StObject.set(x, "renderLabel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      @scala.inline
      def setScrolling(value: Boolean): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSearch(
        value: Boolean | (js.Function2[
              /* options */ js.Array[DropdownItemProps], 
              /* value */ String, 
              js.Array[DropdownItemProps]
            ])
      ): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchFunction2(
        value: (/* options */ js.Array[DropdownItemProps], /* value */ String) => js.Array[DropdownItemProps]
      ): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSearchInput(value: js.Any): Self = StObject.set(x, "searchInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchInputUndefined: Self = StObject.set(x, "searchInput", js.undefined)
      
      @scala.inline
      def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSelectOnBlur(value: Boolean): Self = StObject.set(x, "selectOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnBlurUndefined: Self = StObject.set(x, "selectOnBlur", js.undefined)
      
      @scala.inline
      def setSelectOnNavigation(value: Boolean): Self = StObject.set(x, "selectOnNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnNavigationUndefined: Self = StObject.set(x, "selectOnNavigation", js.undefined)
      
      @scala.inline
      def setSelectedLabel(value: Double | String): Self = StObject.set(x, "selectedLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedLabelUndefined: Self = StObject.set(x, "selectedLabel", js.undefined)
      
      @scala.inline
      def setSelection(value: js.Any): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setUpward(value: Boolean): Self = StObject.set(x, "upward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpwardUndefined: Self = StObject.set(x, "upward", js.undefined)
      
      @scala.inline
      def setValue(value: Boolean | Double | String | (js.Array[Boolean | Double | String])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Boolean | Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setWrapSelection(value: Boolean): Self = StObject.set(x, "wrapSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapSelectionUndefined: Self = StObject.set(x, "wrapSelection", js.undefined)
    }
  }
}
