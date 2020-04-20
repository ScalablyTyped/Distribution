package typings.storybookApi.shortcutsMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getShortcutKeys(): Shortcuts
  def handleKeydownEvent(api: API, event: Event): Unit
  def handleShortcutFeature(api: API, feature: Action): Unit
  def restoreAllDefaultShortcuts(): js.Promise[Shortcuts]
  def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection]
  def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection]
  def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts]
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
}

