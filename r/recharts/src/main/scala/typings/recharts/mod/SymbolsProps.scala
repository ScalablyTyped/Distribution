package typings.recharts.mod

import typings.recharts.rechartsStrings.area
import typings.recharts.rechartsStrings.circle
import typings.recharts.rechartsStrings.cross
import typings.recharts.rechartsStrings.diameter
import typings.recharts.rechartsStrings.diamond
import typings.recharts.rechartsStrings.square
import typings.recharts.rechartsStrings.star
import typings.recharts.rechartsStrings.triangle
import typings.recharts.rechartsStrings.wye
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait SymbolsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sizeType: js.UndefOr[area | diameter] = js.undefined
  var `type`: js.UndefOr[circle | cross | diamond | square | star | triangle | wye] = js.undefined
}

object SymbolsProps {
  @scala.inline
  def apply(
    className: String = null,
    cx: Int | Double = null,
    cy: Int | Double = null,
    size: Int | Double = null,
    sizeType: area | diameter = null,
    `type`: circle | cross | diamond | square | star | triangle | wye = null
  ): SymbolsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolsProps]
  }
}

