package typings.raygun.raygunMod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var className: String
  var columnNumber: js.UndefOr[Double] = js.undefined
  var fileName: String
  var lineNumber: Double
  var methodName: String
}

object StackFrame {
  @scala.inline
  def apply(
    className: String,
    fileName: String,
    lineNumber: Double,
    methodName: String,
    columnNumber: Int | Double = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal(className = className, fileName = fileName, lineNumber = lineNumber, methodName = methodName)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

