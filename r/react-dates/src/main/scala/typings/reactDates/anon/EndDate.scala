package typings.reactDates.anon

import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndDate extends js.Object {
  var endDate: momentObj | Null
  var startDate: momentObj | Null
}

object EndDate {
  @scala.inline
  def apply(endDate: momentObj = null, startDate: momentObj = null): EndDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
}

