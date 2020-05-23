package typings.reactBootstrapTable2Toolkit.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bootstrap4 extends js.Object {
  var bootstrap4: js.UndefOr[Boolean] = js.undefined
  var columns: js.Array[ColumnDescription[_, _]]
  var data: js.Array[_]
  /**
    * table key field
    */
  var keyField: js.Any
}

object Bootstrap4 {
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    data: js.Array[_],
    keyField: js.Any,
    bootstrap4: js.UndefOr[Boolean] = js.undefined
  ): Bootstrap4 = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    if (!js.isUndefined(bootstrap4)) __obj.updateDynamic("bootstrap4")(bootstrap4.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bootstrap4]
  }
}

