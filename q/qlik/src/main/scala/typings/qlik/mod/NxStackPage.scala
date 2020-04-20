package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxStackPage extends js.Object {
  var qArea: Rect
  var qData: js.Array[NxStackedPivotCell]
}

object NxStackPage {
  @scala.inline
  def apply(qArea: Rect, qData: js.Array[NxStackedPivotCell]): NxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStackPage]
  }
}

