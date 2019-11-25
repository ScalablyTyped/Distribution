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
  def apply(value: String, disabled: js.UndefOr[Boolean] = js.undefined, label: String | ReactNode = null): Anon_Disabled = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

