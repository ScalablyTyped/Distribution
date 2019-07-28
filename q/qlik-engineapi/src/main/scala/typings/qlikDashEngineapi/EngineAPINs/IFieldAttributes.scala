package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sets the formatting of a field.
  * The properties of qFieldAttributes and the formatting mechanism are described below.
  */
trait IFieldAttributes extends js.Object {
  /**
    * Defines the decimal separator.
    * Example: .
    */
  var qDec: String
  /**
    * Defines the format pattern that applies to qText.
    * Is used in connection to the type of the field (parameter qType).
    * For more information, see Formatting mechanism.
    * Example: YYYY-MM-DD for a date
    */
  var qFmt: String
  /**
    * no / empty docu
    */
  var qSAFEARRAY: js.Array[_]
  /**
    * Defines the thousand separator (if any).
    * Is used if qUseThou is set to 1.
    * Example: ,
    */
  var qThou: String
  /**
    * Type of the field.
    * One of:
    *
    *    - U for UNKNOWN type (default)
    *    - A for ASCII; Numeric fields values contain only standard ASCII characters.
    *    - I for INTEGER; Numeric fields values are shown as integer numbers.
    *    - R for REAL; Numeric fields values are shown as real numbers.
    *    - F for FIX; Numeric fields values are shown as numbers with a fix number of decimals.
    *    - M for MONEY; Numeric fields values are shown as in the money format.
    *    - D for DATE; Numeric fields values are shown as dates.
    *    - T for TIME; Numeric fields values are shown as times.
    *    - TS TIMESTAMP; Numeric fields values are shown as time stamps.
    *    - IV for INTERVAL; Numeric fields values are shown as intervals.
    *
    */
  var qType: FieldAttributesType
  /**
    * Defines whether or not a thousands separator must be used.
    * default is 0 (false) or  1 (true).
    */
  var qUseThou: Boolean
  /**
    * Number of decimals.
    * (Integer between 0 and 15.)
    * default is 10.
    */
  var qnDec: Double
}

object IFieldAttributes {
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[_],
    qThou: String,
    qType: FieldAttributesType,
    qUseThou: Boolean,
    qnDec: Double
  ): IFieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec, qFmt = qFmt, qSAFEARRAY = qSAFEARRAY, qThou = qThou, qType = qType, qUseThou = qUseThou, qnDec = qnDec)
  
    __obj.asInstanceOf[IFieldAttributes]
  }
}

