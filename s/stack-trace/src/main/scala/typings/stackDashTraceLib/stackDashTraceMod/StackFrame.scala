package typings
package stackDashTraceLib.stackDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  def getColumnNumber(): scala.Double
  def getFileName(): java.lang.String
  def getFunctionName(): java.lang.String
  def getLineNumber(): scala.Double
  def getMethodName(): java.lang.String
  def getTypeName(): java.lang.String
  def isNative(): scala.Boolean
}

object StackFrame {
  @scala.inline
  def apply(
    getColumnNumber: () => scala.Double,
    getFileName: () => java.lang.String,
    getFunctionName: () => java.lang.String,
    getLineNumber: () => scala.Double,
    getMethodName: () => java.lang.String,
    getTypeName: () => java.lang.String,
    isNative: () => scala.Boolean
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getTypeName = js.Any.fromFunction0(getTypeName), isNative = js.Any.fromFunction0(isNative))
  
    __obj.asInstanceOf[StackFrame]
  }
}

