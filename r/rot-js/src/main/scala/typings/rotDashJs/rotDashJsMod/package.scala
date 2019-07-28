package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rotDashJsMod {
  type CanBeDugCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  type ColorArray = js.Tuple3[Double, Double, Double]
  type DigCallback = js.Function3[/* x */ Double, /* y */ Double, /* cellValue */ Double, js.Any]
  type DoorCallback = js.Function2[/* x */ Double, /* y */ Double, js.Any]
  type FOVCallback = js.Function4[/* x */ Double, /* y */ Double, /* R */ Double, /* visibility */ Double, js.Any]
  type IsWallCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  type LightPassesCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  type LightingCallback = js.Function3[/* x */ Double, /* y */ Double, /* color */ js.Tuple3[Double, Double, Double], js.Any]
  type PassableCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  type PathCallback = js.Function2[/* x */ Double, /* y */ Double, js.Any]
  type ReflectivityCallback = js.Function2[/* x */ Double, /* y */ Double, Double]
}
