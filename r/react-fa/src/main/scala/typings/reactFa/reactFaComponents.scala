package typings.reactFa

import typings.react.mod.ComponentType
import typings.reactFa.mod.IconCls
import typings.reactFa.mod.IconStackCls
import typings.reactFa.mod.default
import typings.reactFa.mod.defaultCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFaComponents extends reactFaProps {
  @scala.inline
  def Default: ComponentType[DefaultProps] = js.constructorOf[defaultCls].asInstanceOf[ComponentType[DefaultProps]]
  @scala.inline
  def Icon: ComponentType[IconProps] = js.constructorOf[IconCls].asInstanceOf[ComponentType[IconProps]]
  @scala.inline
  def IconStack: ComponentType[IconStackProps] = js.constructorOf[IconStackCls].asInstanceOf[ComponentType[IconStackProps]]
  @scala.inline
  def ReactFa: ComponentType[ReactFaProps] = default.asInstanceOf[ComponentType[ReactFaProps]]
}

