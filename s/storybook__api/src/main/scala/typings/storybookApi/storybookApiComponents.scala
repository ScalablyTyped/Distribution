package typings.storybookApi

import typings.react.mod.ComponentType
import typings.storybookApi.mod.Combo
import typings.storybookApi.mod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookApiComponents extends storybookApiProps {
  @scala.inline
  def Consumer: ComponentType[ConsumerProps[SubState, Combo]] = js.constructorOf[typings.storybookApi.mod.Consumer].asInstanceOf[typings.react.mod.ComponentType[ConsumerProps[typings.storybookApi.mod.SubState, typings.storybookApi.mod.Combo]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps] = js.constructorOf[typings.storybookApi.mod.Provider].asInstanceOf[typings.react.mod.ComponentType[ProviderProps]]
}

