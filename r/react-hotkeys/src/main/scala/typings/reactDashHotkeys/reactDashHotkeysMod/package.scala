package typings.reactDashHotkeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHotkeysMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.SFC

  type ActionName = String
  type ApplicationKeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeyMapDisplayOptions}
    */ typings.reactDashHotkeys.reactDashHotkeysStrings.ApplicationKeyMap with js.Any
  type HotKeysEnabled = Component[HotKeysProps, js.Object, js.Any]
  type HotKeysIgnoreOverride = Component[HotKeysProps, js.Object, js.Any]
  type KeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
    */ typings.reactDashHotkeys.reactDashHotkeysStrings.KeyMap with js.Any
  type KeyName = String
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashHotkeys.reactDashHotkeysMod.MouseTrapKeySequence
    - typings.reactDashHotkeys.reactDashHotkeysMod.KeyMapOptions
    - typings.reactDashHotkeys.reactDashHotkeysMod.ExtendedKeyMapOptions
    - js.Array[
  typings.reactDashHotkeys.reactDashHotkeysMod.KeyMapOptions | typings.reactDashHotkeys.reactDashHotkeysMod.MouseTrapKeySequence]
  */
  type KeySequence = _KeySequence | (js.Array[KeyMapOptions | MouseTrapKeySequence]) | MouseTrapKeySequence
  type ListOfKeys = String | js.Array[String]
  type MouseTrapKeySequence = String | js.Array[String]
  type ReactComponent = (ComponentClass[js.Object, ComponentState]) | String | SFC[ComponentProps]
  type TabIndex = String | Double
  type cancelKeyCombinationListener = js.Function0[Unit]
}
