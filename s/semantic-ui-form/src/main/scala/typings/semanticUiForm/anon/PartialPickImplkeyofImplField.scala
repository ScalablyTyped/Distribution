package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplField extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var input: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var submit: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplField {
  @scala.inline
  def apply(
    field: String = null,
    group: String = null,
    input: String = null,
    message: String = null,
    prompt: String = null,
    submit: String = null
  ): PartialPickImplkeyofImplField = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (submit != null) __obj.updateDynamic("submit")(submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplField]
  }
}

