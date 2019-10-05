package typings.stackDashTrace.stackDashTraceMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stack-trace", "parse")
@js.native
object parse extends js.Object {
  def apply(err: Error): js.Array[StackFrame] = js.native
}

