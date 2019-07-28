package typings.reactDashOnsenui.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers_number extends js.Object {
  var default: js.UndefOr[Double] = js.undefined
  var material: js.UndefOr[Double] = js.undefined
}

object Modifiers_number {
  @scala.inline
  def apply(default: Int | Double = null, material: Int | Double = null): Modifiers_number = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers_number]
  }
}

