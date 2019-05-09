package typings
package reactDashCropperLib.reactDashCropperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLImageElement>, 'data' | 'ref'> ]: react.react.HTMLProps<std.HTMLImageElement>[P]} */ trait ReactCropperProps
  extends cropperjsLib.cropperjsMod.CropperOptions {
  var ref: js.UndefOr[java.lang.String | (js.Function1[/* cropper */ scala.Null | ReactCropper, _])] = js.undefined
}

object ReactCropperProps {
  @scala.inline
  def apply(
    aspectRatio: scala.Int | scala.Double = null,
    autoCrop: js.UndefOr[scala.Boolean] = js.undefined,
    autoCropArea: scala.Int | scala.Double = null,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    build: () => scala.Boolean = null,
    built: () => scala.Unit = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    checkCrossOrigin: js.UndefOr[scala.Boolean] = js.undefined,
    checkOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    crop: /* event */ cropperjsLib.cropperjsMod.CropperCropEvent => scala.Unit = null,
    cropBoxMovable: js.UndefOr[scala.Boolean] = js.undefined,
    cropBoxResizable: js.UndefOr[scala.Boolean] = js.undefined,
    cropend: /* event */ cropperjsLib.cropperjsMod.CropperCropStepEvent => scala.Unit = null,
    cropmove: /* event */ cropperjsLib.cropperjsMod.CropperCropStepEvent => scala.Unit = null,
    cropstart: /* event */ cropperjsLib.cropperjsMod.CropperCropStepEvent => scala.Unit = null,
    data: js.Object = null,
    dragMode: java.lang.String = null,
    guides: js.UndefOr[scala.Boolean] = js.undefined,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    minCanvasHeight: scala.Int | scala.Double = null,
    minCanvasWidth: scala.Int | scala.Double = null,
    minContainerHeight: scala.Int | scala.Double = null,
    minContainerWidth: scala.Int | scala.Double = null,
    minCropBoxHeight: scala.Int | scala.Double = null,
    minCropBoxWidth: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    movable: js.UndefOr[scala.Boolean] = js.undefined,
    preview: java.lang.String = null,
    ready: /* event */ cropperjsLib.cropperjsMod.CropperReadyEvent => scala.Unit = null,
    ref: java.lang.String | (js.Function1[/* cropper */ scala.Null | ReactCropper, _]) = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    restore: js.UndefOr[scala.Boolean] = js.undefined,
    rotatable: js.UndefOr[scala.Boolean] = js.undefined,
    scalable: js.UndefOr[scala.Boolean] = js.undefined,
    toggleDragModeOnDblclick: js.UndefOr[scala.Boolean] = js.undefined,
    viewMode: cropperjsLib.cropperjsMod.CropperViewMods = null,
    wheelZoomRatio: scala.Int | scala.Double = null,
    zoom: /* event */ cropperjsLib.cropperjsMod.CropperZoomEvent => scala.Unit = null,
    zoomOnTouch: js.UndefOr[scala.Boolean] = js.undefined,
    zoomOnWheel: js.UndefOr[scala.Boolean] = js.undefined,
    zoomable: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactCropperProps = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCrop)) __obj.updateDynamic("autoCrop")(autoCrop)
    if (autoCropArea != null) __obj.updateDynamic("autoCropArea")(autoCropArea.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction0(build))
    if (built != null) __obj.updateDynamic("built")(js.Any.fromFunction0(built))
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(checkCrossOrigin)) __obj.updateDynamic("checkCrossOrigin")(checkCrossOrigin)
    if (!js.isUndefined(checkOrientation)) __obj.updateDynamic("checkOrientation")(checkOrientation)
    if (crop != null) __obj.updateDynamic("crop")(js.Any.fromFunction1(crop))
    if (!js.isUndefined(cropBoxMovable)) __obj.updateDynamic("cropBoxMovable")(cropBoxMovable)
    if (!js.isUndefined(cropBoxResizable)) __obj.updateDynamic("cropBoxResizable")(cropBoxResizable)
    if (cropend != null) __obj.updateDynamic("cropend")(js.Any.fromFunction1(cropend))
    if (cropmove != null) __obj.updateDynamic("cropmove")(js.Any.fromFunction1(cropmove))
    if (cropstart != null) __obj.updateDynamic("cropstart")(js.Any.fromFunction1(cropstart))
    if (data != null) __obj.updateDynamic("data")(data)
    if (dragMode != null) __obj.updateDynamic("dragMode")(dragMode)
    if (!js.isUndefined(guides)) __obj.updateDynamic("guides")(guides)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (minCanvasHeight != null) __obj.updateDynamic("minCanvasHeight")(minCanvasHeight.asInstanceOf[js.Any])
    if (minCanvasWidth != null) __obj.updateDynamic("minCanvasWidth")(minCanvasWidth.asInstanceOf[js.Any])
    if (minContainerHeight != null) __obj.updateDynamic("minContainerHeight")(minContainerHeight.asInstanceOf[js.Any])
    if (minContainerWidth != null) __obj.updateDynamic("minContainerWidth")(minContainerWidth.asInstanceOf[js.Any])
    if (minCropBoxHeight != null) __obj.updateDynamic("minCropBoxHeight")(minCropBoxHeight.asInstanceOf[js.Any])
    if (minCropBoxWidth != null) __obj.updateDynamic("minCropBoxWidth")(minCropBoxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(movable)) __obj.updateDynamic("movable")(movable)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(restore)) __obj.updateDynamic("restore")(restore)
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    if (!js.isUndefined(toggleDragModeOnDblclick)) __obj.updateDynamic("toggleDragModeOnDblclick")(toggleDragModeOnDblclick)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (wheelZoomRatio != null) __obj.updateDynamic("wheelZoomRatio")(wheelZoomRatio.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1(zoom))
    if (!js.isUndefined(zoomOnTouch)) __obj.updateDynamic("zoomOnTouch")(zoomOnTouch)
    if (!js.isUndefined(zoomOnWheel)) __obj.updateDynamic("zoomOnWheel")(zoomOnWheel)
    if (!js.isUndefined(zoomable)) __obj.updateDynamic("zoomable")(zoomable)
    __obj.asInstanceOf[ReactCropperProps]
  }
}

