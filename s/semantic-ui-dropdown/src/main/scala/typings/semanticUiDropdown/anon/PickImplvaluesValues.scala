package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.FieldsSettings._Impl, 'values'> */
@js.native
trait PickImplvaluesValues extends js.Object {
  var values: String = js.native
}

object PickImplvaluesValues {
  @scala.inline
  def apply(values: String): PickImplvaluesValues = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvaluesValues]
  }
  @scala.inline
  implicit class PickImplvaluesValuesOps[Self <: PickImplvaluesValues] (val x: Self) extends AnyVal {
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
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

