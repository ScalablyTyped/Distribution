package typings.reduxDashShortcuts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashShortcutsMod {
  import typings.redux.reduxMod.Action
  import typings.redux.reduxMod.ActionCreator

  type ActionBindings = ActionCreator[Action[js.Any]] | js.Array[ActionCreator[Action[js.Any]]]
  type BasicShortcutDefinition = js.Tuple2[KeyBindings, ActionBindings]
  type KeyBindings = String | js.Array[String]
  type Mousetrap = Mousetrap_
  type ShortcutDefinition = BasicShortcutDefinition | ShortcutDefinitionWithPreventDefault
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[KeyBindings, ActionBindings, Boolean]
}
