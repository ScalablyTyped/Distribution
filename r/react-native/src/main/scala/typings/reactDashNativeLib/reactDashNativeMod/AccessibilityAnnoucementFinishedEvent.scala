package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityAnnoucementFinishedEvent extends js.Object {
  var announcement: java.lang.String
  var success: scala.Boolean
}

object AccessibilityAnnoucementFinishedEvent {
  @scala.inline
  def apply(announcement: java.lang.String, success: scala.Boolean): AccessibilityAnnoucementFinishedEvent = {
    val __obj = js.Dynamic.literal(announcement = announcement, success = success)
  
    __obj.asInstanceOf[AccessibilityAnnoucementFinishedEvent]
  }
}

