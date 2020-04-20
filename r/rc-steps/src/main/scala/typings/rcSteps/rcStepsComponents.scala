package typings.rcSteps

import typings.rcSteps.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcStepsComponents extends rcStepsProps {
  @scala.inline
  def RcSteps: ComponentType[RcStepsProps] = js.constructorOf[default].asInstanceOf[ComponentType[RcStepsProps]]
  @scala.inline
  def Step: ComponentType[StepProps] = js.constructorOf[typings.rcSteps.mod.Step].asInstanceOf[ComponentType[StepProps]]
}

