package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewSaveInfo...
  */
trait ITableViewSaveInfo extends js.Object {
  /**
    * List of the broom points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qBroomPoints: js.Array[ITableViewBroomPointSaveInfo]
  /**
    * List of connection points in the database model viewer.
    * Not used in Qlik Sense.
    */
  var qConnectionPoints: js.Array[ITableViewConnectionPointSaveInfo]
  /**
    * List of the tables in the database model viewer.
    */
  var qTables: js.Array[ITableViewTableWinSaveInfo]
  /**
    * Zoom factor in the database model viewer.
    * The default value is 1.0.
    */
  var qZoomFactor: Double
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
}

