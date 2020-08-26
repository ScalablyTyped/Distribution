package typings.sharepoint.SP.JsGrid.Internal

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.anon.AnyChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffTracker extends js.Object {
  var ExternalAPI: AnyChanges = js.native
  def Clear(): Unit = js.native
  def NotifyRollbackChange(changeKey: IChangeKey): Unit = js.native
  def NotifySynchronizeToChange(changeKey: IChangeKey): Unit = js.native
  def NotifyVacateChange(changeKey: IChangeKey): Unit = js.native
}

object DiffTracker {
  @scala.inline
  def apply(
    Clear: () => Unit,
    ExternalAPI: AnyChanges,
    NotifyRollbackChange: IChangeKey => Unit,
    NotifySynchronizeToChange: IChangeKey => Unit,
    NotifyVacateChange: IChangeKey => Unit
  ): DiffTracker = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), ExternalAPI = ExternalAPI.asInstanceOf[js.Any], NotifyRollbackChange = js.Any.fromFunction1(NotifyRollbackChange), NotifySynchronizeToChange = js.Any.fromFunction1(NotifySynchronizeToChange), NotifyVacateChange = js.Any.fromFunction1(NotifyVacateChange))
    __obj.asInstanceOf[DiffTracker]
  }
  @scala.inline
  implicit class DiffTrackerOps[Self <: DiffTracker] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setExternalAPI(value: AnyChanges): Self = this.set("ExternalAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifyRollbackChange(value: IChangeKey => Unit): Self = this.set("NotifyRollbackChange", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifySynchronizeToChange(value: IChangeKey => Unit): Self = this.set("NotifySynchronizeToChange", js.Any.fromFunction1(value))
    @scala.inline
    def setNotifyVacateChange(value: IChangeKey => Unit): Self = this.set("NotifyVacateChange", js.Any.fromFunction1(value))
  }
  
}

