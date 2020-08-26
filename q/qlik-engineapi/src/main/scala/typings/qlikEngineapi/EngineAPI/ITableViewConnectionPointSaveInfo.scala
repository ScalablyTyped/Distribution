package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableViewConnectionPointSaveInfo...
  */
@js.native
trait ITableViewConnectionPointSaveInfo extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[String] = js.native
  /**
    * Information about the position of the connection point.
    */
  var qPos: IPoint = js.native
}

object ITableViewConnectionPointSaveInfo {
  @scala.inline
  def apply(qFields: js.Array[String], qPos: IPoint): ITableViewConnectionPointSaveInfo = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableViewConnectionPointSaveInfo]
  }
  @scala.inline
  implicit class ITableViewConnectionPointSaveInfoOps[Self <: ITableViewConnectionPointSaveInfo] (val x: Self) extends AnyVal {
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
    def setQFieldsVarargs(value: String*): Self = this.set("qFields", js.Array(value :_*))
    @scala.inline
    def setQFields(value: js.Array[String]): Self = this.set("qFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPos(value: IPoint): Self = this.set("qPos", value.asInstanceOf[js.Any])
  }
  
}

