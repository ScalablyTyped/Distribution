package typings.reactElemental.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  val disabled: js.UndefOr[Boolean] = js.undefined
  val label: String | ReactNode
  val value: String
}

object Disabled {
  @scala.inline
  def apply(value: String, disabled: js.UndefOr[Boolean] = js.undefined, label: String | ReactNode = null): Disabled = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

