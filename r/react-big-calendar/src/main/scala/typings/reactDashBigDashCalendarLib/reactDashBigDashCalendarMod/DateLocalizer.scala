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
  @JSName("propType")
  var propType_Original: propDashTypesLib.propDashTypesMod.Validator[_] = js.native
  def format(value: FormatInput, format: java.lang.String, culture: Culture): java.lang.String = js.native
  def propType(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def startOfWeek(culture: Culture): scala.Double = js.native
}

