package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewBroomPointSaveInfo...
  */
trait ITableViewBroomPointSaveInfo extends js.Object {
  /**
    * List of fields in the table.
    */
  var qFields: js.Array[String]
  /**
    * Information about the position of the broom point.
    */
  var qPos: IPoint
  /**
    * Name of the table.
    */
  var qTable: String
}

object ITableViewBroomPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint, qTable: String): ITableViewBroomPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any], qTable = qTable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITableViewBroomPointSaveInfo]
  }
}

