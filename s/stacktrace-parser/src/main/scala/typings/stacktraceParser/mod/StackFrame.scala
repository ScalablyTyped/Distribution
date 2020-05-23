package typings.stacktraceParser.mod

import typings.stacktraceParser.stacktraceParserStrings.LessthansignunknownGreaterthansign
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var arguments: js.Array[String]
  var column: Double | Null
  var file: String | Null
  var lineNumber: Double | Null
  var methodName: LiteralUnion[LessthansignunknownGreaterthansign, String]
}

object StackFrame {
  @scala.inline
  def apply(
    arguments: js.Array[String],
    methodName: LiteralUnion[LessthansignunknownGreaterthansign, String],
    column: Double = null.asInstanceOf[Double],
    file: String = null,
    lineNumber: Double = null.asInstanceOf[Double]
  ): StackFrame = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

