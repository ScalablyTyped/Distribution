package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxPivotPage extends js.Object {
  var qArea: Rect = js.native
  var qData: js.Array[NxPivotValuePoint] = js.native
  var qLeft: js.Array[NxPivotDimensioncell] = js.native
  var qTop: js.Array[NxPivotDimensioncell] = js.native
}

object NxPivotPage {
  @scala.inline
  def apply(
    qArea: Rect,
    qData: js.Array[NxPivotValuePoint],
    qLeft: js.Array[NxPivotDimensioncell],
    qTop: js.Array[NxPivotDimensioncell]
  ): NxPivotPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotPage]
  }
  @scala.inline
  implicit class NxPivotPageOps[Self <: NxPivotPage] (val x: Self) extends AnyVal {
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
    def setQArea(value: Rect): Self = this.set("qArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDataVarargs(value: NxPivotValuePoint*): Self = this.set("qData", js.Array(value :_*))
    @scala.inline
    def setQData(value: js.Array[NxPivotValuePoint]): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLeftVarargs(value: NxPivotDimensioncell*): Self = this.set("qLeft", js.Array(value :_*))
    @scala.inline
    def setQLeft(value: js.Array[NxPivotDimensioncell]): Self = this.set("qLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTopVarargs(value: NxPivotDimensioncell*): Self = this.set("qTop", js.Array(value :_*))
    @scala.inline
    def setQTop(value: js.Array[NxPivotDimensioncell]): Self = this.set("qTop", value.asInstanceOf[js.Any])
  }
  
}

