package typings.rotDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFovFovMod {
  type LightPassesCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  type VisibilityCallback = js.Function4[/* x */ Double, /* y */ Double, /* r */ Double, /* visibility */ Double, Unit]
}
