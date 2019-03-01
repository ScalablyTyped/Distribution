package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxPivotPage extends js.Object {
  var qArea: Rect
  var qData: js.Array[NxPivotValuePoint]
  var qLeft: js.Array[NxPivotDimensioncell]
  var qTop: js.Array[NxPivotDimensioncell]
}

object NxPivotPage {
  @scala.inline
  def apply(
    qArea: Rect,
    qData: js.Array[NxPivotValuePoint],
    qLeft: js.Array[NxPivotDimensioncell],
    qTop: js.Array[NxPivotDimensioncell]
  ): NxPivotPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qArea")(qArea)
    __obj.updateDynamic("qData")(qData)
    __obj.updateDynamic("qLeft")(qLeft)
    __obj.updateDynamic("qTop")(qTop)
    __obj.asInstanceOf[NxPivotPage]
  }
}

