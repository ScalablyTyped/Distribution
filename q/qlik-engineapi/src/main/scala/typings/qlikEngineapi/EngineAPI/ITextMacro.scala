package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextMacro...
  */
trait ITextMacro extends js.Object {
  /**
    * Variable value.
    */
  var qDisplayString: String
  /**
    * Is set to true if the variable is a reserved variable.
    */
  var qIsReserved: Boolean
  /**
    * Is set to true if the variable is a system variable.
    */
  var qIsSystem: Boolean
  /**
    * Order in which the variable was referenced during the script execution.
    * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
    */
  var qRefSeqNo: Double
  /**
    * Order in which the variable was updated during the script execution.
    * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
    */
  var qSetSeqNo: Double
  /**
    * Name of the variable.
    */
  var qTag: String
}

object ITextMacro {
  @scala.inline
  def apply(
    qDisplayString: String,
    qIsReserved: Boolean,
    qIsSystem: Boolean,
    qRefSeqNo: Double,
    qSetSeqNo: Double,
    qTag: String
  ): ITextMacro = {
    val __obj = js.Dynamic.literal(qDisplayString = qDisplayString.asInstanceOf[js.Any], qIsReserved = qIsReserved.asInstanceOf[js.Any], qIsSystem = qIsSystem.asInstanceOf[js.Any], qRefSeqNo = qRefSeqNo.asInstanceOf[js.Any], qSetSeqNo = qSetSeqNo.asInstanceOf[js.Any], qTag = qTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITextMacro]
  }
}

