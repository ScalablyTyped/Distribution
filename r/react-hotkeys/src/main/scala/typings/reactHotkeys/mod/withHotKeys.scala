package typings.reactHotkeys.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hotkeys", "withHotKeys")
@js.native
object withHotKeys extends js.Object {
  def apply(Component: ComponentClass[js.Object, ComponentState], hotKeysOptions: HotKeysEnabledProps): HotKeysEnabled = js.native
}

