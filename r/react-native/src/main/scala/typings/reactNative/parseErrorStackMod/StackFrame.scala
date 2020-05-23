package typings.reactNative.parseErrorStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var column: Double | Null
  var file: String
  var lineNumber: Double
  var methodName: String
}

object StackFrame {
  @scala.inline
  def apply(file: String, lineNumber: Double, methodName: String, column: Double = null.asInstanceOf[Double]): StackFrame = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

