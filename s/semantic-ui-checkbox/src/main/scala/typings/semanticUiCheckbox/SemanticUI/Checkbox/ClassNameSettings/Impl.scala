package typings.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'checked'
    */
  var checked: String
  /**
    * @default 'disabled'
    */
  var disabled: String
  /**
    * @default 'radio'
    */
  var radio: String
  /**
    * @default 'read-only'
    */
  var readOnly: String
}

object Impl {
  @scala.inline
  def apply(checked: String, disabled: String, radio: String, readOnly: String): Impl = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

