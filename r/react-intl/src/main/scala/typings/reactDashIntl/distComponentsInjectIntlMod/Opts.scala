package typings.reactDashIntl.distComponentsInjectIntlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts[IntlPropName /* <: String */] extends js.Object {
  var enforceContext: js.UndefOr[Boolean] = js.undefined
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  var intlPropName: js.UndefOr[IntlPropName] = js.undefined
}

object Opts {
  @scala.inline
  def apply[IntlPropName /* <: String */](
    enforceContext: js.UndefOr[Boolean] = js.undefined,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    intlPropName: IntlPropName = null
  ): Opts[IntlPropName] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enforceContext)) __obj.updateDynamic("enforceContext")(enforceContext)
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef)
    if (intlPropName != null) __obj.updateDynamic("intlPropName")(intlPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts[IntlPropName]]
  }
}

