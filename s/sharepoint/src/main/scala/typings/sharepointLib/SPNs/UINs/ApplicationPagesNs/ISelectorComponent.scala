package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait ISelectorComponent extends js.Object {
  def get_callback(): js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit]
  def get_componentType(): SelectorType
  def get_scopeKey(): java.lang.String
  def get_selectedEntities(): js.Any
  def removeEntity(ent: ResolveEntity): scala.Unit
  def revertTo(ent: ResolveEntity): scala.Unit
  def setEntity(ent: ResolveEntity): scala.Unit
  def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit]): scala.Unit
  def set_selectedEntities(value: js.Any): scala.Unit
}

object ISelectorComponent {
  @scala.inline
  def apply(
    get_callback: () => js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit],
    get_componentType: () => SelectorType,
    get_scopeKey: () => java.lang.String,
    get_selectedEntities: () => js.Any,
    removeEntity: ResolveEntity => scala.Unit,
    revertTo: ResolveEntity => scala.Unit,
    setEntity: ResolveEntity => scala.Unit,
    set_callback: js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit] => scala.Unit,
    set_selectedEntities: js.Any => scala.Unit
  ): ISelectorComponent = {
    val __obj = js.Dynamic.literal(get_callback = js.Any.fromFunction0(get_callback), get_componentType = js.Any.fromFunction0(get_componentType), get_scopeKey = js.Any.fromFunction0(get_scopeKey), get_selectedEntities = js.Any.fromFunction0(get_selectedEntities), removeEntity = js.Any.fromFunction1(removeEntity), revertTo = js.Any.fromFunction1(revertTo), setEntity = js.Any.fromFunction1(setEntity), set_callback = js.Any.fromFunction1(set_callback), set_selectedEntities = js.Any.fromFunction1(set_selectedEntities))
  
    __obj.asInstanceOf[ISelectorComponent]
  }
}

