package typings.reactSwitchCase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchProps extends js.Object {
  var condition: js.Any = js.native
}

object SwitchProps {
  @scala.inline
  def apply(condition: js.Any): SwitchProps = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
  @scala.inline
  implicit class SwitchPropsOps[Self <: SwitchProps] (val x: Self) extends AnyVal {
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
    def setCondition(value: js.Any): Self = this.set("condition", value.asInstanceOf[js.Any])
  }
  
}

