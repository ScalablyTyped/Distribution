package typings
package reactDashOnsenuiLib.reactDashOnsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers_string extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var material: js.UndefOr[java.lang.String] = js.undefined
}

object Modifiers_string {
  @scala.inline
  def apply(default: java.lang.String = null, material: java.lang.String = null): Modifiers_string = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[Modifiers_string]
  }
}

