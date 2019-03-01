package typings
package qlikLib.qlikMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qArea")(qArea)
    __obj.updateDynamic("qData")(qData)
    __obj.asInstanceOf[NxStackPage]
  }
}

