package typings
package runDashParallelLib.runDashParallelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-parallel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](tasks: js.Array[runDashParallelLib.runDashParallelMod.RunParallelNs.Task[T]]): js.Array[T] = js.native
  def apply[T](
    tasks: js.Array[runDashParallelLib.runDashParallelMod.RunParallelNs.Task[T]],
    callback: runDashParallelLib.runDashParallelMod.RunParallelNs.Callback[js.Array[T]]
  ): scala.Unit = js.native
  def apply[T](tasks: runDashParallelLib.runDashParallelMod.RunParallelNs.TaskObj[T]): stdLib.Record[java.lang.String, T] = js.native
  def apply[T](
    tasks: runDashParallelLib.runDashParallelMod.RunParallelNs.TaskObj[T],
    callback: runDashParallelLib.runDashParallelMod.RunParallelNs.Callback[stdLib.Record[java.lang.String, T]]
  ): scala.Unit = js.native
}

