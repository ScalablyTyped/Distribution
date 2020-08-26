package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewCtlSaveInfo...
  */
@js.native
trait ITableViewCtlSaveInfo extends js.Object {
  /**
    * Internal view mode.
    */
  var qInternalView: ITableViewSaveInfo = js.native
  /**
    * Source view mode.
    */
  var qSourceView: ITableViewSaveInfo = js.native
}

object ITableViewCtlSaveInfo {
  @scala.inline
  def apply(qInternalView: ITableViewSaveInfo, qSourceView: ITableViewSaveInfo): ITableViewCtlSaveInfo = {
    val __obj = js.Dynamic.literal(qInternalView = qInternalView.asInstanceOf[js.Any], qSourceView = qSourceView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewCtlSaveInfo]
  }
  @scala.inline
  implicit class ITableViewCtlSaveInfoOps[Self <: ITableViewCtlSaveInfo] (val x: Self) extends AnyVal {
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
    def setQInternalView(value: ITableViewSaveInfo): Self = this.set("qInternalView", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSourceView(value: ITableViewSaveInfo): Self = this.set("qSourceView", value.asInstanceOf[js.Any])
  }
  
}

