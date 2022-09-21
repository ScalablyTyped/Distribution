package typings.reactBigCalendar.mod

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateLocalizerSpec extends StObject {
  
  def firstOfWeek(culture: Culture): Double = js.native
  
  def format(value: FormatInput, format: String): String = js.native
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
  
  var formats: Formats = js.native
  
  var propType: js.UndefOr[Validator[Any]] = js.native
}
