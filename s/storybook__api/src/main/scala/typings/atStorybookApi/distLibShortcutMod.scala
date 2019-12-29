package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiStrings.Optionkey
import typings.atStorybookApi.atStorybookApiStrings.Placeofinterestsign
import typings.atStorybookApi.atStorybookApiStrings.alt
import typings.atStorybookApi.atStorybookApiStrings.control
import typings.atStorybookApi.atStorybookApiStrings.ctrl
import typings.atStorybookApi.atStorybookApiStrings.meta
import typings.atStorybookApi.distModulesShortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/lib/shortcut", JSImport.Namespace)
@js.native
object distLibShortcutMod extends js.Object {
  def controlOrMetaKey(): meta | control = js.native
  def controlOrMetaSymbol(): Placeofinterestsign | ctrl = js.native
  def eventMatchesShortcut(e: Event, shortcut: js.Array[String]): Boolean = js.native
  def eventToShortcut(e: Event): js.Array[String] = js.native
  def isMacLike(): Boolean = js.native
  def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = js.native
  def keyToSymbol(key: String): String = js.native
  def optionOrAltSymbol(): Optionkey | alt = js.native
  def shortcutMatchesShortcut(inputShortcut: js.Array[String], shortcut: js.Array[String]): Boolean = js.native
  def shortcutToHumanString(shortcut: js.Array[String]): String = js.native
}

