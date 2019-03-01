package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qIsKey: scala.Boolean
  /**
    * Name of the field.
    *
    */
  var qName: java.lang.String
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFieldName: java.lang.String
}

object IDataField {
  @scala.inline
  def apply(qIsKey: scala.Boolean, qName: java.lang.String, qOriginalFieldName: java.lang.String): IDataField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qIsKey")(qIsKey)
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qOriginalFieldName")(qOriginalFieldName)
    __obj.asInstanceOf[IDataField]
  }
}

