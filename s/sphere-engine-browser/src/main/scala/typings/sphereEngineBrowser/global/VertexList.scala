package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores vertex data for a `Shape` directly on the GPU.
  */
@JSGlobal("VertexList")
@js.native
open class VertexList protected ()
  extends StObject
     with typings.sphereEngineBrowser.VertexList {
  /**
    * Construct a new vertex list from an array of vertex descriptors.
    * @param vertices An array of `Vertex` objects describing the vertices.
    */
  def this(vertices: js.Array[Vertex]) = this()
  
  /* private */ /* CompleteClass */
  var _workaround: Null = js.native
}
