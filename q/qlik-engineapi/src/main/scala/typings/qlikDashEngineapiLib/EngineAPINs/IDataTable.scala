package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qName: java.lang.String
  /**
    * Type of the table.
    * For examples: Table, View
    */
  var qType: java.lang.String
}

object IDataTable {
  @scala.inline
  def apply(qName: java.lang.String, qType: java.lang.String): IDataTable = {
    val __obj = js.Dynamic.literal(qName = qName, qType = qType)
  
    __obj.asInstanceOf[IDataTable]
  }
}

