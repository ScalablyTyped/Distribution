package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/real", JSImport.Namespace)
@js.native
object realMod extends js.Object {
  def real(min: Double, max: Double): Distribution[Double] = js.native
  def real(min: Double, max: Double, inclusive: Boolean): Distribution[Double] = js.native
}

