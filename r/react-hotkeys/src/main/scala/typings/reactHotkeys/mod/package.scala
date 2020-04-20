package typings.reactHotkeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionName = java.lang.String
  type ApplicationKeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeyMapDisplayOptions}
    */ typings.reactHotkeys.reactHotkeysStrings.ApplicationKeyMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type HotKeysEnabled = typings.react.mod.Component[typings.reactHotkeys.mod.HotKeysProps, js.Object, js.Any]
  type HotKeysIgnoreOverride = typings.react.mod.Component[typings.reactHotkeys.mod.HotKeysProps, js.Object, js.Any]
  type KeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
    */ typings.reactHotkeys.reactHotkeysStrings.KeyMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type KeyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.reactHotkeys.mod.MouseTrapKeySequence
    - typings.reactHotkeys.mod.KeyMapOptions
    - typings.reactHotkeys.mod.ExtendedKeyMapOptions
    - js.Array[
  typings.reactHotkeys.mod.KeyMapOptions | typings.reactHotkeys.mod.MouseTrapKeySequence]
  */
  type KeySequence = typings.reactHotkeys.mod._KeySequence | (js.Array[
    typings.reactHotkeys.mod.KeyMapOptions | typings.reactHotkeys.mod.MouseTrapKeySequence
  ]) | typings.reactHotkeys.mod.MouseTrapKeySequence
  type ListOfKeys = java.lang.String | js.Array[java.lang.String]
  type MouseTrapKeySequence = java.lang.String | js.Array[java.lang.String]
  type ReactComponent = (typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState]) | java.lang.String | typings.react.mod.SFC[typings.reactHotkeys.mod.ComponentProps]
  type TabIndex = java.lang.String | scala.Double
  type cancelKeyCombinationListener = js.Function0[scala.Unit]
}
