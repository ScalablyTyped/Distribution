package typings.robustPointInPolygon

import typings.robustPointInPolygon.robustPointInPolygonNumbers.`-1`
import typings.robustPointInPolygon.robustPointInPolygonNumbers.`0`
import typings.robustPointInPolygon.robustPointInPolygonNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(vs: js.Array[Point], point: Point): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].apply(vs.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  @JSImport("robust-point-in-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Point = js.Tuple2[Double, Double]
}
