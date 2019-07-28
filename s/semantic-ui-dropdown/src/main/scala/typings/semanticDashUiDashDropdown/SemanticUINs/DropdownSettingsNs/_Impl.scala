package typings.semanticDashUiDashDropdown.SemanticUINs.DropdownSettingsNs

import typings.semanticDashUiDashApi.SemanticUINs.ApiSettings
import typings.semanticDashUiDashDropdown.JQuery
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.ClassNameSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.DelaySettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.ErrorSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.FieldsSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.KeySettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.LabelSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.MessageSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.MetadataSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.RegExpSettings
import typings.semanticDashUiDashDropdown.SemanticUINs.DropdownNs.SelectorSettings
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownNumbers.`false`
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.activate
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.auto
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.both
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.combo
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.downward
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.exact
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.hide
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.nothing
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.select
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.text
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.upward
import typings.semanticDashUiDashDropdown.semanticDashUiDashDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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
  ])
  /**
    * Whether search selection should allow users to add their own selections, works for single or multi-select.
    *
    * @default false
    */
  var allowAdditions: Boolean
  /**
    * Whether menu items with sub-menus (categories) should be selectable
    *
    * @default false
    */
  var allowCategorySelection: Boolean
  /**
    * When set to true will fire onChange even when the value a user select matches the currently selected value.
    *
    * @default false
    */
  var allowReselection: Boolean
  /**
    * Whether to allow the element to be navigable by keyboard, by automatically creating a tabindex
    *
    * @default true
    */
  var allowTab: Boolean
  // endregion
  // region Remote Settings
  /**
    * Can be set to an object to specify API settings for retrieving remote selection menu content from an API endpoint
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: `false` | ApiSettings
  var className: ClassNameSettings
  /**
    * Element context to use when checking whether can show when keepOnScreen: true
    *
    * @default 'window'
    */
  var context: String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * Time in milliseconds to debounce show or hide behavior when on: hover is used, or when touch is used.
    */
  var delay: DelaySettings
  // endregion
  // region Additional Settings
  /**
    * When set to auto determines direction based on whether dropdown can fit on screen. Set to upward or downward to always force a direction.
    *
    * @default 'auto'
    */
  var direction: auto | upward | downward
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * List mapping dropdown content to JSON Property when using API
    */
  var fields: FieldsSettings
  /**
    * When set to true API will be expected to return the complete result set, which will then be filtered clientside to only display matching results.
    *
    * @default false
    * @since 2.2.8
    */
  var filterRemoteData: Boolean
  /**
    * Whether search selection will force currently selected choice when element is blurred.
    *
    * @default true
    */
  var forceSelection: Boolean
  /**
    * Specifying to "true" will use a fuzzy full text search, setting to "exact" will force the exact search to be matched somewhere in the string
    *
    * @default false
    */
  var fullTextSearch: Boolean | exact
  /**
    * Maximum glyph width, used to calculate search size. This is usually size of a "W" in your font in em
    *
    * @default 1.0714
    */
  var glyphWidth: Double
  /**
    * When disabled user additions will appear in the results menu using a specially formatted selection item formatted by templates.addition.
    *
    * @default true
    */
  var hideAdditions: Boolean
  /**
    * Whether dropdown should try to keep itself on screen by checking whether menus display position in its context (Default context is page).
    *
    * @default true
    */
  var keepOnScreen: Boolean
  /**
    * The keycode used to represent keyboard shortcuts. To avoid issues with some foreign languages, you can pass false for comma delimiter's value
    */
  var keys: KeySettings
  /**
    * Allows customization of multi-select labels
    */
  var label: LabelSettings
  /**
    * When using search selection specifies how to match values.
    *
    * @default 'both'
    */
  var `match`: both | value | text
  /**
    * When set to a number, sets the maximum number of selections
    *
    * @default false
    */
  var maxSelections: `false` | Double
  // endregion
  // region DOM Settings
  /**
    * You can specify site wide messages by modifying $.fn.dropdown.settings.message that will apply on any dropdown if it appears in the page.
    */
  var message: MessageSettings
  var metadata: MetadataSettings
  /**
    * The minimum characters for a search to begin showing results
    *
    * @default 1
    */
  var minCharacters: Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  // region Frequently Used Settings
  /**
    * Event used to trigger dropdown (Hover, Click, Custom Event)
    *
    * @default 'click'
    */
  var on: String
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * @default 'auto'
    */
  var placeholder: auto | value | `false`
  /**
    * Whether HTML included in dropdown values should be preserved. (Allows icons to show up in selected value)
    *
    * @default true
    */
  var preserveHTML: Boolean
  var regExp: RegExpSettings
  /**
    * When enabled will automatically store selected name/value pairs in sessionStorage to preserve user selection on page refresh. Disabling will clear remote dropdown values on refresh.
    *
    * @default true
    */
  var saveRemoteData: Boolean
  /**
    * Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice.
    *
    * @default true
    */
  var selectOnKeydown: Boolean
  var selector: SelectorSettings
  /**
    * Whether to show dropdown menu automatically on element focus.
    *
    * @default true
    */
  var showOnFocus: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Whether to sort values when creating a dropdown automatically from a select element.
    *
    * @default false
    */
  var sortSelect: Boolean
  /**
    * Named transition to use when animating menu in and out.
    * Defaults to slide down or slide up depending on dropdown direction.
    * Fade and slide down are available without including ui transitions
    *
    * @default 'auto'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: auto | String
  // endregion
  // region Multiple Select Settings
  /**
    * Whether multiselect should use labels. Must be set to true when allowAdditions is true
    *
    * @default true
    */
  var useLabels: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Is called after a dropdown selection is added using a multiple select dropdown, only receives the added value
    */
  def onAdd(`this`: JQuery, addedValue: js.Any, addedText: String, $addedChoice: JQuery): Unit
  // endregion
  // region Callbacks
  /**
    * Is called after a dropdown value changes. Receives the name and value of selection and the active menu element
    */
  def onChange(`this`: JQuery, value: js.Any, text: String, $choice: JQuery): Unit
  /**
    * Is called before a dropdown is hidden. If false is returned, dropdown will not be hidden.
    */
  def onHide(`this`: JQuery): `false` | Unit
  /**
    * Allows you to modify a label before it is added. Expects the jQ DOM element for a label to be returned.
    */
  def onLabelCreate(`this`: JQuery, value: js.Any, text: String): JQuery
  /**
    * Called when a label is remove, return false; will prevent the label from being removed.
    */
  def onLabelRemove(`this`: JQuery, value: js.Any): `false` | Unit
  /**
    * Is called after a label is selected by a user
    */
  def onLabelSelect(`this`: JQuery, $selectedLabels: JQuery): Unit
  /**
    * Is called after a dropdown is searched with no matching values
    */
  def onNoResults(`this`: JQuery, searchValue: js.Any): Unit
  /**
    * Is called after a dropdown selection is removed using a multiple select dropdown, only receives the removed value
    */
  def onRemove(`this`: JQuery, removedValue: js.Any, removedText: String, $removedChoice: JQuery): Unit
  /**
    * Is called before a dropdown is shown. If false is returned, dropdown will not be shown.
    */
  def onShow(`this`: JQuery): `false` | Unit
}

