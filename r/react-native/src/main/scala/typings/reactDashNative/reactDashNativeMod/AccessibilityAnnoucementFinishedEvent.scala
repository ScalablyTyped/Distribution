package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityAnnoucementFinishedEvent extends js.Object {
  var announcement: String
  var success: Boolean
}

object AccessibilityAnnoucementFinishedEvent {
  @scala.inline
  def apply(announcement: String, success: Boolean): AccessibilityAnnoucementFinishedEvent = {
    val __obj = js.Dynamic.literal(announcement = announcement, success = success)
  
    __obj.asInstanceOf[AccessibilityAnnoucementFinishedEvent]
  }
}

