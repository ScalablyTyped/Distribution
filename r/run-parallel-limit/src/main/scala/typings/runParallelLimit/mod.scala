package typings.runParallelLimit

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](tasks: js.Array[Task[T]], limit: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def apply[T](tasks: js.Array[Task[T]], limit: Double, callback: Callback[js.Array[T]]): Unit = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply[T](tasks: TaskObj[T], limit: Double): Record[String, T] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Record[String, T]]
  @scala.inline
  def apply[T](tasks: TaskObj[T], limit: Double, callback: Callback[Record[String, T]]): Unit = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("run-parallel-limit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback[T] = js.Function2[/* err */ Error, /* results */ T, Unit]
  
  type Task[T] = js.Function1[/* callback */ TaskCallback[T], Unit]
  
  type TaskCallback[T] = js.Function2[/* err */ Error | Null, /* results */ js.UndefOr[T], Unit]
  
  type TaskObj[T] = Record[String, Task[T]]
}
