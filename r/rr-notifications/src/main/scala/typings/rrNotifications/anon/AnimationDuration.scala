package typings.rrNotifications.anon

import typings.react.mod.global.JSX.Element
import typings.rrNotifications.rrNotificationsStrings.left
import typings.rrNotifications.rrNotificationsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDuration extends js.Object {
  /** Duration of the show and hide animations in milliseconds */
  var animationDuration: js.UndefOr[Double] = js.native
  /** Animation timing function / cubic-bezier */
  var animationEasing: js.UndefOr[String] = js.native
  /** Time in milliseconds after which the notification is automatically dismissed */
  var dismissAfter: js.UndefOr[Double] = js.native
  /** Fixed position where all notifications are displayed */
  var position: js.UndefOr[js.Tuple4[String, String, String, String]] = js.native
  /**
    * Horizontal direction which notification appears from. If not provided, the notification will
    * appear from top or bottom, depending on position prop
    */
  var slideFromSide: js.UndefOr[right | left] = js.native
  /** Render prop which passes down removeNotification function and notification payload */
  def renderNotification(args: Payload): Element = js.native
}

object AnimationDuration {
  @scala.inline
  def apply(renderNotification: Payload => Element): AnimationDuration = {
    val __obj = js.Dynamic.literal(renderNotification = js.Any.fromFunction1(renderNotification))
    __obj.asInstanceOf[AnimationDuration]
  }
  @scala.inline
  implicit class AnimationDurationOps[Self <: AnimationDuration] (val x: Self) extends AnyVal {
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
    def setRenderNotification(value: Payload => Element): Self = this.set("renderNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setDismissAfter(value: Double): Self = this.set("dismissAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissAfter: Self = this.set("dismissAfter", js.undefined)
    @scala.inline
    def setPosition(value: js.Tuple4[String, String, String, String]): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSlideFromSide(value: right | left): Self = this.set("slideFromSide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideFromSide: Self = this.set("slideFromSide", js.undefined)
  }
  
}

