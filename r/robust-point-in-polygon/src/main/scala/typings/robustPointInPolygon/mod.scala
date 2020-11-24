package typings.robustPointInPolygon

import typings.robustPointInPolygon.robustPointInPolygonNumbers.`-1`
import typings.robustPointInPolygon.robustPointInPolygonNumbers.`0`
import typings.robustPointInPolygon.robustPointInPolygonNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("robust-point-in-polygon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(vs: js.Array[Point], point: Point): `-1` | `0` | `1` = js.native
  
  type Point = js.Tuple2[Double, Double]
}
