package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResizeProps extends js.Object {
  var leftClassName: js.UndefOr[String] = js.undefined
  var leftStyle: js.UndefOr[CSSProperties] = js.undefined
  var rightClassName: js.UndefOr[String] = js.undefined
  var rightStyle: js.UndefOr[CSSProperties] = js.undefined
}

object GetResizeProps {
  @scala.inline
  def apply(
    leftClassName: String = null,
    leftStyle: CSSProperties = null,
    rightClassName: String = null,
    rightStyle: CSSProperties = null
  ): GetResizeProps = {
    val __obj = js.Dynamic.literal()
    if (leftClassName != null) __obj.updateDynamic("leftClassName")(leftClassName.asInstanceOf[js.Any])
    if (leftStyle != null) __obj.updateDynamic("leftStyle")(leftStyle.asInstanceOf[js.Any])
    if (rightClassName != null) __obj.updateDynamic("rightClassName")(rightClassName.asInstanceOf[js.Any])
    if (rightStyle != null) __obj.updateDynamic("rightStyle")(rightStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResizeProps]
  }
}

