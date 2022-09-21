package typings.semanticUiDropdown.SemanticUI

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownSettings {
  
  trait Impl extends StObject {
    
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
      * Is called after a dropdown selection is added using a multiple select dropdown, only receives the added value
      */
    def onAdd(addedValue: Any, addedText: String, $addedChoice: JQuery): Unit
    
    // endregion
    // region Callbacks
    /**
      * Is called after a dropdown value changes. Receives the name and value of selection and the active menu element
      */
    def onChange(value: Any, text: String, $choice: JQuery): Unit
    
    /**
      * Is called before a dropdown is hidden. If false is returned, dropdown will not be hidden.
      */
    def onHide(): `false` | Unit
    
    /**
      * Allows you to modify a label before it is added. Expects the jQ DOM element for a label to be returned.
      */
    def onLabelCreate(value: Any, text: String): JQuery
    
    /**
      * Called when a label is remove, return false; will prevent the label from being removed.
      */
    def onLabelRemove(value: Any): `false` | Unit
    
    /**
      * Is called after a label is selected by a user
      */
    def onLabelSelect($selectedLabels: JQuery): Unit
    
    /**
      * Is called after a dropdown is searched with no matching values
      */
    def onNoResults(searchValue: Any): Unit
    
    /**
      * Is called after a dropdown selection is removed using a multiple select dropdown, only receives the removed value
      */
    def onRemove(removedValue: Any, removedText: String, $removedChoice: JQuery): Unit
    
    /**
      * Is called before a dropdown is shown. If false is returned, dropdown will not be shown.
      */
    def onShow(): `false` | Unit
    
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
      * When specified allows you to initialize dropdown with specific values. See usage guide for details.
      *
      * @default false
      */
    var values: Any
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
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
      onAdd: (Any, String, JQuery) => Unit,
      onChange: (Any, String, JQuery) => Unit,
      onHide: () => `false` | Unit,
      onLabelCreate: (Any, String) => JQuery,
      onLabelRemove: Any => `false` | Unit,
      onLabelSelect: JQuery => Unit,
      onNoResults: Any => Unit,
      onRemove: (Any, String, JQuery) => Unit,
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
      values: Any,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowAdditions = allowAdditions.asInstanceOf[js.Any], allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any], allowReselection = allowReselection.asInstanceOf[js.Any], allowTab = allowTab.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], filterRemoteData = filterRemoteData.asInstanceOf[js.Any], forceSelection = forceSelection.asInstanceOf[js.Any], fullTextSearch = fullTextSearch.asInstanceOf[js.Any], glyphWidth = glyphWidth.asInstanceOf[js.Any], hideAdditions = hideAdditions.asInstanceOf[js.Any], keepOnScreen = keepOnScreen.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxSelections = maxSelections.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onAdd = js.Any.fromFunction3(onAdd), onChange = js.Any.fromFunction3(onChange), onHide = js.Any.fromFunction0(onHide), onLabelCreate = js.Any.fromFunction2(onLabelCreate), onLabelRemove = js.Any.fromFunction1(onLabelRemove), onLabelSelect = js.Any.fromFunction1(onLabelSelect), onNoResults = js.Any.fromFunction1(onNoResults), onRemove = js.Any.fromFunction3(onRemove), onShow = js.Any.fromFunction0(onShow), performance = performance.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], preserveHTML = preserveHTML.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], saveRemoteData = saveRemoteData.asInstanceOf[js.Any], selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showOnFocus = showOnFocus.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], sortSelect = sortSelect.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLabels = useLabels.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setAction(
        value: activate | select | combo | nothing | hide | (js.ThisFunction3[
              /* this */ JQuery, 
              /* text */ String, 
              /* value */ String | `false`, 
              /* element */ JQuery, 
              Unit
            ])
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAllowAdditions(value: Boolean): Self = StObject.set(x, "allowAdditions", value.asInstanceOf[js.Any])
      
      inline def setAllowCategorySelection(value: Boolean): Self = StObject.set(x, "allowCategorySelection", value.asInstanceOf[js.Any])
      
      inline def setAllowReselection(value: Boolean): Self = StObject.set(x, "allowReselection", value.asInstanceOf[js.Any])
      
      inline def setAllowTab(value: Boolean): Self = StObject.set(x, "allowTab", value.asInstanceOf[js.Any])
      
      inline def setApiSettings(value: `false` | ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: auto | upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFilterRemoteData(value: Boolean): Self = StObject.set(x, "filterRemoteData", value.asInstanceOf[js.Any])
      
      inline def setForceSelection(value: Boolean): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
      
      inline def setFullTextSearch(value: Boolean | exact): Self = StObject.set(x, "fullTextSearch", value.asInstanceOf[js.Any])
      
      inline def setGlyphWidth(value: Double): Self = StObject.set(x, "glyphWidth", value.asInstanceOf[js.Any])
      
      inline def setHideAdditions(value: Boolean): Self = StObject.set(x, "hideAdditions", value.asInstanceOf[js.Any])
      
      inline def setKeepOnScreen(value: Boolean): Self = StObject.set(x, "keepOnScreen", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: KeySettings): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: LabelSettings): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: both | value | text): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMaxSelections(value: `false` | Double): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: MessageSettings): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnAdd(value: (Any, String, JQuery) => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction3(value))
      
      inline def setOnChange(value: (Any, String, JQuery) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnHide(value: () => `false` | Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnLabelCreate(value: (Any, String) => JQuery): Self = StObject.set(x, "onLabelCreate", js.Any.fromFunction2(value))
      
      inline def setOnLabelRemove(value: Any => `false` | Unit): Self = StObject.set(x, "onLabelRemove", js.Any.fromFunction1(value))
      
      inline def setOnLabelSelect(value: JQuery => Unit): Self = StObject.set(x, "onLabelSelect", js.Any.fromFunction1(value))
      
      inline def setOnNoResults(value: Any => Unit): Self = StObject.set(x, "onNoResults", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: (Any, String, JQuery) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction3(value))
      
      inline def setOnShow(value: () => `false` | Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: auto | value | `false`): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPreserveHTML(value: Boolean): Self = StObject.set(x, "preserveHTML", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setSaveRemoteData(value: Boolean): Self = StObject.set(x, "saveRemoteData", value.asInstanceOf[js.Any])
      
      inline def setSelectOnKeydown(value: Boolean): Self = StObject.set(x, "selectOnKeydown", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSortSelect(value: Boolean): Self = StObject.set(x, "sortSelect", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: auto | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setUseLabels(value: Boolean): Self = StObject.set(x, "useLabels", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiDropdown.anon.PickImplonPartialPickImpl
    - typings.semanticUiDropdown.anon.PickImplvaluesPartialPick
    - typings.semanticUiDropdown.anon.PickImplallowReselectionP
    - typings.semanticUiDropdown.anon.PickImplallowAdditionsPar
    - typings.semanticUiDropdown.anon.PickImplhideAdditionsPart
    - typings.semanticUiDropdown.anon.PickImplactionPartialPick
    - typings.semanticUiDropdown.anon.PickImplminCharactersPart
    - typings.semanticUiDropdown.anon.PickImplmatchPartialPickI
    - typings.semanticUiDropdown.anon.PickImplselectOnKeydownPa
    - typings.semanticUiDropdown.anon.PickImplforceSelectionPar
    - typings.semanticUiDropdown.anon.PickImplallowCategorySele
    - typings.semanticUiDropdown.anon.PickImplplaceholderPartia
    - typings.semanticUiDropdown.anon.PickImplapiSettingsPartia
    - typings.semanticUiDropdown.anon.PickImplfieldsPartialPick
    - typings.semanticUiDropdown.anon.PickImplsaveRemoteDataPar
    - typings.semanticUiDropdown.anon.PickImplfilterRemoteDataP
    - typings.semanticUiDropdown.anon.PickImpluseLabelsPartialP
    - typings.semanticUiDropdown.anon.PickImplmaxSelectionsPart
    - typings.semanticUiDropdown.anon.PickImplglyphWidthPartial
    - typings.semanticUiDropdown.anon.PickImpllabelPartialPickI
    - typings.semanticUiDropdown.anon.PickImpldirectionPartialP
    - typings.semanticUiDropdown.anon.PickImplkeepOnScreenParti
    - typings.semanticUiDropdown.anon.PickImplcontextPartialPic
    - typings.semanticUiDropdown.anon.PickImplfullTextSearchPar
    - typings.semanticUiDropdown.anon.PickImplpreserveHTMLParti
    - typings.semanticUiDropdown.anon.PickImplsortSelectPartial
    - typings.semanticUiDropdown.anon.PickImplshowOnFocusPartia
    - typings.semanticUiDropdown.anon.PickImplallowTabPartialPi
    - typings.semanticUiDropdown.anon.PickImpltransitionPartial
    - typings.semanticUiDropdown.anon.PickImpldurationPartialPi
    - typings.semanticUiDropdown.anon.PickImplkeysPartialPickIm
    - typings.semanticUiDropdown.anon.PickImpldelayPartialPickI
    - typings.semanticUiDropdown.anon.PickImplonChangePartialPi
    - typings.semanticUiDropdown.anon.PickImplonAddPartialPickI
    - typings.semanticUiDropdown.anon.PickImplonRemovePartialPi
    - typings.semanticUiDropdown.anon.PickImplonLabelCreatePart
    - typings.semanticUiDropdown.anon.PickImplonLabelRemovePart
    - typings.semanticUiDropdown.anon.PickImplonLabelSelectPart
    - typings.semanticUiDropdown.anon.PickImplonNoResultsPartia
    - typings.semanticUiDropdown.anon.PickImplonShowPartialPick
    - typings.semanticUiDropdown.anon.PickImplonHidePartialPick
    - typings.semanticUiDropdown.anon.PickImplmessagePartialPic
    - typings.semanticUiDropdown.anon.PickImplselectorPartialPi
    - typings.semanticUiDropdown.anon.PickImplregExpPartialPick
    - typings.semanticUiDropdown.anon.PickImplmetadataPartialPi
    - typings.semanticUiDropdown.anon.PickImplclassNamePartialP
    - typings.semanticUiDropdown.anon.PickImplerrorPartialPickI
    - typings.semanticUiDropdown.anon.PickImplnamespacePartialP
    - typings.semanticUiDropdown.anon.PickImplnamePartialPickIm
    - typings.semanticUiDropdown.anon.PickImplsilentPartialPick
    - typings.semanticUiDropdown.anon.PickImpldebugPartialPickI
    - typings.semanticUiDropdown.anon.PickImplperformancePartia
    - typings.semanticUiDropdown.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplactionPartialPick(
      action: (activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])) & (js.UndefOr[
          activate | select | combo | nothing | hide | (js.ThisFunction3[
            /* this */ JQuery, 
            /* text */ String, 
            /* value */ String | `false`, 
            /* element */ JQuery, 
            Unit
          ])
        ])
    ): typings.semanticUiDropdown.anon.PickImplactionPartialPick = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplactionPartialPick]
    }
    
    inline def PickImplallowAdditionsPar(allowAdditions: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplallowAdditionsPar = {
      val __obj = js.Dynamic.literal(allowAdditions = allowAdditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplallowAdditionsPar]
    }
    
    inline def PickImplallowCategorySele(allowCategorySelection: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplallowCategorySele = {
      val __obj = js.Dynamic.literal(allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplallowCategorySele]
    }
    
    inline def PickImplallowReselectionP(allowReselection: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplallowReselectionP = {
      val __obj = js.Dynamic.literal(allowReselection = allowReselection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplallowReselectionP]
    }
    
    inline def PickImplallowTabPartialPi(allowTab: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplallowTabPartialPi = {
      val __obj = js.Dynamic.literal(allowTab = allowTab.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplallowTabPartialPi]
    }
    
    inline def PickImplapiSettingsPartia(apiSettings: (`false` | ApiSettings) & (js.UndefOr[`false` | ApiSettings])): typings.semanticUiDropdown.anon.PickImplapiSettingsPartia = {
      val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplapiSettingsPartia]
    }
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typings.semanticUiDropdown.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplcontextPartialPic(context: (String | JQuery) & (js.UndefOr[String | JQuery])): typings.semanticUiDropdown.anon.PickImplcontextPartialPic = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplcontextPartialPic]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldelayPartialPickI(delay: DelaySettings & js.UndefOr[DelaySettings]): typings.semanticUiDropdown.anon.PickImpldelayPartialPickI = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldelayPartialPickI]
    }
    
    inline def PickImpldirectionPartialP(direction: (auto | upward | downward) & (js.UndefOr[auto | upward | downward])): typings.semanticUiDropdown.anon.PickImpldirectionPartialP = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldirectionPartialP]
    }
    
    inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typings.semanticUiDropdown.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typings.semanticUiDropdown.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplfieldsPartialPick(fields: FieldsSettings & js.UndefOr[FieldsSettings]): typings.semanticUiDropdown.anon.PickImplfieldsPartialPick = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplfieldsPartialPick]
    }
    
    inline def PickImplfilterRemoteDataP(filterRemoteData: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplfilterRemoteDataP = {
      val __obj = js.Dynamic.literal(filterRemoteData = filterRemoteData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplfilterRemoteDataP]
    }
    
    inline def PickImplforceSelectionPar(forceSelection: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplforceSelectionPar = {
      val __obj = js.Dynamic.literal(forceSelection = forceSelection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplforceSelectionPar]
    }
    
    inline def PickImplfullTextSearchPar(fullTextSearch: (Boolean | exact) & (js.UndefOr[Boolean | exact])): typings.semanticUiDropdown.anon.PickImplfullTextSearchPar = {
      val __obj = js.Dynamic.literal(fullTextSearch = fullTextSearch.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplfullTextSearchPar]
    }
    
    inline def PickImplglyphWidthPartial(glyphWidth: Double & js.UndefOr[Double]): typings.semanticUiDropdown.anon.PickImplglyphWidthPartial = {
      val __obj = js.Dynamic.literal(glyphWidth = glyphWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplglyphWidthPartial]
    }
    
    inline def PickImplhideAdditionsPart(hideAdditions: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplhideAdditionsPart = {
      val __obj = js.Dynamic.literal(hideAdditions = hideAdditions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplhideAdditionsPart]
    }
    
    inline def PickImplkeepOnScreenParti(keepOnScreen: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplkeepOnScreenParti = {
      val __obj = js.Dynamic.literal(keepOnScreen = keepOnScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplkeepOnScreenParti]
    }
    
    inline def PickImplkeysPartialPickIm(keys: KeySettings & js.UndefOr[KeySettings]): typings.semanticUiDropdown.anon.PickImplkeysPartialPickIm = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplkeysPartialPickIm]
    }
    
    inline def PickImpllabelPartialPickI(label: LabelSettings & js.UndefOr[LabelSettings]): typings.semanticUiDropdown.anon.PickImpllabelPartialPickI = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpllabelPartialPickI]
    }
    
    inline def PickImplmatchPartialPickI(`match`: (both | value | text) & (js.UndefOr[both | value | text])): typings.semanticUiDropdown.anon.PickImplmatchPartialPickI = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmatchPartialPickI]
    }
    
    inline def PickImplmaxSelectionsPart(maxSelections: (`false` | Double) & (js.UndefOr[`false` | Double])): typings.semanticUiDropdown.anon.PickImplmaxSelectionsPart = {
      val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmaxSelectionsPart]
    }
    
    inline def PickImplmessagePartialPic(message: MessageSettings & js.UndefOr[MessageSettings]): typings.semanticUiDropdown.anon.PickImplmessagePartialPic = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmessagePartialPic]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typings.semanticUiDropdown.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplminCharactersPart(minCharacters: Double & js.UndefOr[Double]): typings.semanticUiDropdown.anon.PickImplminCharactersPart = {
      val __obj = js.Dynamic.literal(minCharacters = minCharacters.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplminCharactersPart]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typings.semanticUiDropdown.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typings.semanticUiDropdown.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonAddPartialPickI(
      onAdd: (js.ThisFunction3[
          /* this */ JQuery, 
          /* addedValue */ Any, 
          /* addedText */ String, 
          /* $addedChoice */ JQuery, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ JQuery, 
            /* addedValue */ Any, 
            /* addedText */ String, 
            /* $addedChoice */ JQuery, 
            Unit
          ]
        ])
    ): typings.semanticUiDropdown.anon.PickImplonAddPartialPickI = {
      val __obj = js.Dynamic.literal(onAdd = onAdd.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonAddPartialPickI]
    }
    
    inline def PickImplonChangePartialPi(
      onChange: (js.ThisFunction3[/* this */ JQuery, /* value */ Any, /* text */ String, /* $choice */ JQuery, Unit]) & (js.UndefOr[
          js.ThisFunction3[/* this */ JQuery, /* value */ Any, /* text */ String, /* $choice */ JQuery, Unit]
        ])
    ): typings.semanticUiDropdown.anon.PickImplonChangePartialPi = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonChangePartialPi]
    }
    
    inline def PickImplonHidePartialPick(
      onHide: (js.ThisFunction0[/* this */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]])
    ): typings.semanticUiDropdown.anon.PickImplonHidePartialPick = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonHidePartialPick]
    }
    
    inline def PickImplonLabelCreatePart(
      onLabelCreate: (js.ThisFunction2[/* this */ JQuery, /* value */ Any, /* text */ String, JQuery]) & (js.UndefOr[js.ThisFunction2[/* this */ JQuery, /* value */ Any, /* text */ String, JQuery]])
    ): typings.semanticUiDropdown.anon.PickImplonLabelCreatePart = {
      val __obj = js.Dynamic.literal(onLabelCreate = onLabelCreate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonLabelCreatePart]
    }
    
    inline def PickImplonLabelRemovePart(
      onLabelRemove: (js.ThisFunction1[/* this */ JQuery, /* value */ Any, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Any, `false` | Unit]])
    ): typings.semanticUiDropdown.anon.PickImplonLabelRemovePart = {
      val __obj = js.Dynamic.literal(onLabelRemove = onLabelRemove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonLabelRemovePart]
    }
    
    inline def PickImplonLabelSelectPart(
      onLabelSelect: (js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]])
    ): typings.semanticUiDropdown.anon.PickImplonLabelSelectPart = {
      val __obj = js.Dynamic.literal(onLabelSelect = onLabelSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonLabelSelectPart]
    }
    
    inline def PickImplonNoResultsPartia(
      onNoResults: (js.ThisFunction1[/* this */ JQuery, /* searchValue */ Any, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* searchValue */ Any, Unit]])
    ): typings.semanticUiDropdown.anon.PickImplonNoResultsPartia = {
      val __obj = js.Dynamic.literal(onNoResults = onNoResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonNoResultsPartia]
    }
    
    inline def PickImplonPartialPickImpl(on: String & js.UndefOr[String]): typings.semanticUiDropdown.anon.PickImplonPartialPickImpl = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonPartialPickImpl]
    }
    
    inline def PickImplonRemovePartialPi(
      onRemove: (js.ThisFunction3[
          /* this */ JQuery, 
          /* removedValue */ Any, 
          /* removedText */ String, 
          /* $removedChoice */ JQuery, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction3[
            /* this */ JQuery, 
            /* removedValue */ Any, 
            /* removedText */ String, 
            /* $removedChoice */ JQuery, 
            Unit
          ]
        ])
    ): typings.semanticUiDropdown.anon.PickImplonRemovePartialPi = {
      val __obj = js.Dynamic.literal(onRemove = onRemove.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonRemovePartialPi]
    }
    
    inline def PickImplonShowPartialPick(
      onShow: (js.ThisFunction0[/* this */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]])
    ): typings.semanticUiDropdown.anon.PickImplonShowPartialPick = {
      val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplonShowPartialPick]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplperformancePartia]
    }
    
    inline def PickImplplaceholderPartia(placeholder: (auto | value | `false`) & (js.UndefOr[auto | value | `false`])): typings.semanticUiDropdown.anon.PickImplplaceholderPartia = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplplaceholderPartia]
    }
    
    inline def PickImplpreserveHTMLParti(preserveHTML: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplpreserveHTMLParti = {
      val __obj = js.Dynamic.literal(preserveHTML = preserveHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplpreserveHTMLParti]
    }
    
    inline def PickImplregExpPartialPick(regExp: RegExpSettings & js.UndefOr[RegExpSettings]): typings.semanticUiDropdown.anon.PickImplregExpPartialPick = {
      val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplregExpPartialPick]
    }
    
    inline def PickImplsaveRemoteDataPar(saveRemoteData: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplsaveRemoteDataPar = {
      val __obj = js.Dynamic.literal(saveRemoteData = saveRemoteData.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsaveRemoteDataPar]
    }
    
    inline def PickImplselectOnKeydownPa(selectOnKeydown: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplselectOnKeydownPa = {
      val __obj = js.Dynamic.literal(selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplselectOnKeydownPa]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typings.semanticUiDropdown.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplshowOnFocusPartia(showOnFocus: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplshowOnFocusPartia = {
      val __obj = js.Dynamic.literal(showOnFocus = showOnFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplshowOnFocusPartia]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImplsortSelectPartial(sortSelect: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplsortSelectPartial = {
      val __obj = js.Dynamic.literal(sortSelect = sortSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplsortSelectPartial]
    }
    
    inline def PickImpltransitionPartial(transition: (auto | String) & (js.UndefOr[auto | String])): typings.semanticUiDropdown.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpltransitionPartial]
    }
    
    inline def PickImpluseLabelsPartialP(useLabels: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImpluseLabelsPartialP = {
      val __obj = js.Dynamic.literal(useLabels = useLabels.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImpluseLabelsPartialP]
    }
    
    inline def PickImplvaluesPartialPick(values: Any & js.UndefOr[Any]): typings.semanticUiDropdown.anon.PickImplvaluesPartialPick = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplvaluesPartialPick]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typings.semanticUiDropdown.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.semanticUiDropdown.anon.PickImplverbosePartialPic]
    }
  }
}
