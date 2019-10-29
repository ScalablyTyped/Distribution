package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Engine
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/pick", JSImport.Namespace)
@js.native
object distDistributionPickMod extends js.Object {
  def pick[T](engine: Engine, source: ArrayLike[T]): T = js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: Double): T = js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: Double, end: Double): T = js.native
}

