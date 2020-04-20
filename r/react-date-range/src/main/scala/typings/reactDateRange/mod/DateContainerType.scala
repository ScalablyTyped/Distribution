package typings.reactDateRange.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateContainerType extends js.Object {
  var date: Moment
}

object DateContainerType {
  @scala.inline
  def apply(date: Moment): DateContainerType = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateContainerType]
  }
}

