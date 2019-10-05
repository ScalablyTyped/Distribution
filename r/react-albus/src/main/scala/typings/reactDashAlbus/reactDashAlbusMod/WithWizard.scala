package typings.reactDashAlbus.reactDashAlbusMod

import org.scalablytyped.runtime.TopLevel
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-albus", "WithWizard")
@js.native
class WithWizard protected ()
  extends Component[WizardContextRenderProps, ComponentState, js.Any] {
  def this(props: WizardContextRenderProps) = this()
  def this(props: WizardContextRenderProps, context: js.Any) = this()
}

@JSImport("react-albus", "WithWizard")
@js.native
object WithWizard extends TopLevel[ComponentType[WizardContextRenderProps]]

@JSImport("react-albus", "withWizard")
@js.native
object withWizard extends js.Object {
  def apply[P](component: ComponentType[P with WizardComponentProps]): ComponentType[P] = js.native
}

