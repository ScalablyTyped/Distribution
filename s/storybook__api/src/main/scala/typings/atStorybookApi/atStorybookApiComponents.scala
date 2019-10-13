package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.Combo
import typings.atStorybookApi.atStorybookApiMod.SubState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atStorybookApiComponents extends atStorybookApiProps {
  @scala.inline
  def Consumer: ComponentType[ConsumerProps[SubState, Combo]] = js.constructorOf[typings.atStorybookApi.atStorybookApiMod.Consumer].asInstanceOf[typings.react.reactMod.ComponentType[
  ConsumerProps[
    typings.atStorybookApi.atStorybookApiMod.SubState, 
    typings.atStorybookApi.atStorybookApiMod.Combo
  ]]]
  @scala.inline
  def Provider: ComponentType[ProviderProps] = js.constructorOf[typings.atStorybookApi.atStorybookApiMod.Provider].asInstanceOf[typings.react.reactMod.ComponentType[ProviderProps]]
}

