package typings.storybookUi.keyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "ResolvedKeybinding")
@js.native
abstract class ResolvedKeybinding () extends js.Object {
  def getAriaLabel(): String | Null = js.native
  def getDispatchParts(): js.Tuple2[String | Null, String | Null] = js.native
  /**
    * This prints the binding in a format suitable for displaying in the UI.
    */
  def getLabel(): String | Null = js.native
  /**
    * returns the firstPart, chordopart of the keybinding
    * For simple keybindings, the second element will be null
    */
  def getParts(): js.Tuple2[ResolveKeybindingPart, ResolveKeybindingPart | Null] = js.native
  def getUserSettingsLabel(): String | Null = js.native
  def isChord(): Boolean = js.native
  def isWYSIWYG(): Boolean = js.native
}

