package typings.semanticUiCheckbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl>> */
trait PartialPickImplkeyofImplInput extends js.Object {
  var input: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplInput {
  @scala.inline
  def apply(input: String = null, label: String = null): PartialPickImplkeyofImplInput = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplInput]
  }
}

