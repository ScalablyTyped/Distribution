package typings.runDashParallelDashLimit.runDashParallelDashLimitMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-parallel-limit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](tasks: js.Array[Task[T]], limit: Double): js.Array[T] = js.native
  def apply[T](tasks: js.Array[Task[T]], limit: Double, callback: Callback[js.Array[T]]): Unit = js.native
  def apply[T](tasks: TaskObj[T], limit: Double): Record[String, T] = js.native
  def apply[T](tasks: TaskObj[T], limit: Double, callback: Callback[Record[String, T]]): Unit = js.native
}

