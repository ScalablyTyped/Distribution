package typings
package sharepointLib.SPNs.JsGridNs.InternalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Internal.DiffTracker")
@js.native
class DiffTracker protected () extends js.Object {
  def this(objBag: js.Any, fnGetChange: js.Function4[
      /* version */ js.Any, 
      /* keys */ js.Array[_], 
      /* synchronized */ scala.Boolean, 
      /* includeInvalidPropUpdates */ scala.Boolean, 
      _
    ]) = this()
  var ExternalAPI: sharepointLib.Anon_GetChanges = js.native
  def Clear(): scala.Unit = js.native
  def NotifyRollbackChange(changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey): scala.Unit = js.native
  def NotifySynchronizeToChange(changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey): scala.Unit = js.native
  def NotifyVacateChange(changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey): scala.Unit = js.native
}

