package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.BaseSelectorComponent")
@js.native
class BaseSelectorComponent protected () extends ISelectorComponent {
  def this(key: java.lang.String, `type`: SelectorType) = this()
  /* CompleteClass */
  override def get_callback(): js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit] = js.native
  /* CompleteClass */
  override def get_componentType(): SelectorType = js.native
  /* CompleteClass */
  override def get_scopeKey(): java.lang.String = js.native
  /* CompleteClass */
  override def get_selectedEntities(): js.Any = js.native
  /* CompleteClass */
  override def removeEntity(ent: ResolveEntity): scala.Unit = js.native
  /* CompleteClass */
  override def revertTo(ent: ResolveEntity): scala.Unit = js.native
  /* CompleteClass */
  override def setEntity(ent: ResolveEntity): scala.Unit = js.native
  /* CompleteClass */
  override def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def set_selectedEntities(value: js.Any): scala.Unit = js.native
}

