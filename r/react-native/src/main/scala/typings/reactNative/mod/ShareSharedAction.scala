package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.sharedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareSharedAction
  extends StObject
     with ShareAction {
  
  var action: sharedAction
  
  var activityType: js.UndefOr[String] = js.undefined
}
object ShareSharedAction {
  
  inline def apply(): ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = "sharedAction")
    __obj.asInstanceOf[ShareSharedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareSharedAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: sharedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
  }
}
