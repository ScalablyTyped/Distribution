package typings.reactDashInspector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Table extends js.Object {
  var table: js.UndefOr[Boolean] = js.undefined
}

object Anon_Table {
  @scala.inline
  def apply(table: js.UndefOr[Boolean] = js.undefined): Anon_Table = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(table)) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Table]
  }
}

