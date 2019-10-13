package typings.atStorybookUi.distKeyboardKeyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "SimpleKeybinding")
@js.native
class SimpleKeybinding protected () extends Keybinding {
  def this(ctrlKey: Boolean, shiftKey: Boolean, altKey: Boolean, metaKey: Boolean, keyCode: KeyCode) = this()
  val altKey: Boolean = js.native
  val ctrlKey: Boolean = js.native
  val keyCode: KeyCode = js.native
  val metaKey: Boolean = js.native
  val shiftKey: Boolean = js.native
  val `type`: String | Double = js.native
  def equals(other: Keybinding): Boolean = js.native
  def getHashCode(): String = js.native
  def isDupliateModifierCase(): Boolean = js.native
  def isModifierKey(): Boolean = js.native
}

