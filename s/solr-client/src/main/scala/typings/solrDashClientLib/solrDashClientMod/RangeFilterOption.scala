package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterOption extends js.Object {
  var end: java.lang.String | scala.Double | stdLib.Date
  var field: java.lang.String
  var start: java.lang.String | scala.Double | stdLib.Date
}

object RangeFilterOption {
  @scala.inline
  def apply(
    end: java.lang.String | scala.Double | stdLib.Date,
    field: java.lang.String,
    start: java.lang.String | scala.Double | stdLib.Date
  ): RangeFilterOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeFilterOption]
  }
}

