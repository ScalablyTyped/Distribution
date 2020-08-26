package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarSelector extends Component {
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
  @scala.inline
  implicit class CalendarSelectorOps[Self <: CalendarSelector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddHandler(
      value: (String, Boolean, Boolean, js.Function2[/* sender */ js.Any, /* selection */ SelectorSelectionEventArgs, Unit]) => Unit
    ): Self = this.set("addHandler", js.Any.fromFunction4(value))
    @scala.inline
    def setGetSelector(value: (SelectorType, String) => ISelectorComponent): Self = this.set("getSelector", js.Any.fromFunction2(value))
    @scala.inline
    def setRegisterSelector(value: ISelectorComponent => Unit): Self = this.set("registerSelector", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveEntity(value: (String, ResolveEntity) => Unit): Self = this.set("removeEntity", js.Any.fromFunction2(value))
    @scala.inline
    def setRevertTo(value: (String, ResolveEntity) => Unit): Self = this.set("revertTo", js.Any.fromFunction2(value))
  }
  
}

