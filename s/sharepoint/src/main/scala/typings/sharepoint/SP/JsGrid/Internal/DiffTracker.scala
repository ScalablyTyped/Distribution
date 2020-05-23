package typings.sharepoint.SP.JsGrid.Internal

import typings.sharepoint.SP.JsGrid.IChangeKey
import typings.sharepoint.anon.AnyChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffTracker extends js.Object {
  var ExternalAPI: AnyChanges
  def Clear(): Unit
  def NotifyRollbackChange(changeKey: IChangeKey): Unit
  def NotifySynchronizeToChange(changeKey: IChangeKey): Unit
  def NotifyVacateChange(changeKey: IChangeKey): Unit
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
}

