package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.Combo
import typings.atStorybookApi.atStorybookApiMod.Props
import typings.atStorybookApi.atStorybookApiMod.SubState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atStorybookApiComponents extends atStorybookApiProps {
  @scala.inline
  def Consumer: ComponentType[typings.atStorybookApi.atStorybookApiMod.ConsumerProps[SubState, Combo]] = js.constructorOf[typings.atStorybookApi.atStorybookApiMod.Consumer].asInstanceOf[typings.react.reactMod.ComponentType[
  typings.atStorybookApi.atStorybookApiMod.ConsumerProps[
    typings.atStorybookApi.atStorybookApiMod.SubState, 
    typings.atStorybookApi.atStorybookApiMod.Combo
  ]]]
  @scala.inline
  def Provider: ComponentType[Props] = js.constructorOf[typings.atStorybookApi.atStorybookApiMod.Provider].asInstanceOf[typings.react.reactMod.ComponentType[typings.atStorybookApi.atStorybookApiMod.Props]]
}

