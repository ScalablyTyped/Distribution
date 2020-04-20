package typings.stackTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  def getColumnNumber(): Double
  def getFileName(): String
  def getFunctionName(): String
  def getLineNumber(): Double
  def getMethodName(): String
  def getTypeName(): String
  def isNative(): Boolean
}

object StackFrame {
  @scala.inline
  def apply(
    getColumnNumber: () => Double,
    getFileName: () => String,
    getFunctionName: () => String,
    getLineNumber: () => Double,
    getMethodName: () => String,
    getTypeName: () => String,
    isNative: () => Boolean
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getTypeName = js.Any.fromFunction0(getTypeName), isNative = js.Any.fromFunction0(isNative))
    __obj.asInstanceOf[StackFrame]
  }
}

