package typings.reactDashHotkeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHotkeysMod {
  import typings.react.reactMod.Component

  type ActionName = String
  type ApplicationKeyMap = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: std.Array<react-hotkeys.react-hotkeys.MouseTrapKeySequence>}
    */ typings.reactDashHotkeys.reactDashHotkeysStrings.ApplicationKeyMap with js.Any
  type HotKeysEnabled = Component[HotKeysProps, js.Object, js.Any]
  type HotKeysIgnoreOverride = Component[HotKeysProps, js.Object, js.Any]
  type KeyMap = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
    */ typings.reactDashHotkeys.reactDashHotkeysStrings.KeyMap with js.Any
  type KeySequence = MouseTrapKeySequence | KeyMapOptions | (js.Array[KeyMapOptions | MouseTrapKeySequence])
  type ListOfKeys = String | js.Array[String]
  type MouseTrapKeySequence = String | js.Array[String]
}
