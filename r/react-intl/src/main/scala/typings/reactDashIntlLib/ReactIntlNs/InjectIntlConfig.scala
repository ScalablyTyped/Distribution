package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectIntlConfig extends js.Object {
  var intlPropName: js.UndefOr[java.lang.String] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

object InjectIntlConfig {
  @scala.inline
  def apply(intlPropName: java.lang.String = null, withRef: js.UndefOr[scala.Boolean] = js.undefined): InjectIntlConfig = {
    val __obj = js.Dynamic.literal()
    if (intlPropName != null) __obj.updateDynamic("intlPropName")(intlPropName)
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef)
    __obj.asInstanceOf[InjectIntlConfig]
  }
}

