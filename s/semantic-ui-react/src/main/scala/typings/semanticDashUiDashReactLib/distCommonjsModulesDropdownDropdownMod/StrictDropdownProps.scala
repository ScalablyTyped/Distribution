package typings
package semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictDropdownProps extends js.Object {
  /** Label prefixed to an option added by a user. */
  var additionLabel: js.UndefOr[scala.Double | java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Position of the `Add: ...` option in the dropdown list ('top' or 'bottom'). */
  var additionPosition: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom
  ] = js.undefined
  /**
     * Allow user additions to the list of options (boolean).
     * Requires the use of `selection`, `options` and `search`.
     */
  var allowAdditions: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A Dropdown can reduce its complexity. */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** Format the Dropdown to appear as a button. */
  var button: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Using the clearable setting will let users remove their selection from a dropdown. */
  var clearable: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the menu should close when the dropdown is blurred. */
  var closeOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Whether or not the menu should close when a value is selected from the dropdown.
     * By default, multiple selection dropdowns will remain open on change, while single
     * selection dropdowns will close on change.
     */
  var closeOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /** A compact dropdown has no minimum width. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the dropdown should strip diacritics in options and input search */
  var deburr: js.UndefOr[scala.Boolean] = js.undefined
  /** Initial value of open. */
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  /** Initial value of searchQuery. */
  var defaultSearchQuery: js.UndefOr[java.lang.String] = js.undefined
  /** Currently selected label in multi-select. */
  var defaultSelectedLabel: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Initial value of upward. */
  var defaultUpward: js.UndefOr[scala.Boolean] = js.undefined
  /** Initial value or value array if multiple. */
  var defaultValue: js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String | scala.Boolean])
  ] = js.undefined
  /** A dropdown menu can open to the left or to the right. */
  var direction: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** A disabled dropdown menu or item does not allow user interaction. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** An errored dropdown can alert a user to a problem. */
  var error: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown menu can contain floated content. */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown can take the full width of its parent */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown menu can contain a header. */
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Shorthand for Icon. */
  var icon: js.UndefOr[js.Any] = js.undefined
  /** A dropdown can be formatted to appear inline in other content. */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown can be formatted as a Menu item. */
  var item: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown can be labeled. */
  var labeled: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown can defer rendering its options until it is open. */
  var lazyLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown can show that it is currently loading data. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** The minimum characters for a search to begin showing results. */
  var minCharacters: js.UndefOr[scala.Double] = js.undefined
  /** A selection dropdown can allow multiple selections. */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /** Message to display when there are no results. */
  var noResultsMessage: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Called when a user adds a new item. Use this to update the options list.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props and the new item's value.
     */
  var onAddItem: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called on blur.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when the user attempts to change the value.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props and proposed value.
     */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called on click.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when a close event happens.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onClose: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called on focus.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onFocus: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when a multi-select label is clicked.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All label props.
     */
  var onLabelClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called on mousedown.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called when an open event happens.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props.
     */
  var onOpen: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
     * Called on search input change.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All props, includes current value of searchQuery.
     */
  var onSearchChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      /* data */ DropdownOnSearchChangeData, 
      scala.Unit
    ]
  ] = js.undefined
  /** Controls whether or not the dropdown menu is displayed. */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the menu should open when the dropdown is focused. */
  var openOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
  var options: js.UndefOr[
    js.Array[
      semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
    ]
  ] = js.undefined
  /** Placeholder text. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** A dropdown can be formatted so that its menu is pointing. */
  var pointing: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`top right`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom left`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`bottom right`)
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
      /* item */ semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps, 
      /* index */ scala.Double, 
      /* defaultLabelProps */ semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps, 
      _
    ]
  ] = js.undefined
  /** A dropdown can have its menu scroll. */
  var scrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * A selection dropdown can allow a user to search through a large list of choices.
     * Pass a function here to replace the default search.
     */
  var search: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* options */ js.Array[
        semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
      ], 
      /* value */ java.lang.String, 
      js.Array[
        semanticDashUiDashReactLib.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
      ]
    ])
  ] = js.undefined
  /** A shorthand for a search input. */
  var searchInput: js.UndefOr[js.Any] = js.undefined
  /** Current value of searchQuery. Creates a controlled component. */
  var searchQuery: js.UndefOr[java.lang.String] = js.undefined
  /** Define whether the highlighted item should be selected on blur. */
  var selectOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice. */
  var selectOnNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Currently selected label in multi-select. */
  var selectedLabel: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A dropdown can be used to select between choices in a form. */
  var selection: js.UndefOr[js.Any] = js.undefined
  /** A simple dropdown can open without Javascript. */
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  /** A dropdown can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The text displayed in the dropdown, usually for the active item. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Custom element to trigger the menu to become visible. Takes place of 'text'. */
  var trigger: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Controls whether the dropdown will open upward. */
  var upward: js.UndefOr[scala.Boolean] = js.undefined
  /** Current value or value array if multiple. Creates a controlled component. */
  var value: js.UndefOr[
    scala.Boolean | scala.Double | java.lang.String | (js.Array[scala.Boolean | scala.Double | java.lang.String])
  ] = js.undefined
  /**
     * A dropdown will go to the last element when ArrowUp is pressed on the first,
     * or go to the first when ArrowDown is pressed on the last( aka infinite selection )
     */
  var wrapSelection: js.UndefOr[scala.Boolean] = js.undefined
}

