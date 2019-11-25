package typings.reactabularDashTable

import typings.reactabularDashTable.reactabularDashTableMod.CellFormatter
import typings.reactabularDashTable.reactabularDashTableMod.CellTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Formatters extends js.Object {
  var formatters: js.UndefOr[js.Array[CellFormatter]] = js.undefined
  var transforms: js.UndefOr[js.Array[CellTransform]] = js.undefined
}

object Anon_Formatters {
  @scala.inline
  def apply(formatters: js.Array[CellFormatter] = null, transforms: js.Array[CellTransform] = null): Anon_Formatters = {
    val __obj = js.Dynamic.literal()
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Formatters]
  }
}

