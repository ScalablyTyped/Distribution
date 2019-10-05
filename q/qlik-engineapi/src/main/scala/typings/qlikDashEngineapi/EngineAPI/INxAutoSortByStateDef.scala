package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAutoSortByStateDef...
  */
trait INxAutoSortByStateDef extends js.Object {
  /**
    * This parameter applies to list objects.
    *
    * If the number of selected values in the list object is greater than the value set in qDisplayNumberOfRows,
    * the selected lines are promoted at the top of the list object.
    *
    * If qDisplayNumberOfRows is set to a negative value or to 0, the sort by state is disabled.
    */
  var qDisplayNumberOfRows: Double
}

object INxAutoSortByStateDef {
  @scala.inline
  def apply(qDisplayNumberOfRows: Double): INxAutoSortByStateDef = {
    val __obj = js.Dynamic.literal(qDisplayNumberOfRows = qDisplayNumberOfRows)
  
    __obj.asInstanceOf[INxAutoSortByStateDef]
  }
}

