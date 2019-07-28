package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerProps[T] extends js.Object {
  var unstable_observedBits: js.UndefOr[Double] = js.undefined
  def children(value: T): ReactNode
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: T => ReactNode, unstable_observedBits: Int | Double = null): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

