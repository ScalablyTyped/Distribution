package typings.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'input[type=checkbox], input[type=radio]'
    */
  var input: String
  /**
    * @default 'label'
    */
  var label: String
}

object Impl {
  @scala.inline
  def apply(input: String, label: String): Impl = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

