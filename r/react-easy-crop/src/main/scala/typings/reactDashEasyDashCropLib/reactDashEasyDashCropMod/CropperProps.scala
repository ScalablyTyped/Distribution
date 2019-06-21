package typings
package reactDashEasyDashCropLib.reactDashEasyDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropperProps extends js.Object {
  var aspect: js.UndefOr[scala.Double] = js.undefined
  var classes: js.UndefOr[reactDashEasyDashCropLib.Anon_ContainerClassName] = js.undefined
  var crop: Location
  var cropShape: js.UndefOr[
    reactDashEasyDashCropLib.reactDashEasyDashCropLibStrings.rect | reactDashEasyDashCropLib.reactDashEasyDashCropLibStrings.round
  ] = js.undefined
  var cropSize: js.UndefOr[Size] = js.undefined
  var crossOrigin: js.UndefOr[java.lang.String] = js.undefined
  var image: java.lang.String
  var initialCroppedAreaPixels: js.UndefOr[Area] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, scala.Unit]] = js.undefined
  var onImgError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onZoomChange: js.UndefOr[js.Function1[/* zoom */ scala.Double, scala.Unit]] = js.undefined
  var restrictPosition: js.UndefOr[scala.Boolean] = js.undefined
  var showGrid: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashEasyDashCropLib.Anon_ContainerStyle] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomSpeed: js.UndefOr[scala.Double] = js.undefined
  def onCropChange(location: Location): scala.Unit
}

object CropperProps {
  @scala.inline
  def apply(
    crop: Location,
    image: java.lang.String,
    onCropChange: Location => scala.Unit,
    aspect: scala.Int | scala.Double = null,
    classes: reactDashEasyDashCropLib.Anon_ContainerClassName = null,
    cropShape: reactDashEasyDashCropLib.reactDashEasyDashCropLibStrings.rect | reactDashEasyDashCropLib.reactDashEasyDashCropLibStrings.round = null,
    cropSize: Size = null,
    crossOrigin: java.lang.String = null,
    initialCroppedAreaPixels: Area = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    onCropComplete: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => scala.Unit = null,
    onImgError: () => scala.Unit = null,
    onZoomChange: /* zoom */ scala.Double => scala.Unit = null,
    restrictPosition: js.UndefOr[scala.Boolean] = js.undefined,
    showGrid: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashEasyDashCropLib.Anon_ContainerStyle = null,
    zoom: scala.Int | scala.Double = null,
    zoomSpeed: scala.Int | scala.Double = null
  ): CropperProps = {
    val __obj = js.Dynamic.literal(crop = crop, image = image, onCropChange = js.Any.fromFunction1(onCropChange))
    if (aspect != null) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (cropShape != null) __obj.updateDynamic("cropShape")(cropShape.asInstanceOf[js.Any])
    if (cropSize != null) __obj.updateDynamic("cropSize")(cropSize)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (initialCroppedAreaPixels != null) __obj.updateDynamic("initialCroppedAreaPixels")(initialCroppedAreaPixels)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onCropComplete != null) __obj.updateDynamic("onCropComplete")(js.Any.fromFunction2(onCropComplete))
    if (onImgError != null) __obj.updateDynamic("onImgError")(js.Any.fromFunction0(onImgError))
    if (onZoomChange != null) __obj.updateDynamic("onZoomChange")(js.Any.fromFunction1(onZoomChange))
    if (!js.isUndefined(restrictPosition)) __obj.updateDynamic("restrictPosition")(restrictPosition)
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid)
    if (style != null) __obj.updateDynamic("style")(style)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomSpeed != null) __obj.updateDynamic("zoomSpeed")(zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropperProps]
  }
}

