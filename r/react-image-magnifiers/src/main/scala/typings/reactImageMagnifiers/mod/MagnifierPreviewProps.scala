package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MagnifierPreviewProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var cursorStyle: js.UndefOr[String] = js.undefined
  var imageAlt: js.UndefOr[String] = js.undefined
  var imageSrc: String
  var largeImageSrc: js.UndefOr[String] = js.undefined
  var onImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  var onLargeImageLoad: js.UndefOr[js.Function1[/* ev */ SyntheticEvent[Element, Event], Unit]] = js.undefined
  var onZoomEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onZoomStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayBackgroundColor: js.UndefOr[Double] = js.undefined
  var overlayBoxColor: js.UndefOr[Double] = js.undefined
  var overlayBoxImage: js.UndefOr[Double] = js.undefined
  var overlayBoxImageSize: js.UndefOr[Double] = js.undefined
  var overlayBoxOpacity: js.UndefOr[Double] = js.undefined
  var overlayOpacity: js.UndefOr[Double] = js.undefined
  var renderOverlay: js.UndefOr[js.Function1[/* state */ Boolean, ReactNode]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionSpeed: js.UndefOr[Double] = js.undefined
}

object MagnifierPreviewProps {
  @scala.inline
  def apply(
    imageSrc: String,
    className: String = null,
    cursorStyle: String = null,
    imageAlt: String = null,
    largeImageSrc: String = null,
    onImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onLargeImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onZoomEnd: () => Unit = null,
    onZoomStart: () => Unit = null,
    overlayBackgroundColor: js.UndefOr[Double] = js.undefined,
    overlayBoxColor: js.UndefOr[Double] = js.undefined,
    overlayBoxImage: js.UndefOr[Double] = js.undefined,
    overlayBoxImageSize: js.UndefOr[Double] = js.undefined,
    overlayBoxOpacity: js.UndefOr[Double] = js.undefined,
    overlayOpacity: js.UndefOr[Double] = js.undefined,
    renderOverlay: /* state */ Boolean => ReactNode = null,
    style: CSSProperties = null,
    transitionSpeed: js.UndefOr[Double] = js.undefined
  ): MagnifierPreviewProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (largeImageSrc != null) __obj.updateDynamic("largeImageSrc")(largeImageSrc.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLargeImageLoad != null) __obj.updateDynamic("onLargeImageLoad")(js.Any.fromFunction1(onLargeImageLoad))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction0(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction0(onZoomStart))
    if (!js.isUndefined(overlayBackgroundColor)) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayBoxColor)) __obj.updateDynamic("overlayBoxColor")(overlayBoxColor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayBoxImage)) __obj.updateDynamic("overlayBoxImage")(overlayBoxImage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayBoxImageSize)) __obj.updateDynamic("overlayBoxImageSize")(overlayBoxImageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayBoxOpacity)) __obj.updateDynamic("overlayBoxOpacity")(overlayBoxOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayOpacity)) __obj.updateDynamic("overlayOpacity")(overlayOpacity.get.asInstanceOf[js.Any])
    if (renderOverlay != null) __obj.updateDynamic("renderOverlay")(js.Any.fromFunction1(renderOverlay))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionSpeed)) __obj.updateDynamic("transitionSpeed")(transitionSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnifierPreviewProps]
  }
}

