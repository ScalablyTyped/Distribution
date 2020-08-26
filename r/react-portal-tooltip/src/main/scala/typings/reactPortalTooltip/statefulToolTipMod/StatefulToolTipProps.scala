package typings.reactPortalTooltip.statefulToolTipMod

import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactPortalTooltip.toolTipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulToolTipProps extends TooltipProps {
  var className: js.UndefOr[String] = js.native
}

object StatefulToolTipProps {
  @scala.inline
  def apply(parent: String | Element | RefObject[_]): StatefulToolTipProps = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulToolTipProps]
  }
  @scala.inline
  implicit class StatefulToolTipPropsOps[Self <: StatefulToolTipProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

