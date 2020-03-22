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
  def apply(align: Alignments = null, size: Sizes = null, valid: ValidationStates = null): InputStyleProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputStyleProps]
  }
}

