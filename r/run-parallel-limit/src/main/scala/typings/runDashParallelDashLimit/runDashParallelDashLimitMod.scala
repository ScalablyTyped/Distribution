package typings.runDashParallelDashLimit

import typings.runDashParallelDashLimit.runDashParallelDashLimitMod.Callback
import typings.runDashParallelDashLimit.runDashParallelDashLimitMod.Task
import typings.runDashParallelDashLimit.runDashParallelDashLimitMod.TaskCallback
import typings.runDashParallelDashLimit.runDashParallelDashLimitMod.TaskObj
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-parallel-limit", JSImport.Namespace)
@js.native
object runDashParallelDashLimitMod extends js.Object {
  def apply[T](tasks: js.Array[Task[T]], limit: Double): js.Array[T] = js.native
  def apply[T](tasks: js.Array[Task[T]], limit: Double, callback: Callback[js.Array[T]]): Unit = js.native
  def apply[T](tasks: TaskObj[T], limit: Double): Record[String, T] = js.native
  def apply[T](tasks: TaskObj[T], limit: Double, callback: Callback[Record[String, T]]): Unit = js.native
  type Callback[T] = js.Function2[/* err */ Error, /* results */ T, Unit]
  type Task[T] = js.Function1[/* callback */ TaskCallback[T], Unit]
  type TaskCallback[T] = js.Function2[/* err */ Error | Null, /* results */ js.UndefOr[T], Unit]
  type TaskObj[T] = Record[String, Task[T]]
}

