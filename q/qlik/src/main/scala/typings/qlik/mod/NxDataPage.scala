package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxDataPage extends js.Object {
  var qArea: Rect = js.native
  var qIsReduced: Boolean = js.native
  var qMatrix: js.Array[NxCellRows] = js.native
  var qTails: js.Array[NxGroupTail] = js.native
}

object NxDataPage {
  @scala.inline
  def apply(qArea: Rect, qIsReduced: Boolean, qMatrix: js.Array[NxCellRows], qTails: js.Array[NxGroupTail]): NxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDataPage]
  }
  @scala.inline
  implicit class NxDataPageOps[Self <: NxDataPage] (val x: Self) extends AnyVal {
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
    def setQIsReduced(value: Boolean): Self = this.set("qIsReduced", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMatrixVarargs(value: NxCellRows*): Self = this.set("qMatrix", js.Array(value :_*))
    @scala.inline
    def setQMatrix(value: js.Array[NxCellRows]): Self = this.set("qMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTailsVarargs(value: NxGroupTail*): Self = this.set("qTails", js.Array(value :_*))
    @scala.inline
    def setQTails(value: js.Array[NxGroupTail]): Self = this.set("qTails", value.asInstanceOf[js.Any])
  }
  
}

