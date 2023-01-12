package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterceptResolutionState extends StObject {
  
  var action: InterceptResolutionAction
  
  var priority: js.UndefOr[Double] = js.undefined
}
object InterceptResolutionState {
  
  inline def apply(action: InterceptResolutionAction): InterceptResolutionState = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptResolutionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterceptResolutionState] (val x: Self) extends AnyVal {
    
    inline def setAction(value: InterceptResolutionAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
