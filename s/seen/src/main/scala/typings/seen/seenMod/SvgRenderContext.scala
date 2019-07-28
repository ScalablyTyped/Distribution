package typings.seen.seenMod

import typings.std.HTMLElement
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgRenderContext")
@js.native
class SvgRenderContext protected () extends RenderContext {
  def this(svgElementOrId: String) = this()
  def this(svgElementOrId: HTMLElement) = this()
  @JSName("layers")
  var layers_SvgRenderContext: js.Array[SvgLayerRenderContext] = js.native
  var svg: SVGSVGElement = js.native
}

