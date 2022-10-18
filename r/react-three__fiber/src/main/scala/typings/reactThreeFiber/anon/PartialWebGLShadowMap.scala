package typings.reactThreeFiber.anon

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcConstantsMod.ShadowMapType
import typings.three.srcLightsLightMod.Light
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
import typings.three.srcRenderersWebglWebGLObjectsMod.WebGLObjects
import typings.three.srcScenesSceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<three.three.WebGLShadowMap> */
trait PartialWebGLShadowMap extends StObject {
  
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  
  var constructor: js.UndefOr[
    js.Function3[
      /* _renderer */ WebGLRenderer, 
      /* _objects */ WebGLObjects, 
      /* _capabilities */ WebGLCapabilities, 
      Any
    ]
  ] = js.undefined
  
  var cullFace: js.UndefOr[Any] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var needsUpdate: js.UndefOr[Boolean] = js.undefined
  
  var render: js.UndefOr[
    js.Function3[/* shadowsArray */ js.Array[Light], /* scene */ Scene, /* camera */ Camera, Unit]
  ] = js.undefined
  
  var `type`: js.UndefOr[ShadowMapType] = js.undefined
}
object PartialWebGLShadowMap {
  
  inline def apply(): PartialWebGLShadowMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWebGLShadowMap]
  }
  
  extension [Self <: PartialWebGLShadowMap](x: Self) {
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
    
    inline def setConstructor(
      value: (/* _renderer */ WebGLRenderer, /* _objects */ WebGLObjects, /* _capabilities */ WebGLCapabilities) => Any
    ): Self = StObject.set(x, "constructor", js.Any.fromFunction3(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setCullFace(value: Any): Self = StObject.set(x, "cullFace", value.asInstanceOf[js.Any])
    
    inline def setCullFaceUndefined: Self = StObject.set(x, "cullFace", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    inline def setNeedsUpdateUndefined: Self = StObject.set(x, "needsUpdate", js.undefined)
    
    inline def setRender(value: (/* shadowsArray */ js.Array[Light], /* scene */ Scene, /* camera */ Camera) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setType(value: ShadowMapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
