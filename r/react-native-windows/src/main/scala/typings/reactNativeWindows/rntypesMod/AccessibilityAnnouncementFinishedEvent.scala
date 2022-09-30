package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// iOS-only Event
trait AccessibilityAnnouncementFinishedEvent extends StObject {
  
  var announcement: String
  
  var success: Boolean
}
object AccessibilityAnnouncementFinishedEvent {
  
  inline def apply(announcement: String, success: Boolean): AccessibilityAnnouncementFinishedEvent = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAnnouncementFinishedEvent]
  }
  
  extension [Self <: AccessibilityAnnouncementFinishedEvent](x: Self) {
    
    inline def setAnnouncement(value: String): Self = StObject.set(x, "announcement", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
