package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qErrorString: java.lang.String
  /**
    * Script statement where the error occurs.
    */
  var qLine: java.lang.String
  /**
    * Line termination characters.
    */
  var qLineEnd: java.lang.String
}

object IErrorData {
  @scala.inline
  def apply(
    qErrorDataCode: ErrorDataCodeType,
    qErrorString: java.lang.String,
    qLine: java.lang.String,
    qLineEnd: java.lang.String
  ): IErrorData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qErrorDataCode")(qErrorDataCode)
    __obj.updateDynamic("qErrorString")(qErrorString)
    __obj.updateDynamic("qLine")(qLine)
    __obj.updateDynamic("qLineEnd")(qLineEnd)
    __obj.asInstanceOf[IErrorData]
  }
}

