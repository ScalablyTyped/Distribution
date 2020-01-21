package typings.reactScroll

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactScrollComponents extends reactScrollProps {
  @scala.inline
  def Button: ComponentType[ButtonProps] = js.constructorOf[typings.reactScroll.buttonMod.default].asInstanceOf[typings.react.mod.ComponentType[ButtonProps]]
  @scala.inline
  def Element: ComponentType[ElementProps] = js.constructorOf[typings.reactScroll.elementMod.default].asInstanceOf[typings.react.mod.ComponentType[ElementProps]]
  @scala.inline
  def Link: ComponentType[LinkProps] = js.constructorOf[typings.reactScroll.linkMod.default].asInstanceOf[typings.react.mod.ComponentType[LinkProps]]
}

