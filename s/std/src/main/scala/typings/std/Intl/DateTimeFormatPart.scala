package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormatPart extends StObject {
  
  var `type`: DateTimeFormatPartTypes = js.native
  
  var value: String = js.native
}
object DateTimeFormatPart {
  
  @scala.inline
  def apply(`type`: DateTimeFormatPartTypes, value: String): DateTimeFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatPart]
  }
  
  @scala.inline
  implicit class DateTimeFormatPartMutableBuilder[Self <: DateTimeFormatPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DateTimeFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
