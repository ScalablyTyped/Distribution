package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxPivotPage...
  */
trait INxPivotPage extends js.Object {
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect
  /**
    * Array of data.
    */
  var qData: js.Array[INxPivotValuePoint]
  /**
    * Information about the left dimension values of a pivot table.
    */
  var qLeft: js.Array[INxPivotDimensionCell]
  /**
    * Information about the top dimension values of a pivot table.
    * If there is no top dimension in the pivot table, information about the measures are given.
    */
  var qTop: js.Array[INxPivotDimensionCell]
}

object INxPivotPage {
  @scala.inline
  def apply(
    qArea: IRect,
    qData: js.Array[INxPivotValuePoint],
    qLeft: js.Array[INxPivotDimensionCell],
    qTop: js.Array[INxPivotDimensionCell]
  ): INxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxPivotPage]
  }
}

