package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkStyle extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sheet) */
  /* standard dom */
  val sheet: CSSStyleSheet | Null
}
object LinkStyle {
  
  inline def apply(): LinkStyle = {
    val __obj = js.Dynamic.literal(sheet = null)
    __obj.asInstanceOf[LinkStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkStyle] (val x: Self) extends AnyVal {
    
    inline def setSheet(value: CSSStyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    inline def setSheetNull: Self = StObject.set(x, "sheet", null)
  }
}
