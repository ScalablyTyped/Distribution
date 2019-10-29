package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/shuffle", JSImport.Namespace)
@js.native
object distDistributionShuffleMod extends js.Object {
  def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = js.native
  def shuffle[T](engine: Engine, array: js.Array[T], downTo: Double): js.Array[T] = js.native
}

