package typings.runParallelLimit

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("run-parallel-limit", JSImport.Namespace)
  @js.native
  def apply[T](tasks: js.Array[Task[T]], limit: Double): js.Array[T] = js.native
  @JSImport("run-parallel-limit", JSImport.Namespace)
  @js.native
  def apply[T](tasks: js.Array[Task[T]], limit: Double, callback: Callback[js.Array[T]]): Unit = js.native
  @JSImport("run-parallel-limit", JSImport.Namespace)
  @js.native
  def apply[T](tasks: TaskObj[T], limit: Double): Record[String, T] = js.native
  @JSImport("run-parallel-limit", JSImport.Namespace)
  @js.native
  def apply[T](tasks: TaskObj[T], limit: Double, callback: Callback[Record[String, T]]): Unit = js.native
  
  type Callback[T] = js.Function2[/* err */ Error, /* results */ T, Unit]
  
  type Task[T] = js.Function1[/* callback */ TaskCallback[T], Unit]
  
  type TaskCallback[T] = js.Function2[/* err */ Error | Null, /* results */ js.UndefOr[T], Unit]
  
  type TaskObj[T] = Record[String, Task[T]]
}
