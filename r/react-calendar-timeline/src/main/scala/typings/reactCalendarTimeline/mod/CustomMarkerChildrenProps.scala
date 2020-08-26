package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMarkerChildrenProps extends js.Object {
  var date: Double = js.native
  var styles: CSSProperties = js.native
}

object CustomMarkerChildrenProps {
  @scala.inline
  def apply(date: Double, styles: CSSProperties): CustomMarkerChildrenProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMarkerChildrenProps]
  }
  @scala.inline
  implicit class CustomMarkerChildrenPropsOps[Self <: CustomMarkerChildrenProps] (val x: Self) extends AnyVal {
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: CSSProperties): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

