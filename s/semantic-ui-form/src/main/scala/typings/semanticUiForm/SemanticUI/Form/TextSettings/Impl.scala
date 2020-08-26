package typings.semanticUiForm.SemanticUI.Form.TextSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'This field'
    */
  var unspecifiedField: String = js.native
  /**
    * @default 'Please enter a valid value'
    */
  var unspecifiedRule: String = js.native
}

object Impl {
  @scala.inline
  def apply(unspecifiedField: String, unspecifiedRule: String): Impl = {
    val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any], unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUnspecifiedField(value: String): Self = this.set("unspecifiedField", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnspecifiedRule(value: String): Self = this.set("unspecifiedRule", value.asInstanceOf[js.Any])
  }
  
}

