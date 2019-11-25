package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataRecord...
  */
trait IDataRecord extends js.Object {
  /**
    * List of values inside the table.
    * The first values (in result/qPreview/0/qValues) correspond to the field names in the table.
    * The following values (from result/qPreview/1/qValues) are the values of the fields in the table.
    */
  var qValues: js.Array[String]
}

object IDataRecord {
  @scala.inline
  def apply(qValues: js.Array[String]): IDataRecord = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDataRecord]
  }
}

