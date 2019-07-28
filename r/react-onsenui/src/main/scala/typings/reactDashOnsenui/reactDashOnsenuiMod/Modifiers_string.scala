package typings.reactDashOnsenui.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers_string extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var material: js.UndefOr[String] = js.undefined
}

object Modifiers_string {
  @scala.inline
  def apply(default: String = null, material: String = null): Modifiers_string = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[Modifiers_string]
  }
}

