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
  def bindShortcut(
    keys: reduxDashShortcutsLib.reduxDashShortcutsMod.KeyBindings,
    actionCreator: reduxDashShortcutsLib.reduxDashShortcutsMod.ActionBindings
  ): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = js.native
  def bindShortcut(
    keys: reduxDashShortcutsLib.reduxDashShortcutsMod.KeyBindings,
    actionCreator: reduxDashShortcutsLib.reduxDashShortcutsMod.ActionBindings,
    preventDefault: scala.Boolean
  ): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = js.native
  def bindShortcuts(shortcut: reduxDashShortcutsLib.reduxDashShortcutsMod.ShortcutDefinition*): js.Function1[/* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit] = js.native
}

