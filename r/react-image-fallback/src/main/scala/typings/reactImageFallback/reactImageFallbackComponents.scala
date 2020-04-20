package typings.reactImageFallback

import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ImgHTMLAttributes
import typings.reactImageFallback.mod.ReactImageFallbackProps
import typings.reactImageFallback.mod.default
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactImageFallbackComponents extends reactImageFallbackProps {
  @scala.inline
  def ReactImageFallback: ComponentType[
    ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.constructorOf[default].asInstanceOf[ComponentType[
    ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ]]
}

