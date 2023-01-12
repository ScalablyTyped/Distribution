package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleOptions
  extends StObject
     with /* propName */ StringDictionary[Any] {
  
  var culture: js.UndefOr[Culture] = js.undefined
  
  var formats: js.Array[DateFormat]
}
object TitleOptions {
  
  inline def apply(formats: js.Array[DateFormat]): TitleOptions = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleOptions] (val x: Self) extends AnyVal {
    
    inline def setCulture(value: Culture): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setFormats(value: js.Array[DateFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: DateFormat*): Self = StObject.set(x, "formats", js.Array(value*))
  }
}
