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
  
  @scala.inline
  def apply(): ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = "sharedAction")
    __obj.asInstanceOf[ShareSharedAction]
  }
  
  @scala.inline
  implicit class ShareSharedActionMutableBuilder[Self <: ShareSharedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: sharedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
  }
}
