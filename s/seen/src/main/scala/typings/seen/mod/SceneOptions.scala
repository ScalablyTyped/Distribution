package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var camera: js.UndefOr[Camera] = js.undefined
  
  var cullBackfaces: js.UndefOr[Boolean] = js.undefined
  
  var fractionalPoints: js.UndefOr[Boolean] = js.undefined
  
  var model: js.UndefOr[Model] = js.undefined
  
  var shader: js.UndefOr[Shader] = js.undefined
  
  var viewport: js.UndefOr[Viewport] = js.undefined
}
object SceneOptions {
  
  inline def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  extension [Self <: SceneOptions](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setCullBackfaces(value: Boolean): Self = StObject.set(x, "cullBackfaces", value.asInstanceOf[js.Any])
    
    inline def setCullBackfacesUndefined: Self = StObject.set(x, "cullBackfaces", js.undefined)
    
    inline def setFractionalPoints(value: Boolean): Self = StObject.set(x, "fractionalPoints", value.asInstanceOf[js.Any])
    
    inline def setFractionalPointsUndefined: Self = StObject.set(x, "fractionalPoints", js.undefined)
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
