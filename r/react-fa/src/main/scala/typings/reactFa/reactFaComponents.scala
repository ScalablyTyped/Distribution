package typings.reactFa

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFaComponents extends reactFaProps {
  @scala.inline
  def Default: ComponentType[DefaultProps] = js.constructorOf[typings.reactFa.mod.defaultCls].asInstanceOf[typings.react.mod.ComponentType[DefaultProps]]
  @scala.inline
  def Icon: ComponentType[IconProps] = js.constructorOf[typings.reactFa.mod.IconCls].asInstanceOf[typings.react.mod.ComponentType[IconProps]]
  @scala.inline
  def IconStack: ComponentType[IconStackProps] = js.constructorOf[typings.reactFa.mod.IconStackCls].asInstanceOf[typings.react.mod.ComponentType[IconStackProps]]
  @scala.inline
  def ReactFa: ComponentType[ReactFaProps] = typings.reactFa.mod.default.asInstanceOf[typings.react.mod.ComponentType[ReactFaProps]]
}

