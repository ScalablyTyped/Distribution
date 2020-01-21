package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldDefEx...
  */
trait IFieldDefEx extends js.Object {
  /**
    * Name of the field
    */
  var qName: String
  /**
    * Type of data entity
    *
    * One of:
    * - 0 for NOT_PRESENT: the field does not exist
    * - 1 for PRESENT: plain field
    * - 2 for IS_EXPR: calculated dimension
    */
  var qType: FieldDefExType
}

object IFieldDefEx {
  @scala.inline
  def apply(qName: String, qType: FieldDefExType): IFieldDefEx = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFieldDefEx]
  }
}

