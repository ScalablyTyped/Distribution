package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableShrink extends js.Object {
  var disableShrink: js.UndefOr[scala.Boolean] = js.undefined
  var max: scala.Double
  var min: scala.Double
}

object Anon_DisableShrink {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double, disableShrink: js.UndefOr[scala.Boolean] = js.undefined): Anon_DisableShrink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    if (!js.isUndefined(disableShrink)) __obj.updateDynamic("disableShrink")(disableShrink)
    __obj.asInstanceOf[Anon_DisableShrink]
  }
}

