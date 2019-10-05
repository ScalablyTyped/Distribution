package typings.reduxDashShortcuts.reduxDashShortcutsMod

import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-shortcuts", "bindShortcuts")
@js.native
object bindShortcuts extends js.Object {
  def apply(shortcut: ShortcutDefinition*): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
}

