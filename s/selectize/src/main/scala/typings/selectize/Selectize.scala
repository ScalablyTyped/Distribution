package typings.selectize

import org.scalablytyped.runtime.StringDictionary
import typings.selectize.anon.Direction
import typings.selectize.selectizeStrings.focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Selectize {
  
  // see https://github.com/brianreavis/selectize.js/blob/master/docs/api.md
  @js.native
  trait IApi[T, U] extends StObject {
    
    /**
      * "Selects" an item. Adds it to the list at the current caret position.
      */
    def addItem(value: T): Unit = js.native
    def addItem(value: T, silent: Boolean): Unit = js.native
    
    // Dropdown Options
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Adds an available option. If it already exists, nothing will happen.
      * Note: this does not refresh the options list dropdown (use refreshOptions() for that).
      */
    def addOption(data: U): Unit = js.native
    
    // Optgroups
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Registers a new optgroup for options to be bucketed into.
      * The "id" argument refers to a value of the property in option identified by the "optgroupField" setting.
      */
    def addOptionGroup(id: String, data: U): Unit = js.native
    
    /**
      * Forces the control out of focus.
      */
    def blur(): Unit = js.native
    
    // Selected Items
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Resets / clears all selected items from the control.
      */
    def clear(): Unit = js.native
    def clear(silent: Boolean): Unit = js.native
    
    /**
      * Clears the render cache. Takes an optional template argument (e.g. "option", "item") to clear only that cache.
      */
    def clearCache(): Unit = js.native
    def clearCache(template: String): Unit = js.native
    
    /**
      * Removes all options from the control.
      */
    def clearOptions(): Unit = js.native
    
    /**
      * Closes the autocomplete dropdown menu.
      */
    def close(): Unit = js.native
    
    /**
      * Invokes the "create" method provided in the selectize options that should provide the data for the
      * new item, given the user input. Once this completes, it will be added to the item list.
      */
    def createItem(value: T): Unit = js.native
    def createItem(value: T, triggerDropdown: Boolean): Unit = js.native
    def createItem(value: T, triggerDropdown: Boolean, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    def createItem(value: T, triggerDropdown: Unit, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): Unit = js.native
    
    // Other
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Destroys the control and unbinds event listeners so that it can be garbage collected.
      */
    def destroy(): Unit = js.native
    
    /**
      * Disables user input on the control completely. While disabled, it cannot receive focus.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables the control so that it can respond to focus and user input.
      */
    def enable(): Unit = js.native
    
    /**
      * Brings the control into focus.
      */
    def focus(): Unit = js.native
    
    /**
      * Retrieves the jQuery element for the previous or next option, relative to the currently highlighted option.
      * The "direction" argument should be 1 for "next" or -1 for "previous".
      */
    def getAdjacentOption(value: T, direction: Double): Unit = js.native
    
    /**
      * Returns the jQuery element of the item matching the given value.
      */
    def getItem(value: T): JQuery = js.native
    
    /**
      * Retrieves the jQuery element for the option identified by the given value.
      */
    def getOption(value: T): JQuery = js.native
    
    /**
      * Returns the value of the control. If multiple items can be selected (e.g. <select multiple>), this
      * returns an array. If only one item can be selected, this returns a string.
      */
    def getValue(): Any = js.native
    
    /**
      * Returns whether or not the user can select more items.
      */
    def isFull(): Boolean = js.native
    
    /**
      * An array of selected values.
      */
    var items: js.Array[T] = js.native
    
    /**
      * Loads options by invoking the the provided function. The function should accept one argument (callback)
      * and invoke the callback with the results once they are available.
      */
    def load(callback: js.Function1[/* results */ Any, Any]): Unit = js.native
    
    /**
      * Disables user input on the control (note: the control can still receive focus).
      */
    def lock(): Unit = js.native
    
    /**
      * Removes an event listener. If no handler is provided, all event listeners are removed.
      */
    def off(eventName: String): Unit = js.native
    def off(eventName: String, handler: js.Function): Unit = js.native
    
    // Events
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Adds an event listener.
      */
    def on(eventName: String, handler: js.Function): Unit = js.native
    
    // Dropdown Actions
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Shows the autocomplete dropdown containing the available options.
      */
    def open(): Unit = js.native
    
    /**
      * An object containing the entire pool of options. The object is keyed by each object's value.
      */
    var options: StringDictionary[U] = js.native
    
    /**
      * Calculates and applies the appropriate position of the dropdown.
      */
    def positionDropdown(): Unit = js.native
    
    /**
      * Re-renders the selected item lists.
      */
    def refreshItems(): Unit = js.native
    
    /**
      * Refreshes the list of available options shown in the autocomplete dropdown menu.
      */
    def refreshOptions(triggerDropdown: Boolean): Unit = js.native
    
    /**
      * Removes the selected item matching the provided value.
      */
    def removeItem(value: T): Unit = js.native
    def removeItem(value: T, silent: Boolean): Unit = js.native
    
    /**
      * Removes the option identified by the given value.
      */
    def removeOption(value: T): Unit = js.native
    
    /**
      * Moves the caret to the specified position ("index" being the index in the list of selected items).
      */
    def setCaret(index: Double): Unit = js.native
    
    /**
      * Resets the selected items to the given value(s).
      */
    def setValue(value: T): Unit = js.native
    def setValue(value: T, silent: Boolean): Unit = js.native
    def setValue(value: js.Array[T]): Unit = js.native
    def setValue(value: js.Array[T], silent: Boolean): Unit = js.native
    
    /**
      * Triggers event listeners.
      */
    def trigger(eventName: String, args: Any*): Unit = js.native
    
    /**
      * Re-enables user input on the control.
      */
    def unlock(): Unit = js.native
    
    /**
      * Updates an option available for selection. If it is visible in the selected items or options dropdown,
      * it will be re-rendered automatically.
      */
    def updateOption(value: T, data: U): Unit = js.native
    
    /**
      * When the `settings.placeholder` value is changed, the new placeholder will be displayed.
      */
    def updatePlaceholder(): Unit = js.native
  }
  
  /**
    * Custom rendering functions. Each function should accept two arguments: "data" and "escape" and return
    * HTML (string) with a single root element. The "escape" argument is a function that takes a string and
    * escapes all special HTML characters. This is very important to use to prevent XSS vulnerabilities.
    */
  trait ICustomRenderers[U] extends StObject {
    
    // An item the user has selected.
    var item: js.UndefOr[
        js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
      ] = js.undefined
    
    // The wrapper for an optgroup. The "html" property in the data will be the raw html of the optgroup's header
    // and options.
    var optgroup: js.UndefOr[
        js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
      ] = js.undefined
    
    // The header of an option group.
    var optgroup_header: js.UndefOr[
        js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
      ] = js.undefined
    
    // An option in the dropdown list of available options.
    var option: js.UndefOr[
        js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
      ] = js.undefined
    
    // The "create new" option at the bottom of the dropdown. The data contains one property: "input"
    // (which is what the user has typed).
    var option_create: js.UndefOr[
        js.Function2[/* data */ U, /* escape */ js.Function1[/* input */ String, String], String]
      ] = js.undefined
  }
  object ICustomRenderers {
    
    inline def apply[U](): ICustomRenderers[U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomRenderers[U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICustomRenderers[?], U] (val x: Self & ICustomRenderers[U]) extends AnyVal {
      
      inline def setItem(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = StObject.set(x, "item", js.Any.fromFunction2(value))
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOptgroup(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = StObject.set(x, "optgroup", js.Any.fromFunction2(value))
      
      inline def setOptgroupUndefined: Self = StObject.set(x, "optgroup", js.undefined)
      
      inline def setOptgroup_header(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = StObject.set(x, "optgroup_header", js.Any.fromFunction2(value))
      
      inline def setOptgroup_headerUndefined: Self = StObject.set(x, "optgroup_header", js.undefined)
      
      inline def setOption(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = StObject.set(x, "option", js.Any.fromFunction2(value))
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setOption_create(value: (/* data */ U, /* escape */ js.Function1[/* input */ String, String]) => String): Self = StObject.set(x, "option_create", js.Any.fromFunction2(value))
      
      inline def setOption_createUndefined: Self = StObject.set(x, "option_create", js.undefined)
    }
  }
  
  // see https://github.com/brianreavis/selectize.js/blob/master/docs/usage.md
  // option identifiers are parameterized by T; data is parameterized by U
  trait IOptions[T, U] extends StObject {
    
    /**
      * Sets if the "Add..." option should be the default selection in the dropdown.
      *
      * Default: false
      */
    var addPrecedence: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, Selectize will treat any options with a "" value like normal. This defaults to false to
      * accomodate the common <select> practice of having the first empty option act as a placeholder.
      *
      * Default: false
      */
    var allowEmptyOption: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the dropdown will be closed after a selection is made.
      *
      * Default: false
      */
    var closeAfterSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Copy the original input classes to the Dropdown element.
      *
      * Default: true
      */
    var copyClassesToDropdown: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows the user to create a new items that aren't in the list of options.
      * This option can be any of the following: "true", "false" (disabled), or a function that accepts two
      * arguments: "input" and "callback". The callback should be invoked with the final data for the option.
      *
      * Default: false
      */
    var create: js.UndefOr[Any] = js.undefined
    
    /**
      * Specifies a RegExp or String containing a regular expression that the current search filter must match to
      * be allowed to be created. May also be a predicate function that takes the filter text and returns whether
      * it is allowed.
      *
      * Default: null
      */
    var createFilter: js.UndefOr[Any] = js.undefined
    
    /**
      * If true, when user exits the field (clicks outside of input or presses ESC) new option is created and
      * selected (if `create`-option is enabled).
      *
      * Default: false
      */
    var createOnBlur: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The <option> attribute from which to read JSON data about the option.
      *
      * Default: "data-data"
      */
    var dataAttr: js.UndefOr[String] = js.undefined
    
    /**
      * The string to separate items by. This option is only used when Selectize is instantiated from a
      * <input type="text"> element.
      *
      * Default: ','
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Enable or disable international character support.
      *
      * Default: true
      */
    var diacritics: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the property to disabled option and optgroup.
      *
      * Default: 'disabled'
      */
    var disabledField: js.UndefOr[String] = js.undefined
    
    /**
      * The element the dropdown menu is appended to. This should be "body" or null.
      * If null, the dropdown will be appended as a child of the selectize control.
      *
      * Default: null
      */
    var dropdownParent: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the items that are currently selected will not be shown in the dropdown list of available options.
      *
      * Default: false
      */
    var hideSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles match highlighting within the dropdown menu.
      *
      * Default: true
      */
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    // General
    // ------------------------------------------------------------------------------------------------------------
    /**
      * An array of the initial selected values. By default this is populated from the original input element.
      */
    var items: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * The name of the property to render as an option / item label (not needed when custom rendering
      * functions are defined).
      *
      * Default: "text"
      */
    var labelField: js.UndefOr[String] = js.undefined
    
    // Callbacks
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Invoked when new options should be loaded from the server.
      */
    var load: js.UndefOr[js.Function2[/* query */ String, /* callback */ js.Function, Any]] = js.undefined
    
    /**
      * The number of milliseconds to wait before requesting options from the server or null.
      * If null, throttling is disabled.
      *
      * Default: 300
      */
    var loadThrottle: js.UndefOr[Double] = js.undefined
    
    /**
      * If truthy, Selectize will make all optgroups be in the same order as they were added (by the `$order`
      * property). Otherwise, it will order based on the score of the results in each.
      *
      * Default: false
      */
    var lockOptgroupOrder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The max number of items the user can select.
      *
      * Default: Infinity
      */
    var maxItems: js.UndefOr[Double] = js.undefined
    
    /**
      * The max number of items to render at once in the dropdown list of options.
      *
      * Default: 1000
      */
    var maxOptions: js.UndefOr[Double] = js.undefined
    
    /**
      * Invoked when the control loses focus.
      */
    var onBlur: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Invoked when the value of the control changes.
      *
      * If single select, value is of type T.
      * If multi select, value is of type T[].
      */
    var onChange: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
    
    /**
      * Invoked when the control is manually cleared via the clear() method.
      */
    var onClear: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Invoked when the user attempts to delete the current selection.
      */
    var onDelete: js.UndefOr[js.Function1[/* values */ js.Array[T], Any]] = js.undefined
    
    /**
      * Invoked when the dropdown closes.
      */
    var onDropdownClose: js.UndefOr[js.Function1[/* dropdown */ JQuery, Any]] = js.undefined
    
    /**
      * Invoked when the dropdown opens.
      */
    var onDropdownOpen: js.UndefOr[js.Function1[/* dropdown */ JQuery, Any]] = js.undefined
    
    /**
      * Invoked when the control gains focus.
      */
    var onFocus: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Invoked once the control is completely initialized.
      */
    var onInitialize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /**
      * Invoked when an item is selected.
      */
    var onItemAdd: js.UndefOr[js.Function2[/* value */ T, /* item */ JQuery, Any]] = js.undefined
    
    /**
      * Invoked when an item is deselected.
      */
    var onItemRemove: js.UndefOr[js.Function1[/* value */ T, Any]] = js.undefined
    
    /**
      * Invoked when new options have been loaded and added to the control (via the "load" option or "load" API method).
      */
    var onLoad: js.UndefOr[js.Function1[/* data */ js.Array[U], Any]] = js.undefined
    
    /**
      * Invoked when a new option is added to the available options list.
      */
    var onOptionAdd: js.UndefOr[js.Function2[/* value */ T, /* data */ U, Any]] = js.undefined
    
    /**
      * Invoked when an option is removed from the available options.
      */
    var onOptionRemove: js.UndefOr[js.Function1[/* value */ T, Any]] = js.undefined
    
    /**
      * Invoked when the user types while filtering options.
      */
    var onType: js.UndefOr[js.Function1[/* srt */ String, Any]] = js.undefined
    
    /**
      * Show the dropdown immediately when the control receives focus.
      *
      * Default: true
      */
    var openOnFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the property to group items by.
      *
      * Default: "optgroup"
      */
    var optgroupField: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the property to render as an option group label (not needed when custom rendering
      * functions are defined).
      *
      * Default: "label"
      */
    var optgroupLabelField: js.UndefOr[String] = js.undefined
    
    /**
      * An array of optgroup values that indicates the order they should be listed in in the dropdown.
      * If not provided, groups will be ordered by the ranking of the options within them.
      *
      * Default: null
      */
    var optgroupOrder: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The name of the option group property that serves as its unique identifier.
      *
      * Default: "value"
      */
    var optgroupValueField: js.UndefOr[String] = js.undefined
    
    /**
      * Option groups that options will be bucketed into.
      * If your element is a <select> with <optgroup>s this property gets populated automatically.
      * Make sure each object in the array has a property named whatever "optgroupValueField" is set to.
      */
    var optgroups: js.UndefOr[js.Array[U]] = js.undefined
    
    // Data / Searching
    // ------------------------------------------------------------------------------------------------------------
    /**
      * Options available to select; array of objects. If your element is <select> with <option>s specified this
      * property gets populated accordingly. Setting this property is convenient if you have your data as an
      * array and want to automatically generate the <option>s.
      *
      * Default: []
      */
    var options: js.UndefOr[js.Array[U]] = js.undefined
    
    /**
      * If false, items created by the user will not show up as available options once they are unselected.
      *
      * Default: true
      */
    var persist: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The placeholder of the control (displayed when nothing is selected / typed).
      * Defaults to input element's placeholder, unless this one is specified.
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Plugins to use
      *
      * Default: null
      */
    var plugins: js.UndefOr[(js.Array[IPluginOption | String]) | StringDictionary[Any]] = js.undefined
    
    /**
      * If true, the "load" function will be called upon control initialization (with an empty search).
      * Alternatively it can be set to "focus" to call the "load" function when control receives focus.
      *
      * Default: false
      */
    var preload: js.UndefOr[Boolean | focus] = js.undefined
    
    // Rendering
    // ------------------------------------------------------------------------------------------------------------
    var render: js.UndefOr[ICustomRenderers[U]] = js.undefined
    
    /**
      * Overrides the scoring function used to sort available options. The provided function should return a
      * function that returns a number greater than or equal to zero to represent the "score" of an item
      * (the function's first argument). If 0, the option is declared not a match.
      */
    var score: js.UndefOr[js.Function1[/* search */ ISearch, js.Function1[/* item */ Any, Double]]] = js.undefined
    
    /**
      * The animation duration (in milliseconds) of the scroll animation triggered when going [up] and [down] in
      * the options dropdown.
      *
      * Default: 60
      */
    var scrollDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * When searching for multiple terms (separated by a space), this is the operator used. Can be "and" or "or".
      *
      * Default: "and"
      */
    var searchConjunction: js.UndefOr[String] = js.undefined
    
    /**
      * An array of property names to analyze when filtering options.
      *
      * Default: ["text"]
      */
    var searchField: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * If true, the tab key will choose the currently selected item.
      *
      * Default: false
      */
    var selectOnTab: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A single field or an array of fields to sort by. Each item in the array should be an object containing at
      * least a "field" property. Optionally, "direction" can be set to "asc" or "desc". The order of the array
      * defines the sort precedence.
      *
      * Unless present, a special "$score" field will be automatically added to the beginning of the sort list.
      * This will make results sorted primarily by match quality (descending).
      *
      * Default: "$order"
      */
    var sortField: js.UndefOr[String | js.Array[Direction]] = js.undefined
    
    /**
      * The name of the property to use as the "value" when an item is selected.
      *
      * Default: "value"
      */
    var valueField: js.UndefOr[String] = js.undefined
  }
  object IOptions {
    
    inline def apply[T, U](): IOptions[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions[?, ?], T, U] (val x: Self & (IOptions[T, U])) extends AnyVal {
      
      inline def setAddPrecedence(value: Boolean): Self = StObject.set(x, "addPrecedence", value.asInstanceOf[js.Any])
      
      inline def setAddPrecedenceUndefined: Self = StObject.set(x, "addPrecedence", js.undefined)
      
      inline def setAllowEmptyOption(value: Boolean): Self = StObject.set(x, "allowEmptyOption", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyOptionUndefined: Self = StObject.set(x, "allowEmptyOption", js.undefined)
      
      inline def setCloseAfterSelect(value: Boolean): Self = StObject.set(x, "closeAfterSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseAfterSelectUndefined: Self = StObject.set(x, "closeAfterSelect", js.undefined)
      
      inline def setCopyClassesToDropdown(value: Boolean): Self = StObject.set(x, "copyClassesToDropdown", value.asInstanceOf[js.Any])
      
      inline def setCopyClassesToDropdownUndefined: Self = StObject.set(x, "copyClassesToDropdown", js.undefined)
      
      inline def setCreate(value: Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateFilter(value: Any): Self = StObject.set(x, "createFilter", value.asInstanceOf[js.Any])
      
      inline def setCreateFilterUndefined: Self = StObject.set(x, "createFilter", js.undefined)
      
      inline def setCreateOnBlur(value: Boolean): Self = StObject.set(x, "createOnBlur", value.asInstanceOf[js.Any])
      
      inline def setCreateOnBlurUndefined: Self = StObject.set(x, "createOnBlur", js.undefined)
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDataAttr(value: String): Self = StObject.set(x, "dataAttr", value.asInstanceOf[js.Any])
      
      inline def setDataAttrUndefined: Self = StObject.set(x, "dataAttr", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDiacritics(value: Boolean): Self = StObject.set(x, "diacritics", value.asInstanceOf[js.Any])
      
      inline def setDiacriticsUndefined: Self = StObject.set(x, "diacritics", js.undefined)
      
      inline def setDisabledField(value: String): Self = StObject.set(x, "disabledField", value.asInstanceOf[js.Any])
      
      inline def setDisabledFieldUndefined: Self = StObject.set(x, "disabledField", js.undefined)
      
      inline def setDropdownParent(value: String): Self = StObject.set(x, "dropdownParent", value.asInstanceOf[js.Any])
      
      inline def setDropdownParentUndefined: Self = StObject.set(x, "dropdownParent", js.undefined)
      
      inline def setHideSelected(value: Boolean): Self = StObject.set(x, "hideSelected", value.asInstanceOf[js.Any])
      
      inline def setHideSelectedUndefined: Self = StObject.set(x, "hideSelected", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabelField(value: String): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
      
      inline def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
      
      inline def setLoad(value: (/* query */ String, /* callback */ js.Function) => Any): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadThrottle(value: Double): Self = StObject.set(x, "loadThrottle", value.asInstanceOf[js.Any])
      
      inline def setLoadThrottleUndefined: Self = StObject.set(x, "loadThrottle", js.undefined)
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLockOptgroupOrder(value: Boolean): Self = StObject.set(x, "lockOptgroupOrder", value.asInstanceOf[js.Any])
      
      inline def setLockOptgroupOrderUndefined: Self = StObject.set(x, "lockOptgroupOrder", js.undefined)
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxOptions(value: Double): Self = StObject.set(x, "maxOptions", value.asInstanceOf[js.Any])
      
      inline def setMaxOptionsUndefined: Self = StObject.set(x, "maxOptions", js.undefined)
      
      inline def setOnBlur(value: () => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ Any => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: () => Any): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnDelete(value: /* values */ js.Array[T] => Any): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnDropdownClose(value: /* dropdown */ JQuery => Any): Self = StObject.set(x, "onDropdownClose", js.Any.fromFunction1(value))
      
      inline def setOnDropdownCloseUndefined: Self = StObject.set(x, "onDropdownClose", js.undefined)
      
      inline def setOnDropdownOpen(value: /* dropdown */ JQuery => Any): Self = StObject.set(x, "onDropdownOpen", js.Any.fromFunction1(value))
      
      inline def setOnDropdownOpenUndefined: Self = StObject.set(x, "onDropdownOpen", js.undefined)
      
      inline def setOnFocus(value: () => Any): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInitialize(value: () => Any): Self = StObject.set(x, "onInitialize", js.Any.fromFunction0(value))
      
      inline def setOnInitializeUndefined: Self = StObject.set(x, "onInitialize", js.undefined)
      
      inline def setOnItemAdd(value: (/* value */ T, /* item */ JQuery) => Any): Self = StObject.set(x, "onItemAdd", js.Any.fromFunction2(value))
      
      inline def setOnItemAddUndefined: Self = StObject.set(x, "onItemAdd", js.undefined)
      
      inline def setOnItemRemove(value: /* value */ T => Any): Self = StObject.set(x, "onItemRemove", js.Any.fromFunction1(value))
      
      inline def setOnItemRemoveUndefined: Self = StObject.set(x, "onItemRemove", js.undefined)
      
      inline def setOnLoad(value: /* data */ js.Array[U] => Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnOptionAdd(value: (/* value */ T, /* data */ U) => Any): Self = StObject.set(x, "onOptionAdd", js.Any.fromFunction2(value))
      
      inline def setOnOptionAddUndefined: Self = StObject.set(x, "onOptionAdd", js.undefined)
      
      inline def setOnOptionRemove(value: /* value */ T => Any): Self = StObject.set(x, "onOptionRemove", js.Any.fromFunction1(value))
      
      inline def setOnOptionRemoveUndefined: Self = StObject.set(x, "onOptionRemove", js.undefined)
      
      inline def setOnType(value: /* srt */ String => Any): Self = StObject.set(x, "onType", js.Any.fromFunction1(value))
      
      inline def setOnTypeUndefined: Self = StObject.set(x, "onType", js.undefined)
      
      inline def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      inline def setOptgroupField(value: String): Self = StObject.set(x, "optgroupField", value.asInstanceOf[js.Any])
      
      inline def setOptgroupFieldUndefined: Self = StObject.set(x, "optgroupField", js.undefined)
      
      inline def setOptgroupLabelField(value: String): Self = StObject.set(x, "optgroupLabelField", value.asInstanceOf[js.Any])
      
      inline def setOptgroupLabelFieldUndefined: Self = StObject.set(x, "optgroupLabelField", js.undefined)
      
      inline def setOptgroupOrder(value: js.Array[String]): Self = StObject.set(x, "optgroupOrder", value.asInstanceOf[js.Any])
      
      inline def setOptgroupOrderUndefined: Self = StObject.set(x, "optgroupOrder", js.undefined)
      
      inline def setOptgroupOrderVarargs(value: String*): Self = StObject.set(x, "optgroupOrder", js.Array(value*))
      
      inline def setOptgroupValueField(value: String): Self = StObject.set(x, "optgroupValueField", value.asInstanceOf[js.Any])
      
      inline def setOptgroupValueFieldUndefined: Self = StObject.set(x, "optgroupValueField", js.undefined)
      
      inline def setOptgroups(value: js.Array[U]): Self = StObject.set(x, "optgroups", value.asInstanceOf[js.Any])
      
      inline def setOptgroupsUndefined: Self = StObject.set(x, "optgroups", js.undefined)
      
      inline def setOptgroupsVarargs(value: U*): Self = StObject.set(x, "optgroups", js.Array(value*))
      
      inline def setOptions(value: js.Array[U]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: U*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPlugins(value: (js.Array[IPluginOption | String]) | StringDictionary[Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: (IPluginOption | String)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPreload(value: Boolean | focus): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setRender(value: ICustomRenderers[U]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setScore(value: /* search */ ISearch => js.Function1[/* item */ Any, Double]): Self = StObject.set(x, "score", js.Any.fromFunction1(value))
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
      
      inline def setSearchConjunction(value: String): Self = StObject.set(x, "searchConjunction", value.asInstanceOf[js.Any])
      
      inline def setSearchConjunctionUndefined: Self = StObject.set(x, "searchConjunction", js.undefined)
      
      inline def setSearchField(value: String | js.Array[String]): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
      
      inline def setSearchFieldUndefined: Self = StObject.set(x, "searchField", js.undefined)
      
      inline def setSearchFieldVarargs(value: String*): Self = StObject.set(x, "searchField", js.Array(value*))
      
      inline def setSelectOnTab(value: Boolean): Self = StObject.set(x, "selectOnTab", value.asInstanceOf[js.Any])
      
      inline def setSelectOnTabUndefined: Self = StObject.set(x, "selectOnTab", js.undefined)
      
      inline def setSortField(value: String | js.Array[Direction]): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
      
      inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
      
      inline def setSortFieldVarargs(value: Direction*): Self = StObject.set(x, "sortField", js.Array(value*))
      
      inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    }
  }
  
  // see https://github.com/selectize/selectize.js/blob/master/docs/plugins.md
  trait IPluginOption extends StObject {
    
    var name: String
    
    var options: Any
  }
  object IPluginOption {
    
    inline def apply(name: String, options: Any): IPluginOption = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPluginOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPluginOption] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISearch extends StObject {
    
    /**
      * A list of matched results. Each result is an object containing two properties: "score" and "id".
      */
    var items: js.Array[ISearchResult]
    
    /**
      * Original search options.
      */
    var options: Any
    
    /**
      * The raw user input
      */
    var query: String
    
    /**
      * An array containing parsed search tokens. A token is an object containing two properties: "string" and "regex".
      */
    var tokens: js.Array[ISearchToken]
    
    /**
      * The total number of results.
      */
    var total: Double
  }
  object ISearch {
    
    inline def apply(
      items: js.Array[ISearchResult],
      options: Any,
      query: String,
      tokens: js.Array[ISearchToken],
      total: Double
    ): ISearch = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISearch] (val x: Self) extends AnyVal {
      
      inline def setItems(value: js.Array[ISearchResult]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ISearchResult*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[ISearchToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: ISearchToken*): Self = StObject.set(x, "tokens", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISearchResult extends StObject {
    
    var id: String
    
    var score: Double
  }
  object ISearchResult {
    
    inline def apply(id: String, score: Double): ISearchResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISearchResult] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISearchToken extends StObject {
    
    var regex: js.RegExp
    
    var string: String
  }
  object ISearchToken {
    
    inline def apply(regex: js.RegExp, string: String): ISearchToken = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISearchToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISearchToken] (val x: Self) extends AnyVal {
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
