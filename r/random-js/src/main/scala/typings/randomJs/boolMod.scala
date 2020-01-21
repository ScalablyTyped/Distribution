package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/bool", JSImport.Namespace)
@js.native
object boolMod extends js.Object {
  def bool(): Distribution[Boolean] = js.native
  def bool(numerator: Double, denominator: Double): Distribution[Boolean] = js.native
  def bool(percentage: Double): Distribution[Boolean] = js.native
}

