package typings.rcNotification.notificationMod

import typings.rcNotification.noticeMod.DivProps
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

/* Inlined parent std.Omit<rc-notification.rc-notification/lib/Notice.NoticeProps, 'prefixCls' | 'children'> */
trait NoticeContent extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var content: js.UndefOr[ReactNode] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var holder: js.UndefOr[HTMLDivElement] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var props: js.UndefOr[DivProps] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
  var updateKey: js.UndefOr[Key] = js.undefined
}

object NoticeContent {
  @scala.inline
  def apply(
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: ReactNode = null,
    content: ReactNode = null,
    duration: js.UndefOr[Double] = js.undefined,
    holder: HTMLDivElement = null,
    key: Key = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onClose: () => Unit = null,
    prefixCls: String = null,
    props: DivProps = null,
    style: CSSProperties = null,
    update: js.UndefOr[Boolean] = js.undefined,
    updateKey: Key = null
  ): NoticeContent = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.get.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.get.asInstanceOf[js.Any])
    if (updateKey != null) __obj.updateDynamic("updateKey")(updateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeContent]
  }
}

