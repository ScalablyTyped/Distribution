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
  var dateClassName: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var iconClassName: js.UndefOr[String] = js.undefined
  var iconOnClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var intersectionObserverProps: js.UndefOr[js.Any] = js.undefined
  var onTimelineElementClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textClassName: js.UndefOr[String] = js.undefined
}

object VerticalTimelineElementProps {
  @scala.inline
  def apply(
    className: String = null,
    contentArrowStyle: CSSProperties = null,
    contentStyle: CSSProperties = null,
    date: String = null,
    dateClassName: String = null,
    icon: ReactNode = null,
    iconClassName: String = null,
    iconOnClick: () => Unit = null,
    iconStyle: CSSProperties = null,
    id: String = null,
    intersectionObserverProps: js.Any = null,
    onTimelineElementClick: () => Unit = null,
    position: String = null,
    style: CSSProperties = null,
    textClassName: String = null
  ): VerticalTimelineElementProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentArrowStyle != null) __obj.updateDynamic("contentArrowStyle")(contentArrowStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateClassName != null) __obj.updateDynamic("dateClassName")(dateClassName.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (iconOnClick != null) __obj.updateDynamic("iconOnClick")(js.Any.fromFunction0(iconOnClick))
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (intersectionObserverProps != null) __obj.updateDynamic("intersectionObserverProps")(intersectionObserverProps.asInstanceOf[js.Any])
    if (onTimelineElementClick != null) __obj.updateDynamic("onTimelineElementClick")(js.Any.fromFunction0(onTimelineElementClick))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textClassName != null) __obj.updateDynamic("textClassName")(textClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalTimelineElementProps]
  }
}

