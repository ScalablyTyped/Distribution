package typings.qlikDashEngineapi.EngineAPI

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
  var qCaption: String
  /**
    * Information about the position of the table.
    */
  var qPos: IRect
}

object ITableViewTableWinSaveInfo {
  @scala.inline
  def apply(qCaption: String, qPos: IRect): ITableViewTableWinSaveInfo = {
    val __obj = js.Dynamic.literal(qCaption = qCaption.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITableViewTableWinSaveInfo]
  }
}

