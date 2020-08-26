package typings.storybookApi.shortcutsMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  def getShortcutKeys(): Shortcuts = js.native
  def handleKeydownEvent(api: API, event: Event): Unit = js.native
  def handleShortcutFeature(api: API, feature: Action): Unit = js.native
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts] = js.native
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection] = js.native
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection] = js.native
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts] = js.native
}

object SubAPI {
  @scala.inline
  def apply(
    getShortcutKeys: () => Shortcuts,
    handleKeydownEvent: (API, Event) => Unit,
    handleShortcutFeature: (API, Action) => Unit,
    restoreAllDefaultShortcuts: () => js.Promise[Shortcuts],
    restoreDefaultShortcut: Action => js.Promise[KeyCollection],
    setShortcut: (Action, KeyCollection) => js.Promise[KeyCollection],
    setShortcuts: Shortcuts => js.Promise[Shortcuts]
  ): SubAPI = {
    val __obj = js.Dynamic.literal(getShortcutKeys = js.Any.fromFunction0(getShortcutKeys), handleKeydownEvent = js.Any.fromFunction2(handleKeydownEvent), handleShortcutFeature = js.Any.fromFunction2(handleShortcutFeature), restoreAllDefaultShortcuts = js.Any.fromFunction0(restoreAllDefaultShortcuts), restoreDefaultShortcut = js.Any.fromFunction1(restoreDefaultShortcut), setShortcut = js.Any.fromFunction2(setShortcut), setShortcuts = js.Any.fromFunction1(setShortcuts))
    __obj.asInstanceOf[SubAPI]
  }
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
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
    def setGetShortcutKeys(value: () => Shortcuts): Self = this.set("getShortcutKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setHandleKeydownEvent(value: (API, Event) => Unit): Self = this.set("handleKeydownEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleShortcutFeature(value: (API, Action) => Unit): Self = this.set("handleShortcutFeature", js.Any.fromFunction2(value))
    @scala.inline
    def setRestoreAllDefaultShortcuts(value: () => js.Promise[Shortcuts]): Self = this.set("restoreAllDefaultShortcuts", js.Any.fromFunction0(value))
    @scala.inline
    def setRestoreDefaultShortcut(value: Action => js.Promise[KeyCollection]): Self = this.set("restoreDefaultShortcut", js.Any.fromFunction1(value))
    @scala.inline
    def setSetShortcut(value: (Action, KeyCollection) => js.Promise[KeyCollection]): Self = this.set("setShortcut", js.Any.fromFunction2(value))
    @scala.inline
    def setSetShortcuts(value: Shortcuts => js.Promise[Shortcuts]): Self = this.set("setShortcuts", js.Any.fromFunction1(value))
  }
  
}

