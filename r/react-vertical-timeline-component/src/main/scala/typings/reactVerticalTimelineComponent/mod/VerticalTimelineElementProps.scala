package typings.reactVerticalTimelineComponent.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalTimelineElementProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentArrowStyle: js.UndefOr[CSSProperties] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var iconOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var visibilitySensorProps: js.UndefOr[js.Any] = js.undefined
}

object VerticalTimelineElementProps {
  @scala.inline
  def apply(
    className: String = null,
    contentArrowStyle: CSSProperties = null,
    contentStyle: CSSProperties = null,
    date: String = null,
    icon: ReactNode = null,
    iconOnClick: () => Unit = null,
    iconStyle: CSSProperties = null,
    id: String = null,
    position: String = null,
    style: CSSProperties = null,
    visibilitySensorProps: js.Any = null
  ): VerticalTimelineElementProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentArrowStyle != null) __obj.updateDynamic("contentArrowStyle")(contentArrowStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconOnClick != null) __obj.updateDynamic("iconOnClick")(js.Any.fromFunction0(iconOnClick))
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visibilitySensorProps != null) __obj.updateDynamic("visibilitySensorProps")(visibilitySensorProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalTimelineElementProps]
  }
}

