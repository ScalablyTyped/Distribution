package typings.semanticDashUiDashCheckbox.SemanticUI.Checkbox.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'input[type=checkbox], input[type=radio]'
    */
  var input: String
  /**
    * @default 'label'
    */
  var label: String
}

object _Impl {
  @scala.inline
  def apply(input: String, label: String): _Impl = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

