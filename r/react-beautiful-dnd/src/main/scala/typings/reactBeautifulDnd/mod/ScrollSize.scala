package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollSize extends StObject {
  
  var scrollHeight: Double
  
  var scrollWidth: Double
}
object ScrollSize {
  
  @scala.inline
  def apply(scrollHeight: Double, scrollWidth: Double): ScrollSize = {
    val __obj = js.Dynamic.literal(scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSize]
  }
  
  @scala.inline
  implicit class ScrollSizeMutableBuilder[Self <: ScrollSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
  }
}
