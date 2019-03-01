package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_180 extends js.Object {
  var fixedWidth: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String | reactDashOnsenuiLib.reactDashOnsenuiMod.Modifiers_string] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var rotate: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibNumbers.`90` | reactDashOnsenuiLib.reactDashOnsenuiLibNumbers.`180` | reactDashOnsenuiLib.reactDashOnsenuiLibNumbers.`270`
  ] = js.undefined
  var size: js.UndefOr[scala.Double | reactDashOnsenuiLib.reactDashOnsenuiMod.Modifiers_number] = js.undefined
  var spin: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_180 {
  @scala.inline
  def apply(
    fixedWidth: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String | reactDashOnsenuiLib.reactDashOnsenuiMod.Modifiers_string = null,
    modifier: java.lang.String = null,
    rotate: reactDashOnsenuiLib.reactDashOnsenuiLibNumbers.`90` | reactDashOnsenuiLib.reactDashOnsenuiLibNumbers.`180` | reactDashOnsenuiLib.reactDashOnsenuiLibNumbers.`270` = null,
    size: scala.Double | reactDashOnsenuiLib.reactDashOnsenuiMod.Modifiers_number = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined
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

