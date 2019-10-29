package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libLightingMod {
  type LightColor = js.Tuple3[Double, Double, Double]
  /** Will be called for every lit cell */
  type LightingCallback = js.Function3[/* x */ Double, /* y */ Double, /* color */ LightColor, Unit]
  /** Callback to retrieve cell reflectivity (0..1) */
  type ReflectivityCallback = js.Function2[/* x */ Double, /* y */ Double, Double]
}
