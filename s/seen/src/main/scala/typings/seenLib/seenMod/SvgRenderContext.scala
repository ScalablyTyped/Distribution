package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "SvgRenderContext")
@js.native
class SvgRenderContext protected () extends RenderContext {
  def this(svgElementOrId: java.lang.String) = this()
  def this(svgElementOrId: stdLib.HTMLElement) = this()
  @JSName("layers")
  var layers_SvgRenderContext: js.Array[SvgLayerRenderContext] = js.native
  var svg: stdLib.SVGSVGElement = js.native
}

