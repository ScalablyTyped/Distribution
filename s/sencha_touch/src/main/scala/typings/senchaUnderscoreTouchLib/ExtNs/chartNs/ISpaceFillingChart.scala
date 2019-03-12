package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpaceFillingChart extends IAbstractChart

object ISpaceFillingChart {
  @scala.inline
  def apply(IAbstractChart: IAbstractChart = null, redraw: () => scala.Unit = null): ISpaceFillingChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractChart)
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction0(redraw))
    __obj.asInstanceOf[ISpaceFillingChart]
  }
}

