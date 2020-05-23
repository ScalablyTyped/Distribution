package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionHandlingScope extends js.Object {
  def get_errorMessage(): String
  def get_hasException(): Boolean
  def get_processed(): Boolean
  def get_serverErrorCode(): Double
  def get_serverErrorDetails(): js.Any
  def get_serverErrorTypeName(): String
  def get_serverErrorValue(): String
  def get_serverStackTrace(): String
  def startCatch(): js.Any
  def startFinally(): js.Any
  def startScope(): js.Any
  def startTry(): js.Any
}

object ExceptionHandlingScope {
  @scala.inline
  def apply(
    get_errorMessage: () => String,
    get_hasException: () => Boolean,
    get_processed: () => Boolean,
    get_serverErrorCode: () => Double,
    get_serverErrorDetails: () => js.Any,
    get_serverErrorTypeName: () => String,
    get_serverErrorValue: () => String,
    get_serverStackTrace: () => String,
    startCatch: () => js.Any,
    startFinally: () => js.Any,
    startScope: () => js.Any,
    startTry: () => js.Any
  ): ExceptionHandlingScope = {
    val __obj = js.Dynamic.literal(get_errorMessage = js.Any.fromFunction0(get_errorMessage), get_hasException = js.Any.fromFunction0(get_hasException), get_processed = js.Any.fromFunction0(get_processed), get_serverErrorCode = js.Any.fromFunction0(get_serverErrorCode), get_serverErrorDetails = js.Any.fromFunction0(get_serverErrorDetails), get_serverErrorTypeName = js.Any.fromFunction0(get_serverErrorTypeName), get_serverErrorValue = js.Any.fromFunction0(get_serverErrorValue), get_serverStackTrace = js.Any.fromFunction0(get_serverStackTrace), startCatch = js.Any.fromFunction0(startCatch), startFinally = js.Any.fromFunction0(startFinally), startScope = js.Any.fromFunction0(startScope), startTry = js.Any.fromFunction0(startTry))
    __obj.asInstanceOf[ExceptionHandlingScope]
  }
}

