package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSchema extends js.Object {
  var Field: js.Array[FieldSchema]
}

object ListSchema {
  @scala.inline
  def apply(Field: js.Array[FieldSchema]): ListSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Field")(Field)
    __obj.asInstanceOf[ListSchema]
  }
}

