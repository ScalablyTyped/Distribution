package typings.stackframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrameOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.native
  var columnNumber: js.UndefOr[Double] = js.native
  var evalOrigin: js.UndefOr[StackFrame] = js.native
  var fileName: js.UndefOr[String] = js.native
  var functionName: js.UndefOr[String] = js.native
  var isConstructor: js.UndefOr[Boolean] = js.native
  var isEval: js.UndefOr[Boolean] = js.native
  var isNative: js.UndefOr[Boolean] = js.native
  var isToplevel: js.UndefOr[Boolean] = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  var source: js.UndefOr[String] = js.native
}

object StackFrameOptions {
  @scala.inline
  def apply(): StackFrameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackFrameOptions]
  }
  @scala.inline
  implicit class StackFrameOptionsOps[Self <: StackFrameOptions] (val x: Self) extends AnyVal {
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

