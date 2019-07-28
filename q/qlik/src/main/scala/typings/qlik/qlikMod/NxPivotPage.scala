package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(qArea = qArea, qData = qData, qLeft = qLeft, qTop = qTop)
  
    __obj.asInstanceOf[NxPivotPage]
  }
}

