package typings.semanticDashUiDashReact.distCommonjsElementsStepStepMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepContentMod.StepContentProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps
import typings.semanticDashUiDashReact.distCommonjsElementsStepStepTitleMod.StepTitleProps
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

