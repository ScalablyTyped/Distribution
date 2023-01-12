package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSize extends StObject {
  
  var scrollHeight: Double
  
  var scrollWidth: Double
}
object ScrollSize {
  
  inline def apply(scrollHeight: Double, scrollWidth: Double): ScrollSize = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollSize] (val x: Self) extends AnyVal {
    
    inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
  }
}
