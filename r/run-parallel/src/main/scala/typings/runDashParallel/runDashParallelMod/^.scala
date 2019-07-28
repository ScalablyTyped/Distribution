package typings.runDashParallel.runDashParallelMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-parallel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](tasks: js.Array[Task[T]]): js.Array[T] = js.native
  def apply[T](tasks: js.Array[Task[T]], callback: Callback[js.Array[T]]): Unit = js.native
  def apply[T](tasks: TaskObj[T]): Record[String, T] = js.native
  def apply[T](tasks: TaskObj[T], callback: Callback[Record[String, T]]): Unit = js.native
}

