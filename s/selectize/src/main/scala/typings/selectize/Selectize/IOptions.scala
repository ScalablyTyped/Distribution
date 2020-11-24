package typings.selectize.Selectize

import org.scalablytyped.runtime.StringDictionary
import typings.selectize.JQuery
import typings.selectize.anon.Direction
import typings.selectize.selectizeStrings.focus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://github.com/brianreavis/selectize.js/blob/master/docs/usage.md
// option identifiers are parameterized by T; data is parameterized by U
@js.native
trait IOptions[T, U] extends js.Object {
  
  /**
    * Sets if the "Add..." option should be the default selection in the dropdown.
    *
    * Default: false
    */
  var addPrecedence: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, Selectize will treat any options with a "" value like normal. This defaults to false to
    * accomodate the common <select> practice of having the first empty option act as a placeholder.
    *
    * Default: false
    */
  var allowEmptyOption: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the dropdown will be closed after a selection is made.
    *
    * Default: false
    */
  var closeAfterSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Copy the original input classes to the Dropdown element.
    *
    * Default: true
    */
  var copyClassesToDropdown: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows the user to create a new items that aren't in the list of options.
    * This option can be any of the following: "true", "false" (disabled), or a function that accepts two
    * arguments: "input" and "callback". The callback should be invoked with the final data for the option.
    *
    * Default: false
    */
  var create: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies a RegExp or String containing a regular expression that the current search filter must match to
    * be allowed to be created. May also be a predicate function that takes the filter text and returns whether
    * it is allowed.
    *
    * Default: null
    */
  var createFilter: js.UndefOr[js.Any] = js.native
  
  /**
    * If true, when user exits the field (clicks outside of input or presses ESC) new option is created and
    * selected (if `create`-option is enabled).
    *
    * Default: false
    */
  var createOnBlur: js.UndefOr[Boolean] = js.native
  
  /**
    * The <option> attribute from which to read JSON data about the option.
    *
    * Default: "data-data"
    */
  var dataAttr: js.UndefOr[String] = js.native
  
  /**
    * The string to separate items by. This option is only used when Selectize is instantiated from a
    * <input type="text"> element.
    *
    * Default: ','
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * Enable or disable international character support.
    *
    * Default: true
    */
  var diacritics: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property to disabled option and optgroup.
    *
    * Default: 'disabled'
    */
  var disabledField: js.UndefOr[String] = js.native
  
  /**
    * The element the dropdown menu is appended to. This should be "body" or null.
    * If null, the dropdown will be appended as a child of the selectize control.
    *
    * Default: null
    */
  var dropdownParent: js.UndefOr[String] = js.native
  
  /**
    * If true, the items that are currently selected will not be shown in the dropdown list of available options.
    *
    * Default: false
    */
  var hideSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * Toggles match highlighting within the dropdown menu.
    *
    * Default: true
    */
  var highlight: js.UndefOr[Boolean] = js.native
  
  // General
  // ------------------------------------------------------------------------------------------------------------
  /**
    * An array of the initial selected values. By default this is populated from the original input element.
    */
  var items: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * The name of the property to render as an option / item label (not needed when custom rendering
    * functions are defined).
    *
    * Default: "text"
    */
  var labelField: js.UndefOr[String] = js.native
  
  // Callbacks
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Invoked when new options should be loaded from the server.
    */
  var load: js.UndefOr[js.Function2[/* query */ String, /* callback */ js.Function, _]] = js.native
  
  /**
    * The number of milliseconds to wait before requesting options from the server or null.
    * If null, throttling is disabled.
    *
    * Default: 300
    */
  var loadThrottle: js.UndefOr[Double] = js.native
  
  /**
    * If truthy, Selectize will make all optgroups be in the same order as they were added (by the `$order`
    * property). Otherwise, it will order based on the score of the results in each.
    *
    * Default: false
    */
  var lockOptgroupOrder: js.UndefOr[Boolean] = js.native
  
  /**
    * The max number of items the user can select.
    *
    * Default: Infinity
    */
  var maxItems: js.UndefOr[Double] = js.native
  
  /**
    * The max number of items to render at once in the dropdown list of options.
    *
    * Default: 1000
    */
  var maxOptions: js.UndefOr[Double] = js.native
  
