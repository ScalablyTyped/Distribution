package typings
package reduxDashShortcutsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashShortcutsMod {
  type ActionBindings = reduxLib.reduxMod.ActionCreator[reduxLib.reduxMod.Action[js.Any]] | js.Array[reduxLib.reduxMod.ActionCreator[reduxLib.reduxMod.Action[js.Any]]]
  type BasicShortcutDefinition = js.Tuple2[KeyBindings, ActionBindings]
  type KeyBindings = java.lang.String | js.Array[java.lang.String]
  type ShortcutDefinition = BasicShortcutDefinition | ShortcutDefinitionWithPreventDefault
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[KeyBindings, ActionBindings, scala.Boolean]
}
