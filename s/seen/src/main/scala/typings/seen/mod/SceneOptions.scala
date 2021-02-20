package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var camera: js.UndefOr[Camera] = js.native
  
  var cullBackfaces: js.UndefOr[Boolean] = js.native
  
  var fractionalPoints: js.UndefOr[Boolean] = js.native
  
  var model: js.UndefOr[Model] = js.native
  
  var shader: js.UndefOr[Shader] = js.native
  
  var viewport: js.UndefOr[Viewport] = js.native
}
object SceneOptions {
  
  @scala.inline
  def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  
  @scala.inline
  implicit class SceneOptionsMutableBuilder[Self <: SceneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    @scala.inline
    def setCullBackfaces(value: Boolean): Self = StObject.set(x, "cullBackfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCullBackfacesUndefined: Self = StObject.set(x, "cullBackfaces", js.undefined)
    
    @scala.inline
    def setFractionalPoints(value: Boolean): Self = StObject.set(x, "fractionalPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFractionalPointsUndefined: Self = StObject.set(x, "fractionalPoints", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setShader(value: Shader): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaderUndefined: Self = StObject.set(x, "shader", js.undefined)
    
    @scala.inline
    def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
