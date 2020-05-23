package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarSelector extends Component {
  def addHandler(
    scopeKey: String,
    people: Boolean,
    resource: Boolean,
    handler: js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]
  ): Unit
  def getSelector(`type`: SelectorType, scopeKey: String): ISelectorComponent
  def registerSelector(selector: ISelectorComponent): Unit
  def removeEntity(scopeKey: String, ent: ResolveEntity): Unit
  def revertTo(scopeKey: String, ent: ResolveEntity): Unit
}

object CalendarSelector {
  @scala.inline
  def apply(
    addHandler: (String, Boolean, Boolean, js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]) => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    beginUpdate: () => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    getSelector: (SelectorType, String) => ISelectorComponent,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    initialize: () => Unit,
    raisePropertyChanged: String => Unit,
    registerSelector: ISelectorComponent => Unit,
    removeEntity: (String, ResolveEntity) => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    revertTo: (String, ResolveEntity) => Unit,
    set_id: String => Unit,
    updated: () => Unit
  ): CalendarSelector = {
    val __obj = js.Dynamic.literal(addHandler = js.Any.fromFunction4(addHandler), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), getSelector = js.Any.fromFunction2(getSelector), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), initialize = js.Any.fromFunction0(initialize), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), registerSelector = js.Any.fromFunction1(registerSelector), removeEntity = js.Any.fromFunction2(removeEntity), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), revertTo = js.Any.fromFunction2(revertTo), set_id = js.Any.fromFunction1(set_id), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[CalendarSelector]
  }
}

