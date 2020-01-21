package typings.reduxShortcuts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionBindings = typings.redux.mod.ActionCreator[typings.redux.mod.Action[js.Any]] | js.Array[typings.redux.mod.ActionCreator[typings.redux.mod.Action[js.Any]]]
  type BasicShortcutDefinition = js.Tuple2[typings.reduxShortcuts.mod.KeyBindings, typings.reduxShortcuts.mod.ActionBindings]
  type KeyBindings = java.lang.String | js.Array[java.lang.String]
  type Mousetrap_ = typings.reduxShortcuts.mod.Mousetrap__
  type ShortcutDefinition = typings.reduxShortcuts.mod.BasicShortcutDefinition | typings.reduxShortcuts.mod.ShortcutDefinitionWithPreventDefault
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[
    typings.reduxShortcuts.mod.KeyBindings, 
    typings.reduxShortcuts.mod.ActionBindings, 
    scala.Boolean
  ]
}
