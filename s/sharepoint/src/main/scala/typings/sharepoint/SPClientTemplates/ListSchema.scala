package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchema extends js.Object {
  var Field: js.Array[FieldSchema] = js.native
}

object ListSchema {
  @scala.inline
  def apply(Field: js.Array[FieldSchema]): ListSchema = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchema]
  }
  @scala.inline
  implicit class ListSchemaOps[Self <: ListSchema] (val x: Self) extends AnyVal {
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
    def setFieldVarargs(value: FieldSchema*): Self = this.set("Field", js.Array(value :_*))
    @scala.inline
    def setField(value: js.Array[FieldSchema]): Self = this.set("Field", value.asInstanceOf[js.Any])
  }
  
}

