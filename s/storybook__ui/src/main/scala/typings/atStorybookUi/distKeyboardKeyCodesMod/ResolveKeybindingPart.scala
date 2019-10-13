package typings.atStorybookUi.distKeyboardKeyCodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "ResolveKeybindingPart")
@js.native
class ResolveKeybindingPart protected () extends js.Object {
  def this(ctrlKey: Boolean, shiftKey: Boolean, altKey: Boolean, metaKey: Boolean) = this()
  def this(ctrlKey: Boolean, shiftKey: Boolean, altKey: Boolean, metaKey: Boolean, kbLabel: String) = this()
  def this(
    ctrlKey: Boolean,
    shiftKey: Boolean,
    altKey: Boolean,
    metaKey: Boolean,
    kbLabel: String,
    kbAriaLabel: String
  ) = this()
  def this(
    ctrlKey: Boolean,
    shiftKey: Boolean,
    altKey: Boolean,
    metaKey: Boolean,
    kbLabel: Null,
    kbAriaLabel: String
  ) = this()
  val altKey: Boolean = js.native
  val ctrlKey: Boolean = js.native
  val keyAriaLabel: String | Null = js.native
  val keyLabel: String | Null = js.native
  val metaKey: Boolean = js.native
  val shiftKey: Boolean = js.native
}

