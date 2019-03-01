package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var className: java.lang.String
  var columnNumber: js.UndefOr[scala.Double] = js.undefined
  var fileName: java.lang.String
  var lineNumber: scala.Double
  var methodName: java.lang.String
}

object StackFrame {
  @scala.inline
  def apply(
    className: java.lang.String,
    fileName: java.lang.String,
    lineNumber: scala.Double,
    methodName: java.lang.String,
    columnNumber: scala.Int | scala.Double = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.updateDynamic("methodName")(methodName)
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

