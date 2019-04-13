package typings
package runDashParallelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runDashParallelMod {
  type Callback[T] = js.Function2[/* err */ stdLib.Error, /* results */ T, scala.Unit]
  type Task[T] = js.Function1[/* callback */ TaskCallback[T], scala.Unit]
  type TaskCallback[T] = js.Function2[/* err */ stdLib.Error | scala.Null, /* results */ js.UndefOr[T], scala.Unit]
  type TaskObj[T] = stdLib.Record[java.lang.String, Task[T]]
}
