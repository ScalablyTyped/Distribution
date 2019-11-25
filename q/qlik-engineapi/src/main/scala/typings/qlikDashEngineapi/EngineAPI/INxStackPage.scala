package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxStackPage...
  */
trait INxStackPage extends js.Object {
  /**
    * Size and offset of the data in the matrix.
    */
  var qArea: IRect
  /**
    * Array of data.
    */
  var qData: js.Array[INxStackedPivotCell]
}

object INxStackPage {
  @scala.inline
  def apply(qArea: IRect, qData: js.Array[INxStackedPivotCell]): INxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxStackPage]
  }
}

