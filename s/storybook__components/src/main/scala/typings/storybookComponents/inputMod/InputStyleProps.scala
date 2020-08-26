package typings.storybookComponents.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputStyleProps extends js.Object {
  var align: js.UndefOr[Alignments] = js.native
  var size: js.UndefOr[Sizes] = js.native
  var valid: js.UndefOr[ValidationStates] = js.native
}

object InputStyleProps {
  @scala.inline
  def apply(): InputStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputStyleProps]
  }
  @scala.inline
  implicit class InputStylePropsOps[Self <: InputStyleProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: Alignments): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setSize(value: Sizes): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValid(value: ValidationStates): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

