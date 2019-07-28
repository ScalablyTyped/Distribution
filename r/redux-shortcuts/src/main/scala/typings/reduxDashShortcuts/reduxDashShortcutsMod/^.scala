package typings.reduxDashShortcuts.reduxDashShortcutsMod

import typings.mousetrap.MousetrapInstance
import typings.mousetrap.MousetrapStatic
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-shortcuts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mousetrap: MousetrapStatic = js.native
  val mousetrap: MousetrapInstance = js.native
  def bindShortcut(keys: KeyBindings, actionCreator: ActionBindings): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
  def bindShortcut(keys: KeyBindings, actionCreator: ActionBindings, preventDefault: Boolean): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
  def bindShortcuts(shortcut: ShortcutDefinition*): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
}

