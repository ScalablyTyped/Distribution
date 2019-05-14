package typings
package reactDashPoseLib.libComponentsPoseElementTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildRegistration extends js.Object {
  var element: stdLib.Element
  var poseConfig: popmotionDashPoseLib.libTypesMod.DomPopmotionConfig
  def onRegistered(poser: popmotionDashPoseLib.libTypesMod.DomPopmotionPoser): scala.Unit
}

object ChildRegistration {
  @scala.inline
  def apply(
    element: stdLib.Element,
    onRegistered: popmotionDashPoseLib.libTypesMod.DomPopmotionPoser => scala.Unit,
    poseConfig: popmotionDashPoseLib.libTypesMod.DomPopmotionConfig
  ): ChildRegistration = {
    val __obj = js.Dynamic.literal(element = element, onRegistered = js.Any.fromFunction1(onRegistered), poseConfig = poseConfig)
  
    __obj.asInstanceOf[ChildRegistration]
  }
}

