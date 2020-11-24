package typings.reactThreeFiber.anon

import typings.three.constantsMod.ShadowMapType
import typings.three.lightMod.Light
import typings.three.sceneMod.Scene
import typings.three.webGLObjectsMod.WebGLObjects
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<three.three.WebGLShadowMap> */
@js.native
trait PartialWebGLShadowMap extends js.Object {
  
  var autoUpdate: js.UndefOr[Boolean] = js.native
  
  var constructor: js.UndefOr[
    js.Function3[
      /* _renderer */ WebGLRenderer, 
      /* _objects */ WebGLObjects, 
      /* maxTextureSize */ Double, 
      js.Any
    ]
  ] = js.native
  
  var cullFace: js.UndefOr[js.Any] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var needsUpdate: js.UndefOr[Boolean] = js.native
  
  var render: js.UndefOr[
    js.Function3[
      /* shadowsArray */ js.Array[Light], 
      /* scene */ Scene, 
      /* camera */ typings.three.cameraMod.Camera, 
      Unit
    ]
  ] = js.native
  
  var `type`: js.UndefOr[ShadowMapType] = js.native
}
object PartialWebGLShadowMap {
  
  @scala.inline
  def apply(): PartialWebGLShadowMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWebGLShadowMap]
  }
  
  @scala.inline
  implicit class PartialWebGLShadowMapOps[Self <: PartialWebGLShadowMap] (val x: Self) extends AnyVal {
    
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
    def setAutoUpdate(value: Boolean): Self = this.set("autoUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdate: Self = this.set("autoUpdate", js.undefined)
    
    @scala.inline
    def setConstructor(
      value: (/* _renderer */ WebGLRenderer, /* _objects */ WebGLObjects, /* maxTextureSize */ Double) => js.Any
    ): Self = this.set("constructor", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    
    @scala.inline
    def setCullFace(value: js.Any): Self = this.set("cullFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCullFace: Self = this.set("cullFace", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setNeedsUpdate(value: Boolean): Self = this.set("needsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedsUpdate: Self = this.set("needsUpdate", js.undefined)
    
    @scala.inline
    def setRender(
      value: (/* shadowsArray */ js.Array[Light], /* scene */ Scene, /* camera */ typings.three.cameraMod.Camera) => Unit
    ): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setType(value: ShadowMapType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
