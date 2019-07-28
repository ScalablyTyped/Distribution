package typings.reactDashMosaicDashComponent.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicParent[T /* <: MosaicKey */] extends js.Object {
  var direction: MosaicDirection
  var first: MosaicNode[T]
  var second: MosaicNode[T]
  var splitPercentage: js.UndefOr[Double] = js.undefined
}

object MosaicParent {
  @scala.inline
  def apply[T /* <: MosaicKey */](
    direction: MosaicDirection,
    first: MosaicNode[T],
    second: MosaicNode[T],
    splitPercentage: Int | Double = null
  ): MosaicParent[T] = {
    val __obj = js.Dynamic.literal(direction = direction, first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    if (splitPercentage != null) __obj.updateDynamic("splitPercentage")(splitPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MosaicParent[T]]
  }
}

