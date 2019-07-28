package typings.semanticDashUiDashSearch.SemanticUINs.SearchNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Error in debug logging, exiting.'
    */
  var logging: String
  /**
    * @default 'Results must be an array to use maxResults setting'
    */
  var maxResults: String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'Your search returned no results'
    */
  var noResults: String
  /**
    * @default 'A valid template name was not specified.'
    */
  var noTemplate: String
  /**
    * @default 'There was an issue with querying the server.'
    */
  var serverError: String
  /**
    * @default 'Cannot search. No source used, and Semantic API module was not included'
    */
  var source: String
}

object _Impl {
  @scala.inline
  def apply(
    logging: String,
    maxResults: String,
    method: String,
    noResults: String,
    noTemplate: String,
    serverError: String,
    source: String
  ): _Impl = {
    val __obj = js.Dynamic.literal(logging = logging, maxResults = maxResults, method = method, noResults = noResults, noTemplate = noTemplate, serverError = serverError, source = source)
  
    __obj.asInstanceOf[_Impl]
  }
}

