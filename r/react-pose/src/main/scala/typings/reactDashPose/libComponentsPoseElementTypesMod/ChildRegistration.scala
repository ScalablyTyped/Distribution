package typings.reactDashPose.libComponentsPoseElementTypesMod

import typings.popmotionDashPose.libTypesMod.DomPopmotionConfig
import typings.popmotionDashPose.libTypesMod.DomPopmotionPoser
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildRegistration extends js.Object {
  var element: Element
  var poseConfig: DomPopmotionConfig
  def onRegistered(poser: DomPopmotionPoser): Unit
}

object ChildRegistration {
  @scala.inline
  def apply(element: Element, onRegistered: DomPopmotionPoser => Unit, poseConfig: DomPopmotionConfig): ChildRegistration = {
    val __obj = js.Dynamic.literal(element = element, onRegistered = js.Any.fromFunction1(onRegistered), poseConfig = poseConfig)
  
    __obj.asInstanceOf[ChildRegistration]
  }
}

