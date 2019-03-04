package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownSettingsNs

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
  var action: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.activate | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.select | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.combo | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.nothing | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.hide | (js.ThisFunction3[
    /* this */ semanticDashUiDashDropdownLib.JQuery, 
    /* text */ java.lang.String, 
    /* value */ java.lang.String | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false`, 
    /* element */ semanticDashUiDashDropdownLib.JQuery, 
    scala.Unit
  ])
  /**
    * Whether search selection should allow users to add their own selections, works for single or multi-select.
    *
    * @default false
    */
  var allowAdditions: scala.Boolean
  /**
    * Whether menu items with sub-menus (categories) should be selectable
    *
    * @default false
    */
  var allowCategorySelection: scala.Boolean
  /**
    * When set to true will fire onChange even when the value a user select matches the currently selected value.
    *
    * @default false
    */
  var allowReselection: scala.Boolean
  /**
    * Whether to allow the element to be navigable by keyboard, by automatically creating a tabindex
    *
    * @default true
    */
  var allowTab: scala.Boolean
  // endregion
  // region Remote Settings
  /**
    * Can be set to an object to specify API settings for retrieving remote selection menu content from an API endpoint
    *
    * @default false
    * @see {@link http://semantic-ui.com/behaviors/api.html}
    */
  var apiSettings: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | semanticDashUiDashApiLib.SemanticUINs.ApiSettings
  var className: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.ClassNameSettings
  /**
    * Element context to use when checking whether can show when keepOnScreen: true
    *
    * @default 'window'
    */
  var context: java.lang.String | semanticDashUiDashDropdownLib.JQuery
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Time in milliseconds to debounce show or hide behavior when on: hover is used, or when touch is used.
    */
  var delay: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.DelaySettings
  // endregion
  // region Additional Settings
  /**
    * When set to auto determines direction based on whether dropdown can fit on screen. Set to upward or downward to always force a direction.
    *
    * @default 'auto'
    */
  var direction: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.auto | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.upward | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.downward
  /**
    * Duration of animation events
    *
    * @default 200
    */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.ErrorSettings
  /**
    * List mapping dropdown content to JSON Property when using API
    */
  var fields: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.FieldsSettings
  /**
    * When set to true API will be expected to return the complete result set, which will then be filtered clientside to only display matching results.
    *
    * @default false
    * @since 2.2.8
    */
  var filterRemoteData: scala.Boolean
  /**
    * Whether search selection will force currently selected choice when element is blurred.
    *
    * @default true
    */
  var forceSelection: scala.Boolean
  /**
    * Specifying to "true" will use a fuzzy full text search, setting to "exact" will force the exact search to be matched somewhere in the string
    *
    * @default false
    */
  var fullTextSearch: scala.Boolean | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.exact
  /**
    * Maximum glyph width, used to calculate search size. This is usually size of a "W" in your font in em
    *
    * @default 1.0714
    */
  var glyphWidth: scala.Double
  /**
    * When disabled user additions will appear in the results menu using a specially formatted selection item formatted by templates.addition.
    *
    * @default true
    */
  var hideAdditions: scala.Boolean
  /**
    * Whether dropdown should try to keep itself on screen by checking whether menus display position in its context (Default context is page).
    *
    * @default true
    */
  var keepOnScreen: scala.Boolean
  /**
    * The keycode used to represent keyboard shortcuts. To avoid issues with some foreign languages, you can pass false for comma delimiter's value
    */
  var keys: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.KeySettings
  /**
    * Allows customization of multi-select labels
    */
  var label: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.LabelSettings
  /**
    * When using search selection specifies how to match values.
    *
    * @default 'both'
    */
  var `match`: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.both | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.value | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.text
  /**
    * When set to a number, sets the maximum number of selections
    *
    * @default false
    */
  var maxSelections: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Double
  // endregion
  // region DOM Settings
  /**
    * You can specify site wide messages by modifying $.fn.dropdown.settings.message that will apply on any dropdown if it appears in the page.
    */
  var message: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.MessageSettings
  var metadata: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.MetadataSettings
  /**
    * The minimum characters for a search to begin showing results
    *
    * @default 1
    */
  var minCharacters: scala.Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  // region Frequently Used Settings
  /**
    * Event used to trigger dropdown (Hover, Click, Custom Event)
    *
    * @default 'click'
    */
  var on: java.lang.String
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  /**
    * @default 'auto'
    */
  var placeholder: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.auto | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.value | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false`
  /**
    * Whether HTML included in dropdown values should be preserved. (Allows icons to show up in selected value)
    *
    * @default true
    */
  var preserveHTML: scala.Boolean
  var regExp: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.RegExpSettings
  /**
    * When enabled will automatically store selected name/value pairs in sessionStorage to preserve user selection on page refresh. Disabling will clear remote dropdown values on refresh.
    *
    * @default true
    */
  var saveRemoteData: scala.Boolean
  /**
    * Whether dropdown should select new option when using keyboard shortcuts. Setting to false will require enter or left click to confirm a choice.
    *
    * @default true
    */
  var selectOnKeydown: scala.Boolean
  var selector: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.SelectorSettings
  /**
    * Whether to show dropdown menu automatically on element focus.
    *
    * @default true
    */
  var showOnFocus: scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Whether to sort values when creating a dropdown automatically from a select element.
    *
    * @default false
    */
  var sortSelect: scala.Boolean
  /**
    * Named transition to use when animating menu in and out.
    * Defaults to slide down or slide up depending on dropdown direction.
    * Fade and slide down are available without including ui transitions
    *
    * @default 'auto'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.auto | java.lang.String
  // endregion
  // region Multiple Select Settings
  /**
    * Whether multiselect should use labels. Must be set to true when allowAdditions is true
    *
    * @default true
    */
  var useLabels: scala.Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Is called after a dropdown selection is added using a multiple select dropdown, only receives the added value
    */
  def onAdd(
    `this`: semanticDashUiDashDropdownLib.JQuery,
    addedValue: js.Any,
    addedText: java.lang.String,
    $addedChoice: semanticDashUiDashDropdownLib.JQuery
  ): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Is called after a dropdown value changes. Receives the name and value of selection and the active menu element
    */
  def onChange(
    `this`: semanticDashUiDashDropdownLib.JQuery,
    value: js.Any,
    text: java.lang.String,
    $choice: semanticDashUiDashDropdownLib.JQuery
  ): scala.Unit
  /**
    * Is called before a dropdown is hidden. If false is returned, dropdown will not be hidden.
    */
  def onHide(`this`: semanticDashUiDashDropdownLib.JQuery): semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Unit
  /**
    * Allows you to modify a label before it is added. Expects the jQ DOM element for a label to be returned.
    */
  def onLabelCreate(`this`: semanticDashUiDashDropdownLib.JQuery, value: js.Any, text: java.lang.String): semanticDashUiDashDropdownLib.JQuery
  /**
    * Called when a label is remove, return false; will prevent the label from being removed.
    */
  def onLabelRemove(`this`: semanticDashUiDashDropdownLib.JQuery, value: js.Any): semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Unit
  /**
    * Is called after a label is selected by a user
    */
  def onLabelSelect(
    `this`: semanticDashUiDashDropdownLib.JQuery,
    $selectedLabels: semanticDashUiDashDropdownLib.JQuery
  ): scala.Unit
  /**
    * Is called after a dropdown is searched with no matching values
    */
  def onNoResults(`this`: semanticDashUiDashDropdownLib.JQuery, searchValue: js.Any): scala.Unit
  /**
    * Is called after a dropdown selection is removed using a multiple select dropdown, only receives the removed value
    */
  def onRemove(
    `this`: semanticDashUiDashDropdownLib.JQuery,
    removedValue: js.Any,
    removedText: java.lang.String,
    $removedChoice: semanticDashUiDashDropdownLib.JQuery
  ): scala.Unit
  /**
    * Is called before a dropdown is shown. If false is returned, dropdown will not be shown.
    */
  def onShow(`this`: semanticDashUiDashDropdownLib.JQuery): semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    action: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.activate | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.select | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.combo | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.nothing | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.hide | (js.ThisFunction3[
      /* this */ semanticDashUiDashDropdownLib.JQuery, 
      /* text */ java.lang.String, 
      /* value */ java.lang.String | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false`, 
      /* element */ semanticDashUiDashDropdownLib.JQuery, 
      scala.Unit
    ]),
    allowAdditions: scala.Boolean,
    allowCategorySelection: scala.Boolean,
    allowReselection: scala.Boolean,
    allowTab: scala.Boolean,
    apiSettings: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | semanticDashUiDashApiLib.SemanticUINs.ApiSettings,
    className: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.ClassNameSettings,
    context: java.lang.String | semanticDashUiDashDropdownLib.JQuery,
    debug: scala.Boolean,
    delay: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.DelaySettings,
    direction: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.auto | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.upward | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.downward,
    duration: scala.Double,
    error: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.ErrorSettings,
    fields: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.FieldsSettings,
    filterRemoteData: scala.Boolean,
    forceSelection: scala.Boolean,
    fullTextSearch: scala.Boolean | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.exact,
    glyphWidth: scala.Double,
    hideAdditions: scala.Boolean,
    keepOnScreen: scala.Boolean,
    keys: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.KeySettings,
    label: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.LabelSettings,
    `match`: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.both | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.value | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.text,
    maxSelections: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Double,
    message: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.MessageSettings,
    metadata: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.MetadataSettings,
    minCharacters: scala.Double,
    name: java.lang.String,
    namespace: java.lang.String,
    on: java.lang.String,
    onAdd: js.Function4[
      semanticDashUiDashDropdownLib.JQuery, 
      js.Any, 
      java.lang.String, 
      semanticDashUiDashDropdownLib.JQuery, 
      scala.Unit
    ],
    onChange: js.Function4[
      semanticDashUiDashDropdownLib.JQuery, 
      js.Any, 
      java.lang.String, 
      semanticDashUiDashDropdownLib.JQuery, 
      scala.Unit
    ],
    onHide: js.Function1[
      semanticDashUiDashDropdownLib.JQuery, 
      semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Unit
    ],
    onLabelCreate: js.Function3[
      semanticDashUiDashDropdownLib.JQuery, 
      js.Any, 
      java.lang.String, 
      semanticDashUiDashDropdownLib.JQuery
    ],
    onLabelRemove: js.Function2[
      semanticDashUiDashDropdownLib.JQuery, 
      js.Any, 
      semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Unit
    ],
    onLabelSelect: js.Function2[
      semanticDashUiDashDropdownLib.JQuery, 
      semanticDashUiDashDropdownLib.JQuery, 
      scala.Unit
    ],
    onNoResults: js.Function2[semanticDashUiDashDropdownLib.JQuery, js.Any, scala.Unit],
    onRemove: js.Function4[
      semanticDashUiDashDropdownLib.JQuery, 
      js.Any, 
      java.lang.String, 
      semanticDashUiDashDropdownLib.JQuery, 
      scala.Unit
    ],
    onShow: js.Function1[
      semanticDashUiDashDropdownLib.JQuery, 
      semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false` | scala.Unit
    ],
    performance: scala.Boolean,
    placeholder: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.auto | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.value | semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibNumbers.`false`,
    preserveHTML: scala.Boolean,
    regExp: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.RegExpSettings,
    saveRemoteData: scala.Boolean,
    selectOnKeydown: scala.Boolean,
    selector: semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.SelectorSettings,
    showOnFocus: scala.Boolean,
    silent: scala.Boolean,
    sortSelect: scala.Boolean,
    transition: semanticDashUiDashDropdownLib.semanticDashUiDashDropdownLibStrings.auto | java.lang.String,
    useLabels: scala.Boolean,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowAdditions = allowAdditions, allowCategorySelection = allowCategorySelection, allowReselection = allowReselection, allowTab = allowTab, apiSettings = apiSettings.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug, delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration, error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], filterRemoteData = filterRemoteData, forceSelection = forceSelection, fullTextSearch = fullTextSearch.asInstanceOf[js.Any], glyphWidth = glyphWidth, hideAdditions = hideAdditions, keepOnScreen = keepOnScreen, keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters, name = name, namespace = namespace, on = on, onAdd = onAdd, onChange = onChange, onHide = onHide, onLabelCreate = onLabelCreate, onLabelRemove = onLabelRemove, onLabelSelect = onLabelSelect, onNoResults = onNoResults, onRemove = onRemove, onShow = onShow, performance = performance, placeholder = placeholder.asInstanceOf[js.Any], preserveHTML = preserveHTML, regExp = regExp, saveRemoteData = saveRemoteData, selectOnKeydown = selectOnKeydown, selector = selector.asInstanceOf[js.Any], showOnFocus = showOnFocus, silent = silent, sortSelect = sortSelect, transition = transition.asInstanceOf[js.Any], useLabels = useLabels, verbose = verbose)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Impl]
  }
}

