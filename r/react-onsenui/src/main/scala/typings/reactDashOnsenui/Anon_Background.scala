package typings.reactDashOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(
    background: String = null,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null
  ): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    __obj.asInstanceOf[Anon_Background]
  }
}

