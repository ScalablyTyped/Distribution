package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DelimiterInfo...
  */
trait IDelimiterInfo extends js.Object {
  /**
    * Is set to true if multiple spaces are used to separate the values.
    */
  var qIsMultiple: scala.Boolean
  /**
    * Name of the delimiter.
    * Example:
    * "Tab_DELIMITER"
    */
  var qName: java.lang.String
  /**
    * Delimiter character number used by the engine to determine how to separate the values.
    */
  var qNumber: scala.Double
  /**
    * Representation of the delimiter value that is used in the script.
    * Example:
    * "'\t'"
    */
  var qScriptCode: java.lang.String
}

object IDelimiterInfo {
  @scala.inline
  def apply(
    qIsMultiple: scala.Boolean,
    qName: java.lang.String,
    qNumber: scala.Double,
    qScriptCode: java.lang.String
  ): IDelimiterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qIsMultiple")(qIsMultiple)
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qNumber")(qNumber)
    __obj.updateDynamic("qScriptCode")(qScriptCode)
    __obj.asInstanceOf[IDelimiterInfo]
  }
}

