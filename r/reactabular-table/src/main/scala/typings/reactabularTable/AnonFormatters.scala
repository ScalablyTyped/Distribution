package typings.reactabularTable

import typings.reactabularTable.mod.CellFormatter
import typings.reactabularTable.mod.CellTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatters extends js.Object {
  var formatters: js.UndefOr[js.Array[CellFormatter]] = js.undefined
  var transforms: js.UndefOr[js.Array[CellTransform]] = js.undefined
}

object AnonFormatters {
  @scala.inline
  def apply(formatters: js.Array[CellFormatter] = null, transforms: js.Array[CellTransform] = null): AnonFormatters = {
    val __obj = js.Dynamic.literal()
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormatters]
  }
}

