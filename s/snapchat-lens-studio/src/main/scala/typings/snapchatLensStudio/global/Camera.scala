package typings.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Camera {
  
  /** Used in Camera’s depthBufferMode property. Each mode is suited for handling objects at a certain distance range. For more information on depth modes, see the Camera and Layers guide. */
  @JSGlobal("Camera.DepthBufferMode")
  @js.native
  object DepthBufferMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.Camera.DepthBufferMode & Double] = js.native
    
    /* 1 */ val Logarithmic: typings.snapchatLensStudio.Camera.DepthBufferMode.Logarithmic & Double = js.native
    
    /* 0 */ val Regular: typings.snapchatLensStudio.Camera.DepthBufferMode.Regular & Double = js.native
  }
  
  /** Used in Camera’s devicePropertyUsage property. Specifies which camera properties should be overridden by device properties. */
  @JSGlobal("Camera.DeviceProperty")
  @js.native
  object DeviceProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.Camera.DeviceProperty & Double] = js.native
    
    /* 3 */ val All: typings.snapchatLensStudio.Camera.DeviceProperty.All & Double = js.native
    
    /* 1 */ val Aspect: typings.snapchatLensStudio.Camera.DeviceProperty.Aspect & Double = js.native
    
    /* 2 */ val Fov: typings.snapchatLensStudio.Camera.DeviceProperty.Fov & Double = js.native
    
    /* 0 */ val None: typings.snapchatLensStudio.Camera.DeviceProperty.None & Double = js.native
  }
  
  /** Returned from Camera’s type property. */
  @JSGlobal("Camera.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.snapchatLensStudio.Camera.Type & Double] = js.native
    
    /* 1 */ val Orthographic: typings.snapchatLensStudio.Camera.Type.Orthographic & Double = js.native
    
    /* 0 */ val Perspective: typings.snapchatLensStudio.Camera.Type.Perspective & Double = js.native
  }
}
