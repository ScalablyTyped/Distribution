package typings
package slateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Match extends js.Object {
  var `match`: js.UndefOr[slateLib.slateMod.ObjectAndType | js.Array[slateLib.slateMod.ObjectAndType]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Match {
  @scala.inline
  def apply(
    `match`: slateLib.slateMod.ObjectAndType | js.Array[slateLib.slateMod.ObjectAndType] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): Anon_Match = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Match]
  }
}

