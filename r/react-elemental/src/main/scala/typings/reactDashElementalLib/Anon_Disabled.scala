package typings
package reactDashElementalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  val disabled: js.UndefOr[scala.Boolean] = js.undefined
  val label: java.lang.String | reactLib.reactMod.ReactNode
  val value: java.lang.String
}

object Anon_Disabled {
  @scala.inline
  def apply(
    label: java.lang.String | reactLib.reactMod.ReactNode,
    value: java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

