package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolarChart extends IAbstractChart {
  /** [Config Option] (Array) */
  var center: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of center
  		* @returns Array
  		*/
  var getCenter: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of radius
  		* @returns Number
  		*/
  var getRadius: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of center
  		* @param center Array The new value.
  		*/
  var setCenter: js.UndefOr[
    js.Function1[/* center */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of radius
  		* @param radius Number The new value.
  		*/
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object IPolarChart {
  @scala.inline
  def apply(
    IAbstractChart: IAbstractChart = null,
    center: senchaUnderscoreTouchLib.ExtNs.Array = null,
    getCenter: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getRadius: js.Function0[scala.Double] = null,
    radius: scala.Int | scala.Double = null,
    redraw: js.Function0[scala.Unit] = null,
    setCenter: js.Function1[/* center */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setRadius: js.Function1[/* radius */ js.UndefOr[scala.Double], scala.Unit] = null
  ): IPolarChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractChart)
    if (center != null) __obj.updateDynamic("center")(center)
    if (getCenter != null) __obj.updateDynamic("getCenter")(getCenter)
    if (getRadius != null) __obj.updateDynamic("getRadius")(getRadius)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (redraw != null) __obj.updateDynamic("redraw")(redraw)
    if (setCenter != null) __obj.updateDynamic("setCenter")(setCenter)
    if (setRadius != null) __obj.updateDynamic("setRadius")(setRadius)
    __obj.asInstanceOf[IPolarChart]
  }
}

