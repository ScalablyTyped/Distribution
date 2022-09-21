package typings.std.Intl

import typings.std.stdStrings.endRange
import typings.std.stdStrings.shared
import typings.std.stdStrings.startRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberRangeFormatPart
  extends StObject
     with NumberFormatPart {
  
  /* standard esnext.intl */
  var source: startRange | endRange | shared
}
object NumberRangeFormatPart {
  
  inline def apply(source: startRange | endRange | shared, `type`: NumberFormatPartTypes, value: String): NumberRangeFormatPart = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberRangeFormatPart]
  }
  
  extension [Self <: NumberRangeFormatPart](x: Self) {
    
    inline def setSource(value: startRange | endRange | shared): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
