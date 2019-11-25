package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SourceKeyRecord...
  */
trait ISourceKeyRecord extends js.Object {
  /**
    * Name of the key field.
    */
  var qKeyFields: js.Array[String]
  /**
    * Table the key belongs to.
    */
  var qTables: js.Array[String]
}

object ISourceKeyRecord {
  @scala.inline
  def apply(qKeyFields: js.Array[String], qTables: js.Array[String]): ISourceKeyRecord = {
    val __obj = js.Dynamic.literal(qKeyFields = qKeyFields.asInstanceOf[js.Any], qTables = qTables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISourceKeyRecord]
  }
}

