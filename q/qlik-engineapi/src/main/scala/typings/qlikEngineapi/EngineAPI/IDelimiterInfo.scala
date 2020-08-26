package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DelimiterInfo...
  */
@js.native
trait IDelimiterInfo extends js.Object {
  /**
    * Is set to true if multiple spaces are used to separate the values.
    */
  var qIsMultiple: Boolean = js.native
  /**
    * Name of the delimiter.
    * Example:
    * "Tab_DELIMITER"
    */
  var qName: String = js.native
  /**
    * Delimiter character number used by the engine to determine how to separate the values.
    */
  var qNumber: Double = js.native
  /**
    * Representation of the delimiter value that is used in the script.
    * Example:
    * "'\t'"
    */
  var qScriptCode: String = js.native
}

object IDelimiterInfo {
  @scala.inline
  def apply(qIsMultiple: Boolean, qName: String, qNumber: Double, qScriptCode: String): IDelimiterInfo = {
    val __obj = js.Dynamic.literal(qIsMultiple = qIsMultiple.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumber = qNumber.asInstanceOf[js.Any], qScriptCode = qScriptCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelimiterInfo]
  }
  @scala.inline
  implicit class IDelimiterInfoOps[Self <: IDelimiterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQIsMultiple(value: Boolean): Self = this.set("qIsMultiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNumber(value: Double): Self = this.set("qNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setQScriptCode(value: String): Self = this.set("qScriptCode", value.asInstanceOf[js.Any])
  }
  
}

