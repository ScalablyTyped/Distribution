package typings
package stacktraceDashJsLib.StackTraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var args: js.Any
  var columnNumber: scala.Double
  var fileName: java.lang.String
  var functionName: java.lang.String
  var isEval: scala.Boolean
  var isNative: scala.Boolean
  var lineNumber: scala.Double
  var source: java.lang.String
}

object StackFrame {
  @scala.inline
  def apply(
    args: js.Any,
    columnNumber: scala.Double,
    fileName: java.lang.String,
    functionName: java.lang.String,
    isEval: scala.Boolean,
    isNative: scala.Boolean,
    lineNumber: scala.Double,
    source: java.lang.String,
    toString: js.Function0[java.lang.String]
  ): StackFrame = {
    val __obj = js.Dynamic.literal(args = args, columnNumber = columnNumber, fileName = fileName, functionName = functionName, isEval = isEval, isNative = isNative, lineNumber = lineNumber, source = source, toString = toString)
  
    __obj.asInstanceOf[StackFrame]
  }
}

