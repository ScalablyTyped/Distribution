package typings.robustSegmentIntersect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Test if the closed line segment `[firstStart, firstEnd]` intersects
    * the closed line segment `[secondStart, secondEnd]`
    * @param firstStart An end point of the first line
    * @param firstEnd An end point of the first line
    * @param secondStart An end point of the second line
    * @param secondEnd An end point of the second line
    * @returns Whether the lines intersect
    */
  inline def apply(firstStart: Coord, firstEnd: Coord, secondStart: Coord, secondEnd: Coord): Boolean = (^.asInstanceOf[js.Dynamic].apply(firstStart.asInstanceOf[js.Any], firstEnd.asInstanceOf[js.Any], secondStart.asInstanceOf[js.Any], secondEnd.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("robust-segment-intersect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Coord = js.Tuple2[Double, Double]
}
