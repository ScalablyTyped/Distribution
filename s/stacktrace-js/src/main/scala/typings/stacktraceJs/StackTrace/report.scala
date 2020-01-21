package typings.stacktraceJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace.report")
@js.native
object report extends js.Object {
  def apply(stackframes: js.Array[StackFrame], url: String): js.Promise[_] = js.native
  def apply(stackframes: js.Array[StackFrame], url: String, errorMsg: String): js.Promise[_] = js.native
  def apply(stackframes: js.Array[StackFrame], url: String, errorMsg: String, requestOptions: js.Object): js.Promise[_] = js.native
}

