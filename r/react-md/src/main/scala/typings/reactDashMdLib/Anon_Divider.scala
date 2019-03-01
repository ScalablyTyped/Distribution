package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Divider extends js.Object {
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var primaryText: js.UndefOr[java.lang.String] = js.undefined
  var subheader: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Divider {
  @scala.inline
  def apply(
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    primaryText: java.lang.String = null,
    subheader: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Divider = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText)
    if (!js.isUndefined(subheader)) __obj.updateDynamic("subheader")(subheader)
    __obj.asInstanceOf[Anon_Divider]
  }
}

