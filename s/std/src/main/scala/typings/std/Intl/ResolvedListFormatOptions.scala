package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedListFormatOptions extends StObject {
  
  /* standard es2021.intl */
  var locale: String
  
  /* standard es2021.intl */
  var style: ListFormatStyle
  
  /* standard es2021.intl */
  var `type`: ListFormatType
}
object ResolvedListFormatOptions {
  
  inline def apply(locale: String, style: ListFormatStyle, `type`: ListFormatType): ResolvedListFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedListFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedListFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ListFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setType(value: ListFormatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
