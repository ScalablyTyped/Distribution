package typings
package reactDashSimpleDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSimpleDashMapsMod {
  type Point = js.Tuple2[scala.Double, scala.Double]
  type ProjectionFunction = js.Function3[
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    /* config */ ProjectionConfig, 
    d3DashGeoLib.d3DashGeoMod.GeoProjection
  ]
}
