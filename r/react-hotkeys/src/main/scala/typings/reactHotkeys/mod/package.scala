package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def configure(options: typings.reactHotkeys.mod.ConfigurationOptions): scala.Unit = typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def deprecatedWithHotKeys(keyMap: org.scalablytyped.runtime.StringDictionary[typings.reactHotkeys.mod.KeySequence]): typings.reactHotkeys.mod.HotKeys = typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deprecatedWithHotKeys")(keyMap.asInstanceOf[js.Any]).asInstanceOf[typings.reactHotkeys.mod.HotKeys]

inline def getApplicationKeyMap(): typings.reactHotkeys.mod.ApplicationKeyMap = typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationKeyMap")().asInstanceOf[typings.reactHotkeys.mod.ApplicationKeyMap]

inline def recordKeyCombination(
  callbackFunction: js.Function1[/* keyCombination */ typings.reactHotkeys.mod.KeyCombination, scala.Unit]
): typings.reactHotkeys.mod.cancelKeyCombinationListener = typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("recordKeyCombination")(callbackFunction.asInstanceOf[js.Any]).asInstanceOf[typings.reactHotkeys.mod.cancelKeyCombinationListener]

inline def withHotKeys(
  Component: typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState],
  hotKeysOptions: typings.reactHotkeys.mod.HotKeysEnabledProps
): typings.reactHotkeys.mod.HotKeysEnabled = (typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withHotKeys")(Component.asInstanceOf[js.Any], hotKeysOptions.asInstanceOf[js.Any])).asInstanceOf[typings.reactHotkeys.mod.HotKeysEnabled]

inline def withIgnoreKeys(
  Component: typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState],
  hotKeysIgnoreOptions: typings.reactHotkeys.mod.HotKeysOverrideProps
): typings.reactHotkeys.mod.IgnoreKeys = (typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withIgnoreKeys")(Component.asInstanceOf[js.Any], hotKeysIgnoreOptions.asInstanceOf[js.Any])).asInstanceOf[typings.reactHotkeys.mod.IgnoreKeys]

inline def withObserveKeys(
  Component: typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState],
  hotKeysIgnoreOptions: typings.reactHotkeys.mod.HotKeysOverrideProps
): typings.reactHotkeys.mod.ObserveKeys = (typings.reactHotkeys.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withObserveKeys")(Component.asInstanceOf[js.Any], hotKeysIgnoreOptions.asInstanceOf[js.Any])).asInstanceOf[typings.reactHotkeys.mod.ObserveKeys]

type ActionName = java.lang.String

type ApplicationKeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeyMapDisplayOptions}
  */ typings.reactHotkeys.reactHotkeysStrings.ApplicationKeyMap & org.scalablytyped.runtime.TopLevel[js.Any]

type HotKeysEnabled = typings.react.mod.Component[typings.reactHotkeys.mod.HotKeysProps, js.Object, js.Any]

type HotKeysIgnoreOverride = typings.react.mod.Component[typings.reactHotkeys.mod.HotKeysProps, js.Object, js.Any]

type KeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
  */ typings.reactHotkeys.reactHotkeysStrings.KeyMap & org.scalablytyped.runtime.TopLevel[js.Any]

type KeyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.reactHotkeys.mod.MouseTrapKeySequence
  - typings.reactHotkeys.mod.KeyMapOptions
  - typings.reactHotkeys.mod.ExtendedKeyMapOptions
  - js.Array[
typings.reactHotkeys.mod.KeyMapOptions | typings.reactHotkeys.mod.MouseTrapKeySequence]
*/
type KeySequence = typings.reactHotkeys.mod._KeySequence | (js.Array[
typings.reactHotkeys.mod.KeyMapOptions | typings.reactHotkeys.mod.MouseTrapKeySequence]) | typings.reactHotkeys.mod.MouseTrapKeySequence

type ListOfKeys = java.lang.String | js.Array[java.lang.String]

type MouseTrapKeySequence = java.lang.String | js.Array[java.lang.String]

type ReactComponent = (typings.react.mod.ComponentClass[js.Object, typings.react.mod.ComponentState]) | java.lang.String | typings.react.mod.SFC[typings.reactHotkeys.mod.ComponentProps]

type TabIndex = java.lang.String | scala.Double

type cancelKeyCombinationListener = js.Function0[scala.Unit]
