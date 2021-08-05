package typings.reactNativeMaterialUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightElementPressEvent extends StObject {
  
  var action: String
  
  var index: Double
  
  var result: js.UndefOr[js.Any] = js.undefined
}
object RightElementPressEvent {
  
  inline def apply(action: String, index: Double): RightElementPressEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightElementPressEvent]
  }
  
  extension [Self <: RightElementPressEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
