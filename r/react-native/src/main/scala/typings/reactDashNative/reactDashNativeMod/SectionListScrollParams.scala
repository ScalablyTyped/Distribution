package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListScrollParams extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var itemIndex: Double
  var sectionIndex: Double
  var viewOffset: js.UndefOr[Double] = js.undefined
  var viewPosition: js.UndefOr[Double] = js.undefined
}

object SectionListScrollParams {
  @scala.inline
  def apply(
    itemIndex: Double,
    sectionIndex: Double,
    animated: js.UndefOr[Boolean] = js.undefined,
    viewOffset: Int | Double = null,
    viewPosition: Int | Double = null
  ): SectionListScrollParams = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (viewOffset != null) __obj.updateDynamic("viewOffset")(viewOffset.asInstanceOf[js.Any])
    if (viewPosition != null) __obj.updateDynamic("viewPosition")(viewPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
}

