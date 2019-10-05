package typings.qlikDashEngineapi.EngineAPI

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
  var qIsMultiple: Boolean
  /**
    * Name of the delimiter.
    * Example:
    * "Tab_DELIMITER"
    */
  var qName: String
  /**
    * Delimiter character number used by the engine to determine how to separate the values.
    */
  var qNumber: Double
  /**
    * Representation of the delimiter value that is used in the script.
    * Example:
    * "'\t'"
    */
  var qScriptCode: String
}

object IDelimiterInfo {
  @scala.inline
  def apply(qIsMultiple: Boolean, qName: String, qNumber: Double, qScriptCode: String): IDelimiterInfo = {
    val __obj = js.Dynamic.literal(qIsMultiple = qIsMultiple, qName = qName, qNumber = qNumber, qScriptCode = qScriptCode)
  
    __obj.asInstanceOf[IDelimiterInfo]
  }
}

