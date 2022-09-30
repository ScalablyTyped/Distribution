package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShapeType extends StObject
/**
  * Specifies how to interpret the vertices of a `Shape`.
  */
@JSGlobal("ShapeType")
@js.native
object ShapeType extends StObject {
  
  /**
    * Triangle fan: First 3 vertices form a triangle, then each additional vertex forms
    * another triangle fanning out from the initial vertex (the center of the fan).
    */
  @js.native
  sealed trait Fan
    extends StObject
       with ShapeType
  
  /**
    * Line loop: First 2 vertices form a line segment; each additional vertex forms another
    * segment connected to the last; an implied final segment connects the last one to the
    * first, forming a loop.
    */
  @js.native
  sealed trait LineLoop
    extends StObject
       with ShapeType
  
  /**
    * Line strip: First 2 vertices form a line segment; each additional vertex forms another
    * segment connected to the last.
    */
  @js.native
  sealed trait LineStrip
    extends StObject
       with ShapeType
  
  /** Line list: Every 2 vertices form a line segment. */
  @js.native
  sealed trait Lines
    extends StObject
       with ShapeType
  
  /** Point list: Each vertex specifies a single point in space. */
  @js.native
  sealed trait Points
    extends StObject
       with ShapeType
  
  /**
    * Triangle strip: First 3 vertices form a triangle; each additional vertex forms another
    * triangle connected to the previous one on two sides.
    */
  @js.native
  sealed trait TriStrip
    extends StObject
       with ShapeType
  
  /** Triangle list: Every 3 vertices form a triangle. */
  @js.native
  sealed trait Triangles
    extends StObject
       with ShapeType
}
