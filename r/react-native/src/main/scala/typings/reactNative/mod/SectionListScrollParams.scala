package typings.reactNative.mod

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
    viewOffset: js.UndefOr[Double] = js.undefined,
    viewPosition: js.UndefOr[Double] = js.undefined
  ): SectionListScrollParams = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewOffset)) __obj.updateDynamic("viewOffset")(viewOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewPosition)) __obj.updateDynamic("viewPosition")(viewPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
}

