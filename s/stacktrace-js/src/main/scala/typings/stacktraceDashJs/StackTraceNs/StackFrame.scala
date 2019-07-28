package typings.stacktraceDashJs.StackTraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var args: js.Any
  var columnNumber: Double
  var fileName: String
  var functionName: String
  var isEval: Boolean
  var isNative: Boolean
  var lineNumber: Double
  var source: String
}

object StackFrame {
  @scala.inline
  def apply(
    args: js.Any,
    columnNumber: Double,
    fileName: String,
    functionName: String,
    isEval: Boolean,
    isNative: Boolean,
    lineNumber: Double,
    source: String,
    toString: () => String
  ): StackFrame = {
    val __obj = js.Dynamic.literal(args = args, columnNumber = columnNumber, fileName = fileName, functionName = functionName, isEval = isEval, isNative = isNative, lineNumber = lineNumber, source = source, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[StackFrame]
  }
}

