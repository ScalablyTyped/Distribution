package typings.atStorybookUi.distKeyboardKeyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "ChordKeybinding")
@js.native
class ChordKeybinding protected () extends Keybinding {
  def this(firstPart: SimpleKeybinding, chordPart: SimpleKeybinding) = this()
  val chordPart: SimpleKeybinding = js.native
  val firstPart: SimpleKeybinding = js.native
  val `type`: String | Double = js.native
  def getHashCode(): String = js.native
}

