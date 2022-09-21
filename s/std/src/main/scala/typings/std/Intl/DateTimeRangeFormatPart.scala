package typings.std.Intl

import typings.std.stdStrings.endRange
import typings.std.stdStrings.shared
import typings.std.stdStrings.startRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeRangeFormatPart
  extends StObject
     with DateTimeFormatPart {
  
  /* standard es2021.intl */
  var source: startRange | endRange | shared
}
object DateTimeRangeFormatPart {
  
  inline def apply(source: startRange | endRange | shared, `type`: DateTimeFormatPartTypes, value: String): DateTimeRangeFormatPart = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRangeFormatPart]
  }
  
  extension [Self <: DateTimeRangeFormatPart](x: Self) {
    
    inline def setSource(value: startRange | endRange | shared): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
