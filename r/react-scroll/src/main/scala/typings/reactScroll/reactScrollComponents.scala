package typings.reactScroll

import typings.react.mod.ComponentType
import typings.reactScroll.buttonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactScrollComponents extends reactScrollProps {
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[default].asInstanceOf[ComponentType[ButtonProps]]
  @scala.inline
  def Element: ComponentType[ElementProps] = js.constructorOf[typings.reactScroll.elementMod.default].asInstanceOf[ComponentType[ElementProps]]
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.reactScroll.linkMod.default].asInstanceOf[ComponentType[LinkProps]]
}

