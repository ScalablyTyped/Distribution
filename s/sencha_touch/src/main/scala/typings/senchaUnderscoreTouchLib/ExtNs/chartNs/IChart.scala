package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChart extends IAbstractChart {
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of flipXY
  		* @returns Boolean
  		*/
  var getFlipXY: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of innerRegion
  		* @returns Array
  		*/
  var getInnerRegion: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of flipXY
  		* @param flipXY Boolean The new value.
  		*/
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of innerRegion
  		* @param innerRegion Array The new value.
  		*/
  var setInnerRegion: js.UndefOr[
    js.Function1[/* innerRegion */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

object IChart {
  @scala.inline
  def apply(
    IAbstractChart: IAbstractChart = null,
    flipXY: js.UndefOr[scala.Boolean] = js.undefined,
    getFlipXY: js.Function0[scala.Boolean] = null,
    getInnerRegion: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    onPlaceWatermark: js.Function0[scala.Unit] = null,
    performLayout: js.Function0[scala.Unit] = null,
    redraw: js.Function0[scala.Unit] = null,
    setFlipXY: js.Function1[/* flipXY */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setInnerRegion: js.Function1[/* innerRegion */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null
  ): IChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractChart)
    if (!js.isUndefined(flipXY)) __obj.updateDynamic("flipXY")(flipXY)
    if (getFlipXY != null) __obj.updateDynamic("getFlipXY")(getFlipXY)
    if (getInnerRegion != null) __obj.updateDynamic("getInnerRegion")(getInnerRegion)
    if (onPlaceWatermark != null) __obj.updateDynamic("onPlaceWatermark")(onPlaceWatermark)
    if (performLayout != null) __obj.updateDynamic("performLayout")(performLayout)
    if (redraw != null) __obj.updateDynamic("redraw")(redraw)
    if (setFlipXY != null) __obj.updateDynamic("setFlipXY")(setFlipXY)
    if (setInnerRegion != null) __obj.updateDynamic("setInnerRegion")(setInnerRegion)
    __obj.asInstanceOf[IChart]
  }
}