  /**
    * Invoked when the control loses focus.
    */
  var onBlur: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Invoked when the value of the control changes.
    *
    * If single select, value is of type T.
    * If multi select, value is of type T[].
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * Invoked when the control is manually cleared via the clear() method.
    */
  var onClear: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Invoked when the user attempts to delete the current selection.
    */
  var onDelete: js.UndefOr[js.Function1[/* values */ js.Array[T], _]] = js.native
  
  /**
    * Invoked when the dropdown closes.
    */
  var onDropdownClose: js.UndefOr[js.Function1[/* dropdown */ JQuery, _]] = js.native
  
  /**
    * Invoked when the dropdown opens.
    */
  var onDropdownOpen: js.UndefOr[js.Function1[/* dropdown */ JQuery, _]] = js.native
  
  /**
    * Invoked when the control gains focus.
    */
  var onFocus: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Invoked once the control is completely initialized.
    */
  var onInitialize: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Invoked when an item is selected.
    */
  var onItemAdd: js.UndefOr[js.Function2[/* value */ T, /* item */ JQuery, _]] = js.native
  
  /**
    * Invoked when an item is deselected.
    */
  var onItemRemove: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
  
  /**
    * Invoked when new options have been loaded and added to the control (via the "load" option or "load" API method).
    */
  var onLoad: js.UndefOr[js.Function1[/* data */ js.Array[U], _]] = js.native
  
  /**
    * Invoked when a new option is added to the available options list.
    */
  var onOptionAdd: js.UndefOr[js.Function2[/* value */ T, /* data */ U, _]] = js.native
  
  /**
    * Invoked when an option is removed from the available options.
    */
  var onOptionRemove: js.UndefOr[js.Function1[/* value */ T, _]] = js.native
  
  /**
    * Invoked when the user types while filtering options.
    */
  var onType: js.UndefOr[js.Function1[/* srt */ String, _]] = js.native
  
  /**
    * Show the dropdown immediately when the control receives focus.
    *
    * Default: true
    */
  var openOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property to group items by.
    *
    * Default: "optgroup"
    */
  var optgroupField: js.UndefOr[String] = js.native
  
  /**
    * The name of the property to render as an option group label (not needed when custom rendering
    * functions are defined).
    *
    * Default: "label"
    */
  var optgroupLabelField: js.UndefOr[String] = js.native
  
  /**
    * An array of optgroup values that indicates the order they should be listed in in the dropdown.
    * If not provided, groups will be ordered by the ranking of the options within them.
    *
    * Default: null
    */
  var optgroupOrder: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the option group property that serves as its unique identifier.
    *
    * Default: "value"
    */
  var optgroupValueField: js.UndefOr[String] = js.native
  
  /**
    * Option groups that options will be bucketed into.
    * If your element is a <select> with <optgroup>s this property gets populated automatically.
    * Make sure each object in the array has a property named whatever "optgroupValueField" is set to.
    */
  var optgroups: js.UndefOr[js.Array[U]] = js.native
  
  // Data / Searching
  // ------------------------------------------------------------------------------------------------------------
  /**
    * Options available to select; array of objects. If your element is <select> with <option>s specified this
    * property gets populated accordingly. Setting this property is convenient if you have your data as an
    * array and want to automatically generate the <option>s.
    *
    * Default: []
    */
  var options: js.UndefOr[js.Array[U]] = js.native
  
  /**
    * If false, items created by the user will not show up as available options once they are unselected.
    *
    * Default: true
    */
  var persist: js.UndefOr[Boolean] = js.native
  
  /**
    * The placeholder of the control (displayed when nothing is selected / typed).
    * Defaults to input element's placeholder, unless this one is specified.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * Plugins to use
    *
    * Default: null
    */
  var plugins: js.UndefOr[(js.Array[IPluginOption | String]) | StringDictionary[js.Any]] = js.native
  
  /**
    * If true, the "load" function will be called upon control initialization (with an empty search).
    * Alternatively it can be set to "focus" to call the "load" function when control receives focus.
    *
    * Default: false
    */
  var preload: js.UndefOr[Boolean | focus] = js.native
  
