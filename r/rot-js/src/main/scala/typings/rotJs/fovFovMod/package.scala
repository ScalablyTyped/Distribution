package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fovFovMod {
  type LightPassesCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Boolean]
  type VisibilityCallback = js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* r */ scala.Double, 
    /* visibility */ scala.Double, 
    scala.Unit
  ]
}
