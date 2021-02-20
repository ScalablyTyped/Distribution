package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// iOS-only Event
@js.native
trait AccessibilityAnnouncementFinishedEvent extends StObject {
  
  var announcement: String = js.native
  
  var success: Boolean = js.native
}
object AccessibilityAnnouncementFinishedEvent {
  
  @scala.inline
  def apply(announcement: String, success: Boolean): AccessibilityAnnouncementFinishedEvent = {
    val __obj = js.Dynamic.literal(announcement = announcement.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAnnouncementFinishedEvent]
  }
  
  @scala.inline
  implicit class AccessibilityAnnouncementFinishedEventMutableBuilder[Self <: AccessibilityAnnouncementFinishedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnouncement(value: String): Self = StObject.set(x, "announcement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
