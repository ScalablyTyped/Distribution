package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends js.Object {
  /**
    * Whether the Grid is enabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether there is padding between the components
    */
  var padded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the Grid can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    padded: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GridProps]
  }
}

