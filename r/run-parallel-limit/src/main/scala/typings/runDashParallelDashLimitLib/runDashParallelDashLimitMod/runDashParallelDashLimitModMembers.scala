package typings
package runDashParallelDashLimitLib.runDashParallelDashLimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-parallel-limit", JSImport.Namespace)
@js.native
object runDashParallelDashLimitModMembers extends js.Object {
  def apply[T](
    tasks: js.Array[
      runDashParallelDashLimitLib.runDashParallelDashLimitMod.RunParallelLimitNs.Task[T]
    ],
    limit: scala.Double
  ): js.Array[T] = js.native
  def apply[T](
    tasks: js.Array[
      runDashParallelDashLimitLib.runDashParallelDashLimitMod.RunParallelLimitNs.Task[T]
    ],
    limit: scala.Double,
    callback: runDashParallelDashLimitLib.runDashParallelDashLimitMod.RunParallelLimitNs.Callback[js.Array[T]]
  ): scala.Unit = js.native
  def apply[T](
    tasks: runDashParallelDashLimitLib.runDashParallelDashLimitMod.RunParallelLimitNs.TaskObj[T],
    limit: scala.Double
  ): stdLib.Record[java.lang.String, T] = js.native
  def apply[T](
    tasks: runDashParallelDashLimitLib.runDashParallelDashLimitMod.RunParallelLimitNs.TaskObj[T],
    limit: scala.Double,
    callback: runDashParallelDashLimitLib.runDashParallelDashLimitMod.RunParallelLimitNs.Callback[stdLib.Record[java.lang.String, T]]
  ): scala.Unit = js.native
}

