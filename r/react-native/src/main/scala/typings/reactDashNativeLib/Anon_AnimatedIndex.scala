package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimatedIndex extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var index: scala.Double
  var viewOffset: js.UndefOr[scala.Double] = js.undefined
  var viewPosition: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AnimatedIndex {
  @scala.inline
  def apply(
    index: scala.Double,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    viewOffset: scala.Int | scala.Double = null,
    viewPosition: scala.Int | scala.Double = null
  ): Anon_AnimatedIndex = {
    val __obj = js.Dynamic.literal(index = index)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset.asInstanceOf[js.Any])
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimatedIndex]
  }
}

