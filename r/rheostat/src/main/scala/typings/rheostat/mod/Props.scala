package typings.rheostat.mod

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends Events {
  var algorithm: js.UndefOr[Algorithm] = js.undefined
  var autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[ReactType[_]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handle: js.UndefOr[ReactType[_]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[Orientation] = js.undefined
  var pitComponent: js.UndefOr[ReactType[_]] = js.undefined
  var pitPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var progressBar: js.UndefOr[ReactType[_]] = js.undefined
  var snap: js.UndefOr[Boolean] = js.undefined
  var snapPoints: js.UndefOr[js.Array[Double]] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    algorithm: Algorithm = null,
    autoAdjustVerticalPosition: js.UndefOr[Boolean] = js.undefined,
    background: ReactType[_] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    getNextHandlePosition: (/* handleIdx */ Double, /* percentPosition */ Double) => Double = null,
    handle: ReactType[_] = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onChange: /* publicState */ PublicState => _ = null,
    onClick: () => _ = null,
    onKeyPress: () => _ = null,
    onSliderDragEnd: () => _ = null,
    onSliderDragMove: () => _ = null,
    onSliderDragStart: () => _ = null,
    onValuesUpdated: /* publicState */ PublicState => _ = null,
    orientation: Orientation = null,
    pitComponent: ReactType[_] = null,
    pitPoints: js.Array[Double] = null,
    progressBar: ReactType[_] = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    snapPoints: js.Array[Double] = null,
    values: js.Array[Double] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustVerticalPosition)) __obj.updateDynamic("autoAdjustVerticalPosition")(autoAdjustVerticalPosition.get.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (getNextHandlePosition != null) __obj.updateDynamic("getNextHandlePosition")(js.Any.fromFunction2(getNextHandlePosition))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction0(onKeyPress))
    if (onSliderDragEnd != null) __obj.updateDynamic("onSliderDragEnd")(js.Any.fromFunction0(onSliderDragEnd))
    if (onSliderDragMove != null) __obj.updateDynamic("onSliderDragMove")(js.Any.fromFunction0(onSliderDragMove))
    if (onSliderDragStart != null) __obj.updateDynamic("onSliderDragStart")(js.Any.fromFunction0(onSliderDragStart))
    if (onValuesUpdated != null) __obj.updateDynamic("onValuesUpdated")(js.Any.fromFunction1(onValuesUpdated))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pitComponent != null) __obj.updateDynamic("pitComponent")(pitComponent.asInstanceOf[js.Any])
    if (pitPoints != null) __obj.updateDynamic("pitPoints")(pitPoints.asInstanceOf[js.Any])
    if (progressBar != null) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.get.asInstanceOf[js.Any])
    if (snapPoints != null) __obj.updateDynamic("snapPoints")(snapPoints.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

