package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var date: Date
  var label: String
  var localizer: DateLocalizer
}

object HeaderProps {
  @scala.inline
  def apply(date: Date, label: String, localizer: DateLocalizer): HeaderProps = {
    val __obj = js.Dynamic.literal(date = date, label = label, localizer = localizer)
  
    __obj.asInstanceOf[HeaderProps]
  }
}

