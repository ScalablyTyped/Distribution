package typings.reactAce

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactAceComponents extends reactAceProps {
  @scala.inline
  def Ace: ComponentType[AceProps] = js.constructorOf[typings.reactAce.aceMod.default].asInstanceOf[typings.react.mod.ComponentType[AceProps]]
  @scala.inline
  def Diff: ComponentType[DiffProps] = js.constructorOf[typings.reactAce.diffMod.default].asInstanceOf[typings.react.mod.ComponentType[DiffProps]]
  @scala.inline
  def ReactAce: ComponentType[ReactAceProps] = js.constructorOf[typings.reactAce.mod.default].asInstanceOf[typings.react.mod.ComponentType[ReactAceProps]]
  @scala.inline
  def Split: ComponentType[SplitProps] = js.constructorOf[typings.reactAce.splitMod.default].asInstanceOf[typings.react.mod.ComponentType[SplitProps]]
}

