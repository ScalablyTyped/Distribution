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
    get_callback: js.Function0[
      js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit]
    ],
    get_componentType: js.Function0[SelectorType],
    get_scopeKey: js.Function0[java.lang.String],
    get_selectedEntities: js.Function0[js.Any],
    removeEntity: js.Function1[ResolveEntity, scala.Unit],
    revertTo: js.Function1[ResolveEntity, scala.Unit],
    setEntity: js.Function1[ResolveEntity, scala.Unit],
    set_callback: js.Function1[
      js.Function2[/* sender */ js.Any, /* e */ microsoftDashAjaxLib.SysNs.EventArgs, scala.Unit], 
      scala.Unit
    ],
    set_selectedEntities: js.Function1[js.Any, scala.Unit]
  ): ISelectorComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_callback")(get_callback)
    __obj.updateDynamic("get_componentType")(get_componentType)
    __obj.updateDynamic("get_scopeKey")(get_scopeKey)
    __obj.updateDynamic("get_selectedEntities")(get_selectedEntities)
    __obj.updateDynamic("removeEntity")(removeEntity)
    __obj.updateDynamic("revertTo")(revertTo)
    __obj.updateDynamic("setEntity")(setEntity)
    __obj.updateDynamic("set_callback")(set_callback)
    __obj.updateDynamic("set_selectedEntities")(set_selectedEntities)
    __obj.asInstanceOf[ISelectorComponent]
  }
}

