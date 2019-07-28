package typings.reduxDashShortcuts

import typings.redux.reduxMod.Action
import typings.redux.reduxMod.ActionCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashShortcutsMod {
  type ActionBindings = ActionCreator[Action[js.Any]] | js.Array[ActionCreator[Action[js.Any]]]
  type BasicShortcutDefinition = js.Tuple2[KeyBindings, ActionBindings]
  type KeyBindings = String | js.Array[String]
  type ShortcutDefinition = BasicShortcutDefinition | ShortcutDefinitionWithPreventDefault
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[KeyBindings, ActionBindings, Boolean]
}
