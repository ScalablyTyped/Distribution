package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import typings.reactDashNativeDashFirebase.Anon_CACHESDIRECTORYPATH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageStatics extends js.Object {
  var Native: js.UndefOr[Anon_CACHESDIRECTORYPATH] = js.undefined
  var TaskEvent: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskEvent
  var TaskState: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskState
}

object StorageStatics {
  @scala.inline
  def apply(TaskEvent: TaskEvent, TaskState: TaskState, Native: Anon_CACHESDIRECTORYPATH = null): StorageStatics = {
    val __obj = js.Dynamic.literal(TaskEvent = TaskEvent, TaskState = TaskState)
    if (Native != null) __obj.updateDynamic("Native")(Native)
    __obj.asInstanceOf[StorageStatics]
  }
}

