package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatPart extends StObject {
  
  /* standard es2018.intl */
  var `type`: NumberFormatPartTypes
  
  /* standard es2018.intl */
  var value: String
}
object NumberFormatPart {
  
  inline def apply(`type`: NumberFormatPartTypes, value: String): NumberFormatPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormatPart] (val x: Self) extends AnyVal {
    
    inline def setType(value: NumberFormatPartTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
