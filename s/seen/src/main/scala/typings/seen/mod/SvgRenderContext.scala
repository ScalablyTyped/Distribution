package typings.seen.mod

import typings.std.HTMLElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "SvgRenderContext")
@js.native
class SvgRenderContext protected () extends RenderContext {
  def this(svgElementOrId: String) = this()
  def this(svgElementOrId: HTMLElement) = this()
  
  @JSName("layers")
  var layers_SvgRenderContext: js.Array[SvgLayerRenderContext] = js.native
  
  var svg: SVGSVGElement = js.native
}
