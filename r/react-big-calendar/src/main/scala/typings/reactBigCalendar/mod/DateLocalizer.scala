package typings.reactBigCalendar.mod

import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-calendar", "DateLocalizer")
@js.native
class DateLocalizer protected () extends js.Object {
  def this(spec: DateLocalizerSpec) = this()
  
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
  
  var formats: Formats = js.native
  
  var propType: Validator[_] = js.native
  
  def startOfWeek(culture: Culture): Double = js.native
}
