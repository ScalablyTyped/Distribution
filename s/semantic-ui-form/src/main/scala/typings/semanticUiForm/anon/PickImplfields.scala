package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StringDictionary
import typings.semanticUiForm.SemanticUI.Form.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'fields'> */
@js.native
trait PickImplfields extends js.Object {
  var fields: StringDictionary[String | js.Array[String] | Field] = js.native
}

object PickImplfields {
  @scala.inline
  def apply(fields: StringDictionary[String | js.Array[String] | Field]): PickImplfields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfields]
  }
  @scala.inline
  implicit class PickImplfieldsOps[Self <: PickImplfields] (val x: Self) extends AnyVal {
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
    def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
  
}

