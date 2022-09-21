package typings.storybookApi

import typings.std.KeyboardEvent
import typings.storybookApi.shortcutsMod.Event
import typings.storybookApi.shortcutsMod.KeyCollection
import typings.storybookApi.storybookApiStrings.Optionkey
import typings.storybookApi.storybookApiStrings.Placeofinterestsign
import typings.storybookApi.storybookApiStrings.alt
import typings.storybookApi.storybookApiStrings.control
import typings.storybookApi.storybookApiStrings.ctrl
import typings.storybookApi.storybookApiStrings.meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutMod {
  
  @JSImport("@storybook/api/dist/ts3.9/lib/shortcut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def controlOrMetaKey(): meta | control = ^.asInstanceOf[js.Dynamic].applyDynamic("controlOrMetaKey")().asInstanceOf[meta | control]
  
  inline def controlOrMetaSymbol(): Placeofinterestsign | ctrl = ^.asInstanceOf[js.Dynamic].applyDynamic("controlOrMetaSymbol")().asInstanceOf[Placeofinterestsign | ctrl]
  
  inline def eventMatchesShortcut(e: Event, shortcut: KeyCollection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eventMatchesShortcut")(e.asInstanceOf[js.Any], shortcut.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def eventToShortcut(e: KeyboardEvent): KeyCollection | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("eventToShortcut")(e.asInstanceOf[js.Any]).asInstanceOf[KeyCollection | Null]
  
  inline def isMacLike(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacLike")().asInstanceOf[Boolean]
  
  inline def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShortcutTaken")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def keyToSymbol(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyToSymbol")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def optionOrAltSymbol(): Optionkey | alt = ^.asInstanceOf[js.Dynamic].applyDynamic("optionOrAltSymbol")().asInstanceOf[Optionkey | alt]
  
  inline def shortcutMatchesShortcut(inputShortcut: KeyCollection, shortcut: KeyCollection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shortcutMatchesShortcut")(inputShortcut.asInstanceOf[js.Any], shortcut.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shortcutToHumanString(shortcut: KeyCollection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shortcutToHumanString")(shortcut.asInstanceOf[js.Any]).asInstanceOf[String]
}
