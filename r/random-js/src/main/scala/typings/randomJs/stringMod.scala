package typings.randomJs

import typings.randomJs.typesMod.StringDistribution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  def string(): StringDistribution = js.native
  def string(pool: String): StringDistribution = js.native
}

