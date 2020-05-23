package typings.reactCanvasDraw.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasDrawProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var brushColor: js.UndefOr[String] = js.undefined
  var brushRadius: js.UndefOr[Double] = js.undefined
  var canvasHeight: js.UndefOr[Double | String] = js.undefined
  var canvasWidth: js.UndefOr[Double | String] = js.undefined
  var catenaryColor: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var gridColor: js.UndefOr[String] = js.undefined
  var hideGrid: js.UndefOr[Boolean] = js.undefined
  var hideInterface: js.UndefOr[Boolean] = js.undefined
  var imgSrc: js.UndefOr[String] = js.undefined
  var immediateLoading: js.UndefOr[Boolean] = js.undefined
  var lazyRadius: js.UndefOr[Double] = js.undefined
  var loadTimeOffset: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[(js.Function1[/* canvas */ CanvasDraw, Unit]) | Null] = js.undefined
  var saveData: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CanvasDrawProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    brushColor: String = null,
    brushRadius: js.UndefOr[Double] = js.undefined,
    canvasHeight: Double | String = null,
    canvasWidth: Double | String = null,
    catenaryColor: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    gridColor: String = null,
    hideGrid: js.UndefOr[Boolean] = js.undefined,
    hideInterface: js.UndefOr[Boolean] = js.undefined,
    imgSrc: String = null,
    immediateLoading: js.UndefOr[Boolean] = js.undefined,
    lazyRadius: js.UndefOr[Double] = js.undefined,
    loadTimeOffset: js.UndefOr[Double] = js.undefined,
    onChange: js.UndefOr[Null | (/* canvas */ CanvasDraw => Unit)] = js.undefined,
    saveData: String = null,
    style: CSSProperties = null
  ): CanvasDrawProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (brushColor != null) __obj.updateDynamic("brushColor")(brushColor.asInstanceOf[js.Any])
    if (!js.isUndefined(brushRadius)) __obj.updateDynamic("brushRadius")(brushRadius.get.asInstanceOf[js.Any])
    if (canvasHeight != null) __obj.updateDynamic("canvasHeight")(canvasHeight.asInstanceOf[js.Any])
    if (canvasWidth != null) __obj.updateDynamic("canvasWidth")(canvasWidth.asInstanceOf[js.Any])
    if (catenaryColor != null) __obj.updateDynamic("catenaryColor")(catenaryColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (gridColor != null) __obj.updateDynamic("gridColor")(gridColor.asInstanceOf[js.Any])
    if (!js.isUndefined(hideGrid)) __obj.updateDynamic("hideGrid")(hideGrid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideInterface)) __obj.updateDynamic("hideInterface")(hideInterface.get.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateLoading)) __obj.updateDynamic("immediateLoading")(immediateLoading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyRadius)) __obj.updateDynamic("lazyRadius")(lazyRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadTimeOffset)) __obj.updateDynamic("loadTimeOffset")(loadTimeOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onChange)) __obj.updateDynamic("onChange")(if (onChange != null) js.Any.fromFunction1(onChange.asInstanceOf[/* canvas */ CanvasDraw => Unit]) else null)
    if (saveData != null) __obj.updateDynamic("saveData")(saveData.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasDrawProps]
  }
}

