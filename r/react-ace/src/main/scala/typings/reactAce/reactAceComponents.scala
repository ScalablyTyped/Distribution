package typings.reactAce

import typings.react.mod.ComponentType
import typings.reactAce.aceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactAceComponents extends reactAceProps {
  @scala.inline
  def Ace: ComponentType[AceProps] = js.constructorOf[default].asInstanceOf[ComponentType[AceProps]]
  @scala.inline
  def Diff: ComponentType[DiffProps] = js.constructorOf[typings.reactAce.diffMod.default].asInstanceOf[ComponentType[DiffProps]]
  @scala.inline
  def ReactAce: ComponentType[ReactAceProps] = js.constructorOf[typings.reactAce.mod.default].asInstanceOf[ComponentType[ReactAceProps]]
  @scala.inline
  def Split: ComponentType[SplitProps] = js.constructorOf[typings.reactAce.splitMod.default].asInstanceOf[ComponentType[SplitProps]]
}

