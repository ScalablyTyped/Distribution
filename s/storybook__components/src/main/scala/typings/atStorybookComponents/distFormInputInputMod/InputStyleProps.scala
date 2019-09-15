package typings.atStorybookComponents.distFormInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputStyleProps extends js.Object {
  var align: js.UndefOr[Alignments] = js.undefined
  var size: js.UndefOr[Sizes] = js.undefined
  var valid: js.UndefOr[ValidationStates] = js.undefined
}

object InputStyleProps {
  @scala.inline
  def apply(align: Alignments = null, size: Sizes = null, valid: ValidationStates = null): InputStyleProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (size != null) __obj.updateDynamic("size")(size)
    if (valid != null) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[InputStyleProps]
  }
}

