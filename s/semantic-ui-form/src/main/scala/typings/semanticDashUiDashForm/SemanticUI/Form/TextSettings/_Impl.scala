package typings.semanticDashUiDashForm.SemanticUI.Form.TextSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'This field'
    */
  var unspecifiedField: String
  /**
    * @default 'Please enter a valid value'
    */
  var unspecifiedRule: String
}

object _Impl {
  @scala.inline
  def apply(unspecifiedField: String, unspecifiedRule: String): _Impl = {
    val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any], unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

