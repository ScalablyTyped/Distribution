package typings.rcNotification

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rc-notification.rc-notification/lib/Notice.NoticeProps & {  key  :react.react.Key} */
trait NoticePropskeyKey extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var duration: js.UndefOr[Double | Null] = js.undefined
  /** @private Only for internal usage. We don't promise that we will refactor this */
  var holder: js.UndefOr[HTMLDivElement] = js.undefined
  var key: Key
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
}

object NoticePropskeyKey {
  @scala.inline
  def apply(
    key: Key,
    prefixCls: String,
    children: ReactNode = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: ReactNode = null,
    duration: Int | Double = null,
    holder: HTMLDivElement = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onClose: () => Unit = null,
    style: CSSProperties = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): NoticePropskeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticePropskeyKey]
  }
}

