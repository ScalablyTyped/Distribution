package typings.primereact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataField extends js.Object {
  var data: js.Any
  var field: String
}

object AnonDataField {
  @scala.inline
  def apply(data: js.Any, field: String): AnonDataField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataField]
  }
}

