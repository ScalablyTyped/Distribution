package typings.stackDashTrace.stackDashTraceMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stack-trace", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def get(): js.Array[StackFrame] = js.native
  def get(belowFn: js.Function0[Unit]): js.Array[StackFrame] = js.native
  def parse(err: Error): js.Array[StackFrame] = js.native
}

