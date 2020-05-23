package typings.semanticUiSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplLogging extends js.Object {
  var logging: js.UndefOr[String] = js.undefined
  var maxResults: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var noResults: js.UndefOr[String] = js.undefined
  var noTemplate: js.UndefOr[String] = js.undefined
  var serverError: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplLogging {
  @scala.inline
  def apply(
    logging: String = null,
    maxResults: String = null,
    method: String = null,
    noResults: String = null,
    noTemplate: String = null,
    serverError: String = null,
    source: String = null
  ): PartialPickImplkeyofImplLogging = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (noResults != null) __obj.updateDynamic("noResults")(noResults.asInstanceOf[js.Any])
    if (noTemplate != null) __obj.updateDynamic("noTemplate")(noTemplate.asInstanceOf[js.Any])
    if (serverError != null) __obj.updateDynamic("serverError")(serverError.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplLogging]
  }
}

