package typings.stackframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackFrame extends js.Object {
  
  var args: js.UndefOr[js.Array[_]] = js.native
  
  var columnNumber: js.UndefOr[Double] = js.native
  
  var evalOrigin: js.UndefOr[StackFrame] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var functionName: js.UndefOr[String] = js.native
  
  def getArgs(): js.UndefOr[js.Array[_]] = js.native
  
  def getColumnNumber(): js.UndefOr[Double] = js.native
  
  def getEvalOrigin(): js.UndefOr[StackFrame] = js.native
  
  def getFileName(): js.UndefOr[String] = js.native
  
  def getFunctionName(): js.UndefOr[String] = js.native
  
  def getIsConstructor(): js.UndefOr[Boolean] = js.native
  
  def getIsEval(): js.UndefOr[Boolean] = js.native
  
  def getIsNative(): js.UndefOr[Boolean] = js.native
  
  def getIsToplevel(): js.UndefOr[Boolean] = js.native
  
  def getLineNumber(): js.UndefOr[Double] = js.native
  
  def getSource(): js.UndefOr[String] = js.native
  
  var isConstructor: js.UndefOr[Boolean] = js.native
  
  var isEval: js.UndefOr[Boolean] = js.native
  
  var isNative: js.UndefOr[Boolean] = js.native
  
  var isToplevel: js.UndefOr[Boolean] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
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
  
  var source: js.UndefOr[String] = js.native
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
    setSource: String => Unit
  ): StackFrame = {
    val __obj = js.Dynamic.literal(getArgs = js.Any.fromFunction0(getArgs), getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunctionName = js.Any.fromFunction0(getFunctionName), getIsConstructor = js.Any.fromFunction0(getIsConstructor), getIsEval = js.Any.fromFunction0(getIsEval), getIsNative = js.Any.fromFunction0(getIsNative), getIsToplevel = js.Any.fromFunction0(getIsToplevel), getLineNumber = js.Any.fromFunction0(getLineNumber), getSource = js.Any.fromFunction0(getSource), setArgs = js.Any.fromFunction1(setArgs), setColumnNumber = js.Any.fromFunction1(setColumnNumber), setEvalOrigin = js.Any.fromFunction1(setEvalOrigin), setFileName = js.Any.fromFunction1(setFileName), setFunctionName = js.Any.fromFunction1(setFunctionName), setIsConstructor = js.Any.fromFunction1(setIsConstructor), setIsEval = js.Any.fromFunction1(setIsEval), setIsNative = js.Any.fromFunction1(setIsNative), setIsToplevel = js.Any.fromFunction1(setIsToplevel), setLineNumber = js.Any.fromFunction1(setLineNumber), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[StackFrame]
  }
  
  @scala.inline
  implicit class StackFrameOps[Self <: StackFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetArgs(value: () => js.UndefOr[js.Array[_]]): Self = this.set("getArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumnNumber(value: () => js.UndefOr[Double]): Self = this.set("getColumnNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEvalOrigin(value: () => js.UndefOr[StackFrame]): Self = this.set("getEvalOrigin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileName(value: () => js.UndefOr[String]): Self = this.set("getFileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFunctionName(value: () => js.UndefOr[String]): Self = this.set("getFunctionName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsConstructor(value: () => js.UndefOr[Boolean]): Self = this.set("getIsConstructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsEval(value: () => js.UndefOr[Boolean]): Self = this.set("getIsEval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsNative(value: () => js.UndefOr[Boolean]): Self = this.set("getIsNative", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsToplevel(value: () => js.UndefOr[Boolean]): Self = this.set("getIsToplevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineNumber(value: () => js.UndefOr[Double]): Self = this.set("getLineNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSource(value: () => js.UndefOr[String]): Self = this.set("getSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetArgs(value: js.Array[_] => Unit): Self = this.set("setArgs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetColumnNumber(value: Double => Unit): Self = this.set("setColumnNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEvalOrigin(value: StackFrame => Unit): Self = this.set("setEvalOrigin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFileName(value: String => Unit): Self = this.set("setFileName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFunctionName(value: String => Unit): Self = this.set("setFunctionName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsConstructor(value: Boolean => Unit): Self = this.set("setIsConstructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsEval(value: Boolean => Unit): Self = this.set("setIsEval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsNative(value: Boolean => Unit): Self = this.set("setIsNative", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsToplevel(value: Boolean => Unit): Self = this.set("setIsToplevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLineNumber(value: Double => Unit): Self = this.set("setLineNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSource(value: String => Unit): Self = this.set("setSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    
    @scala.inline
    def setEvalOrigin(value: StackFrame): Self = this.set("evalOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalOrigin: Self = this.set("evalOrigin", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    
    @scala.inline
    def setIsConstructor(value: Boolean): Self = this.set("isConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsConstructor: Self = this.set("isConstructor", js.undefined)
    
    @scala.inline
    def setIsEval(value: Boolean): Self = this.set("isEval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEval: Self = this.set("isEval", js.undefined)
    
    @scala.inline
    def setIsNative(value: Boolean): Self = this.set("isNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNative: Self = this.set("isNative", js.undefined)
    
    @scala.inline
    def setIsToplevel(value: Boolean): Self = this.set("isToplevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsToplevel: Self = this.set("isToplevel", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
