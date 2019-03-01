package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PolarGridProps extends js.Object {
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
  var gridType: js.UndefOr[rechartsLib.rechartsLibStrings.polygon | rechartsLib.rechartsLibStrings.circle] = js.undefined
  var innerRadius: js.UndefOr[scala.Double] = js.undefined
  var outerRadius: js.UndefOr[scala.Double] = js.undefined
  var polarAngles: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var polarRadius: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object PolarGridProps {
  @scala.inline
  def apply(
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    gridType: rechartsLib.rechartsLibStrings.polygon | rechartsLib.rechartsLibStrings.circle = null,
    innerRadius: scala.Int | scala.Double = null,
    outerRadius: scala.Int | scala.Double = null,
    polarAngles: js.Array[scala.Double] = null,
    polarRadius: js.Array[scala.Double] = null
  ): PolarGridProps = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (gridType != null) __obj.updateDynamic("gridType")(gridType.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (polarAngles != null) __obj.updateDynamic("polarAngles")(polarAngles)
    if (polarRadius != null) __obj.updateDynamic("polarRadius")(polarRadius)
    __obj.asInstanceOf[PolarGridProps]
  }
}

