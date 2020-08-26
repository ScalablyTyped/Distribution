package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldMappingV2 extends js.Object {
  // A List of InputField for this mapping
  var input_fields: js.UndefOr[js.Array[InputField]] = js.native
  // A user specified string that is a name for this mapping
  var name: js.UndefOr[String] = js.native
  // An OutputField for this mapping
  var output_field: js.UndefOr[OutputField] = js.native
}

object FieldMappingV2 {
  @scala.inline
  def apply(): FieldMappingV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldMappingV2]
  }
  @scala.inline
  implicit class FieldMappingV2Ops[Self <: FieldMappingV2] (val x: Self) extends AnyVal {
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
    def setInput_fieldsVarargs(value: InputField*): Self = this.set("input_fields", js.Array(value :_*))
    @scala.inline
    def setInput_fields(value: js.Array[InputField]): Self = this.set("input_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_fields: Self = this.set("input_fields", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOutput_field(value: OutputField): Self = this.set("output_field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput_field: Self = this.set("output_field", js.undefined)
  }
  
}

