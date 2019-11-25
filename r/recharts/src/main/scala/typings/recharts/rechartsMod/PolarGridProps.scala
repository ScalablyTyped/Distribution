package typings.recharts.rechartsMod

import typings.recharts.rechartsStrings.circle
import typings.recharts.rechartsStrings.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof recharts.recharts.PresentationAttributes<number, number> ]:? recharts.recharts.PresentationAttributes<number, number>[P]} */ trait PolarGridProps extends js.Object {
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var gridType: js.UndefOr[polygon | circle] = js.undefined
  var innerRadius: js.UndefOr[Double] = js.undefined
  var outerRadius: js.UndefOr[Double] = js.undefined
  var polarAngles: js.UndefOr[js.Array[Double]] = js.undefined
  var polarRadius: js.UndefOr[js.Array[Double]] = js.undefined
}

object PolarGridProps {
  @scala.inline
  def apply(
    cx: Int | Double = null,
    cy: Int | Double = null,
    gridType: polygon | circle = null,
    innerRadius: Int | Double = null,
    outerRadius: Int | Double = null,
    polarAngles: js.Array[Double] = null,
    polarRadius: js.Array[Double] = null
  ): PolarGridProps = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (gridType != null) __obj.updateDynamic("gridType")(gridType.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (polarAngles != null) __obj.updateDynamic("polarAngles")(polarAngles.asInstanceOf[js.Any])
    if (polarRadius != null) __obj.updateDynamic("polarRadius")(polarRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarGridProps]
  }
}

