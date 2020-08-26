package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewSaveInfo...
  */
@js.native
trait ITableViewSaveInfo extends js.Object {
  /**
    * List of the broom points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qBroomPoints: js.Array[ITableViewBroomPointSaveInfo] = js.native
  /**
    * List of connection points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qConnectionPoints: js.Array[ITableViewConnectionPointSaveInfo] = js.native
  /**
    * List of the tables in the database model viewer.
    */
  var qTables: js.Array[ITableViewTableWinSaveInfo] = js.native
  /**
    * Zoom factor in the database model viewer.
    * The default value is 1.0.
    */
  var qZoomFactor: Double = js.native
}

object ITableViewSaveInfo {
  @scala.inline
  def apply(
    qBroomPoints: js.Array[ITableViewBroomPointSaveInfo],
    qConnectionPoints: js.Array[ITableViewConnectionPointSaveInfo],
    qTables: js.Array[ITableViewTableWinSaveInfo],
    qZoomFactor: Double
  ): ITableViewSaveInfo = {
    val __obj = js.Dynamic.literal(qBroomPoints = qBroomPoints.asInstanceOf[js.Any], qConnectionPoints = qConnectionPoints.asInstanceOf[js.Any], qTables = qTables.asInstanceOf[js.Any], qZoomFactor = qZoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewSaveInfo]
  }
  @scala.inline
  implicit class ITableViewSaveInfoOps[Self <: ITableViewSaveInfo] (val x: Self) extends AnyVal {
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
    def setQBroomPointsVarargs(value: ITableViewBroomPointSaveInfo*): Self = this.set("qBroomPoints", js.Array(value :_*))
    @scala.inline
    def setQBroomPoints(value: js.Array[ITableViewBroomPointSaveInfo]): Self = this.set("qBroomPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setQConnectionPointsVarargs(value: ITableViewConnectionPointSaveInfo*): Self = this.set("qConnectionPoints", js.Array(value :_*))
    @scala.inline
    def setQConnectionPoints(value: js.Array[ITableViewConnectionPointSaveInfo]): Self = this.set("qConnectionPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTablesVarargs(value: ITableViewTableWinSaveInfo*): Self = this.set("qTables", js.Array(value :_*))
    @scala.inline
    def setQTables(value: js.Array[ITableViewTableWinSaveInfo]): Self = this.set("qTables", value.asInstanceOf[js.Any])
    @scala.inline
    def setQZoomFactor(value: Double): Self = this.set("qZoomFactor", value.asInstanceOf[js.Any])
  }
  
}

