package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ErrorData...
  */
trait IErrorData extends js.Object {
  /**
    * Type of the error messages.
    */
  var qErrorDataCode: ErrorDataCodeType
  /**
    * Detailed information about the error message.
    */
  var qErrorString: String
  /**
    * Script statement where the error occurs.
    */
  var qLine: String
  /**
    * Line termination characters.
    */
  var qLineEnd: String
}

object IErrorData {
  @scala.inline
  def apply(qErrorDataCode: ErrorDataCodeType, qErrorString: String, qLine: String, qLineEnd: String): IErrorData = {
    val __obj = js.Dynamic.literal(qErrorDataCode = qErrorDataCode, qErrorString = qErrorString, qLine = qLine, qLineEnd = qLineEnd)
  
    __obj.asInstanceOf[IErrorData]
  }
}

