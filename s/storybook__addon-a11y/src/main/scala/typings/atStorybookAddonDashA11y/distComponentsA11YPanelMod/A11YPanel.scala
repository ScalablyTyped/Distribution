package typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod

import typings.axeDashCore.axeDashCoreMod.AxeResults
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-a11y/dist/components/A11YPanel", "A11YPanel")
@js.native
class A11YPanel ()
  extends Component[A11YPanelProps, A11YPanelState, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MA11YPanel(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MA11YPanel(prevProps: A11YPanelProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MA11YPanel(): Unit = js.native
  def onError(error: js.Any): Unit = js.native
  def onUpdate(hasPassesViolationsIncomplete: AxeResults): Unit = js.native
  def request(): Unit = js.native
}

