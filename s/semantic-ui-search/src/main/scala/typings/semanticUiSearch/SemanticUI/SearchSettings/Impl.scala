package typings.semanticUiSearch.SemanticUI.SearchSettings

import typings.semanticUiApi.SemanticUI.ApiSettings
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
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  // region Behavior
  /**
    * Settings for API call.
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#/usage}
    */
  var apiSettings: ApiSettings = js.native
  /**
    * Caches results locally to avoid requerying server
    *
    * @default true
    */
  var cache: Boolean = js.native
  /**
    * Class names used to determine element state
    */
  var className: ClassNameSettings = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * Duration of animation events
    *
    * @default 300
    */
  var duration: Double = js.native
  /**
    * Easing equation when using fallback Javascript animation
    *
    * @default 'easeOutExpo'
    */
  var easing: String = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * List mapping display content to JSON property, either with API or source.
    */
  var fields: FieldsSettings = js.native
  /**
    * Delay before hiding results after search blur
    *
    * @default 0
    */
  var hideDelay: Double = js.native
  /**
    * Maximum results to display when using local and simple search, maximum category count for category search
    *
    * @default 7
    */
  var maxResults: Double = js.native
  /**
    * HTML5 metadata attributes used internally
    */
  var metadata: MetadataSettings = js.native
  /**
    * Minimum characters to query for results
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
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Regular expressions used for matching
    */
  var regExp: RegExpSettings = js.native
  /**
    * Delay before querying results on inputchange
    *
    * @default 100
    */
  var searchDelay: Double = js.native
  /**
    * Specify object properties inside local source object which will be searched
    */
  var searchFields: js.Array[String] = js.native
  /**
    * Return local results that match anywhere inside your content
    *
    * @default true
    */
  var searchFullText: Boolean = js.native
  /**
    * Whether the search should automatically select the first search result after searching
    *
    * @default false
    */
  var selectFirstResult: Boolean = js.native
  /**
    * Selectors used to find parts of a module
    */
  var selector: SelectorSettings = js.native
  /**
    * Whether a "no results" message should be shown if no results are found. (These messages can be modified using the template object specified below)
    *
    * @default false
    */
  var showNoResults: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Specify a Javascript object which will be searched locally
    *
    * @default false
    */
  var source: `false` | js.Any = js.native
  // endregion
  // region Templates
  var templates: TemplatesSettings = js.native
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: String = js.native
  var `type`: String = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Callback on server response
    */
  def onResults(response: js.Any): Unit = js.native
  /**
    * Callback after processing element template to add HTML to results. Function should return false to prevent default actions.
    */
  def onResultsAdd(html: String): `false` | Unit = js.native
  /**
    * Callback when results are closed
    */
  def onResultsClose(): Unit = js.native
  /**
    * Callback when results are opened
    */
  def onResultsOpen(): Unit = js.native
  /**
    * Callback on search query
    */
  def onSearchQuery(query: String): Unit = js.native
  // endregion
  // region Callbacks
  /**
    * Callback on element selection by user.
    * The first parameter includes the filtered response results for that element.
    * The function should return false to prevent default action (closing search results and selecting value).
    */
  def onSelect(result: js.Any, response: js.Any): `false` | Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    apiSettings: ApiSettings,
    cache: Boolean,
    className: ClassNameSettings,
    debug: Boolean,
    duration: Double,
    easing: String,
    error: ErrorSettings,
    fields: FieldsSettings,
    hideDelay: Double,
    maxResults: Double,
    metadata: MetadataSettings,
    minCharacters: Double,
    name: String,
    namespace: String,
    onResults: js.Any => Unit,
    onResultsAdd: String => `false` | Unit,
    onResultsClose: () => Unit,
    onResultsOpen: () => Unit,
    onSearchQuery: String => Unit,
    onSelect: (js.Any, js.Any) => `false` | Unit,
    performance: Boolean,
    regExp: RegExpSettings,
    searchDelay: Double,
    searchFields: js.Array[String],
    searchFullText: Boolean,
    selectFirstResult: Boolean,
    selector: SelectorSettings,
    showNoResults: Boolean,
    silent: Boolean,
    source: `false` | js.Any,
    templates: TemplatesSettings,
    transition: String,
    `type`: String,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onResults = js.Any.fromFunction1(onResults), onResultsAdd = js.Any.fromFunction1(onResultsAdd), onResultsClose = js.Any.fromFunction0(onResultsClose), onResultsOpen = js.Any.fromFunction0(onResultsOpen), onSearchQuery = js.Any.fromFunction1(onSearchQuery), onSelect = js.Any.fromFunction2(onSelect), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], searchDelay = searchDelay.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], searchFullText = searchFullText.asInstanceOf[js.Any], selectFirstResult = selectFirstResult.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showNoResults = showNoResults.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setApiSettings(value: ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setFields(value: FieldsSettings): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: MetadataSettings): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnResults(value: js.Any => Unit): Self = this.set("onResults", js.Any.fromFunction1(value))
    @scala.inline
    def setOnResultsAdd(value: String => `false` | Unit): Self = this.set("onResultsAdd", js.Any.fromFunction1(value))
    @scala.inline
    def setOnResultsClose(value: () => Unit): Self = this.set("onResultsClose", js.Any.fromFunction0(value))
    @scala.inline
    def setOnResultsOpen(value: () => Unit): Self = this.set("onResultsOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSearchQuery(value: String => Unit): Self = this.set("onSearchQuery", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSelect(value: (js.Any, js.Any) => `false` | Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegExp(value: RegExpSettings): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchDelay(value: Double): Self = this.set("searchDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFullText(value: Boolean): Self = this.set("searchFullText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = this.set("selectFirstResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowNoResults(value: Boolean): Self = this.set("showNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: `false` | js.Any): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplates(value: TemplatesSettings): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
  
}

