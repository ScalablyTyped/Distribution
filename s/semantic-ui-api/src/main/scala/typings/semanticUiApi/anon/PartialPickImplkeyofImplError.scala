package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplError extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplError {
  @scala.inline
  def apply(error: String = null, loading: String = null): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
}

