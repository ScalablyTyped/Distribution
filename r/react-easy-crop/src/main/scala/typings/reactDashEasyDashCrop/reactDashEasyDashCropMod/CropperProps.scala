package typings.reactDashEasyDashCrop.reactDashEasyDashCropMod

import typings.reactDashEasyDashCrop.Anon_ContainerClassName
import typings.reactDashEasyDashCrop.Anon_ContainerStyle
import typings.reactDashEasyDashCrop.reactDashEasyDashCropStrings.rect
import typings.reactDashEasyDashCrop.reactDashEasyDashCropStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropperProps extends js.Object {
  var aspect: js.UndefOr[Double] = js.undefined
  var classes: js.UndefOr[Anon_ContainerClassName] = js.undefined
  var crop: Location
  var cropShape: js.UndefOr[rect | round] = js.undefined
  var cropSize: js.UndefOr[Size] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var image: String
  var initialCroppedAreaPixels: js.UndefOr[Area] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.undefined
  var onImgError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.undefined
  var restrictPosition: js.UndefOr[Boolean] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Anon_ContainerStyle] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
  var zoomSpeed: js.UndefOr[Double] = js.undefined
  def onCropChange(location: Location): Unit
}

object CropperProps {
  @scala.inline
  def apply(
    crop: Location,
    image: String,
    onCropChange: Location => Unit,
    aspect: Int | Double = null,
    classes: Anon_ContainerClassName = null,
    cropShape: rect | round = null,
    cropSize: Size = null,
    crossOrigin: String = null,
    initialCroppedAreaPixels: Area = null,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    onCropComplete: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit = null,
    onImgError: () => Unit = null,
    onZoomChange: /* zoom */ Double => Unit = null,
    restrictPosition: js.UndefOr[Boolean] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    style: Anon_ContainerStyle = null,
    zoom: Int | Double = null,
    zoomSpeed: Int | Double = null
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

