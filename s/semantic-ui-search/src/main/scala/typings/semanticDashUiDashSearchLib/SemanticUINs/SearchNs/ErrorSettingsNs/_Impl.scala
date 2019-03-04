package typings
package semanticDashUiDashSearchLib.SemanticUINs.SearchNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Error in debug logging, exiting.'
    */
  var logging: java.lang.String
  /**
    * @default 'Results must be an array to use maxResults setting'
    */
  var maxResults: java.lang.String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default 'Your search returned no results'
    */
  var noResults: java.lang.String
  /**
    * @default 'A valid template name was not specified.'
    */
  var noTemplate: java.lang.String
  /**
    * @default 'There was an issue with querying the server.'
    */
  var serverError: java.lang.String
  /**
    * @default 'Cannot search. No source used, and Semantic API module was not included'
    */
  var source: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    logging: java.lang.String,
    maxResults: java.lang.String,
    method: java.lang.String,
    noResults: java.lang.String,
    noTemplate: java.lang.String,
    serverError: java.lang.String,
    source: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal(logging = logging, maxResults = maxResults, method = method, noResults = noResults, noTemplate = noTemplate, serverError = serverError, source = source)
  
    __obj.asInstanceOf[_Impl]
  }
}

