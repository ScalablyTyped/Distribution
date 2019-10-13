package typings.reactDashAce

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashAceComponents extends reactDashAceProps {
  @scala.inline
  def Ace: ComponentType[AceProps] = js.constructorOf[typings.reactDashAce.libAceMod.default].asInstanceOf[typings.react.reactMod.ComponentType[AceProps]]
  @scala.inline
  def Diff: ComponentType[DiffProps] = js.constructorOf[typings.reactDashAce.libDiffMod.default].asInstanceOf[typings.react.reactMod.ComponentType[DiffProps]]
  @scala.inline
  def ReactDashAce: ComponentType[ReactDashAceProps] = js.constructorOf[typings.reactDashAce.reactDashAceMod.default].asInstanceOf[typings.react.reactMod.ComponentType[ReactDashAceProps]]
  @scala.inline
  def Split: ComponentType[SplitProps] = js.constructorOf[typings.reactDashAce.libSplitMod.default].asInstanceOf[typings.react.reactMod.ComponentType[SplitProps]]
}

