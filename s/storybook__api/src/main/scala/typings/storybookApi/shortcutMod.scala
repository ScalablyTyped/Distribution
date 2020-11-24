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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/api/dist/lib/shortcut", JSImport.Namespace)
@js.native
object shortcutMod extends js.Object {
  
  def controlOrMetaKey(): meta | control = js.native
  
  def controlOrMetaSymbol(): Placeofinterestsign | ctrl = js.native
  
  def eventMatchesShortcut(e: Event, shortcut: KeyCollection): Boolean = js.native
  
  def eventToShortcut(e: KeyboardEvent): KeyCollection | Null = js.native
  
  def isMacLike(): Boolean = js.native
  
  def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = js.native
  
  def keyToSymbol(key: String): String = js.native
  
  def optionOrAltSymbol(): Optionkey | alt = js.native
  
  def shortcutMatchesShortcut(inputShortcut: KeyCollection, shortcut: KeyCollection): Boolean = js.native
  
  def shortcutToHumanString(shortcut: KeyCollection): String = js.native
}
