package typings.reactBigCalendar.mod

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-big-calendar", "DateLocalizer")
@js.native
open class DateLocalizer protected () extends StObject {
  def this(spec: DateLocalizerSpec) = this()
  
  def format(value: FormatInput, format: String): String = js.native
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
  
  var formats: Formats = js.native
  
  var messages: Messages = js.native
  
  var propType: Validator[Any] = js.native
  
  def startOfWeek(culture: Culture): Double = js.native
}
