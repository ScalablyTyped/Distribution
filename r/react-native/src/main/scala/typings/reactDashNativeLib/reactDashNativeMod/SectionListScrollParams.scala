package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListScrollParams extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var itemIndex: scala.Double
  var sectionIndex: scala.Double
  var viewOffset: js.UndefOr[scala.Double] = js.undefined
  var viewPosition: js.UndefOr[scala.Double] = js.undefined
}

object SectionListScrollParams {
  @scala.inline
  def apply(
    itemIndex: scala.Double,
    sectionIndex: scala.Double,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    viewOffset: scala.Int | scala.Double = null,
    viewPosition: scala.Int | scala.Double = null
  ): SectionListScrollParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemIndex")(itemIndex)
    __obj.updateDynamic("sectionIndex")(sectionIndex)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset.asInstanceOf[js.Any])
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
}

