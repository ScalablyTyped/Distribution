package typings.solrDashClient.solrDashClientMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeFilterOption extends js.Object {
  var end: String | Double | Date
  var field: String
  var start: String | Double | Date
}

object RangeFilterOption {
  @scala.inline
  def apply(end: String | Double | Date, field: String, start: String | Double | Date): RangeFilterOption = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], field = field, start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeFilterOption]
  }
}

