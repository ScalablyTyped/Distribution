package typings.semanticUiApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, keyof semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplDisabled extends js.Object {
  var disabled: js.UndefOr[String] = js.undefined
  var form: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplDisabled {
  @scala.inline
  def apply(disabled: String = null, form: String = null): PartialPickImplkeyofImplDisabled = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplDisabled]
  }
}

