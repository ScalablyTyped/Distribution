package typings.randomNumberCsprng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-number-csprng", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(minimum: Double, maximum: Double): js.Promise[Double] = js.native
  def apply(minimum: Double, maximum: Double, cb: js.Function0[Unit]): js.Promise[Double] = js.native
}

