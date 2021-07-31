package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endcursor extends StObject {
  
  var end_cursor: String
  
  var has_next_page: Boolean
}
object Endcursor {
  
  @scala.inline
  def apply(end_cursor: String, has_next_page: Boolean): Endcursor = {
    val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endcursor]
  }
  
  @scala.inline
  implicit class EndcursorMutableBuilder[Self <: Endcursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
  }
}
