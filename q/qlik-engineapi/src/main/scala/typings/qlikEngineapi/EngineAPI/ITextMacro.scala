package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextMacro...
  */
@js.native
trait ITextMacro extends js.Object {
  /**
    * Variable value.
    */
  var qDisplayString: String = js.native
  /**
    * Is set to true if the variable is a reserved variable.
    */
  var qIsReserved: Boolean = js.native
  /**
    * Is set to true if the variable is a system variable.
    */
  var qIsSystem: Boolean = js.native
  /**
    * Order in which the variable was referenced during the script execution.
    * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
    */
  var qRefSeqNo: Double = js.native
  /**
    * Order in which the variable was updated during the script execution.
    * The same number sequence is used for both qRefSeqNo and qSetSeqNo.
    */
  var qSetSeqNo: Double = js.native
  /**
    * Name of the variable.
    */
  var qTag: String = js.native
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
  @scala.inline
  implicit class ITextMacroOps[Self <: ITextMacro] (val x: Self) extends AnyVal {
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
    def setQDisplayString(value: String): Self = this.set("qDisplayString", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsReserved(value: Boolean): Self = this.set("qIsReserved", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsSystem(value: Boolean): Self = this.set("qIsSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setQRefSeqNo(value: Double): Self = this.set("qRefSeqNo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSetSeqNo(value: Double): Self = this.set("qSetSeqNo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTag(value: String): Self = this.set("qTag", value.asInstanceOf[js.Any])
  }
  
}

