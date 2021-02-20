package typings.raphael.mod

import typings.raphael.raphaelStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaphaelPath[TTechnology /* <: RaphaelTechnology */]
  extends RaphaelElement[
      TTechnology, 
      /* import warning: importer.ImportType#apply Failed type conversion: raphael.raphael.RaphaelElementByTechnologyMap<std.SVGPathElement, raphael.raphael.VMLPathElement>[TTechnology] */ js.Any
    ] {
  
  /**
    * Finds the coordinates of the point located at the given length on this path.
    * @param length Length at which to get the point.
    * @return The point located at the given length on this path.
    */
  def getPointAtLength(length: Double): RaphaelCartesianCurvePoint = js.native
  
  /**
    * Return a sub path of this path from the given length to the given length.
    * @param from Position of the start of the segment.
    * @param to Position of the end of the segment
    * @return An SVG path string for the segment.
    */
  def getSubpath(from: Double, to: Double): String = js.native
  
  /**
    * Finds the total length of this path.
    * @return The length of this path in pixels
    */
  def getTotalLength(): Double = js.native
  
  /**
    * The type of this element, i.e. `path`.
    */
  @JSName("type")
  var type_RaphaelPath: path = js.native
}
