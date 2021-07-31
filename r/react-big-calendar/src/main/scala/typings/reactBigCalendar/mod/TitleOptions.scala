package typings.reactBigCalendar.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleOptions
  extends StObject
     with /* propName */ StringDictionary[js.Any] {
  
  var culture: js.UndefOr[String] = js.undefined
  
  var formats: js.Array[DateFormat]
}
object TitleOptions {
  
  @scala.inline
  def apply(formats: js.Array[DateFormat]): TitleOptions = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleOptions]
  }
  
  @scala.inline
  implicit class TitleOptionsMutableBuilder[Self <: TitleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Array[DateFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsVarargs(value: DateFormat*): Self = StObject.set(x, "formats", js.Array(value :_*))
  }
}
