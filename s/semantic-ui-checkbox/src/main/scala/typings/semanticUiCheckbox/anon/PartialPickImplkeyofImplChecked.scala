package typings.semanticUiCheckbox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplChecked extends js.Object {
  var checked: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var radio: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplChecked {
  @scala.inline
  def apply(checked: String = null, disabled: String = null, radio: String = null, readOnly: String = null): PartialPickImplkeyofImplChecked = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (radio != null) __obj.updateDynamic("radio")(radio.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplChecked]
  }
}

