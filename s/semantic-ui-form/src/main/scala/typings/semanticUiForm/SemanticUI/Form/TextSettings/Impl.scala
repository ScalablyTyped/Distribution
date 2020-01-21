package typings.semanticUiForm.SemanticUI.Form.TextSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'This field'
    */
  var unspecifiedField: String
  /**
    * @default 'Please enter a valid value'
    */
  var unspecifiedRule: String
}

object Impl {
  @scala.inline
  def apply(unspecifiedField: String, unspecifiedRule: String): Impl = {
    val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any], unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

