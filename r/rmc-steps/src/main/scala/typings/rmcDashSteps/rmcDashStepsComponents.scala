package typings.rmcDashSteps

import typings.react.reactMod.ComponentType
import typings.rmcDashSteps.libStepMod.IStepProps
import typings.rmcDashSteps.libStepsMod.IStepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcDashStepsComponents extends rmcDashStepsProps {
  @scala.inline
  def Lib: ComponentType[IStepsProps] = js.constructorOf[typings.rmcDashSteps.libMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.rmcDashSteps.libStepsMod.IStepsProps]]
  @scala.inline
  def Step: ComponentType[IStepProps] = js.constructorOf[typings.rmcDashSteps.libStepMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.rmcDashSteps.libStepMod.IStepProps]]
  @scala.inline
  def Steps: ComponentType[IStepsProps] = js.constructorOf[typings.rmcDashSteps.libStepsMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.rmcDashSteps.libStepsMod.IStepsProps]]
}

