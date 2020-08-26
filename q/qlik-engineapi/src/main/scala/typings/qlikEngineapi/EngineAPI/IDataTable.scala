package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataTable...
  */
@js.native
trait IDataTable extends js.Object {
  /**
    * Name of the table.
    */
  var qName: String = js.native
  /**
    * Type of the table.
    * For examples: Table, View
    */
  var qType: String = js.native
}

object IDataTable {
  @scala.inline
  def apply(qName: String, qType: String): IDataTable = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTable]
  }
  @scala.inline
  implicit class IDataTableOps[Self <: IDataTable] (val x: Self) extends AnyVal {
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
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: String): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}

