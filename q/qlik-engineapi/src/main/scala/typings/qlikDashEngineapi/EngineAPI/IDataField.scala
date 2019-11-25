package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataField...
  */
trait IDataField extends js.Object {
  /**
    * Is set to true if the field is a primary key.
    */
  var qIsKey: Boolean
  /**
    * Name of the field.
    *
    */
  var qName: String
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFieldName: String
}

object IDataField {
  @scala.inline
  def apply(qIsKey: Boolean, qName: String, qOriginalFieldName: String): IDataField = {
    val __obj = js.Dynamic.literal(qIsKey = qIsKey.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qOriginalFieldName = qOriginalFieldName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDataField]
  }
}

