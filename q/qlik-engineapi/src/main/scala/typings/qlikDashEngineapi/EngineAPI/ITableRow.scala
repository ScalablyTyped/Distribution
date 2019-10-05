package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableRow...
  */
trait ITableRow extends js.Object {
  /**
    * Array of field values [{qText, qIsNumeric, qNumber},..]
    */
  var vqValue: js.Array[IFieldValue]
}

object ITableRow {
  @scala.inline
  def apply(vqValue: js.Array[IFieldValue]): ITableRow = {
    val __obj = js.Dynamic.literal(vqValue = vqValue)
  
    __obj.asInstanceOf[ITableRow]
  }
}

