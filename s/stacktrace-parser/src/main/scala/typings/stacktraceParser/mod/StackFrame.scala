package typings.stacktraceParser.mod

import typings.stacktraceParser.stacktraceParserStrings.LessthansignunknownGreaterthansign
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackFrame extends js.Object {
  var arguments: js.Array[String] = js.native
  var column: Double | Null = js.native
  var file: String | Null = js.native
  var lineNumber: Double | Null = js.native
  var methodName: LiteralUnion[LessthansignunknownGreaterthansign, String] = js.native
}

object StackFrame {
  @scala.inline
  def apply(arguments: js.Array[String], methodName: LiteralUnion[LessthansignunknownGreaterthansign, String]): StackFrame = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethodName(value: LiteralUnion[LessthansignunknownGreaterthansign, String]): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnNull: Self = this.set("column", null)
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileNull: Self = this.set("file", null)
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumberNull: Self = this.set("lineNumber", null)
  }
  
}

