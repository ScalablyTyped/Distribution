package typings.reactBootstrapTable2Toolkit.anon

import typings.reactBootstrapTableNext.mod.ColumnDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.Array[ColumnDescription[_, _]]
  /**
    * array of toggled columns
    */
  var toggles: js.Array[Boolean]
  def onColumnToggle(dataField: String): Unit
}

object Columns {
  @scala.inline
  def apply(
    columns: js.Array[ColumnDescription[_, _]],
    onColumnToggle: String => Unit,
    toggles: js.Array[Boolean]
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnToggle = js.Any.fromFunction1(onColumnToggle), toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

