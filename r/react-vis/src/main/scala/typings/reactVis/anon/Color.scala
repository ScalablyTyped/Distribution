package typings.reactVis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var title: String
}

object Color {
  @scala.inline
  def apply(title: String, color: String = null, disabled: js.UndefOr[Boolean] = js.undefined): Color = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

