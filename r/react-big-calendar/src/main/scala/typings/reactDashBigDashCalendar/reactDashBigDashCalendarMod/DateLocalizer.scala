package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-big-calendar", "DateLocalizer")
@js.native
class DateLocalizer protected () extends js.Object {
  def this(spec: DateLocalizerSpec) = this()
  var formats: Formats = js.native
  var propType: Validator[_] = js.native
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
  def startOfWeek(culture: Culture): Double = js.native
}

