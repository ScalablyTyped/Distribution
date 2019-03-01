package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolarViewBox extends js.Object {
  var cx: js.UndefOr[scala.Double] = js.undefined
  var cy: js.UndefOr[scala.Double] = js.undefined
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var innerRadius: js.UndefOr[scala.Double] = js.undefined
  var outerRadius: js.UndefOr[scala.Double] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
}

object PolarViewBox {
  @scala.inline
  def apply(
    cx: scala.Int | scala.Double = null,
    cy: scala.Int | scala.Double = null,
    endAngle: scala.Int | scala.Double = null,
    innerRadius: scala.Int | scala.Double = null,
    outerRadius: scala.Int | scala.Double = null,
    startAngle: scala.Int | scala.Double = null
  ): PolarViewBox = {
    val __obj = js.Dynamic.literal()
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarViewBox]
  }
}

