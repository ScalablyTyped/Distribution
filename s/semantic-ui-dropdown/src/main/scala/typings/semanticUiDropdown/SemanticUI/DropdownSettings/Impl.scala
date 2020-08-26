package typings.semanticUiDropdown.SemanticUI.DropdownSettings

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiDropdown.JQuery
import typings.semanticUiDropdown.SemanticUI.Dropdown.ClassNameSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.ErrorSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.FieldsSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.MessageSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.MetadataSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.RegExpSettings
import typings.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.activate
import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.both
import typings.semanticUiDropdown.semanticUiDropdownStrings.combo
import typings.semanticUiDropdown.semanticUiDropdownStrings.downward
import typings.semanticUiDropdown.semanticUiDropdownStrings.exact
import typings.semanticUiDropdown.semanticUiDropdownStrings.hide
import typings.semanticUiDropdown.semanticUiDropdownStrings.nothing
import typings.semanticUiDropdown.semanticUiDropdownStrings.select
import typings.semanticUiDropdown.semanticUiDropdownStrings.text
import typings.semanticUiDropdown.semanticUiDropdownStrings.upward
import typings.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * Sets a default action to occur. (See usage guide)
    *
    * @default 'activate'
    * @see {@link http://semantic-ui.com/modules/dropdown.html#/usage}
    */
  var action: activate | select | combo | nothing | hide | (js.ThisFunction3[
    /* this */ JQuery, 
    /* text */ String, 
    /* value */ String | `false`, 
    /* element */ JQuery, 
    Unit
  ]) = js.native
  /**
    * Whether search selection should allow users to add their own selections, works for single or multi-select.
    *
    * @default false
    */
  var allowAdditions: Boolean = js.native
  /**
    * Whether menu items with sub-menus (categories) should be selectable
    *
    * @default false
    */
  var allowCategorySelection: Boolean = js.native
  /**
    * When set to true will fire onChange even when the value a user select matches the currently selected value.
    *
    * @default false
    */
  var allowReselection: Boolean = js.native
  /**
    * Whether to allow the element to be navigable by keyboard, by automatically creating a tabindex
    *
    * @default true
    */
  var allowTab: Boolean = js.native
  // endregion
  // region Remote Settings
  /**
    * Can be set to an object to specify API settings for retrieving remote selection menu content from an API endpoint
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: `false` | ApiSettings = js.native
  var className: ClassNameSettings = js.native
  /**
    * Element context to use when checking whether can show when keepOnScreen: true
    *
    * @default 'window'
    */
  var context: String | JQuery = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Time in milliseconds to debounce show or hide behavior when on: hover is used, or when touch is used.
    */
  var delay: DelaySettings = js.native
  // endregion
  // region Additional Settings
  /**
    * When set to auto determines direction based on whether dropdown can fit on screen. Set to upward or downward to always force a direction.
    *
    * @default 'auto'
    */
  var direction: auto | upward | downward = js.native
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * List mapping dropdown content to JSON Property when using API
    */
  var fields: FieldsSettings = js.native
  /**
    * When set to true API will be expected to return the complete result set, which will then be filtered clientside to only display matching results.
    *
    * @default false
    * @since 2.2.8
    */
  var filterRemoteData: Boolean = js.native
  /**
    * Whether search selection will force currently selected choice when element is blurred.
    *
    * @default true
    */
  var forceSelection: Boolean = js.native
  /**
    * Specifying to "true" will use a fuzzy full text search, setting to "exact" will force the exact search to be matched somewhere in the string
    *
    * @default false
    */
  var fullTextSearch: Boolean | exact = js.native
  /**
    * Maximum glyph width, used to calculate search size. This is usually size of a "W" in your font in em
    *
    * @default 1.0714
    */
  var glyphWidth: Double = js.native
  /**
    * When disabled user additions will appear in the results menu using a specially formatted selection item formatted by templates.addition.
    *
    * @default true
    */
  var hideAdditions: Boolean = js.native
  /**
    * Whether dropdown should try to keep itself on screen by checking whether menus display position in its context (Default context is page).
    *
    * @default true
    */
  var keepOnScreen: Boolean = js.native
  /**
    * The keycode used to represent keyboard shortcuts. To avoid issues with some foreign languages, you can pass false for comma delimiter's value
    */
  var keys: KeySettings = js.native
  /**
    * Allows customization of multi-select labels
    */
  var label: LabelSettings = js.native
  /**
    * When using search selection specifies how to match values.
    *
    * @default 'both'
    */
  var `match`: both | value | text = js.native
  /**
    * When set to a number, sets the maximum number of selections
    *
    * @default false
    */
  var maxSelections: `false` | Double = js.native
  // endregion
  // region DOM Settings
  /**
    * You can specify site wide messages by modifying $.fn.dropdown.settings.message that will apply on any dropdown if it appears in the page.
    */
  var message: MessageSettings = js.native
  var metadata: MetadataSettings = js.native
  /**
    * The minimum characters for a search to begin showing results
    *
    * @default 1
    */
  var minCharacters: Double = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  // region Frequently Used Settings
  /**
    * Event used to trigger dropdown (Hover, Click, Custom Event)
    *
    * @default 'click'
    */
  var on: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * @default 'auto'
    */
  var placeholder: auto | value | `false` = js.native
  /**
    * Whether HTML included in dropdown values should be preserved. (Allows icons to show up in selected value)
    *
    * @default true
    */
  var preserveHTML: Boolean = js.native
  var regExp: RegExpSettings = js.native
  /**
    * When enabled will automatically store selected name/value pairs in sessionStorage to preserve user selection on page refresh. Disabling will clear remote dropdown values on refresh.
    *
    * @default true
    */
  var saveRemoteData: Boolean = js.native
  /**
    * Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice.
    *
    * @default true
    */
  var selectOnKeydown: Boolean = js.native
  var selector: SelectorSettings = js.native
  /**
    * Whether to show dropdown menu automatically on element focus.
    *
    * @default true
    */
  var showOnFocus: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Whether to sort values when creating a dropdown automatically from a select element.
    *
    * @default false
    */
  var sortSelect: Boolean = js.native
  /**
    * Named transition to use when animating menu in and out.
    * Defaults to slide down or slide up depending on dropdown direction.
    * Fade and slide down are available without including ui transitions
    *
    * @default 'auto'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: auto | String = js.native
  // endregion
  // region Multiple Select Settings
  /**
    * Whether multiselect should use labels. Must be set to true when allowAdditions is true
    *
    * @default true
    */
  var useLabels: Boolean = js.native
  /**
    * When specified allows you to initialize dropdown with specific values. See usage guide for details.
    *
    * @default false
    */
  var values: js.Any = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Is called after a dropdown selection is added using a multiple select dropdown, only receives the added value
    */
  def onAdd(addedValue: js.Any, addedText: String, $addedChoice: JQuery): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Is called after a dropdown value changes. Receives the name and value of selection and the active menu element
    */
  def onChange(value: js.Any, text: String, $choice: JQuery): Unit = js.native
  /**
    * Is called before a dropdown is hidden. If false is returned, dropdown will not be hidden.
    */
  def onHide(): `false` | Unit = js.native
  /**
    * Allows you to modify a label before it is added. Expects the jQ DOM element for a label to be returned.
    */
  def onLabelCreate(value: js.Any, text: String): JQuery = js.native
  /**
    * Called when a label is remove, return false; will prevent the label from being removed.
    */
  def onLabelRemove(value: js.Any): `false` | Unit = js.native
  /**
    * Is called after a label is selected by a user
    */
  def onLabelSelect($selectedLabels: JQuery): Unit = js.native
  /**
    * Is called after a dropdown is searched with no matching values
    */
  def onNoResults(searchValue: js.Any): Unit = js.native
  /**
    * Is called after a dropdown selection is removed using a multiple select dropdown, only receives the removed value
    */
  def onRemove(removedValue: js.Any, removedText: String, $removedChoice: JQuery): Unit = js.native
  /**
    * Is called before a dropdown is shown. If false is returned, dropdown will not be shown.
    */
  def onShow(): `false` | Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    action: activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ]),
    allowAdditions: Boolean,
    allowCategorySelection: Boolean,
    allowReselection: Boolean,
    allowTab: Boolean,
    apiSettings: `false` | ApiSettings,
    className: ClassNameSettings,
    context: String | JQuery,
    debug: Boolean,
    delay: DelaySettings,
    direction: auto | upward | downward,
    duration: Double,
    error: ErrorSettings,
    fields: FieldsSettings,
    filterRemoteData: Boolean,
    forceSelection: Boolean,
    fullTextSearch: Boolean | exact,
    glyphWidth: Double,
    hideAdditions: Boolean,
    keepOnScreen: Boolean,
    keys: KeySettings,
    label: LabelSettings,
    `match`: both | value | text,
    maxSelections: `false` | Double,
    message: MessageSettings,
    metadata: MetadataSettings,
    minCharacters: Double,
    name: String,
    namespace: String,
    on: String,
    onAdd: (js.Any, String, JQuery) => Unit,
    onChange: (js.Any, String, JQuery) => Unit,
    onHide: () => `false` | Unit,
    onLabelCreate: (js.Any, String) => JQuery,
    onLabelRemove: js.Any => `false` | Unit,
    onLabelSelect: JQuery => Unit,
    onNoResults: js.Any => Unit,
    onRemove: (js.Any, String, JQuery) => Unit,
    onShow: () => `false` | Unit,
    performance: Boolean,
    placeholder: auto | value | `false`,
    preserveHTML: Boolean,
    regExp: RegExpSettings,
    saveRemoteData: Boolean,
    selectOnKeydown: Boolean,
    selector: SelectorSettings,
    showOnFocus: Boolean,
    silent: Boolean,
    sortSelect: Boolean,
    transition: auto | String,
    useLabels: Boolean,
    values: js.Any,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowAdditions = allowAdditions.asInstanceOf[js.Any], allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any], allowReselection = allowReselection.asInstanceOf[js.Any], allowTab = allowTab.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], filterRemoteData = filterRemoteData.asInstanceOf[js.Any], forceSelection = forceSelection.asInstanceOf[js.Any], fullTextSearch = fullTextSearch.asInstanceOf[js.Any], glyphWidth = glyphWidth.asInstanceOf[js.Any], hideAdditions = hideAdditions.asInstanceOf[js.Any], keepOnScreen = keepOnScreen.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAdd = js.Any.fromFunction3(onAdd), onChange = js.Any.fromFunction3(onChange), onHide = js.Any.fromFunction0(onHide), onLabelCreate = js.Any.fromFunction2(onLabelCreate), onLabelRemove = js.Any.fromFunction1(onLabelRemove), onLabelSelect = js.Any.fromFunction1(onLabelSelect), onNoResults = js.Any.fromFunction1(onNoResults), onRemove = js.Any.fromFunction3(onRemove), onShow = js.Any.fromFunction0(onShow), performance = performance.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preserveHTML = preserveHTML.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], saveRemoteData = saveRemoteData.asInstanceOf[js.Any], selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showOnFocus = showOnFocus.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], sortSelect = sortSelect.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLabels = useLabels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
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
    def setAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowAdditions(value: Boolean): Self = this.set("allowAdditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowCategorySelection(value: Boolean): Self = this.set("allowCategorySelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowReselection(value: Boolean): Self = this.set("allowReselection", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowTab(value: Boolean): Self = this.set("allowTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiSettings(value: `false` | ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: DelaySettings): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: auto | upward | downward): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: FieldsSettings): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterRemoteData(value: Boolean): Self = this.set("filterRemoteData", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceSelection(value: Boolean): Self = this.set("forceSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTextSearch(value: Boolean | exact): Self = this.set("fullTextSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlyphWidth(value: Double): Self = this.set("glyphWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideAdditions(value: Boolean): Self = this.set("hideAdditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeepOnScreen(value: Boolean): Self = this.set("keepOnScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeys(value: KeySettings): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: LabelSettings): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(value: both | value | text): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSelections(value: `false` | Double): Self = this.set("maxSelections", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: MessageSettings): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAdd(value: (js.Any, String, JQuery) => Unit): Self = this.set("onAdd", js.Any.fromFunction3(value))
    @scala.inline
    def setOnChange(value: (js.Any, String, JQuery) => Unit): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def setOnHide(value: () => `false` | Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def setOnLabelCreate(value: (js.Any, String) => JQuery): Self = this.set("onLabelCreate", js.Any.fromFunction2(value))
    @scala.inline
    def setOnLabelRemove(value: js.Any => `false` | Unit): Self = this.set("onLabelRemove", js.Any.fromFunction1(value))
    @scala.inline
    def setOnLabelSelect(value: JQuery => Unit): Self = this.set("onLabelSelect", js.Any.fromFunction1(value))
    @scala.inline
    def setOnNoResults(value: js.Any => Unit): Self = this.set("onNoResults", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRemove(value: (js.Any, String, JQuery) => Unit): Self = this.set("onRemove", js.Any.fromFunction3(value))
    @scala.inline
    def setOnShow(value: () => `false` | Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: auto | value | `false`): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveHTML(value: Boolean): Self = this.set("preserveHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveRemoteData(value: Boolean): Self = this.set("saveRemoteData", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectOnKeydown(value: Boolean): Self = this.set("selectOnKeydown", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortSelect(value: Boolean): Self = this.set("sortSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: auto | String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseLabels(value: Boolean): Self = this.set("useLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def setValues(value: js.Any): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

