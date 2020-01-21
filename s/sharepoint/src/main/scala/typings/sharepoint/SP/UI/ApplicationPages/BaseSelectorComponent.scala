package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.BaseSelectorComponent")
@js.native
class BaseSelectorComponent protected () extends ISelectorComponent {
  def this(key: String, `type`: SelectorType) = this()
  /* CompleteClass */
  override def get_callback(): js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] = js.native
  /* CompleteClass */
  override def get_componentType(): SelectorType = js.native
  /* CompleteClass */
  override def get_scopeKey(): String = js.native
  /* CompleteClass */
  override def get_selectedEntities(): js.Any = js.native
  /* CompleteClass */
  override def removeEntity(ent: ResolveEntity): Unit = js.native
  /* CompleteClass */
  override def revertTo(ent: ResolveEntity): Unit = js.native
  /* CompleteClass */
  override def setEntity(ent: ResolveEntity): Unit = js.native
  /* CompleteClass */
  override def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
  /* CompleteClass */
  override def set_selectedEntities(value: js.Any): Unit = js.native
}

