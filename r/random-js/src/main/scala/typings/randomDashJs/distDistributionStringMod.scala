package typings.randomDashJs

import typings.randomDashJs.distTypesMod.StringDistribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/string", JSImport.Namespace)
@js.native
object distDistributionStringMod extends js.Object {
  def string(): StringDistribution = js.native
  def string(pool: String): StringDistribution = js.native
}

