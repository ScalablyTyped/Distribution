package typings.rcNotification

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rc-notification.rc-notification/lib/Notification.NotificationProps & {getContainer ? (): std.HTMLElement} */
trait NotificationPropsgetConta extends js.Object {
  var animation: js.UndefOr[String | js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
}

object NotificationPropsgetConta {
  @scala.inline
  def apply(
    animation: String | js.Object = null,
    className: String = null,
    closeIcon: ReactNode = null,
    getContainer: () => HTMLElement = null,
    maxCount: Int | Double = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    transitionName: String = null
  ): NotificationPropsgetConta = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPropsgetConta]
  }
}

