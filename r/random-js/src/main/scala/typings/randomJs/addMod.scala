package typings.randomJs

import typings.randomJs.typesMod.Distribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/utils/add", JSImport.Namespace)
@js.native
object addMod extends js.Object {
  def add(distribution: Distribution[Double], addend: Double): Distribution[Double] = js.native
}

