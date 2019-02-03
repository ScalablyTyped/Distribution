package typings
package sharepointLib.SPNs.UINs.ApplicationPagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.CalendarSelector")
@js.native
class CalendarSelector ()
  extends microsoftDashAjaxLib.SysNs.Component {
  def addHandler(
    scopeKey: java.lang.String,
    people: scala.Boolean,
    resource: scala.Boolean,
    handler: js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, scala.Unit]
  ): scala.Unit = js.native
  def getSelector(`type`: SelectorType, scopeKey: java.lang.String): ISelectorComponent = js.native
  def registerSelector(selector: ISelectorComponent): scala.Unit = js.native
  def removeEntity(scopeKey: java.lang.String, ent: ResolveEntity): scala.Unit = js.native
  def revertTo(scopeKey: java.lang.String, ent: ResolveEntity): scala.Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.ApplicationPages.CalendarSelector")
@js.native
object CalendarSelector extends js.Object {
  def instance(): sharepointLib.SPNs.UINs.ApplicationPagesNs.CalendarSelector = js.native
}

