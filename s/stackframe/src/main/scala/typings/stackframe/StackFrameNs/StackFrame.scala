package typings.stackframe.StackFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackFrame.StackFrame")
@js.native
class StackFrame protected () extends js.Object {
  def this(obj: StackFrameOptions) = this()
  def getArgs(): js.Array[_] = js.native
  def getColumnNumber(): Double = js.native
  def getEvalOrigin(): StackFrame = js.native
  def getFileName(): String = js.native
  def getFunctionName(): String = js.native
  def getIsConstructor(): Boolean = js.native
  def getIsEval(): Boolean = js.native
  def getIsNative(): Boolean = js.native
  def getIsToplevel(): Boolean = js.native
  def getLineNumber(): Double = js.native
  def getSource(): String = js.native
  def setArgs(args: js.Array[_]): Unit = js.native
  def setColumnNumber(columnNumber: Double): Unit = js.native
  def setEvalOrigin(stackframe: StackFrame): Unit = js.native
  def setFileName(fileName: String): Unit = js.native
  def setFunctionName(functionName: String): Unit = js.native
  def setIsConstructor(isConstructor: Boolean): Unit = js.native
  def setIsEval(isEval: Boolean): Unit = js.native
  def setIsNative(isNative: Boolean): Unit = js.native
  def setIsToplevel(isToplevel: Boolean): Unit = js.native
  def setLineNumber(lineNumber: Double): Unit = js.native
  def setSource(source: String): Unit = js.native
}

