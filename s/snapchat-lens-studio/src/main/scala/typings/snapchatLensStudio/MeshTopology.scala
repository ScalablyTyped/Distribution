package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MeshTopology extends StObject
@JSGlobal("MeshTopology")
@js.native
object MeshTopology extends StObject {
  
  /** Draws connected line segments. Starting with the second vertex, a line is drawn between each vertex and the preceding one. */
  @js.native
  sealed trait LineStrip
    extends StObject
       with MeshTopology
  
  /** Draws unconnected line segments. Each group of two vertices specifies a new line segment. */
  @js.native
  sealed trait Lines
    extends StObject
       with MeshTopology
  
  /** Draws individual points. Each vertex specifies a new point to draw. */
  @js.native
  sealed trait Points
    extends StObject
       with MeshTopology
  
  /**
    * Draws connected triangles sharing one central vertex. The first vertex is the shared one, or “hub” vertex. Starting with the third vertex, each vertex forms a triangle connecting with the
    * previous vertex and hub vertex.
    */
  @js.native
  sealed trait TriangleFan
    extends StObject
       with MeshTopology
  
  /** Draws connected triangles in a strip. After the first two vertices, each vertex defines the third point on a new triangle extending from the previous one. */
  @js.native
  sealed trait TriangleStrip
    extends StObject
       with MeshTopology
  
  /** Draws unconnected triangles. Each group of three vertices specifies a new triangle. */
  @js.native
  sealed trait Triangles
    extends StObject
       with MeshTopology
}
