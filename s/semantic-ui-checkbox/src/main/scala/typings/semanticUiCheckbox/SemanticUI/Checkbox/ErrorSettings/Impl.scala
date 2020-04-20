package typings.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
}

object Impl {
  @scala.inline
  def apply(method: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

