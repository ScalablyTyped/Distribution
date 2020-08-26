package typings.reactSpring.webMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolationChain[T] extends js.Object {
  def apply[U](config: InterpolationConfig[T, U]): OpaqueInterpolation[U] = js.native
  def apply[U](interpolator: js.Function1[/* params */ T, U]): OpaqueInterpolation[U] = js.native
}

