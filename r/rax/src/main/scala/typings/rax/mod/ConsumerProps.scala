package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerProps[T] extends js.Object {
  var unstable_observedBits: js.UndefOr[Double] = js.undefined
  def children(value: T): RaxNode
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: T => RaxNode, unstable_observedBits: js.UndefOr[Double] = js.undefined): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (!js.isUndefined(unstable_observedBits)) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

