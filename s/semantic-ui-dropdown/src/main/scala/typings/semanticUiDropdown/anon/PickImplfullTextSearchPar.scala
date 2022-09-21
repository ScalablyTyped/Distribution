package typings.semanticUiDropdown.anon

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
import typings.semanticUiDropdown.SemanticUI.DropdownSettings.Param
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

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'fullTextSearch'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl>> */
trait PickImplfullTextSearchPar
  extends StObject
     with Param {
  
  var action: js.UndefOr[
    activate | select | combo | nothing | hide | (js.ThisFunction3[
      /* this */ JQuery, 
      /* text */ String, 
      /* value */ String | `false`, 
      /* element */ JQuery, 
      Unit
    ])
  ] = js.undefined
  
  var allowAdditions: js.UndefOr[Boolean] = js.undefined
  
  var allowCategorySelection: js.UndefOr[Boolean] = js.undefined
  
  var allowReselection: js.UndefOr[Boolean] = js.undefined
  
  var allowTab: js.UndefOr[Boolean] = js.undefined
  
  var apiSettings: js.UndefOr[`false` | ApiSettings] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var context: js.UndefOr[String | JQuery] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var delay: js.UndefOr[DelaySettings] = js.undefined
  
  var direction: js.UndefOr[auto | upward | downward] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var fields: js.UndefOr[FieldsSettings] = js.undefined
  
  var filterRemoteData: js.UndefOr[Boolean] = js.undefined
  
  var forceSelection: js.UndefOr[Boolean] = js.undefined
  
  var fullTextSearch: (Boolean | exact) & (js.UndefOr[Boolean | exact])
  
  var glyphWidth: js.UndefOr[Double] = js.undefined
  
  var hideAdditions: js.UndefOr[Boolean] = js.undefined
  
  var keepOnScreen: js.UndefOr[Boolean] = js.undefined
  
  var keys: js.UndefOr[KeySettings] = js.undefined
  
  var label: js.UndefOr[LabelSettings] = js.undefined
  
  var `match`: js.UndefOr[both | value | text] = js.undefined
  
  var maxSelections: js.UndefOr[`false` | Double] = js.undefined
  
  var message: js.UndefOr[MessageSettings] = js.undefined
  
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  
  var minCharacters: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var on: js.UndefOr[String] = js.undefined
  
  var onAdd: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* addedValue */ Any, 
      /* addedText */ String, 
      /* $addedChoice */ JQuery, 
      Unit
    ]
  ] = js.undefined
  
  var onChange: js.UndefOr[
    js.ThisFunction3[/* this */ JQuery, /* value */ Any, /* text */ String, /* $choice */ JQuery, Unit]
  ] = js.undefined
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.undefined
  
  var onLabelCreate: js.UndefOr[js.ThisFunction2[/* this */ JQuery, /* value */ Any, /* text */ String, JQuery]] = js.undefined
  
  var onLabelRemove: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* value */ Any, `false` | Unit]] = js.undefined
  
  var onLabelSelect: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]] = js.undefined
  
  var onNoResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* searchValue */ Any, Unit]] = js.undefined
  
  var onRemove: js.UndefOr[
    js.ThisFunction3[
      /* this */ JQuery, 
      /* removedValue */ Any, 
      /* removedText */ String, 
      /* $removedChoice */ JQuery, 
      Unit
    ]
  ] = js.undefined
  
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, `false` | Unit]] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[auto | value | `false`] = js.undefined
  
  var preserveHTML: js.UndefOr[Boolean] = js.undefined
  
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  
  var saveRemoteData: js.UndefOr[Boolean] = js.undefined
  
  var selectOnKeydown: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var sortSelect: js.UndefOr[Boolean] = js.undefined
  
  var transition: js.UndefOr[auto | String] = js.undefined
  
  var useLabels: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[Any] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplfullTextSearchPar {
  
  inline def apply(fullTextSearch: (Boolean | exact) & (js.UndefOr[Boolean | exact])): PickImplfullTextSearchPar = {
    val __obj = js.Dynamic.literal(fullTextSearch = fullTextSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfullTextSearchPar]
  }
  
  extension [Self <: PickImplfullTextSearchPar](x: Self) {
    
    inline def setAction(
      value: activate | select | combo | nothing | hide | (js.ThisFunction3[
          /* this */ JQuery, 
          /* text */ String, 
          /* value */ String | `false`, 
          /* element */ JQuery, 
          Unit
        ])
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllowAdditions(value: Boolean): Self = StObject.set(x, "allowAdditions", value.asInstanceOf[js.Any])
    
    inline def setAllowAdditionsUndefined: Self = StObject.set(x, "allowAdditions", js.undefined)
    
    inline def setAllowCategorySelection(value: Boolean): Self = StObject.set(x, "allowCategorySelection", value.asInstanceOf[js.Any])
    
    inline def setAllowCategorySelectionUndefined: Self = StObject.set(x, "allowCategorySelection", js.undefined)
    
    inline def setAllowReselection(value: Boolean): Self = StObject.set(x, "allowReselection", value.asInstanceOf[js.Any])
    
    inline def setAllowReselectionUndefined: Self = StObject.set(x, "allowReselection", js.undefined)
    
    inline def setAllowTab(value: Boolean): Self = StObject.set(x, "allowTab", value.asInstanceOf[js.Any])
    
    inline def setAllowTabUndefined: Self = StObject.set(x, "allowTab", js.undefined)
    
    inline def setApiSettings(value: `false` | ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
    
    inline def setApiSettingsUndefined: Self = StObject.set(x, "apiSettings", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDelay(value: DelaySettings): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDirection(value: auto | upward | downward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFilterRemoteData(value: Boolean): Self = StObject.set(x, "filterRemoteData", value.asInstanceOf[js.Any])
    
    inline def setFilterRemoteDataUndefined: Self = StObject.set(x, "filterRemoteData", js.undefined)
    
    inline def setForceSelection(value: Boolean): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
    
    inline def setForceSelectionUndefined: Self = StObject.set(x, "forceSelection", js.undefined)
    
    inline def setFullTextSearch(value: (Boolean | exact) & (js.UndefOr[Boolean | exact])): Self = StObject.set(x, "fullTextSearch", value.asInstanceOf[js.Any])
    
    inline def setGlyphWidth(value: Double): Self = StObject.set(x, "glyphWidth", value.asInstanceOf[js.Any])
    
    inline def setGlyphWidthUndefined: Self = StObject.set(x, "glyphWidth", js.undefined)
    
    inline def setHideAdditions(value: Boolean): Self = StObject.set(x, "hideAdditions", value.asInstanceOf[js.Any])
    
    inline def setHideAdditionsUndefined: Self = StObject.set(x, "hideAdditions", js.undefined)
    
    inline def setKeepOnScreen(value: Boolean): Self = StObject.set(x, "keepOnScreen", value.asInstanceOf[js.Any])
    
    inline def setKeepOnScreenUndefined: Self = StObject.set(x, "keepOnScreen", js.undefined)
    
    inline def setKeys(value: KeySettings): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLabel(value: LabelSettings): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMatch(value: both | value | text): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMaxSelections(value: `false` | Double): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
    
    inline def setMaxSelectionsUndefined: Self = StObject.set(x, "maxSelections", js.undefined)
    
    inline def setMessage(value: MessageSettings): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
    
    inline def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnAdd(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* addedValue */ Any, 
          /* addedText */ String, 
          /* $addedChoice */ JQuery, 
          Unit
        ]
    ): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnChange(
      value: js.ThisFunction3[/* this */ JQuery, /* value */ Any, /* text */ String, /* $choice */ JQuery, Unit]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnHide(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnLabelCreate(value: js.ThisFunction2[/* this */ JQuery, /* value */ Any, /* text */ String, JQuery]): Self = StObject.set(x, "onLabelCreate", value.asInstanceOf[js.Any])
    
    inline def setOnLabelCreateUndefined: Self = StObject.set(x, "onLabelCreate", js.undefined)
    
    inline def setOnLabelRemove(value: js.ThisFunction1[/* this */ JQuery, /* value */ Any, `false` | Unit]): Self = StObject.set(x, "onLabelRemove", value.asInstanceOf[js.Any])
    
    inline def setOnLabelRemoveUndefined: Self = StObject.set(x, "onLabelRemove", js.undefined)
    
    inline def setOnLabelSelect(value: js.ThisFunction1[/* this */ JQuery, /* $selectedLabels */ JQuery, Unit]): Self = StObject.set(x, "onLabelSelect", value.asInstanceOf[js.Any])
    
    inline def setOnLabelSelectUndefined: Self = StObject.set(x, "onLabelSelect", js.undefined)
    
    inline def setOnNoResults(value: js.ThisFunction1[/* this */ JQuery, /* searchValue */ Any, Unit]): Self = StObject.set(x, "onNoResults", value.asInstanceOf[js.Any])
    
    inline def setOnNoResultsUndefined: Self = StObject.set(x, "onNoResults", js.undefined)
    
    inline def setOnRemove(
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* removedValue */ Any, 
          /* removedText */ String, 
          /* $removedChoice */ JQuery, 
          Unit
        ]
    ): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setOnShow(value: js.ThisFunction0[/* this */ JQuery, `false` | Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPlaceholder(value: auto | value | `false`): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPreserveHTML(value: Boolean): Self = StObject.set(x, "preserveHTML", value.asInstanceOf[js.Any])
    
    inline def setPreserveHTMLUndefined: Self = StObject.set(x, "preserveHTML", js.undefined)
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    inline def setSaveRemoteData(value: Boolean): Self = StObject.set(x, "saveRemoteData", value.asInstanceOf[js.Any])
    
    inline def setSaveRemoteDataUndefined: Self = StObject.set(x, "saveRemoteData", js.undefined)
    
    inline def setSelectOnKeydown(value: Boolean): Self = StObject.set(x, "selectOnKeydown", value.asInstanceOf[js.Any])
    
    inline def setSelectOnKeydownUndefined: Self = StObject.set(x, "selectOnKeydown", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSortSelect(value: Boolean): Self = StObject.set(x, "sortSelect", value.asInstanceOf[js.Any])
    
    inline def setSortSelectUndefined: Self = StObject.set(x, "sortSelect", js.undefined)
    
    inline def setTransition(value: auto | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setUseLabels(value: Boolean): Self = StObject.set(x, "useLabels", value.asInstanceOf[js.Any])
    
    inline def setUseLabelsUndefined: Self = StObject.set(x, "useLabels", js.undefined)
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
