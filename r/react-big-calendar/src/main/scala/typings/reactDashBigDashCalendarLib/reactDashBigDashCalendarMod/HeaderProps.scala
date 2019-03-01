package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var date: stdLib.Date
  var label: java.lang.String
  var localizer: DateLocalizer
}

object HeaderProps {
  @scala.inline
  def apply(date: stdLib.Date, label: java.lang.String, localizer: DateLocalizer): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("localizer")(localizer)
    __obj.asInstanceOf[HeaderProps]
  }
}

