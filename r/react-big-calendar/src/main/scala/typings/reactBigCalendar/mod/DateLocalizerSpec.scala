package typings.reactBigCalendar.mod

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateLocalizerSpec extends StObject {
  
  def firstOfWeek(culture: Culture): Double = js.native
  
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
  
  var formats: Formats = js.native
  
  var propType: js.UndefOr[Validator[_]] = js.native
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
    def setPropType(value: Validator[_]): Self = StObject.set(x, "propType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypeUndefined: Self = StObject.set(x, "propType", js.undefined)
  }
}
