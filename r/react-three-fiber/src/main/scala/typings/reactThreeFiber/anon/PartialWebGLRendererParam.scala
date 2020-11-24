package typings.reactThreeFiber.anon

import typings.std.HTMLCanvasElement
import typings.std.OffscreenCanvas
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<three.three.WebGLRendererParameters> */
@js.native
trait PartialWebGLRendererParam extends js.Object {
  
  var alpha: js.UndefOr[Boolean] = js.native
  
  var antialias: js.UndefOr[Boolean] = js.native
  
  var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.native
  
  var context: js.UndefOr[WebGLRenderingContext] = js.native
  
  var depth: js.UndefOr[Boolean] = js.native
  
  var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native
  
  var powerPreference: js.UndefOr[String] = js.native
  
  var precision: js.UndefOr[String] = js.native
  
  var premultipliedAlpha: js.UndefOr[Boolean] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
  
  var stencil: js.UndefOr[Boolean] = js.native
}
object PartialWebGLRendererParam {
  
  @scala.inline
  def apply(): PartialWebGLRendererParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWebGLRendererParam]
  }
  
  @scala.inline
  implicit class PartialWebGLRendererParamOps[Self <: PartialWebGLRendererParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setContext(value: WebGLRenderingContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDepth(value: Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setLogarithmicDepthBuffer(value: Boolean): Self = this.set("logarithmicDepthBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogarithmicDepthBuffer: Self = this.set("logarithmicDepthBuffer", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: String): Self = this.set("powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerPreference: Self = this.set("powerPreference", js.undefined)
    
    @scala.inline
    def setPrecision(value: String): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPremultipliedAlpha(value: Boolean): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremultipliedAlpha: Self = this.set("premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: Boolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setStencil(value: Boolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
}
