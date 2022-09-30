package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls a camera texture resource. Can be accessed through Texture.control on a Camera texture. For more information, see the Camera and Layers guide. */
trait RenderTargetProvider
  extends StObject
     with TextureProvider {
  
  /** When clearColorEnabled is true and inputTexture is null, this color is used to clear this RenderTarget the first time it is drawn to each frame. */
  var clearColor: vec4
  
  /**
    * If true, the color on this RenderTarget will be cleared the first time it is drawn to each frame. inputTexture will be used to clear it unless it is null, in which case clearColor is used
    * instead.
    */
  var clearColorEnabled: Boolean
  
  /** If true, the depth buffer will be cleared on this RenderTarget the first time it is drawn to each frame. */
  var clearDepthEnabled: Boolean
  
  /** When clearColorEnabled is true, this texture is used to clear this RenderTarget the first time it is drawn to each frame. If this texture is null, clearColor will be used instead. */
  var inputTexture: Texture
  
  /** When useScreenResolution is false, controls the horizontal and vertical resolution of the Render Target. */
  var resolution: vec2
  
  /** If true, the Render Target’s resolution will match the device’s screen resolution. */
  var useScreenResolution: Boolean
}
object RenderTargetProvider {
  
  inline def apply(
    clearColor: vec4,
    clearColorEnabled: Boolean,
    clearDepthEnabled: Boolean,
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    inputTexture: Texture,
    isOfType: String => Boolean,
    resolution: vec2,
    useScreenResolution: Boolean
  ): RenderTargetProvider = {
    val __obj = js.Dynamic.literal(clearColor = clearColor.asInstanceOf[js.Any], clearColorEnabled = clearColorEnabled.asInstanceOf[js.Any], clearDepthEnabled = clearDepthEnabled.asInstanceOf[js.Any], getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), resolution = resolution.asInstanceOf[js.Any], useScreenResolution = useScreenResolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTargetProvider]
  }
  
  extension [Self <: RenderTargetProvider](x: Self) {
    
    inline def setClearColor(value: vec4): Self = StObject.set(x, "clearColor", value.asInstanceOf[js.Any])
    
    inline def setClearColorEnabled(value: Boolean): Self = StObject.set(x, "clearColorEnabled", value.asInstanceOf[js.Any])
    
    inline def setClearDepthEnabled(value: Boolean): Self = StObject.set(x, "clearDepthEnabled", value.asInstanceOf[js.Any])
    
    inline def setInputTexture(value: Texture): Self = StObject.set(x, "inputTexture", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: vec2): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setUseScreenResolution(value: Boolean): Self = StObject.set(x, "useScreenResolution", value.asInstanceOf[js.Any])
  }
}
