package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerProps[T] extends js.Object {
  var unstable_observedBits: js.UndefOr[scala.Double] = js.undefined
  def children(value: T): ReactNode
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: js.Function1[T, ReactNode], unstable_observedBits: scala.Int | scala.Double = null): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

