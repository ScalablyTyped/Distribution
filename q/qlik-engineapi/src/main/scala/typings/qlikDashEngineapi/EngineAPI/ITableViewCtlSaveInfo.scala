package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewCtlSaveInfo...
  */
trait ITableViewCtlSaveInfo extends js.Object {
  /**
    * Internal view mode.
    */
  var qInternalView: ITableViewSaveInfo
  /**
    * Source view mode.
    */
  var qSourceView: ITableViewSaveInfo
}

object ITableViewCtlSaveInfo {
  @scala.inline
  def apply(qInternalView: ITableViewSaveInfo, qSourceView: ITableViewSaveInfo): ITableViewCtlSaveInfo = {
    val __obj = js.Dynamic.literal(qInternalView = qInternalView, qSourceView = qSourceView)
  
    __obj.asInstanceOf[ITableViewCtlSaveInfo]
  }
}

