package typings.storybookUi.shortcutsMod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.std.KeyboardEvent
import typings.storybookUi.storybookUiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/ui/dist/settings/shortcuts", "ShortcutsScreen")
@js.native
class ShortcutsScreen protected ()
  extends Component[ShortcutsScreenProps, ShortcutsScreenState, js.Any] {
  def this(props: ShortcutsScreenProps) = this()
  
  def displayError(activeElement: Feature): ValidationStates = js.native
  
  def displaySuccessMessage(activeElement: Feature): String = js.native
  
  def onBlur(): js.Promise[`false` | Unit] = js.native
  
  def onFocus(focusedInput: Feature): js.Function0[Unit] = js.native
  
  def onKeyDown(e: KeyboardEvent): `false` | Unit | js.Promise[Unit] = js.native
  
  def renderKeyForm(): Element = js.native
  
  def renderKeyInput(): js.Array[Element] = js.native
  
  def restoreDefault(): js.Promise[Unit] = js.native
  
  def restoreDefaults(): js.Promise[Unit] = js.native
  
  def saveShortcut(): js.Promise[Unit] = js.native
}
