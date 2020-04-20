package typings.reactPose.typesMod

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
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
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], onRegistered = js.Any.fromFunction1(onRegistered), poseConfig = poseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRegistration]
  }
}

