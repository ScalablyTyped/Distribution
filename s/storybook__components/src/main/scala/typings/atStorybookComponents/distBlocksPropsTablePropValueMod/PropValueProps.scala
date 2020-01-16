package typings.atStorybookComponents.distBlocksPropsTablePropValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropValueProps extends js.Object {
  var value: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropSummaryValue */ js.Any
  ] = js.undefined
}

object PropValueProps {
  @scala.inline
  def apply(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PropSummaryValue */ js.Any = null
  ): PropValueProps = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropValueProps]
  }
}

