package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineHeadersProps extends js.Object {
  var calendarHeaderClassName: js.UndefOr[String] = js.native
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.native
  var className: js.UndefOr[String] = js.native
  var headerRef: js.UndefOr[Ref[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TimelineHeadersProps {
  @scala.inline
  def apply(): TimelineHeadersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineHeadersProps]
  }
  @scala.inline
  implicit class TimelineHeadersPropsOps[Self <: TimelineHeadersProps] (val x: Self) extends AnyVal {
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
    def setCalendarHeaderClassName(value: String): Self = this.set("calendarHeaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarHeaderClassName: Self = this.set("calendarHeaderClassName", js.undefined)
    @scala.inline
    def setCalendarHeaderStyle(value: CSSProperties): Self = this.set("calendarHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarHeaderStyle: Self = this.set("calendarHeaderStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setHeaderRefFunction1(value: /* instance */ _ | Null => scala.Unit): Self = this.set("headerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderRef(value: Ref[_]): Self = this.set("headerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRef: Self = this.set("headerRef", js.undefined)
    @scala.inline
    def setHeaderRefNull: Self = this.set("headerRef", null)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

