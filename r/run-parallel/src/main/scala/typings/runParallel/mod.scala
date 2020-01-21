package typings.runParallel

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("run-parallel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](tasks: js.Array[Task[T]]): js.Array[T] = js.native
  def apply[T](tasks: js.Array[Task[T]], callback: Callback[js.Array[T]]): Unit = js.native
  def apply[T](tasks: TaskObj[T]): Record[String, T] = js.native
  def apply[T](tasks: TaskObj[T], callback: Callback[Record[String, T]]): Unit = js.native
  type Callback[T] = js.Function2[/* err */ Error, /* results */ T, Unit]
  type Task[T] = js.Function1[/* callback */ TaskCallback[T], Unit]
  type TaskCallback[T] = js.Function2[/* err */ Error | Null, /* results */ js.UndefOr[T], Unit]
  type TaskObj[T] = Record[String, Task[T]]
}

