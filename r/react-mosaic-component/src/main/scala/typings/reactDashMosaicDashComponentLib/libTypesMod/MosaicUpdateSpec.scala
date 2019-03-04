package typings
package reactDashMosaicDashComponentLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MosaicUpdateSpec[T /* <: MosaicKey */] extends js.Object {
  @JSName("$set")
  var $set: js.UndefOr[MosaicNode[T]] = js.undefined
  var direction: js.UndefOr[reactDashMosaicDashComponentLib.Anon_SetMosaicDirection] = js.undefined
  var first: js.UndefOr[MosaicUpdateSpec[T]] = js.undefined
  var second: js.UndefOr[MosaicUpdateSpec[T]] = js.undefined
  var splitPercentage: js.UndefOr[reactDashMosaicDashComponentLib.Anon_Set] = js.undefined
}

object MosaicUpdateSpec {
  @scala.inline
  def apply[T /* <: MosaicKey */](
    $set: MosaicNode[T] = null,
    direction: reactDashMosaicDashComponentLib.Anon_SetMosaicDirection = null,
    first: MosaicUpdateSpec[T] = null,
    second: MosaicUpdateSpec[T] = null,
    splitPercentage: reactDashMosaicDashComponentLib.Anon_Set = null
  ): MosaicUpdateSpec[T] = {
    val __obj = js.Dynamic.literal()
    if ($set != null) __obj.updateDynamic("$set")($set.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (first != null) __obj.updateDynamic("first")(first)
    if (second != null) __obj.updateDynamic("second")(second)
    if (splitPercentage != null) __obj.updateDynamic("splitPercentage")(splitPercentage)
    __obj.asInstanceOf[MosaicUpdateSpec[T]]
  }
}

