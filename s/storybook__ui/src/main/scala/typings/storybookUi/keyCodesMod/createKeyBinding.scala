package typings.storybookUi.keyCodesMod

import typings.storybookUi.platformMod.OperatingSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/keyboard/keyCodes", "createKeyBinding")
@js.native
object createKeyBinding extends js.Object {
  def apply(keybinding: Double, OS: OperatingSystem): Keybinding | Null = js.native
}

