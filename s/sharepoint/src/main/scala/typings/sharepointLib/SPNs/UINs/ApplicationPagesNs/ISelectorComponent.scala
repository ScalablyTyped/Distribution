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

