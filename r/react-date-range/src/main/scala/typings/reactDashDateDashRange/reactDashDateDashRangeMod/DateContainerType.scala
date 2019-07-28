package typings.reactDashDateDashRange.reactDashDateDashRangeMod

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateContainerType extends js.Object {
  var date: Moment
}

object DateContainerType {
  @scala.inline
  def apply(date: Moment): DateContainerType = {
    val __obj = js.Dynamic.literal(date = date)
  
    __obj.asInstanceOf[DateContainerType]
  }
}

