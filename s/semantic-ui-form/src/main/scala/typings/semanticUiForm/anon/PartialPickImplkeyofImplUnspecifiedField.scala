package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TextSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TextSettings._Impl>> */
trait PartialPickImplkeyofImplUnspecifiedField extends js.Object {
  var unspecifiedField: js.UndefOr[String] = js.undefined
  var unspecifiedRule: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplUnspecifiedField {
  @scala.inline
  def apply(unspecifiedField: String = null, unspecifiedRule: String = null): PartialPickImplkeyofImplUnspecifiedField = {
    val __obj = js.Dynamic.literal()
    if (unspecifiedField != null) __obj.updateDynamic("unspecifiedField")(unspecifiedField.asInstanceOf[js.Any])
    if (unspecifiedRule != null) __obj.updateDynamic("unspecifiedRule")(unspecifiedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplUnspecifiedField]
  }
}

