package typings.sharepoint.SP.Application.UI

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.Sys.UI.Control
import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeWebPage extends Control {
  def add_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
  def get_thmxThemes(): js.Any = js.native
  def onThemeSelectionChanged(evt: DomEvent): Unit = js.native
  def remove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
  def set_thmxThemes(value: js.Any): Unit = js.native
  def updateThemeDisplay(): Unit = js.native
}

object ThemeWebPage {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    add_themeDisplayUpdated: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
    beginUpdate: () => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_element: () => HTMLElement,
    get_events: () => js.Any,
    get_id: () => String,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_thmxThemes: () => js.Any,
    initialize: () => Unit,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    onThemeSelectionChanged: DomEvent => Unit,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raisePropertyChanged: String => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_themeDisplayUpdated: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
    set_id: String => Unit,
    set_thmxThemes: js.Any => Unit,
    toggleCssClass: String => Unit,
    updateThemeDisplay: () => Unit,
    updated: () => Unit
  ): ThemeWebPage = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_themeDisplayUpdated = js.Any.fromFunction1(add_themeDisplayUpdated), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_thmxThemes = js.Any.fromFunction0(get_thmxThemes), initialize = js.Any.fromFunction0(initialize), onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), onThemeSelectionChanged = js.Any.fromFunction1(onThemeSelectionChanged), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_themeDisplayUpdated = js.Any.fromFunction1(remove_themeDisplayUpdated), set_id = js.Any.fromFunction1(set_id), set_thmxThemes = js.Any.fromFunction1(set_thmxThemes), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateThemeDisplay = js.Any.fromFunction0(updateThemeDisplay), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[ThemeWebPage]
  }
  @scala.inline
  implicit class ThemeWebPageOps[Self <: ThemeWebPage] (val x: Self) extends AnyVal {
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
    def setAdd_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit): Self = this.set("add_themeDisplayUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def setGet_thmxThemes(value: () => js.Any): Self = this.set("get_thmxThemes", js.Any.fromFunction0(value))
    @scala.inline
    def setOnThemeSelectionChanged(value: DomEvent => Unit): Self = this.set("onThemeSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove_themeDisplayUpdated(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit): Self = this.set("remove_themeDisplayUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_thmxThemes(value: js.Any => Unit): Self = this.set("set_thmxThemes", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateThemeDisplay(value: () => Unit): Self = this.set("updateThemeDisplay", js.Any.fromFunction0(value))
  }
  
}

