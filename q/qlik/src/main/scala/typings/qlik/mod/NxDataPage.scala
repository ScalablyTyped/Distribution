package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDataPage extends js.Object {
  var qArea: Rect
  var qIsReduced: Boolean
  var qMatrix: js.Array[NxCellRows]
  var qTails: js.Array[NxGroupTail]
}

object NxDataPage {
  @scala.inline
  def apply(qArea: Rect, qIsReduced: Boolean, qMatrix: js.Array[NxCellRows], qTails: js.Array[NxGroupTail]): NxDataPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qIsReduced = qIsReduced.asInstanceOf[js.Any], qMatrix = qMatrix.asInstanceOf[js.Any], qTails = qTails.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxDataPage]
  }
}

