package typings.rcTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollLeft extends StObject {
  
  var scrollLeft: Double
}
object ScrollLeft {
  
  inline def apply(scrollLeft: Double): ScrollLeft = {
    val __obj = js.Dynamic.literal(scrollLeft = scrollLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollLeft]
  }
  
  extension [Self <: ScrollLeft](x: Self) {
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
  }
}
