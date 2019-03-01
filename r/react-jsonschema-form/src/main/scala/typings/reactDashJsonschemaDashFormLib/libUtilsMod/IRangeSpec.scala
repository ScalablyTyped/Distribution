package typings
package reactDashJsonschemaDashFormLib.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRangeSpec extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object IRangeSpec {
  @scala.inline
  def apply(
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): IRangeSpec = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRangeSpec]
  }
}

