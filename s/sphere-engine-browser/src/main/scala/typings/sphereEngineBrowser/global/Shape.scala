package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a graphics primitive whose parameters are stored on the GPU.
  */
@JSGlobal("Shape")
@js.native
open class Shape protected ()
  extends StObject
     with typings.sphereEngineBrowser.Shape {
  def this(`type`: Double, texture: Null, vertices: typings.sphereEngineBrowser.VertexList) = this()
  /**
    * Construct a new `Shape` with the given texture and vertices.
    * @param type     Type of primitive the new `Shape` will represent.
    * @param texture  Texture to use for this shape, or `null` for no texture.
    * @param vertices A vertex list containing vertices for this shape.
    * @param indices  Optional index list specifying which members of `vertices` are used in the
    *                 shape. Omit this to use the entire vertex list.
    */
  def this(
    `type`: Double,
    texture: typings.sphereEngineBrowser.Texture,
    vertices: typings.sphereEngineBrowser.VertexList
  ) = this()
  def this(
    `type`: Double,
    texture: Null,
    vertices: typings.sphereEngineBrowser.VertexList,
    indices: typings.sphereEngineBrowser.IndexList
  ) = this()
  def this(
    `type`: Double,
    texture: typings.sphereEngineBrowser.Texture,
    vertices: typings.sphereEngineBrowser.VertexList,
    indices: typings.sphereEngineBrowser.IndexList
  ) = this()
}
object Shape {
  
  @JSGlobal("Shape")
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawImmediate(
    surface: typings.sphereEngineBrowser.Surface,
    `type`: typings.sphereEngineBrowser.ShapeType,
    texture: Null,
    vertices: js.Array[Vertex]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImmediate")(surface.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Render a textured shape of the given type to a surface.
    * @param surface  Surface on which to render the shape.
    * @param type     Type of primitive to draw.
    * @param texture  Texture to use for the shape, or `null` for no texture.
    * @param vertices Array of `Vertex` objects describing the shape's vertices.
    */
  /* static member */
  inline def drawImmediate(
    surface: typings.sphereEngineBrowser.Surface,
    `type`: typings.sphereEngineBrowser.ShapeType,
    texture: typings.sphereEngineBrowser.Texture,
    vertices: js.Array[Vertex]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImmediate")(surface.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Render a shape of the given type to a surface.
    * @param surface  Surface on which to render the shape.
    * @param type     Type of primitive to draw.
    * @param vertices Array of `Vertex` objects describing the shape's vertices.
    */
  /* static member */
  inline def drawImmediate(
    surface: typings.sphereEngineBrowser.Surface,
    `type`: typings.sphereEngineBrowser.ShapeType,
    vertices: js.Array[Vertex]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImmediate")(surface.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def drawImmediate(`type`: typings.sphereEngineBrowser.ShapeType, texture: Null, vertices: js.Array[Vertex]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImmediate")(`type`.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Render a textured shape of the given type to the backbuffer.
    * @param type     Type of primitive to draw.
    * @param texture  Texture to use for the shape, or `null` for no texture.
    * @param vertices Array of `Vertex` objects describing the shape's vertices.
    */
  /* static member */
  inline def drawImmediate(
    `type`: typings.sphereEngineBrowser.ShapeType,
    texture: typings.sphereEngineBrowser.Texture,
    vertices: js.Array[Vertex]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImmediate")(`type`.asInstanceOf[js.Any], texture.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Render a shape of the given type to the backbuffer.
    * @param type     Type of primitive to draw.
    * @param vertices Array of `Vertex` objects describing the shape's vertices.
    */
  /* static member */
  inline def drawImmediate(`type`: typings.sphereEngineBrowser.ShapeType, vertices: js.Array[Vertex]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawImmediate")(`type`.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
