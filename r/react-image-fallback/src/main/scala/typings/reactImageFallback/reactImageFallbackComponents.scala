package typings.reactImageFallback

import typings.react.mod.ComponentType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ImgHTMLAttributes
import typings.reactImageFallback.mod.ReactImageFallbackProps
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactImageFallbackComponents extends reactImageFallbackProps {
  @scala.inline
  def ReactImageFallback: ComponentType[
    ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
  ] = js.constructorOf[typings.reactImageFallback.mod.default].asInstanceOf[typings.react.mod.ComponentType[
  typings.reactImageFallback.mod.ReactImageFallbackProps with (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.ImgHTMLAttributes[typings.std.HTMLImageElement], 
    typings.std.HTMLImageElement
  ])]]
}

