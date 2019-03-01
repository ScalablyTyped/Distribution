package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewTableWinSaveInfo...
  */
trait ITableViewTableWinSaveInfo extends js.Object {
  /**
    * Table name.
    */
  var qCaption: java.lang.String
  /**
    * Information about the position of the table.
    */
  var qPos: IRect
}

object ITableViewTableWinSaveInfo {
  @scala.inline
  def apply(qCaption: java.lang.String, qPos: IRect): ITableViewTableWinSaveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qCaption")(qCaption)
    __obj.updateDynamic("qPos")(qPos)
    __obj.asInstanceOf[ITableViewTableWinSaveInfo]
  }
}

