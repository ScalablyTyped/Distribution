package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featuresMod {
  type DigCallback = js.Function3[/* x */ scala.Double, /* y */ scala.Double, /* value */ scala.Double, scala.Unit]
  type TestPositionCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Boolean]
}
