package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataField extends js.Object {
  var data: js.Any
  var field: String
}

object DataField {
  @scala.inline
  def apply(data: js.Any, field: String): DataField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataField]
  }
}

