package typings.semanticUiForm.SemanticUI.Form.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'disabled'
    */
  var disabled: String
  /**
    * @default 'default'
    */
  var placeholder: String
  /**
    * @default 'visible'
    */
  var visible: String
}

object Impl {
  @scala.inline
  def apply(active: String, disabled: String, placeholder: String, visible: String): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

