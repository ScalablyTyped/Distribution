package typings.reactBigCalendar.mod

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateLocalizerSpec extends StObject {
  
  def firstOfWeek(culture: Culture): Double
  
  def format(value: FormatInput, format: String, culture: Culture): String
  
  var formats: Formats
  
  var propType: js.UndefOr[Validator[js.Any]] = js.undefined
}
object DateLocalizerSpec {
  
  @scala.inline
  def apply(firstOfWeek: Culture => Double, format: (FormatInput, String, Culture) => String, formats: Formats): DateLocalizerSpec = {
    val __obj = js.Dynamic.literal(firstOfWeek = js.Any.fromFunction1(firstOfWeek), format = js.Any.fromFunction3(format), formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateLocalizerSpec]
  }
  
  @scala.inline
  implicit class DateLocalizerSpecMutableBuilder[Self <: DateLocalizerSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstOfWeek(value: Culture => Double): Self = StObject.set(x, "firstOfWeek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: (FormatInput, String, Culture) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormats(value: Formats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropType(value: Validator[js.Any]): Self = StObject.set(x, "propType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypeUndefined: Self = StObject.set(x, "propType", js.undefined)
  }
}
