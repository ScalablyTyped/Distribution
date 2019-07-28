package typings.reactDashElemental

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: String | ReactNode
  val value: String
}

object Anon_Disabled {
  @scala.inline
  def apply(label: String | ReactNode, value: String, disabled: js.UndefOr[Boolean] = js.undefined): Anon_Disabled = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

