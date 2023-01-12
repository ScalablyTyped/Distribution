package typings.semanticUiSearch.anon

import typings.semanticUiApi.SemanticUI.ApiSettings
import typings.semanticUiSearch.JQuery
import typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typings.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typings.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typings.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typings.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typings.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typings.semanticUiSearch.SemanticUI.SearchSettings.Param
import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'onResultsAdd'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, keyof semantic-ui-search.SemanticUI.SearchSettings._Impl>> */
trait PickImplonResultsAddParti
  extends StObject
     with Param {
  
  var apiSettings: js.UndefOr[ApiSettings] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var fields: js.UndefOr[FieldsSettings] = js.undefined
  
  var hideDelay: js.UndefOr[Double] = js.undefined
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var metadata: js.UndefOr[MetadataSettings] = js.undefined
  
  var minCharacters: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var onResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* response */ Any, Unit]] = js.undefined
  
  def onResultsAdd(html: String): `false` | Unit
  @JSName("onResultsAdd")
  var onResultsAdd_Original: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
  
  var onResultsClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onResultsOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onSearchQuery: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* result */ Any, /* response */ Any, `false` | Unit]
  ] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var regExp: js.UndefOr[RegExpSettings] = js.undefined
  
  var searchDelay: js.UndefOr[Double] = js.undefined
  
  var searchFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var searchFullText: js.UndefOr[Boolean] = js.undefined
  
  var selectFirstResult: js.UndefOr[Boolean] = js.undefined
  
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  
  var showNoResults: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[`false` | Any] = js.undefined
  
  var templates: js.UndefOr[TemplatesSettings] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplonResultsAddParti {
  
  inline def apply(onResultsAdd: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): PickImplonResultsAddParti = {
    val __obj = js.Dynamic.literal(onResultsAdd = onResultsAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonResultsAddParti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplonResultsAddParti] (val x: Self) extends AnyVal {
    
    inline def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
    
    inline def setApiSettingsUndefined: Self = StObject.set(x, "apiSettings", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
    
    inline def setMinCharactersUndefined: Self = StObject.set(x, "minCharacters", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnResults(value: js.ThisFunction1[/* this */ JQuery, /* response */ Any, Unit]): Self = StObject.set(x, "onResults", value.asInstanceOf[js.Any])
    
    inline def setOnResultsAdd(value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): Self = StObject.set(x, "onResultsAdd", value.asInstanceOf[js.Any])
    
    inline def setOnResultsClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onResultsClose", value.asInstanceOf[js.Any])
    
    inline def setOnResultsCloseUndefined: Self = StObject.set(x, "onResultsClose", js.undefined)
    
    inline def setOnResultsOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onResultsOpen", value.asInstanceOf[js.Any])
    
    inline def setOnResultsOpenUndefined: Self = StObject.set(x, "onResultsOpen", js.undefined)
    
    inline def setOnResultsUndefined: Self = StObject.set(x, "onResults", js.undefined)
    
    inline def setOnSearchQuery(value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]): Self = StObject.set(x, "onSearchQuery", value.asInstanceOf[js.Any])
    
    inline def setOnSearchQueryUndefined: Self = StObject.set(x, "onSearchQuery", js.undefined)
    
    inline def setOnSelect(value: js.ThisFunction2[/* this */ JQuery, /* result */ Any, /* response */ Any, `false` | Unit]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    inline def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
    
    inline def setSearchDelayUndefined: Self = StObject.set(x, "searchDelay", js.undefined)
    
    inline def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
    
    inline def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
    
    inline def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value*))
    
    inline def setSearchFullText(value: Boolean): Self = StObject.set(x, "searchFullText", value.asInstanceOf[js.Any])
    
    inline def setSearchFullTextUndefined: Self = StObject.set(x, "searchFullText", js.undefined)
    
    inline def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
    
    inline def setSelectFirstResultUndefined: Self = StObject.set(x, "selectFirstResult", js.undefined)
    
    inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
    
    inline def setShowNoResultsUndefined: Self = StObject.set(x, "showNoResults", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSource(value: `false` | Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
