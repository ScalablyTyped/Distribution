package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-big-calendar", "DateLocalizer")
@js.native
class DateLocalizer protected () extends js.Object {
  def this(spec: DateLocalizerSpec) = this()
  var formats: Formats = js.native
  var propType: propDashTypesLib.propDashTypesMod.Validator[_] = js.native
  def format(value: FormatInput, format: java.lang.String, culture: Culture): java.lang.String = js.native
  def startOfWeek(culture: Culture): scala.Double = js.native
}

