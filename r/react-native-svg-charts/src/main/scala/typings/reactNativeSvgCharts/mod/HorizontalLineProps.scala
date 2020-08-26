package typings.reactNativeSvgCharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalLineProps extends js.Object {
  var stroke: String = js.native
}

object HorizontalLineProps {
  @scala.inline
  def apply(stroke: String): HorizontalLineProps = {
    val __obj = js.Dynamic.literal(stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineProps]
  }
  @scala.inline
  implicit class HorizontalLinePropsOps[Self <: HorizontalLineProps] (val x: Self) extends AnyVal {
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
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
  }
  
}

