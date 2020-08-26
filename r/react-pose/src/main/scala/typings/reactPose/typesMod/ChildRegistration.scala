package typings.reactPose.typesMod

import typings.popmotionPose.typesMod.DomPopmotionConfig
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildRegistration extends js.Object {
  var element: Element = js.native
  var poseConfig: DomPopmotionConfig = js.native
  def onRegistered(poser: DomPopmotionPoser): Unit = js.native
}

object ChildRegistration {
  @scala.inline
  def apply(element: Element, onRegistered: DomPopmotionPoser => Unit, poseConfig: DomPopmotionConfig): ChildRegistration = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], onRegistered = js.Any.fromFunction1(onRegistered), poseConfig = poseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildRegistration]
  }
  @scala.inline
  implicit class ChildRegistrationOps[Self <: ChildRegistration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElement(value: Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRegistered(value: DomPopmotionPoser => Unit): Self = this.set("onRegistered", js.Any.fromFunction1(value))
    @scala.inline
    def setPoseConfig(value: DomPopmotionConfig): Self = this.set("poseConfig", value.asInstanceOf[js.Any])
  }
  
}

