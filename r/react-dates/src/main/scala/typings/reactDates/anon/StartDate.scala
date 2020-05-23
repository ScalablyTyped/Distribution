package typings.reactDates.anon

import typings.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDate extends js.Object {
  var endDate: momentObj
  var startDate: momentObj
}

object StartDate {
  @scala.inline
  def apply(endDate: momentObj, startDate: momentObj): StartDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDate]
  }
}

