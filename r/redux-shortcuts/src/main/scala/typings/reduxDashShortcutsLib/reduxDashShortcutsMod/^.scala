package typings
package reduxDashShortcutsLib.reduxDashShortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-shortcuts", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Mousetrap: mousetrapLib.MousetrapStatic = js.native
  val mousetrap: mousetrapLib.MousetrapInstance = js.native
  def bindShortcut(keys: KeyBindings, actionCreator: ActionBindings): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = js.native
  def bindShortcut(keys: KeyBindings, actionCreator: ActionBindings, preventDefault: scala.Boolean): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = js.native
  def bindShortcuts(shortcut: ShortcutDefinition*): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = js.native
}

