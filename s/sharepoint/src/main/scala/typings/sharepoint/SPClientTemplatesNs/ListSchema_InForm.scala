package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchema_InForm extends ListSchema {
  @JSName("Field")
  var Field_ListSchema_InForm: js.Array[FieldSchema_InForm]
}

object ListSchema_InForm {
  @scala.inline
  def apply(Field: js.Array[FieldSchema_InForm]): ListSchema_InForm = {
    val __obj = js.Dynamic.literal(Field = Field)
  
    __obj.asInstanceOf[ListSchema_InForm]
  }
}

