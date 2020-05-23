package typings.reactEasyCrop.mod

import typings.reactEasyCrop.anon.ContainerClassName
import typings.reactEasyCrop.anon.ContainerStyle
import typings.reactEasyCrop.reactEasyCropStrings.rect
import typings.reactEasyCrop.reactEasyCropStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropperProps extends js.Object {
  var aspect: js.UndefOr[Double] = js.undefined
  var classes: js.UndefOr[ContainerClassName] = js.undefined
  var crop: Location
  var cropShape: js.UndefOr[rect | round] = js.undefined
  var cropSize: js.UndefOr[Size] = js.undefined
  var crossOrigin: js.UndefOr[String] = js.undefined
  var image: String
  var initialCroppedAreaPixels: js.UndefOr[Area] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var onCropComplete: js.UndefOr[js.Function2[/* croppedArea */ Area, /* croppedAreaPixels */ Area, Unit]] = js.undefined
  var onImageLoaded: js.UndefOr[js.Function1[/* imageSize */ ImageSize, Unit]] = js.undefined
  var onImgError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInteractionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onInteractionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRotationChange: js.UndefOr[js.Function1[/* rotation */ Double, Unit]] = js.undefined
  var onZoomChange: js.UndefOr[js.Function1[/* zoom */ Double, Unit]] = js.undefined
  var restrictPosition: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var showGrid: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[ContainerStyle] = js.undefined
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
    aspect: js.UndefOr[Double] = js.undefined,
    classes: ContainerClassName = null,
    cropShape: rect | round = null,
    cropSize: Size = null,
    crossOrigin: String = null,
    initialCroppedAreaPixels: Area = null,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    onCropComplete: (/* croppedArea */ Area, /* croppedAreaPixels */ Area) => Unit = null,
    onImageLoaded: /* imageSize */ ImageSize => Unit = null,
    onImgError: () => Unit = null,
    onInteractionEnd: () => Unit = null,
    onInteractionStart: () => Unit = null,
    onRotationChange: /* rotation */ Double => Unit = null,
    onZoomChange: /* zoom */ Double => Unit = null,
    restrictPosition: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    showGrid: js.UndefOr[Boolean] = js.undefined,
    style: ContainerStyle = null,
    zoom: js.UndefOr[Double] = js.undefined,
    zoomSpeed: js.UndefOr[Double] = js.undefined
  ): CropperProps = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1(onCropChange))
    if (!js.isUndefined(aspect)) __obj.updateDynamic("aspect")(aspect.get.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (cropShape != null) __obj.updateDynamic("cropShape")(cropShape.asInstanceOf[js.Any])
    if (cropSize != null) __obj.updateDynamic("cropSize")(cropSize.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (initialCroppedAreaPixels != null) __obj.updateDynamic("initialCroppedAreaPixels")(initialCroppedAreaPixels.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (onCropComplete != null) __obj.updateDynamic("onCropComplete")(js.Any.fromFunction2(onCropComplete))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1(onImageLoaded))
    if (onImgError != null) __obj.updateDynamic("onImgError")(js.Any.fromFunction0(onImgError))
    if (onInteractionEnd != null) __obj.updateDynamic("onInteractionEnd")(js.Any.fromFunction0(onInteractionEnd))
    if (onInteractionStart != null) __obj.updateDynamic("onInteractionStart")(js.Any.fromFunction0(onInteractionStart))
    if (onRotationChange != null) __obj.updateDynamic("onRotationChange")(js.Any.fromFunction1(onRotationChange))
    if (onZoomChange != null) __obj.updateDynamic("onZoomChange")(js.Any.fromFunction1(onZoomChange))
    if (!js.isUndefined(restrictPosition)) __obj.updateDynamic("restrictPosition")(restrictPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGrid)) __obj.updateDynamic("showGrid")(showGrid.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomSpeed)) __obj.updateDynamic("zoomSpeed")(zoomSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropperProps]
  }
}

