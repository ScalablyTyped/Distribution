package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.day
import typings.reactNativeWindows.reactNativeWindowsStrings.hour
import typings.reactNativeWindows.reactNativeWindowsStrings.minute
import typings.reactNativeWindows.reactNativeWindowsStrings.month
import typings.reactNativeWindows.reactNativeWindowsStrings.week
import typings.reactNativeWindows.reactNativeWindowsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleLocalNotificationDetails extends StObject {
  
  var alertAction: js.UndefOr[String] = js.undefined
  
  var alertBody: js.UndefOr[String] = js.undefined
  
  var alertTitle: js.UndefOr[String] = js.undefined
  
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var fireDate: js.UndefOr[Double | String] = js.undefined
  
  var isSilent: js.UndefOr[Boolean] = js.undefined
  
  var repeatInterval: js.UndefOr[year | month | week | day | hour | minute] = js.undefined
  
  var soundName: js.UndefOr[String] = js.undefined
  
  var userInfo: js.UndefOr[js.Object] = js.undefined
}
object ScheduleLocalNotificationDetails {
  
  inline def apply(): ScheduleLocalNotificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleLocalNotificationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleLocalNotificationDetails] (val x: Self) extends AnyVal {
    
    inline def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    inline def setAlertActionUndefined: Self = StObject.set(x, "alertAction", js.undefined)
    
    inline def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    inline def setAlertBodyUndefined: Self = StObject.set(x, "alertBody", js.undefined)
    
    inline def setAlertTitle(value: String): Self = StObject.set(x, "alertTitle", value.asInstanceOf[js.Any])
    
    inline def setAlertTitleUndefined: Self = StObject.set(x, "alertTitle", js.undefined)
    
    inline def setApplicationIconBadgeNumber(value: Double): Self = StObject.set(x, "applicationIconBadgeNumber", value.asInstanceOf[js.Any])
    
    inline def setApplicationIconBadgeNumberUndefined: Self = StObject.set(x, "applicationIconBadgeNumber", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setFireDate(value: Double | String): Self = StObject.set(x, "fireDate", value.asInstanceOf[js.Any])
    
    inline def setFireDateUndefined: Self = StObject.set(x, "fireDate", js.undefined)
    
    inline def setIsSilent(value: Boolean): Self = StObject.set(x, "isSilent", value.asInstanceOf[js.Any])
    
    inline def setIsSilentUndefined: Self = StObject.set(x, "isSilent", js.undefined)
    
    inline def setRepeatInterval(value: year | month | week | day | hour | minute): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
    
    inline def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
    
    inline def setSoundName(value: String): Self = StObject.set(x, "soundName", value.asInstanceOf[js.Any])
    
    inline def setSoundNameUndefined: Self = StObject.set(x, "soundName", js.undefined)
    
    inline def setUserInfo(value: js.Object): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
