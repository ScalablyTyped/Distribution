package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItemBase[DateType] extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.native
  var canMove: js.UndefOr[Boolean] = js.native
  var canResize: js.UndefOr[Boolean | left | right | both] = js.native
  var className: js.UndefOr[String] = js.native
  var end_time: DateType = js.native
  var group: Id = js.native
  var id: Id = js.native
  var itemProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  var start_time: DateType = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object TimelineItemBase {
  @scala.inline
  def apply[DateType](end_time: DateType, group: Id, id: Id, start_time: DateType): TimelineItemBase[DateType] = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItemBase[DateType]]
  }
  @scala.inline
  implicit class TimelineItemBaseOps[Self <: TimelineItemBase[_], DateType] (val x: Self with TimelineItemBase[DateType]) extends AnyVal {
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
    def setEnd_time(value: DateType): Self = this.set("end_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Id): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Id): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_time(value: DateType): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanChangeGroup(value: Boolean): Self = this.set("canChangeGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanChangeGroup: Self = this.set("canChangeGroup", js.undefined)
    @scala.inline
    def setCanMove(value: Boolean): Self = this.set("canMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanMove: Self = this.set("canMove", js.undefined)
    @scala.inline
    def setCanResize(value: Boolean | left | right | both): Self = this.set("canResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanResize: Self = this.set("canResize", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setItemProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("itemProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProps: Self = this.set("itemProps", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

