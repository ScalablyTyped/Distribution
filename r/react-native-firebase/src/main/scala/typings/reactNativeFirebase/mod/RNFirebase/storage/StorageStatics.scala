package typings.reactNativeFirebase.mod.RNFirebase.storage

import typings.reactNativeFirebase.anon.CACHESDIRECTORYPATH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageStatics extends js.Object {
  var Native: js.UndefOr[CACHESDIRECTORYPATH] = js.native
  var TaskEvent: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskEvent = js.native
  var TaskState: typings.reactNativeFirebase.mod.RNFirebase.storage.TaskState = js.native
}

object StorageStatics {
  @scala.inline
  def apply(TaskEvent: TaskEvent, TaskState: TaskState): StorageStatics = {
    val __obj = js.Dynamic.literal(TaskEvent = TaskEvent.asInstanceOf[js.Any], TaskState = TaskState.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStatics]
  }
  @scala.inline
  implicit class StorageStaticsOps[Self <: StorageStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskEvent(value: TaskEvent): Self = this.set("TaskEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskState(value: TaskState): Self = this.set("TaskState", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: CACHESDIRECTORYPATH): Self = this.set("Native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("Native", js.undefined)
  }
  
}

