package typings.semanticDashUiDashForm.SemanticUI.Form.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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

object _Impl {
  @scala.inline
  def apply(active: String, disabled: String, placeholder: String, visible: String): _Impl = {
    val __obj = js.Dynamic.literal(active = active, disabled = disabled, placeholder = placeholder, visible = visible)
  
    __obj.asInstanceOf[_Impl]
  }
}

