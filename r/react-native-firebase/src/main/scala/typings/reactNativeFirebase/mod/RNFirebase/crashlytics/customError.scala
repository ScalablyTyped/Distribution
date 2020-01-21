package typings.reactNativeFirebase.mod.RNFirebase.crashlytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait customError extends js.Object {
  var additional: js.UndefOr[js.Object] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var fileName: String
  var functionName: js.UndefOr[String] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
}

object customError {
  @scala.inline
  def apply(
    fileName: String,
    additional: js.Object = null,
    className: String = null,
    functionName: String = null,
    lineNumber: Int | Double = null
  ): customError = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    if (additional != null) __obj.updateDynamic("additional")(additional.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[customError]
  }
}

