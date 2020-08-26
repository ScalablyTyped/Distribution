package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxPivotPage...
  */
@js.native
trait INxPivotPage extends js.Object {
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect = js.native
  /**
    * Array of data.
    */
  var qData: js.Array[INxPivotValuePoint] = js.native
  /**
    * Information about the left dimension values of a pivot table.
    */
  var qLeft: js.Array[INxPivotDimensionCell] = js.native
  /**
    * Information about the top dimension values of a pivot table.
    * If there is no top dimension in the pivot table, information about the measures are given.
    */
  var qTop: js.Array[INxPivotDimensionCell] = js.native
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
  @scala.inline
  implicit class INxPivotPageOps[Self <: INxPivotPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQArea(value: IRect): Self = this.set("qArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDataVarargs(value: INxPivotValuePoint*): Self = this.set("qData", js.Array(value :_*))
    @scala.inline
    def setQData(value: js.Array[INxPivotValuePoint]): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLeftVarargs(value: INxPivotDimensionCell*): Self = this.set("qLeft", js.Array(value :_*))
    @scala.inline
    def setQLeft(value: js.Array[INxPivotDimensionCell]): Self = this.set("qLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTopVarargs(value: INxPivotDimensionCell*): Self = this.set("qTop", js.Array(value :_*))
    @scala.inline
    def setQTop(value: js.Array[INxPivotDimensionCell]): Self = this.set("qTop", value.asInstanceOf[js.Any])
  }
  
}

