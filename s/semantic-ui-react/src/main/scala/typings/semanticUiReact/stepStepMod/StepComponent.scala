package typings.semanticUiReact.stepStepMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.stepContentMod.StepContentProps
import typings.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typings.semanticUiReact.stepGroupMod.StepGroupProps
import typings.semanticUiReact.stepTitleMod.StepTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepComponent extends ComponentClass[StepProps, ComponentState] {
  var Content: StatelessComponent[StepContentProps] = js.native
  var Description: StatelessComponent[StepDescriptionProps] = js.native
  var Group: StatelessComponent[StepGroupProps] = js.native
  var Title: StatelessComponent[StepTitleProps] = js.native
}

