package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchema extends js.Object {
  var Field: js.Array[FieldSchema]
}

object ListSchema {
  @scala.inline
  def apply(Field: js.Array[FieldSchema]): ListSchema = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchema]
  }
}

