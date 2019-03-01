package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qFields: js.Array[java.lang.String]
  /**
    * Information about the position of the broom point.
    */
  var qPos: IPoint
  /**
    * Name of the table.
    */
  var qTable: java.lang.String
}

object ITableViewBroomPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[java.lang.String], qPos: IPoint, qTable: java.lang.String): ITableViewBroomPointSaveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFields")(qFields)
    __obj.updateDynamic("qPos")(qPos)
    __obj.updateDynamic("qTable")(qTable)
    __obj.asInstanceOf[ITableViewBroomPointSaveInfo]
  }
}

