package typings.storybookComponents.propValueMod

import typings.storybookComponents.propDefMod.PropSummaryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropValueProps extends js.Object {
  var value: js.UndefOr[PropSummaryValue] = js.native
}

object PropValueProps {
  @scala.inline
  def apply(): PropValueProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropValueProps]
  }
  @scala.inline
  implicit class PropValuePropsOps[Self <: PropValueProps] (val x: Self) extends AnyVal {
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
    def setValue(value: PropSummaryValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

