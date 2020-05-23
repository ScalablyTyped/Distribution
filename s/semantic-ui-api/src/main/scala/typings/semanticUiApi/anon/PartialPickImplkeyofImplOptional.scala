package typings.semanticUiApi.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl>> */
trait PartialPickImplkeyofImplOptional extends js.Object {
  var optional: js.UndefOr[RegExp] = js.undefined
  var required: js.UndefOr[RegExp] = js.undefined
}

object PartialPickImplkeyofImplOptional {
  @scala.inline
  def apply(optional: RegExp = null, required: RegExp = null): PartialPickImplkeyofImplOptional = {
    val __obj = js.Dynamic.literal()
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplOptional]
  }
}

