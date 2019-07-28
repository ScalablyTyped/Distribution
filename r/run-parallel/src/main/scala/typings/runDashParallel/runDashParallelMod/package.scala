package typings.runDashParallel

import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runDashParallelMod {
  type Callback[T] = js.Function2[/* err */ Error, /* results */ T, Unit]
  type Task[T] = js.Function1[/* callback */ TaskCallback[T], Unit]
  type TaskCallback[T] = js.Function2[/* err */ Error | Null, /* results */ js.UndefOr[T], Unit]
  type TaskObj[T] = Record[String, Task[T]]
}