object _Impl {
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
    onAdd: (JQuery, js.Any, String, JQuery) => Unit,
    onChange: (JQuery, js.Any, String, JQuery) => Unit,
    onHide: JQuery => `false` | Unit,
    onLabelCreate: (JQuery, js.Any, String) => JQuery,
    onLabelRemove: (JQuery, js.Any) => `false` | Unit,
    onLabelSelect: (JQuery, JQuery) => Unit,
    onNoResults: (JQuery, js.Any) => Unit,
    onRemove: (JQuery, js.Any, String, JQuery) => Unit,
    onShow: JQuery => `false` | Unit,
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
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowAdditions = allowAdditions, allowCategorySelection = allowCategorySelection, allowReselection = allowReselection, allowTab = allowTab, apiSettings = apiSettings.asInstanceOf[js.Any], className = className, context = context.asInstanceOf[js.Any], debug = debug, delay = delay, direction = direction.asInstanceOf[js.Any], duration = duration, error = error, fields = fields, filterRemoteData = filterRemoteData, forceSelection = forceSelection, fullTextSearch = fullTextSearch.asInstanceOf[js.Any], glyphWidth = glyphWidth, hideAdditions = hideAdditions, keepOnScreen = keepOnScreen, keys = keys, label = label, maxSelections = maxSelections.asInstanceOf[js.Any], message = message, metadata = metadata, minCharacters = minCharacters, name = name, namespace = namespace, on = on, onAdd = js.Any.fromFunction4(onAdd), onChange = js.Any.fromFunction4(onChange), onHide = js.Any.fromFunction1(onHide), onLabelCreate = js.Any.fromFunction3(onLabelCreate), onLabelRemove = js.Any.fromFunction2(onLabelRemove), onLabelSelect = js.Any.fromFunction2(onLabelSelect), onNoResults = js.Any.fromFunction2(onNoResults), onRemove = js.Any.fromFunction4(onRemove), onShow = js.Any.fromFunction1(onShow), performance = performance, placeholder = placeholder.asInstanceOf[js.Any], preserveHTML = preserveHTML, regExp = regExp, saveRemoteData = saveRemoteData, selectOnKeydown = selectOnKeydown, selector = selector, showOnFocus = showOnFocus, silent = silent, sortSelect = sortSelect, transition = transition.asInstanceOf[js.Any], useLabels = useLabels, verbose = verbose)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Impl]
  }
}

