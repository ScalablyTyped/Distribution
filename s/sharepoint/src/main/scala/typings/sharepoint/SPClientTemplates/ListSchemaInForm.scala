package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchemaInForm extends ListSchema {
  @JSName("Field")
  var Field_ListSchemaInForm: js.Array[FieldSchemaInForm]
}

object ListSchemaInForm {
  @scala.inline
  def apply(Field: js.Array[FieldSchemaInForm]): ListSchemaInForm = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaInForm]
  }
}

