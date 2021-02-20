package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresentLocalNotificationDetails extends StObject {
  
  var alertAction: String = js.native
  
  var alertBody: String = js.native
  
  var alertTitle: js.UndefOr[String] = js.native
  
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var soundName: js.UndefOr[String] = js.native
  
  var userInfo: js.UndefOr[js.Object] = js.native
}
object PresentLocalNotificationDetails {
  
  @scala.inline
  def apply(alertAction: String, alertBody: String): PresentLocalNotificationDetails = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentLocalNotificationDetails]
  }
  
  @scala.inline
  implicit class PresentLocalNotificationDetailsMutableBuilder[Self <: PresentLocalNotificationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertTitle(value: String): Self = StObject.set(x, "alertTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertTitleUndefined: Self = StObject.set(x, "alertTitle", js.undefined)
    
    @scala.inline
    def setApplicationIconBadgeNumber(value: Double): Self = StObject.set(x, "applicationIconBadgeNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIconBadgeNumberUndefined: Self = StObject.set(x, "applicationIconBadgeNumber", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setSoundName(value: String): Self = StObject.set(x, "soundName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundNameUndefined: Self = StObject.set(x, "soundName", js.undefined)
    
    @scala.inline
    def setUserInfo(value: js.Object): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
