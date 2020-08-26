package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAutoSortByStateDef...
  */
@js.native
trait INxAutoSortByStateDef extends js.Object {
  /**
    * This parameter applies to list objects.
    *
    * If the number of selected values in the list object is greater than the value set in qDisplayNumberOfRows,
    * the selected lines are promoted at the top of the list object.
    *
    * If qDisplayNumberOfRows is set to a negative value or to 0, the sort by state is disabled.
    */
  var qDisplayNumberOfRows: Double = js.native
}

object INxAutoSortByStateDef {
  @scala.inline
  def apply(qDisplayNumberOfRows: Double): INxAutoSortByStateDef = {
    val __obj = js.Dynamic.literal(qDisplayNumberOfRows = qDisplayNumberOfRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAutoSortByStateDef]
  }
  @scala.inline
  implicit class INxAutoSortByStateDefOps[Self <: INxAutoSortByStateDef] (val x: Self) extends AnyVal {
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
    def setQDisplayNumberOfRows(value: Double): Self = this.set("qDisplayNumberOfRows", value.asInstanceOf[js.Any])
  }
  
}

