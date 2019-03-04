package typings
package reactDashNativeLib.librariesCoreDevtoolsParseErrorStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var column: scala.Double | scala.Null
  var file: java.lang.String
  var lineNumber: scala.Double
  var methodName: java.lang.String
}

object StackFrame {
  @scala.inline
  def apply(
    file: java.lang.String,
    lineNumber: scala.Double,
    methodName: java.lang.String,
    column: scala.Int | scala.Double = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal(file = file, lineNumber = lineNumber, methodName = methodName)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

