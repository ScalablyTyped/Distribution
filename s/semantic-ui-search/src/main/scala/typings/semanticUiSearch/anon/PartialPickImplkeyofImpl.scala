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
import typings.semanticUiSearch.semanticUiSearchBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, keyof semantic-ui-search.SemanticUI.SearchSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  
  var apiSettings: js.UndefOr[ApiSettings] = js.native
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[ClassNameSettings] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[ErrorSettings] = js.native
  
  var fields: js.UndefOr[FieldsSettings] = js.native
  
  var hideDelay: js.UndefOr[Double] = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var metadata: js.UndefOr[MetadataSettings] = js.native
  
  var minCharacters: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var namespace: js.UndefOr[String] = js.native
  
  var onResults: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]] = js.native
  
  var onResultsAdd: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]] = js.native
  
  var onResultsClose: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onResultsOpen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  
  var onSearchQuery: js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]] = js.native
  
  var onSelect: js.UndefOr[
    js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
  ] = js.native
  
  var performance: js.UndefOr[Boolean] = js.native
  
  var regExp: js.UndefOr[RegExpSettings] = js.native
  
  var searchDelay: js.UndefOr[Double] = js.native
  
  var searchFields: js.UndefOr[js.Array[String]] = js.native
  
  var searchFullText: js.UndefOr[Boolean] = js.native
  
  var selectFirstResult: js.UndefOr[Boolean] = js.native
  
  var selector: js.UndefOr[SelectorSettings] = js.native
  
  var showNoResults: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[`false` | js.Any] = js.native
  
  var templates: js.UndefOr[TemplatesSettings] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialPickImplkeyofImpl {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
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
    def setApiSettings(value: ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiSettings: Self = this.set("apiSettings", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFields(value: FieldsSettings): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDelay: Self = this.set("hideDelay", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCharacters: Self = this.set("minCharacters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setOnResults(value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]): Self = this.set("onResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResults: Self = this.set("onResults", js.undefined)
    
    @scala.inline
    def setOnResultsAdd(value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]): Self = this.set("onResultsAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResultsAdd: Self = this.set("onResultsAdd", js.undefined)
    
    @scala.inline
    def setOnResultsClose(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onResultsClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResultsClose: Self = this.set("onResultsClose", js.undefined)
    
    @scala.inline
    def setOnResultsOpen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onResultsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnResultsOpen: Self = this.set("onResultsOpen", js.undefined)
    
    @scala.inline
    def setOnSearchQuery(value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]): Self = this.set("onSearchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSearchQuery: Self = this.set("onSearchQuery", js.undefined)
    
    @scala.inline
    def setOnSelect(
      value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
    ): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    
    @scala.inline
    def setSearchDelay(value: Double): Self = this.set("searchDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchDelay: Self = this.set("searchDelay", js.undefined)
    
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchFields: Self = this.set("searchFields", js.undefined)
    
    @scala.inline
    def setSearchFullText(value: Boolean): Self = this.set("searchFullText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchFullText: Self = this.set("searchFullText", js.undefined)
    
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = this.set("selectFirstResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectFirstResult: Self = this.set("selectFirstResult", js.undefined)
    
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setShowNoResults(value: Boolean): Self = this.set("showNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNoResults: Self = this.set("showNoResults", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSource(value: `false` | js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
