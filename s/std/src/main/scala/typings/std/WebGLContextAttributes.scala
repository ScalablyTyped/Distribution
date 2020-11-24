package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLContextAttributes extends js.Object {
  
  var alpha: js.UndefOr[scala.Boolean] = js.native
  
  var antialias: js.UndefOr[scala.Boolean] = js.native
  
  var depth: js.UndefOr[scala.Boolean] = js.native
  
  var desynchronized: js.UndefOr[scala.Boolean] = js.native
  
  var failIfMajorPerformanceCaveat: js.UndefOr[scala.Boolean] = js.native
  
  var powerPreference: js.UndefOr[WebGLPowerPreference] = js.native
  
  var premultipliedAlpha: js.UndefOr[scala.Boolean] = js.native
  
  var preserveDrawingBuffer: js.UndefOr[scala.Boolean] = js.native
  
  var stencil: js.UndefOr[scala.Boolean] = js.native
}
object WebGLContextAttributes {
  
  @scala.inline
  def apply(): WebGLContextAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLContextAttributes]
  }
  
  @scala.inline
  implicit class WebGLContextAttributesOps[Self <: WebGLContextAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlpha(value: scala.Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAntialias(value: scala.Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntialias: Self = this.set("antialias", js.undefined)
    
    @scala.inline
    def setDepth(value: scala.Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setDesynchronized(value: scala.Boolean): Self = this.set("desynchronized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesynchronized: Self = this.set("desynchronized", js.undefined)
    
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: scala.Boolean): Self = this.set("failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailIfMajorPerformanceCaveat: Self = this.set("failIfMajorPerformanceCaveat", js.undefined)
    
    @scala.inline
    def setPowerPreference(value: WebGLPowerPreference): Self = this.set("powerPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerPreference: Self = this.set("powerPreference", js.undefined)
    
    @scala.inline
    def setPremultipliedAlpha(value: scala.Boolean): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePremultipliedAlpha: Self = this.set("premultipliedAlpha", js.undefined)
    
    @scala.inline
    def setPreserveDrawingBuffer(value: scala.Boolean): Self = this.set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveDrawingBuffer: Self = this.set("preserveDrawingBuffer", js.undefined)
    
    @scala.inline
    def setStencil(value: scala.Boolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
}
