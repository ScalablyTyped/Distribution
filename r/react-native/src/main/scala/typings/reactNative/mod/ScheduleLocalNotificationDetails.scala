package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.day
import typings.reactNative.reactNativeStrings.hour
import typings.reactNative.reactNativeStrings.minute
import typings.reactNative.reactNativeStrings.month
import typings.reactNative.reactNativeStrings.week
import typings.reactNative.reactNativeStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleLocalNotificationDetails extends StObject {
  
  var alertAction: js.UndefOr[String] = js.native
  
  var alertBody: js.UndefOr[String] = js.native
  
  var alertTitle: js.UndefOr[String] = js.native
  
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.native
  
  var category: js.UndefOr[String] = js.native
  
  var fireDate: js.UndefOr[Double | String] = js.native
  
  var isSilent: js.UndefOr[Boolean] = js.native
  
  var repeatInterval: js.UndefOr[year | month | week | day | hour | minute] = js.native
  
  var soundName: js.UndefOr[String] = js.native
  
  var userInfo: js.UndefOr[js.Object] = js.native
}
object ScheduleLocalNotificationDetails {
  
  @scala.inline
  def apply(): ScheduleLocalNotificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
  
  @scala.inline
  implicit class ScheduleLocalNotificationDetailsMutableBuilder[Self <: ScheduleLocalNotificationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertActionUndefined: Self = StObject.set(x, "alertAction", js.undefined)
    
    @scala.inline
    def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertBodyUndefined: Self = StObject.set(x, "alertBody", js.undefined)
    
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
    def setFireDate(value: Double | String): Self = StObject.set(x, "fireDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFireDateUndefined: Self = StObject.set(x, "fireDate", js.undefined)
    
    @scala.inline
    def setIsSilent(value: Boolean): Self = StObject.set(x, "isSilent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
    
    @scala.inline
    def setRepeatInterval(value: year | month | week | day | hour | minute): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
    
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
