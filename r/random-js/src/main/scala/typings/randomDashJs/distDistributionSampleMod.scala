package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Engine
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/sample", JSImport.Namespace)
@js.native
object distDistributionSampleMod extends js.Object {
  def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = js.native
}

