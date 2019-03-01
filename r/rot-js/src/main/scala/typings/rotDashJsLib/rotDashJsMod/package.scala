package typings
package rotDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rotDashJsMod {
  type CanBeDugCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Boolean]
  type ColorArray = js.Tuple3[scala.Double, scala.Double, scala.Double]
  type DigCallback = js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* cellValue */ scala.Double, js.Any]
  type DoorCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, js.Any]
  type FOVCallback = js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* R */ scala.Double, 
    /* visibility */ scala.Double, 
    js.Any
  ]
  type IsWallCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Boolean]
  type LightPassesCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Boolean]
  type LightingCallback = js.Function3[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* color */ js.Tuple3[scala.Double, scala.Double, scala.Double], 
    js.Any
  ]
  type PassableCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Boolean]
  type PathCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, js.Any]
  type ReflectivityCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Double]
}
