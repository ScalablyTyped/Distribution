package typings.reactNativeFirebase.mod.RNFirebase.storage

import typings.reactNativeFirebase.AnonCACHESDIRECTORYPATH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageStatics extends js.Object {
  var Native: js.UndefOr[AnonCACHESDIRECTORYPATH] = js.undefined
  var TaskEvent: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent
  var TaskState: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState
}

object StorageStatics {
  @scala.inline
  def apply(TaskEvent: TaskEvent, TaskState: TaskState, Native: AnonCACHESDIRECTORYPATH = null): StorageStatics = {
    val __obj = js.Dynamic.literal(TaskEvent = TaskEvent.asInstanceOf[js.Any], TaskState = TaskState.asInstanceOf[js.Any])
    if (Native != null) __obj.updateDynamic("Native")(Native.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStatics]
  }
}

