package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotMarking extends Marking {
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var disableTouchEvent: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dotColor: js.UndefOr[String] = js.undefined
  var marked: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedColor: js.UndefOr[String] = js.undefined
}

object DotMarking {
  @scala.inline
  def apply(
    activeOpacity: js.UndefOr[Double] = js.undefined,
    disableTouchEvent: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotColor: String = null,
    marked: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedColor: String = null
  ): DotMarking = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeOpacity)) __obj.updateDynamic("activeOpacity")(activeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTouchEvent)) __obj.updateDynamic("disableTouchEvent")(disableTouchEvent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (!js.isUndefined(marked)) __obj.updateDynamic("marked")(marked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectedColor != null) __obj.updateDynamic("selectedColor")(selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotMarking]
  }
}

