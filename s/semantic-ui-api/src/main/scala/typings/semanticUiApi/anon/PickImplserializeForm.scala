package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'serializeForm'> */
@js.native
trait PickImplserializeForm extends js.Object {
  var serializeForm: Boolean = js.native
}

object PickImplserializeForm {
  @scala.inline
  def apply(serializeForm: Boolean): PickImplserializeForm = {
    val __obj = js.Dynamic.literal(serializeForm = serializeForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplserializeForm]
  }
  @scala.inline
  implicit class PickImplserializeFormOps[Self <: PickImplserializeForm] (val x: Self) extends AnyVal {
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
    def setSerializeForm(value: Boolean): Self = this.set("serializeForm", value.asInstanceOf[js.Any])
  }
  
}

