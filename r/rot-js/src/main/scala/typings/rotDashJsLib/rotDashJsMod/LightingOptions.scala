package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightingOptions extends js.Object {
  var emissionThreshold: js.UndefOr[scala.Double] = js.undefined
  var passes: js.UndefOr[scala.Double] = js.undefined
  var range: js.UndefOr[scala.Double] = js.undefined
}

object LightingOptions {
  @scala.inline
  def apply(
    emissionThreshold: scala.Int | scala.Double = null,
    passes: scala.Int | scala.Double = null,
    range: scala.Int | scala.Double = null
  ): LightingOptions = {
    val __obj = js.Dynamic.literal()
    if (emissionThreshold != null) __obj.updateDynamic("emissionThreshold")(emissionThreshold.asInstanceOf[js.Any])
    if (passes != null) __obj.updateDynamic("passes")(passes.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightingOptions]
  }
}

