package typings.stackframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var evalOrigin: js.UndefOr[StackFrame] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var isConstructor: js.UndefOr[Boolean] = js.undefined
  var isEval: js.UndefOr[Boolean] = js.undefined
  var isNative: js.UndefOr[Boolean] = js.undefined
  var isToplevel: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  def getArgs(): js.UndefOr[js.Array[_]]
  def getColumnNumber(): js.UndefOr[Double]
  def getEvalOrigin(): js.UndefOr[StackFrame]
  def getFileName(): js.UndefOr[String]
  def getFunctionName(): js.UndefOr[String]
  def getIsConstructor(): js.UndefOr[Boolean]
  def getIsEval(): js.UndefOr[Boolean]
  def getIsNative(): js.UndefOr[Boolean]
  def getIsToplevel(): js.UndefOr[Boolean]
  def getLineNumber(): js.UndefOr[Double]
  def getSource(): js.UndefOr[String]
  def setArgs(args: js.Array[_]): Unit
  def setColumnNumber(columnNumber: Double): Unit
  def setEvalOrigin(stackframe: StackFrame): Unit
  def setFileName(fileName: String): Unit
  def setFunctionName(functionName: String): Unit
  def setIsConstructor(isConstructor: Boolean): Unit
  def setIsEval(isEval: Boolean): Unit
  def setIsNative(isNative: Boolean): Unit
  def setIsToplevel(isToplevel: Boolean): Unit
  def setLineNumber(lineNumber: Double): Unit
  def setSource(source: String): Unit
}

object StackFrame {
  @scala.inline
  def apply(
    getArgs: () => js.UndefOr[js.Array[_]],
    getColumnNumber: () => js.UndefOr[Double],
    getEvalOrigin: () => js.UndefOr[StackFrame],
    getFileName: () => js.UndefOr[String],
    getFunctionName: () => js.UndefOr[String],
    getIsConstructor: () => js.UndefOr[Boolean],
    getIsEval: () => js.UndefOr[Boolean],
    getIsNative: () => js.UndefOr[Boolean],
    getIsToplevel: () => js.UndefOr[Boolean],
    getLineNumber: () => js.UndefOr[Double],
    getSource: () => js.UndefOr[String],
    setArgs: js.Array[_] => Unit,
    setColumnNumber: Double => Unit,
    setEvalOrigin: StackFrame => Unit,
    setFileName: String => Unit,
    setFunctionName: String => Unit,
    setIsConstructor: Boolean => Unit,
    setIsEval: Boolean => Unit,
    setIsNative: Boolean => Unit,
    setIsToplevel: Boolean => Unit,
    setLineNumber: Double => Unit,
    setSource: String => Unit,
    args: js.Array[_] = null,
    columnNumber: Int | Double = null,
    evalOrigin: StackFrame = null,
    fileName: String = null,
    functionName: String = null,
    isConstructor: js.UndefOr[Boolean] = js.undefined,
    isEval: js.UndefOr[Boolean] = js.undefined,
    isNative: js.UndefOr[Boolean] = js.undefined,
    isToplevel: js.UndefOr[Boolean] = js.undefined,
    lineNumber: Int | Double = null,
    source: String = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsToplevel = js.Any.fromFunction0(getIsToplevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction1(setArgs), setColumnNumber = js.Any.fromFunction1(setColumnNumber), setEvalOrigin = js.Any.fromFunction1(setEvalOrigin), setFileName = js.Any.fromFunction1(setFileName), setFunctionName = js.Any.fromFunction1(setFunctionName), setIsConstructor = js.Any.fromFunction1(setIsConstructor), setIsEval = js.Any.fromFunction1(setIsEval), setIsNative = js.Any.fromFunction1(setIsNative), setIsToplevel = js.Any.fromFunction1(setIsToplevel), setLineNumber = js.Any.fromFunction1(setLineNumber), setSource = js.Any.fromFunction1(setSource))
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructor)) __obj.updateDynamic("isConstructor")(isConstructor.asInstanceOf[js.Any])
    if (!js.isUndefined(isEval)) __obj.updateDynamic("isEval")(isEval.asInstanceOf[js.Any])
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative.asInstanceOf[js.Any])
    if (!js.isUndefined(isToplevel)) __obj.updateDynamic("isToplevel")(isToplevel.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

