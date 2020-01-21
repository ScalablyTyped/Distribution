package typings.storybookUi.scanCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/scanCode", "ScanCodeBinding")
@js.native
class ScanCodeBinding protected () extends js.Object {
  def this(ctrlKey: Boolean, shiftKey: Boolean, altKey: Boolean, metaKey: Boolean, scanCode: ScanCode) = this()
  val altKey: Boolean = js.native
  val ctrlKey: Boolean = js.native
  val metaKey: Boolean = js.native
  val scanCode: ScanCode = js.native
  val shiftKey: Boolean = js.native
  def equals(other: ScanCodeBinding): Boolean = js.native
  /**
    * Does this keybinding refer to the key code of a modifier and it also has the modifier flag?
    */
  def isDuplicateModifierCase(): Boolean = js.native
}

