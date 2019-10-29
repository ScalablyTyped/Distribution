package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Distribution
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/distribution/picker", JSImport.Namespace)
@js.native
object distDistributionPickerMod extends js.Object {
  def picker[T](source: ArrayLike[T]): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: Double): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: Double, end: Double): Distribution[T] = js.native
}

