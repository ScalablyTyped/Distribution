package typings.sharepoint.SPNs.JsGridNs.InternalNs

import typings.sharepoint.Anon_AnyChanges
import typings.sharepoint.SPNs.JsGridNs.IChangeKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Internal.DiffTracker")
@js.native
class DiffTracker protected () extends js.Object {
  def this(
    objBag: js.Any,
    fnGetChange: js.Function4[
        /* version */ js.Any, 
        /* keys */ js.Array[_], 
        /* synchronized */ Boolean, 
        /* includeInvalidPropUpdates */ Boolean, 
        _
      ]
  ) = this()
  var ExternalAPI: Anon_AnyChanges = js.native
  def Clear(): Unit = js.native
  def NotifyRollbackChange(changeKey: IChangeKey): Unit = js.native
  def NotifySynchronizeToChange(changeKey: IChangeKey): Unit = js.native
  def NotifyVacateChange(changeKey: IChangeKey): Unit = js.native
}

