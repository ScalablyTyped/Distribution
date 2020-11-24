package typings.reduxShortcuts.mod

import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-shortcuts", "bindShortcuts")
@js.native
object bindShortcuts extends js.Object {
  
  def apply(shortcut: ShortcutDefinition*): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
}
