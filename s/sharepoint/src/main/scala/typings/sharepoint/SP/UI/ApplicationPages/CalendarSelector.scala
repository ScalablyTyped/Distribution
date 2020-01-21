package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.ApplicationPages.CalendarSelector")
@js.native
class CalendarSelector () extends Component {
  def addHandler(
    scopeKey: String,
    people: Boolean,
    resource: Boolean,
    handler: js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]
  ): Unit = js.native
  def getSelector(`type`: SelectorType, scopeKey: String): ISelectorComponent = js.native
  def registerSelector(selector: ISelectorComponent): Unit = js.native
  def removeEntity(scopeKey: String, ent: ResolveEntity): Unit = js.native
  def revertTo(scopeKey: String, ent: ResolveEntity): Unit = js.native
}

/* static members */
@JSGlobal("SP.UI.ApplicationPages.CalendarSelector")
@js.native
object CalendarSelector extends js.Object {
  def instance(): CalendarSelector = js.native
}

