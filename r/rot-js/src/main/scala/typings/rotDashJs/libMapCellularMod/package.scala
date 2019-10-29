package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMapCellularMod {
  import org.scalablytyped.runtime.StringDictionary

  type ConnectionCallback = js.Function2[/* from */ Point, /* to */ Point, Unit]
  type Point = js.Tuple2[Double, Double]
  type PointMap = StringDictionary[Point]
}
