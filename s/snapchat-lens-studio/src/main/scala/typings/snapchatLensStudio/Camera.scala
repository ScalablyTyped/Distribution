package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Camera {
  
  @js.native
  sealed trait DepthBufferMode extends StObject
  /** Used in Camera’s depthBufferMode property. Each mode is suited for handling objects at a certain distance range. For more information on depth modes, see the Camera and Layers guide. */
  @JSGlobal("Camera.DepthBufferMode")
  @js.native
  object DepthBufferMode extends StObject {
    
    /** Gives higher depth precision on far away objects, so is better suited for scenes far away from the camera. */
    @js.native
    sealed trait Logarithmic
      extends StObject
         with DepthBufferMode
    
    /** Gives higher depth precision on nearby objects, so is better suited for scenes near to the camera. */
    @js.native
    sealed trait Regular
      extends StObject
         with DepthBufferMode
  }
  
  @js.native
  sealed trait DeviceProperty extends StObject
  /** Used in Camera’s devicePropertyUsage property. Specifies which camera properties should be overridden by device properties. */
  @JSGlobal("Camera.DeviceProperty")
  @js.native
  object DeviceProperty extends StObject {
    
    /** Overrides both aspect and fov with the device’s properties. */
    @js.native
    sealed trait All
      extends StObject
         with DeviceProperty
    
    /** Overrides the Camera’s aspect property to use the device’s aspect ratio instead. */
    @js.native
    sealed trait Aspect
      extends StObject
         with DeviceProperty
    
    /** Overrides the Camera’s fov property to use the device’s field of view instead. */
    @js.native
    sealed trait Fov
      extends StObject
         with DeviceProperty
    
    /** No Camera properties are overridden with device properties. */
    @js.native
    sealed trait None
      extends StObject
         with DeviceProperty
  }
  
  @js.native
  sealed trait Type extends StObject
  /** Returned from Camera’s type property. */
  @JSGlobal("Camera.Type")
  @js.native
  object Type extends StObject {
    
    /** Does not simulate perspective distortion. Useful for 2D effects like Images and Text. */
    @js.native
    sealed trait Orthographic
      extends StObject
         with Type
    
    /** Simulates how perspective and depth perception work in the real world. Useful for rendering objects in 3D space. */
    @js.native
    sealed trait Perspective
      extends StObject
         with Type
  }
}
