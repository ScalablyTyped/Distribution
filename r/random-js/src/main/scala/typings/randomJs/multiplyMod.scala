package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/utils/multiply", JSImport.Namespace)
@js.native
object multiplyMod extends js.Object {
  def multiply(distribution: Distribution[Double], multiplier: Double): Distribution[Double] = js.native
}

