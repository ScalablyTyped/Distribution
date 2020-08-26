package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ErrorData...
  */
@js.native
trait IErrorData extends js.Object {
  /**
    * Type of the error messages.
    */
  var qErrorDataCode: ErrorDataCodeType = js.native
  /**
    * Detailed information about the error message.
    */
  var qErrorString: String = js.native
  /**
    * Script statement where the error occurs.
    */
  var qLine: String = js.native
  /**
    * Line termination characters.
    */
  var qLineEnd: String = js.native
}

object IErrorData {
  @scala.inline
  def apply(qErrorDataCode: ErrorDataCodeType, qErrorString: String, qLine: String, qLineEnd: String): IErrorData = {
    val __obj = js.Dynamic.literal(qErrorDataCode = qErrorDataCode.asInstanceOf[js.Any], qErrorString = qErrorString.asInstanceOf[js.Any], qLine = qLine.asInstanceOf[js.Any], qLineEnd = qLineEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorData]
  }
  @scala.inline
  implicit class IErrorDataOps[Self <: IErrorData] (val x: Self) extends AnyVal {
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
    def setQErrorDataCode(value: ErrorDataCodeType): Self = this.set("qErrorDataCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQErrorString(value: String): Self = this.set("qErrorString", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLine(value: String): Self = this.set("qLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLineEnd(value: String): Self = this.set("qLineEnd", value.asInstanceOf[js.Any])
  }
  
}

