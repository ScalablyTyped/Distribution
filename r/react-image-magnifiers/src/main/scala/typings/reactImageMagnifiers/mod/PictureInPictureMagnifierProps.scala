package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.bottom
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.left
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.right
import typings.reactImageMagnifiers.reactImageMagnifiersStrings.top
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureInPictureMagnifierProps extends CommonProps {
  var cursorStyleActive: js.UndefOr[String] = js.undefined
  var previewHorizontalPos: js.UndefOr[left | right] = js.undefined
  var previewOpacity: js.UndefOr[Double] = js.undefined
  var previewOverlayBackgroundColor: js.UndefOr[String] = js.undefined
  var previewOverlayBoxColor: js.UndefOr[String] = js.undefined
  var previewOverlayBoxImage: js.UndefOr[String] = js.undefined
  var previewOverlayBoxImageSize: js.UndefOr[String] = js.undefined
  var previewOverlayBoxOpacity: js.UndefOr[Double] = js.undefined
  var previewOverlayOpacity: js.UndefOr[Double] = js.undefined
  var previewSizePercentage: js.UndefOr[Double] = js.undefined
  var previewVerticalPos: js.UndefOr[top | bottom] = js.undefined
  var shadow: js.UndefOr[Boolean] = js.undefined
  var shadowColor: js.UndefOr[String] = js.undefined
}

object PictureInPictureMagnifierProps {
  @scala.inline
  def apply(
    imageSrc: String,
    className: String = null,
    cursorStyle: String = null,
    cursorStyleActive: String = null,
    imageAlt: String = null,
    largeImageSrc: String = null,
    onImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onLargeImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onZoomEnd: () => Unit = null,
    onZoomStart: () => Unit = null,
    previewHorizontalPos: left | right = null,
    previewOpacity: js.UndefOr[Double] = js.undefined,
    previewOverlayBackgroundColor: String = null,
    previewOverlayBoxColor: String = null,
    previewOverlayBoxImage: String = null,
    previewOverlayBoxImageSize: String = null,
    previewOverlayBoxOpacity: js.UndefOr[Double] = js.undefined,
    previewOverlayOpacity: js.UndefOr[Double] = js.undefined,
    previewSizePercentage: js.UndefOr[Double] = js.undefined,
    previewVerticalPos: top | bottom = null,
    renderOverlay: /* state */ Boolean => ReactNode = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shadowColor: String = null,
    style: CSSProperties = null
  ): PictureInPictureMagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (cursorStyleActive != null) __obj.updateDynamic("cursorStyleActive")(cursorStyleActive.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (largeImageSrc != null) __obj.updateDynamic("largeImageSrc")(largeImageSrc.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLargeImageLoad != null) __obj.updateDynamic("onLargeImageLoad")(js.Any.fromFunction1(onLargeImageLoad))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction0(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction0(onZoomStart))
    if (previewHorizontalPos != null) __obj.updateDynamic("previewHorizontalPos")(previewHorizontalPos.asInstanceOf[js.Any])
    if (!js.isUndefined(previewOpacity)) __obj.updateDynamic("previewOpacity")(previewOpacity.get.asInstanceOf[js.Any])
    if (previewOverlayBackgroundColor != null) __obj.updateDynamic("previewOverlayBackgroundColor")(previewOverlayBackgroundColor.asInstanceOf[js.Any])
    if (previewOverlayBoxColor != null) __obj.updateDynamic("previewOverlayBoxColor")(previewOverlayBoxColor.asInstanceOf[js.Any])
    if (previewOverlayBoxImage != null) __obj.updateDynamic("previewOverlayBoxImage")(previewOverlayBoxImage.asInstanceOf[js.Any])
    if (previewOverlayBoxImageSize != null) __obj.updateDynamic("previewOverlayBoxImageSize")(previewOverlayBoxImageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(previewOverlayBoxOpacity)) __obj.updateDynamic("previewOverlayBoxOpacity")(previewOverlayBoxOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(previewOverlayOpacity)) __obj.updateDynamic("previewOverlayOpacity")(previewOverlayOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(previewSizePercentage)) __obj.updateDynamic("previewSizePercentage")(previewSizePercentage.get.asInstanceOf[js.Any])
    if (previewVerticalPos != null) __obj.updateDynamic("previewVerticalPos")(previewVerticalPos.asInstanceOf[js.Any])
    if (renderOverlay != null) __obj.updateDynamic("renderOverlay")(js.Any.fromFunction1(renderOverlay))
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.get.asInstanceOf[js.Any])
    if (shadowColor != null) __obj.updateDynamic("shadowColor")(shadowColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPictureMagnifierProps]
  }
}

