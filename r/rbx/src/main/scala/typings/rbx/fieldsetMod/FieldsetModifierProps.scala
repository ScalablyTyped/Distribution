package typings.rbx.fieldsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsetModifierProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
}

object FieldsetModifierProps {
  @scala.inline
  def apply(disabled: js.UndefOr[Boolean] = js.undefined): FieldsetModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsetModifierProps]
  }
}

