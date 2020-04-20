package typings.reactVega

import typings.react.mod.ComponentType
import typings.reactVega.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactVegaComponents extends reactVegaProps {
  @scala.inline
  def ReactVega: ComponentType[ReactVegaProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactVegaProps]]
  @scala.inline
  def VegaWithSpec: ComponentType[VegaWithSpecProps] = js.constructorOf[typings.reactVega.mod.VegaWithSpec].asInstanceOf[ComponentType[VegaWithSpecProps]]
}