  // Rendering
  // ------------------------------------------------------------------------------------------------------------
  var render: js.UndefOr[ICustomRenderers[U]] = js.native
  
  /**
    * Overrides the scoring function used to sort available options. The provided function should return a
    * function that returns a number greater than or equal to zero to represent the "score" of an item
    * (the function's first argument). If 0, the option is declared not a match.
    */
  var score: js.UndefOr[js.Function1[/* search */ ISearch, js.Function1[/* item */ _, Double]]] = js.native
  
  /**
    * The animation duration (in milliseconds) of the scroll animation triggered when going [up] and [down] in
    * the options dropdown.
    *
    * Default: 60
    */
  var scrollDuration: js.UndefOr[Double] = js.native
  
  /**
    * When searching for multiple terms (separated by a space), this is the operator used. Can be "and" or "or".
    *
    * Default: "and"
    */
  var searchConjunction: js.UndefOr[String] = js.native
  
  /**
    * An array of property names to analyze when filtering options.
    *
    * Default: ["text"]
    */
  var searchField: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * If true, the tab key will choose the currently selected item.
    *
    * Default: false
    */
  var selectOnTab: js.UndefOr[Boolean] = js.native
  
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
  var sortField: js.UndefOr[String | js.Array[Direction]] = js.native
  
