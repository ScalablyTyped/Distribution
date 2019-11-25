package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewConnectionPointSaveInfo...
  */
trait ITableViewConnectionPointSaveInfo extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[String]
  /**
    * Information about the position of the connection point.
    */
  var qPos: IPoint
}

object ITableViewConnectionPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint): ITableViewConnectionPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITableViewConnectionPointSaveInfo]
  }
}

