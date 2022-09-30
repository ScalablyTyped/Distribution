package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a surface that can be used as a target for rendering operations. Surfaces can also be
  * used as textures.
  */
@js.native
trait Surface
  extends StObject
     with Texture {
  
  /** Blending operation to use when rendering to this surface. */
  var blendOp: BlendOp = js.native
  
  /**
    * Set this surface's clipping rectangle. When drawing to a surface, anything falling outside of
    * the clipping rectangle will not be rendered.
    * @param x       X coordinate relative to the upper-left corner of the surface, in pixels.
    * @param y       Y coordinate relative to the upper-left corner of the surface, in pixels.
    * @param width   Width of the new clipping rectangle, in pixels.
    * @param height  Height of the new clipping rectangle, in pixels.
    */
  def clipTo(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  /**
    * Convert the contents of this surface to a texture. All surfaces are also textures, so this is
    * provided only for backward compatibility with API level 1.
    * @deprecated
    * @returns A new `Texture` created from the contents of this surface.
    */
  def toTexture(): Texture = js.native
  
  /** Transform to use when rendering to this surface. Must include a projection. */
  var transform: Transform = js.native
}
