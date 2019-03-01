package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers_number extends js.Object {
  var default: js.UndefOr[scala.Double] = js.undefined
  var material: js.UndefOr[scala.Double] = js.undefined
}

object Modifiers_number {
  @scala.inline
  def apply(default: scala.Int | scala.Double = null, material: scala.Int | scala.Double = null): Modifiers_number = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers_number]
  }
}