  /**
    * The name of the property to use as the "value" when an item is selected.
    *
    * Default: "value"
    */
  var valueField: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T, U](): IOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions[T, U]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_, _], T, U] (val x: Self with (IOptions[T, U])) extends AnyVal {
    
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
    def setAddPrecedence(value: Boolean): Self = this.set("addPrecedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddPrecedence: Self = this.set("addPrecedence", js.undefined)
    
    @scala.inline
    def setAllowEmptyOption(value: Boolean): Self = this.set("allowEmptyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmptyOption: Self = this.set("allowEmptyOption", js.undefined)
    
    @scala.inline
    def setCloseAfterSelect(value: Boolean): Self = this.set("closeAfterSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseAfterSelect: Self = this.set("closeAfterSelect", js.undefined)
    
    @scala.inline
    def setCopyClassesToDropdown(value: Boolean): Self = this.set("copyClassesToDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyClassesToDropdown: Self = this.set("copyClassesToDropdown", js.undefined)
    
    @scala.inline
    def setCreate(value: js.Any): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCreateFilter(value: js.Any): Self = this.set("createFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateFilter: Self = this.set("createFilter", js.undefined)
    
    @scala.inline
    def setCreateOnBlur(value: Boolean): Self = this.set("createOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateOnBlur: Self = this.set("createOnBlur", js.undefined)
    
    @scala.inline
    def setDataAttr(value: String): Self = this.set("dataAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataAttr: Self = this.set("dataAttr", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setDiacritics(value: Boolean): Self = this.set("diacritics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiacritics: Self = this.set("diacritics", js.undefined)
    
    @scala.inline
    def setDisabledField(value: String): Self = this.set("disabledField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledField: Self = this.set("disabledField", js.undefined)
    
    @scala.inline
    def setDropdownParent(value: String): Self = this.set("dropdownParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownParent: Self = this.set("dropdownParent", js.undefined)
    
    @scala.inline
    def setHideSelected(value: Boolean): Self = this.set("hideSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSelected: Self = this.set("hideSelected", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLabelField(value: String): Self = this.set("labelField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelField: Self = this.set("labelField", js.undefined)
    
    @scala.inline
    def setLoad(value: (/* query */ String, /* callback */ js.Function) => _): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadThrottle(value: Double): Self = this.set("loadThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadThrottle: Self = this.set("loadThrottle", js.undefined)
    
    @scala.inline
    def setLockOptgroupOrder(value: Boolean): Self = this.set("lockOptgroupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockOptgroupOrder: Self = this.set("lockOptgroupOrder", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMaxOptions(value: Double): Self = this.set("maxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOptions: Self = this.set("maxOptions", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => _): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Any => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClear(value: () => _): Self = this.set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClear: Self = this.set("onClear", js.undefined)
    
    @scala.inline
    def setOnDelete(value: /* values */ js.Array[T] => _): Self = this.set("onDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setOnDropdownClose(value: /* dropdown */ JQuery => _): Self = this.set("onDropdownClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownClose: Self = this.set("onDropdownClose", js.undefined)
    
    @scala.inline
    def setOnDropdownOpen(value: /* dropdown */ JQuery => _): Self = this.set("onDropdownOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDropdownOpen: Self = this.set("onDropdownOpen", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => _): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnInitialize(value: () => _): Self = this.set("onInitialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInitialize: Self = this.set("onInitialize", js.undefined)
    
    @scala.inline
    def setOnItemAdd(value: (/* value */ T, /* item */ JQuery) => _): Self = this.set("onItemAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnItemAdd: Self = this.set("onItemAdd", js.undefined)
    
    @scala.inline
    def setOnItemRemove(value: /* value */ T => _): Self = this.set("onItemRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnItemRemove: Self = this.set("onItemRemove", js.undefined)
    
    @scala.inline
    def setOnLoad(value: /* data */ js.Array[U] => _): Self = this.set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOnOptionAdd(value: (/* value */ T, /* data */ U) => _): Self = this.set("onOptionAdd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnOptionAdd: Self = this.set("onOptionAdd", js.undefined)
    
    @scala.inline
    def setOnOptionRemove(value: /* value */ T => _): Self = this.set("onOptionRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOptionRemove: Self = this.set("onOptionRemove", js.undefined)
    
    @scala.inline
    def setOnType(value: /* srt */ String => _): Self = this.set("onType", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnType: Self = this.set("onType", js.undefined)
    
    @scala.inline
    def setOpenOnFocus(value: Boolean): Self = this.set("openOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnFocus: Self = this.set("openOnFocus", js.undefined)
    
    @scala.inline
    def setOptgroupField(value: String): Self = this.set("optgroupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptgroupField: Self = this.set("optgroupField", js.undefined)
    
    @scala.inline
    def setOptgroupLabelField(value: String): Self = this.set("optgroupLabelField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptgroupLabelField: Self = this.set("optgroupLabelField", js.undefined)
    
    @scala.inline
    def setOptgroupOrderVarargs(value: String*): Self = this.set("optgroupOrder", js.Array(value :_*))
    
    @scala.inline
    def setOptgroupOrder(value: js.Array[String]): Self = this.set("optgroupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptgroupOrder: Self = this.set("optgroupOrder", js.undefined)
    
    @scala.inline
    def setOptgroupValueField(value: String): Self = this.set("optgroupValueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptgroupValueField: Self = this.set("optgroupValueField", js.undefined)
    
    @scala.inline
    def setOptgroupsVarargs(value: U*): Self = this.set("optgroups", js.Array(value :_*))
    
    @scala.inline
    def setOptgroups(value: js.Array[U]): Self = this.set("optgroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptgroups: Self = this.set("optgroups", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: U*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[U]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (IPluginOption | String)*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: (js.Array[IPluginOption | String]) | StringDictionary[js.Any]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean | focus): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
    
    @scala.inline
    def setRender(value: ICustomRenderers[U]): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setScore(value: /* search */ ISearch => js.Function1[/* item */ _, Double]): Self = this.set("score", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDuration: Self = this.set("scrollDuration", js.undefined)
    
    @scala.inline
    def setSearchConjunction(value: String): Self = this.set("searchConjunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchConjunction: Self = this.set("searchConjunction", js.undefined)
    
    @scala.inline
    def setSearchFieldVarargs(value: String*): Self = this.set("searchField", js.Array(value :_*))
    
    @scala.inline
    def setSearchField(value: String | js.Array[String]): Self = this.set("searchField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchField: Self = this.set("searchField", js.undefined)
    
    @scala.inline
    def setSelectOnTab(value: Boolean): Self = this.set("selectOnTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnTab: Self = this.set("selectOnTab", js.undefined)
    
    @scala.inline
    def setSortFieldVarargs(value: Direction*): Self = this.set("sortField", js.Array(value :_*))
    
    @scala.inline
    def setSortField(value: String | js.Array[Direction]): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortField: Self = this.set("sortField", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
}
