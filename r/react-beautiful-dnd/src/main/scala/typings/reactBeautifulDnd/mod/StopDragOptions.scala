package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDragOptions extends StObject {
  
  var shouldBlockNextClick: Boolean
}
object StopDragOptions {
  
  inline def apply(shouldBlockNextClick: Boolean): StopDragOptions = {
    val __obj = js.Dynamic.literal(shouldBlockNextClick = shouldBlockNextClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDragOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopDragOptions] (val x: Self) extends AnyVal {
    
    inline def setShouldBlockNextClick(value: Boolean): Self = StObject.set(x, "shouldBlockNextClick", value.asInstanceOf[js.Any])
  }
}
