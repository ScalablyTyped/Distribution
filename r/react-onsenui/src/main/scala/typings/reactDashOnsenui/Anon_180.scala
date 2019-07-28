package typings.reactDashOnsenui

import typings.reactDashOnsenui.reactDashOnsenuiMod.Modifiers_number
import typings.reactDashOnsenui.reactDashOnsenuiMod.Modifiers_string
import typings.reactDashOnsenui.reactDashOnsenuiNumbers.`180`
import typings.reactDashOnsenui.reactDashOnsenuiNumbers.`270`
import typings.reactDashOnsenui.reactDashOnsenuiNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_180 extends js.Object {
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String | Modifiers_string] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
  var size: js.UndefOr[Double | Modifiers_number] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
}

object Anon_180 {
  @scala.inline
  def apply(
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    icon: String | Modifiers_string = null,
    modifier: String = null,
    rotate: `90` | `180` | `270` = null,
    size: Double | Modifiers_number = null,
    spin: js.UndefOr[Boolean] = js.undefined
  ): Anon_180 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    __obj.asInstanceOf[Anon_180]
  }
}

