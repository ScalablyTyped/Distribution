package typings.rrNotifications.anon

import typings.react.mod.global.JSX.Element
import typings.rrNotifications.rrNotificationsStrings.left
import typings.rrNotifications.rrNotificationsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationDuration extends js.Object {
  /** Duration of the show and hide animations in milliseconds */
  var animationDuration: js.UndefOr[Double] = js.undefined
  /** Animation timing function / cubic-bezier */
  var animationEasing: js.UndefOr[String] = js.undefined
  /** Time in milliseconds after which the notification is automatically dismissed */
  var dismissAfter: js.UndefOr[Double] = js.undefined
  /** Fixed position where all notifications are displayed */
  var position: js.UndefOr[js.Tuple4[String, String, String, String]] = js.undefined
  /**
    * Horizontal direction which notification appears from. If not provided, the notification will
    * appear from top or bottom, depending on position prop
    */
  var slideFromSide: js.UndefOr[right | left] = js.undefined
  /** Render prop which passes down removeNotification function and notification payload */
  def renderNotification(args: Payload): Element
}

object AnimationDuration {
  @scala.inline
  def apply(
    renderNotification: Payload => Element,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: String = null,
    dismissAfter: js.UndefOr[Double] = js.undefined,
    position: js.Tuple4[String, String, String, String] = null,
    slideFromSide: right | left = null
  ): AnimationDuration = {
    val __obj = js.Dynamic.literal(renderNotification = js.Any.fromFunction1(renderNotification))
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissAfter)) __obj.updateDynamic("dismissAfter")(dismissAfter.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (slideFromSide != null) __obj.updateDynamic("slideFromSide")(slideFromSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
}

