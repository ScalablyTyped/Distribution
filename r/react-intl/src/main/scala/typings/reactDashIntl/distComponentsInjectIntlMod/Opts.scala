package typings.reactDashIntl.distComponentsInjectIntlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts[IntlPropName /* <: String */, ForwardRef /* <: Boolean */] extends js.Object {
  var enforceContext: js.UndefOr[Boolean] = js.undefined
  var forwardRef: js.UndefOr[ForwardRef] = js.undefined
  var intlPropName: js.UndefOr[IntlPropName] = js.undefined
}

object Opts {
  @scala.inline
  def apply[IntlPropName /* <: String */, ForwardRef /* <: Boolean */](
    enforceContext: js.UndefOr[Boolean] = js.undefined,
    forwardRef: ForwardRef = null,
    intlPropName: IntlPropName = null
  ): Opts[IntlPropName, ForwardRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enforceContext)) __obj.updateDynamic("enforceContext")(enforceContext.asInstanceOf[js.Any])
    if (forwardRef != null) __obj.updateDynamic("forwardRef")(forwardRef.asInstanceOf[js.Any])
    if (intlPropName != null) __obj.updateDynamic("intlPropName")(intlPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts[IntlPropName, ForwardRef]]
  }
}

