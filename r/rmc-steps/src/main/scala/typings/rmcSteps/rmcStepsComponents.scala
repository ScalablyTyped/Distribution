package typings.rmcSteps

import typings.react.mod.ComponentType
import typings.rmcSteps.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcStepsComponents extends rmcStepsProps {
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[default].asInstanceOf[ComponentType[LibProps]]
  @scala.inline
  def Step: ComponentType[StepProps] = js.constructorOf[typings.rmcSteps.stepMod.default].asInstanceOf[ComponentType[StepProps]]
  @scala.inline
  def Steps: ComponentType[StepsProps] = js.constructorOf[typings.rmcSteps.stepsMod.default].asInstanceOf[ComponentType[StepsProps]]
}

