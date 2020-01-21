package typings.stacktraceJs.StackTrace

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace.fromError")
@js.native
object fromError extends js.Object {
  def apply(error: Error): js.Promise[js.Array[StackFrame]] = js.native
  def apply(error: Error, options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
}

