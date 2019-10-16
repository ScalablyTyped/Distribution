package typings.stacktraceDashJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace.StackFrame")
@js.native
class StackFrame protected () extends js.Object {
  def this(functionName: String, args: js.Any, fileName: String, lineNumber: Double, columnNumber: Double) = this()
  var args: js.Any = js.native
  var columnNumber: Double = js.native
  var fileName: String = js.native
  var functionName: String = js.native
  var isEval: Boolean = js.native
  var isNative: Boolean = js.native
  var lineNumber: Double = js.native
  var source: String = js.native
}

