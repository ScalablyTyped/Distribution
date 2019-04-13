package typings
package sparklyLib.sparklyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[sparklyLib.sparklyLibStrings.fire] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    style: sparklyLib.sparklyLibStrings.fire = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Options]
  }
}

