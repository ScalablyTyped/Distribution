package typings
package semanticDashUiDashSearchLib.SemanticUINs.SearchSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  // region Behavior
  /**
    * Settings for API call.
    *
    * @see {@link http://semantic-ui.com/behaviors/api.html#/usage}
    */
  var apiSettings: semanticDashUiDashApiLib.SemanticUINs.ApiSettings
  /**
    * Caches results locally to avoid requerying server
    *
    * @default true
    */
  var cache: scala.Boolean
  /**
    * Class names used to determine element state
    */
  var className: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.ClassNameSettings
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * Duration of animation events
    *
    * @default 300
    */
  var duration: scala.Double
  /**
    * Easing equation when using fallback Javascript animation
    *
    * @default 'easeOutExpo'
    */
  var easing: java.lang.String
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.ErrorSettings
  /**
    * List mapping display content to JSON property, either with API or source.
    */
  var fields: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.FieldsSettings
  /**
    * Delay before hiding results after search blur
    *
    * @default 0
    */
  var hideDelay: scala.Double
  /**
    * Maximum results to display when using local and simple search, maximum category count for category search
    *
    * @default 7
    */
  var maxResults: scala.Double
  /**
    * HTML5 metadata attributes used internally
    */
  var metadata: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.MetadataSettings
  /**
    * Minimum characters to query for results
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
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Regular expressions used for matching
    */
  var regExp: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.RegExpSettings
  /**
    * Delay before querying results on inputchange
    *
    * @default 100
    */
  var searchDelay: scala.Double
  /**
    * Specify object properties inside local source object which will be searched
    */
  var searchFields: js.Array[java.lang.String]
  /**
    * Return local results that match anywhere inside your content
    *
    * @default true
    */
  var searchFullText: scala.Boolean
  /**
    * Whether the search should automatically select the first search result after searching
    *
    * @default false
    */
  var selectFirstResult: scala.Boolean
  /**
    * Selectors used to find parts of a module
    */
  var selector: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.SelectorSettings
  /**
    * Whether a "no results" message should be shown if no results are found. (These messages can be modified using the template object specified below)
    *
    * @default false
    */
  var showNoResults: scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * Specify a Javascript object which will be searched locally
    *
    * @default false
    */
  var source: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibNumbers.`false` | js.Any
  // endregion
  // region Templates
  var templates: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.TemplatesSettings
  /**
    * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
    *
    * @default 'fade'
    * @see {@link http://semantic-ui.com/modules/transition.html}
    */
  var transition: java.lang.String
  var `type`: java.lang.String
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Callback on server response
    */
  def onResults(`this`: semanticDashUiDashSearchLib.JQuery, response: js.Any): scala.Unit
  /**
    * Callback after processing element template to add HTML to results. Function should return false to prevent default actions.
    */
  def onResultsAdd(`this`: semanticDashUiDashSearchLib.JQuery, html: java.lang.String): semanticDashUiDashSearchLib.semanticDashUiDashSearchLibNumbers.`false` | scala.Unit
  /**
    * Callback when results are closed
    */
  def onResultsClose(`this`: semanticDashUiDashSearchLib.JQuery): scala.Unit
  /**
    * Callback when results are opened
    */
  def onResultsOpen(`this`: semanticDashUiDashSearchLib.JQuery): scala.Unit
  /**
    * Callback on search query
    */
  def onSearchQuery(`this`: semanticDashUiDashSearchLib.JQuery, query: java.lang.String): scala.Unit
  // endregion
  // region Callbacks
  /**
    * Callback on element selection by user.
    * The first parameter includes the filtered response results for that element.
    * The function should return false to prevent default action (closing search results and selecting value).
    */
  def onSelect(`this`: semanticDashUiDashSearchLib.JQuery, result: js.Any, response: js.Any): semanticDashUiDashSearchLib.semanticDashUiDashSearchLibNumbers.`false` | scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    apiSettings: semanticDashUiDashApiLib.SemanticUINs.ApiSettings,
    cache: scala.Boolean,
    className: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.ClassNameSettings,
    debug: scala.Boolean,
    duration: scala.Double,
    easing: java.lang.String,
    error: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.ErrorSettings,
    fields: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.FieldsSettings,
    hideDelay: scala.Double,
    maxResults: scala.Double,
    metadata: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.MetadataSettings,
    minCharacters: scala.Double,
    name: java.lang.String,
    namespace: java.lang.String,
    onResults: js.Function2[semanticDashUiDashSearchLib.JQuery, js.Any, scala.Unit],
    onResultsAdd: js.Function2[
      semanticDashUiDashSearchLib.JQuery, 
      java.lang.String, 
      semanticDashUiDashSearchLib.semanticDashUiDashSearchLibNumbers.`false` | scala.Unit
    ],
    onResultsClose: js.Function1[semanticDashUiDashSearchLib.JQuery, scala.Unit],
    onResultsOpen: js.Function1[semanticDashUiDashSearchLib.JQuery, scala.Unit],
    onSearchQuery: js.Function2[semanticDashUiDashSearchLib.JQuery, java.lang.String, scala.Unit],
    onSelect: js.Function3[
      semanticDashUiDashSearchLib.JQuery, 
      js.Any, 
      js.Any, 
      semanticDashUiDashSearchLib.semanticDashUiDashSearchLibNumbers.`false` | scala.Unit
    ],
    performance: scala.Boolean,
    regExp: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.RegExpSettings,
    searchDelay: scala.Double,
    searchFields: js.Array[java.lang.String],
    searchFullText: scala.Boolean,
    selectFirstResult: scala.Boolean,
    selector: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.SelectorSettings,
    showNoResults: scala.Boolean,
    silent: scala.Boolean,
    source: semanticDashUiDashSearchLib.semanticDashUiDashSearchLibNumbers.`false` | js.Any,
    templates: semanticDashUiDashSearchLib.SemanticUINs.SearchNs.TemplatesSettings,
    transition: java.lang.String,
    `type`: java.lang.String,
    verbose: scala.Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("apiSettings")(apiSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("easing")(easing)
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.updateDynamic("hideDelay")(hideDelay)
    __obj.updateDynamic("maxResults")(maxResults)
    __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("minCharacters")(minCharacters)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("onResults")(onResults)
    __obj.updateDynamic("onResultsAdd")(onResultsAdd)
    __obj.updateDynamic("onResultsClose")(onResultsClose)
    __obj.updateDynamic("onResultsOpen")(onResultsOpen)
    __obj.updateDynamic("onSearchQuery")(onSearchQuery)
    __obj.updateDynamic("onSelect")(onSelect)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    __obj.updateDynamic("searchDelay")(searchDelay)
    __obj.updateDynamic("searchFields")(searchFields)
    __obj.updateDynamic("searchFullText")(searchFullText)
    __obj.updateDynamic("selectFirstResult")(selectFirstResult)
    __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.updateDynamic("showNoResults")(showNoResults)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    __obj.updateDynamic("transition")(transition)
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[_Impl]
  }
}

