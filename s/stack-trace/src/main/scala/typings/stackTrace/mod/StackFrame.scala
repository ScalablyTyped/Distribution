package typings.stackTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  def getColumnNumber(): Double = js.native
  def getFileName(): String = js.native
  def getFunctionName(): String = js.native
  def getLineNumber(): Double = js.native
  def getMethodName(): String = js.native
  def getTypeName(): String = js.native
  def isNative(): Boolean = js.native
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
    def setGetColumnNumber(value: () => Double): Self = this.set("getColumnNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFileName(value: () => String): Self = this.set("getFileName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFunctionName(value: () => String): Self = this.set("getFunctionName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLineNumber(value: () => Double): Self = this.set("getLineNumber", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMethodName(value: () => String): Self = this.set("getMethodName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTypeName(value: () => String): Self = this.set("getTypeName", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNative(value: () => Boolean): Self = this.set("isNative", js.Any.fromFunction0(value))
  }
  
}

