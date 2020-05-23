package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataField extends js.Object {
  var dataField: js.Any
  var newValue: js.Any
  var rowId: String
}

object DataField {
  @scala.inline
  def apply(dataField: js.Any, newValue: js.Any, rowId: String): DataField = {
    val __obj = js.Dynamic.literal(dataField = dataField.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataField]
  }
}

