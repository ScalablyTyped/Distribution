package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait SymbolsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var sizeType: js.UndefOr[rechartsLib.rechartsLibStrings.area | rechartsLib.rechartsLibStrings.diameter] = js.undefined
  var `type`: js.UndefOr[
    rechartsLib.rechartsLibStrings.circle | rechartsLib.rechartsLibStrings.cross | rechartsLib.rechartsLibStrings.diamond | rechartsLib.rechartsLibStrings.square | rechartsLib.rechartsLibStrings.star | rechartsLib.rechartsLibStrings.triangle | rechartsLib.rechartsLibStrings.wye
  ] = js.undefined
}

object SymbolsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    sizeType: rechartsLib.rechartsLibStrings.area | rechartsLib.rechartsLibStrings.diameter = null,
    `type`: rechartsLib.rechartsLibStrings.circle | rechartsLib.rechartsLibStrings.cross | rechartsLib.rechartsLibStrings.diamond | rechartsLib.rechartsLibStrings.square | rechartsLib.rechartsLibStrings.star | rechartsLib.rechartsLibStrings.triangle | rechartsLib.rechartsLibStrings.wye = null
  ): SymbolsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolsProps]
  }
}

