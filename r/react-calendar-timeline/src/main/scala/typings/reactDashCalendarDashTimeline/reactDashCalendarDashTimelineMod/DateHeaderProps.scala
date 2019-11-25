package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateHeaderProps[Data] extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ SidebarHeaderChildrenFnProps[Data], ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var headerData: js.UndefOr[Data] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var intervalRenderer: js.UndefOr[js.Function1[/* props */ js.UndefOr[IntervalRenderer[Data]], ReactNode]] = js.undefined
  var labelFormat: js.UndefOr[
    String | (js.Function3[
      /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ])
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var unit: js.UndefOr[Unit | primaryHeader] = js.undefined
}

object DateHeaderProps {
  @scala.inline
  def apply[Data](
    children: /* props */ SidebarHeaderChildrenFnProps[Data] => ReactNode = null,
    className: String = null,
    headerData: Data = null,
    height: Int | Double = null,
    intervalRenderer: /* props */ js.UndefOr[IntervalRenderer[Data]] => ReactNode = null,
    labelFormat: String | (js.Function3[
      /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ]) = null,
    style: CSSProperties = null,
    unit: Unit | primaryHeader = null
  ): DateHeaderProps[Data] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (intervalRenderer != null) __obj.updateDynamic("intervalRenderer")(js.Any.fromFunction1(intervalRenderer))
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateHeaderProps[Data]]
  }
}

