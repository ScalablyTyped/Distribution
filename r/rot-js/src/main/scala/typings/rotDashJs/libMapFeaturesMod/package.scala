package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMapFeaturesMod {
  type DigCallback = js.Function3[/* x */ Double, /* y */ Double, /* value */ Double, Unit]
  type TestPositionCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
}
