package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hasnextpage extends StObject {
  
  var end_cursor: js.UndefOr[String] = js.undefined
  
  var has_next_page: Boolean
  
  var start_cursor: js.UndefOr[String] = js.undefined
}
object Hasnextpage {
  
  inline def apply(has_next_page: Boolean): Hasnextpage = {
    val __obj = js.Dynamic.literal(has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hasnextpage]
  }
  
  extension [Self <: Hasnextpage](x: Self) {
    
    inline def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
    
    inline def setEnd_cursorUndefined: Self = StObject.set(x, "end_cursor", js.undefined)
    
    inline def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
    
    inline def setStart_cursor(value: String): Self = StObject.set(x, "start_cursor", value.asInstanceOf[js.Any])
    
    inline def setStart_cursorUndefined: Self = StObject.set(x, "start_cursor", js.undefined)
  }
}
