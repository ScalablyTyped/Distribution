package typings.stacktraceDashJs.StackTrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace.report")
@js.native
object report extends js.Object {
  def apply(stackframes: js.Array[StackFrame], url: String): js.Promise[String] = js.native
  def apply(stackframes: js.Array[StackFrame], url: String, message: String): js.Promise[String] = js.native
  def apply(stackframes: js.Array[StackFrame], url: String, message: String, requestOptions: RequestOptions): js.Promise[String] = js.native
}

