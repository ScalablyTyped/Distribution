package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataTable...
  */
trait IDataTable extends js.Object {
  /**
    * Name of the table.
    */
  var qName: String
  /**
    * Type of the table.
    * For examples: Table, View
    */
  var qType: String
}

object IDataTable {
  @scala.inline
  def apply(qName: String, qType: String): IDataTable = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTable]
  }
}

