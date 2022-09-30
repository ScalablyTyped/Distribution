package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a graphics primitive whose parameters are stored on the GPU.
  */
@js.native
trait Shape extends StObject {
  
  /**
    * Draw this shape to the backbuffer using an optional transform.
    * @param transform Transform to be applied before the projection transform.
    */
  def draw(): Unit = js.native
  /**
    * Draw this shape to a given surface using an optional transform.
    * @param surface   Surface the shape will be rendered to.
    * @param transform Transform to be applied before the projection transform.
    */
  def draw(surface: Surface): Unit = js.native
  def draw(surface: Surface, transform: Transform): Unit = js.native
  def draw(transform: Transform): Unit = js.native
  
  /**
    * Index list specifying which elements of `vertexList` are used in the shape.  Set this to
    * `null` to use all elements of the vertex list in order.
    */
  var indexList: IndexList | Null = js.native
  
  /**
    * Texture image used to texture the shape when rendered. How the texture is applied is
    * typically determined by the `u` and `v` components of each vertex, but may depend on the
    * shader in use. Use `null` for no texture.
    */
  var texture: Texture | Null = js.native
  
  /** Vertex list containing the vertices used in this shape. */
  var vertexList: VertexList = js.native
}
