package typings.reactSvg

import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.reactSvg.mod.Props
import typings.reactSvg.mod.WrapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactSvgComponents extends reactSvgProps {
  @scala.inline
  def ReactSvg: ComponentType[Props with (DetailedHTMLProps[HTMLAttributes[WrapperType], WrapperType])] = js.constructorOf[typings.reactSvg.mod.default].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactSvg.mod.Props with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.reactSvg.mod.WrapperType], 
    typings.reactSvg.mod.WrapperType
  ])]]
}

