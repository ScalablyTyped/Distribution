package typings.reactDashVega

import typings.react.reactMod.ComponentType
import typings.reactDashVega.reactDashVegaMod.VegaPropsWithSpec
import typings.reactDashVega.reactDashVegaMod.VegaPropsWithoutSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashVegaComponents extends reactDashVegaProps {
  @scala.inline
  def ReactDashVega: ComponentType[VegaPropsWithSpec] = js.constructorOf[typings.reactDashVega.reactDashVegaMod.default].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashVega.reactDashVegaMod.VegaPropsWithSpec]]
  @scala.inline
  def VegaWithSpec: ComponentType[VegaPropsWithoutSpec] = js.constructorOf[typings.reactDashVega.reactDashVegaMod.VegaWithSpec].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashVega.reactDashVegaMod.VegaPropsWithoutSpec]]
}

