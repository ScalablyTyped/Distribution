package typings.senchaUnderscoreTouch.Ext.chart

import typings.senchaUnderscoreTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChart extends IAbstractChart {
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns the value of flipXY
  		* @returns Boolean
  		*/
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of innerRegion
  		* @returns Array
  		*/
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of flipXY
  		* @param flipXY Boolean The new value.
  		*/
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of innerRegion
  		* @param innerRegion Array The new value.
  		*/
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.undefined
}

object IChart {
  @scala.inline
  def apply(
    IAbstractChart: IAbstractChart = null,
    flipXY: js.UndefOr[Boolean] = js.undefined,
    getFlipXY: () => Boolean = null,
    getInnerRegion: () => Array = null,
    onPlaceWatermark: () => Unit = null,
    performLayout: () => Unit = null,
    redraw: () => Unit = null,
    setFlipXY: /* flipXY */ js.UndefOr[Boolean] => Unit = null,
    setInnerRegion: /* innerRegion */ js.UndefOr[Array] => Unit = null
  ): IChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractChart)
    if (!js.isUndefined(flipXY)) __obj.updateDynamic("flipXY")(flipXY)
    if (getFlipXY != null) __obj.updateDynamic("getFlipXY")(js.Any.fromFunction0(getFlipXY))
    if (getInnerRegion != null) __obj.updateDynamic("getInnerRegion")(js.Any.fromFunction0(getInnerRegion))
    if (onPlaceWatermark != null) __obj.updateDynamic("onPlaceWatermark")(js.Any.fromFunction0(onPlaceWatermark))
    if (performLayout != null) __obj.updateDynamic("performLayout")(js.Any.fromFunction0(performLayout))
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction0(redraw))
    if (setFlipXY != null) __obj.updateDynamic("setFlipXY")(js.Any.fromFunction1(setFlipXY))
    if (setInnerRegion != null) __obj.updateDynamic("setInnerRegion")(js.Any.fromFunction1(setInnerRegion))
    __obj.asInstanceOf[IChart]
  }
}

