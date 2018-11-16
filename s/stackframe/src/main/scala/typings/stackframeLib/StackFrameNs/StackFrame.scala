package typings
package stackframeLib.StackFrameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackFrame.StackFrame")
@js.native
class StackFrame protected () extends js.Object {
  def this(obj: StackFrameOptions) = this()
  def getArgs(): js.Array[_] = js.native
  def getColumnNumber(): scala.Double = js.native
  def getEvalOrigin(): StackFrame = js.native
  def getFileName(): java.lang.String = js.native
  def getFunctionName(): java.lang.String = js.native
  def getIsConstructor(): scala.Boolean = js.native
  def getIsEval(): scala.Boolean = js.native
  def getIsNative(): scala.Boolean = js.native
  def getIsToplevel(): scala.Boolean = js.native
  def getLineNumber(): scala.Double = js.native
  def getSource(): java.lang.String = js.native
  def setArgs(args: js.Array[_]): scala.Unit = js.native
  def setColumnNumber(columnNumber: scala.Double): scala.Unit = js.native
  def setEvalOrigin(stackframe: StackFrame): scala.Unit = js.native
  def setFileName(fileName: java.lang.String): scala.Unit = js.native
  def setFunctionName(functionName: java.lang.String): scala.Unit = js.native
  def setIsConstructor(isConstructor: scala.Boolean): scala.Unit = js.native
  def setIsEval(isEval: scala.Boolean): scala.Unit = js.native
  def setIsNative(isNative: scala.Boolean): scala.Unit = js.native
  def setIsToplevel(isToplevel: scala.Boolean): scala.Unit = js.native
  def setLineNumber(lineNumber: scala.Double): scala.Unit = js.native
  def setSource(source: java.lang.String): scala.Unit = js.native
}

