package typings.semanticUiForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplActive {
  @scala.inline
  def apply(active: String = null, disabled: String = null, placeholder: String = null, visible: String = null): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
}

