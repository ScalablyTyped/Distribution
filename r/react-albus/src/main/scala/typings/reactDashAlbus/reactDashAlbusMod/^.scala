package typings.reactDashAlbus.reactDashAlbusMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-albus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Step: ComponentType[StepProps] = js.native
  val Steps: ComponentType[StepsProps] = js.native
  val WithWizard: ComponentType[WizardContextRenderProps] = js.native
  val Wizard: ComponentType[WizardProps] = js.native
  def withWizard[P](component: ComponentType[P with WizardComponentProps]): ComponentType[P] = js.native
}

