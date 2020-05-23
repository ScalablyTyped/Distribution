package typings.reactImageMagnifiers.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideBySideMagnifierProps extends CommonProps {
  var alwaysInPlace: js.UndefOr[Boolean] = js.undefined
  var fillAlignTop: js.UndefOr[Boolean] = js.undefined
  var fillAvailableSpace: js.UndefOr[Boolean] = js.undefined
  var fillGapBottom: js.UndefOr[Double] = js.undefined
  var fillGapLeft: js.UndefOr[Double] = js.undefined
  var fillGapRight: js.UndefOr[Double] = js.undefined
  var fillGapTop: js.UndefOr[Double] = js.undefined
  var inPlaceMinBreakpoint: js.UndefOr[Double] = js.undefined
  var overlayBackgroundColor: js.UndefOr[String] = js.undefined
  var overlayBoxColor: js.UndefOr[String] = js.undefined
  var overlayBoxImage: js.UndefOr[String] = js.undefined
  var overlayBoxImageSize: js.UndefOr[String] = js.undefined
  var overlayBoxOpacity: js.UndefOr[Double] = js.undefined
  var overlayOpacity: js.UndefOr[Double] = js.undefined
  var switchSides: js.UndefOr[Boolean] = js.undefined
  var transitionSpeed: js.UndefOr[Double] = js.undefined
  var transitionSpeedInPlace: js.UndefOr[Double] = js.undefined
  var zoomContainerBorder: js.UndefOr[String] = js.undefined
  var zoomContainerBoxShadow: js.UndefOr[String] = js.undefined
}

object SideBySideMagnifierProps {
  @scala.inline
  def apply(
    imageSrc: String,
    alwaysInPlace: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cursorStyle: String = null,
    fillAlignTop: js.UndefOr[Boolean] = js.undefined,
    fillAvailableSpace: js.UndefOr[Boolean] = js.undefined,
    fillGapBottom: js.UndefOr[Double] = js.undefined,
    fillGapLeft: js.UndefOr[Double] = js.undefined,
    fillGapRight: js.UndefOr[Double] = js.undefined,
    fillGapTop: js.UndefOr[Double] = js.undefined,
    imageAlt: String = null,
    inPlaceMinBreakpoint: js.UndefOr[Double] = js.undefined,
    largeImageSrc: String = null,
    onImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onLargeImageLoad: /* ev */ SyntheticEvent[Element, Event] => Unit = null,
    onZoomEnd: () => Unit = null,
    onZoomStart: () => Unit = null,
    overlayBackgroundColor: String = null,
    overlayBoxColor: String = null,
    overlayBoxImage: String = null,
    overlayBoxImageSize: String = null,
    overlayBoxOpacity: js.UndefOr[Double] = js.undefined,
    overlayOpacity: js.UndefOr[Double] = js.undefined,
    renderOverlay: /* state */ Boolean => ReactNode = null,
    style: CSSProperties = null,
    switchSides: js.UndefOr[Boolean] = js.undefined,
    transitionSpeed: js.UndefOr[Double] = js.undefined,
    transitionSpeedInPlace: js.UndefOr[Double] = js.undefined,
    zoomContainerBorder: String = null,
    zoomContainerBoxShadow: String = null
  ): SideBySideMagnifierProps = {
    val __obj = js.Dynamic.literal(imageSrc = imageSrc.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysInPlace)) __obj.updateDynamic("alwaysInPlace")(alwaysInPlace.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursorStyle != null) __obj.updateDynamic("cursorStyle")(cursorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fillAlignTop)) __obj.updateDynamic("fillAlignTop")(fillAlignTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillAvailableSpace)) __obj.updateDynamic("fillAvailableSpace")(fillAvailableSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGapBottom)) __obj.updateDynamic("fillGapBottom")(fillGapBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGapLeft)) __obj.updateDynamic("fillGapLeft")(fillGapLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGapRight)) __obj.updateDynamic("fillGapRight")(fillGapRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fillGapTop)) __obj.updateDynamic("fillGapTop")(fillGapTop.get.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlaceMinBreakpoint)) __obj.updateDynamic("inPlaceMinBreakpoint")(inPlaceMinBreakpoint.get.asInstanceOf[js.Any])
    if (largeImageSrc != null) __obj.updateDynamic("largeImageSrc")(largeImageSrc.asInstanceOf[js.Any])
    if (onImageLoad != null) __obj.updateDynamic("onImageLoad")(js.Any.fromFunction1(onImageLoad))
    if (onLargeImageLoad != null) __obj.updateDynamic("onLargeImageLoad")(js.Any.fromFunction1(onLargeImageLoad))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction0(onZoomEnd))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction0(onZoomStart))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (overlayBoxColor != null) __obj.updateDynamic("overlayBoxColor")(overlayBoxColor.asInstanceOf[js.Any])
    if (overlayBoxImage != null) __obj.updateDynamic("overlayBoxImage")(overlayBoxImage.asInstanceOf[js.Any])
    if (overlayBoxImageSize != null) __obj.updateDynamic("overlayBoxImageSize")(overlayBoxImageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayBoxOpacity)) __obj.updateDynamic("overlayBoxOpacity")(overlayBoxOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayOpacity)) __obj.updateDynamic("overlayOpacity")(overlayOpacity.get.asInstanceOf[js.Any])
    if (renderOverlay != null) __obj.updateDynamic("renderOverlay")(js.Any.fromFunction1(renderOverlay))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(switchSides)) __obj.updateDynamic("switchSides")(switchSides.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionSpeed)) __obj.updateDynamic("transitionSpeed")(transitionSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionSpeedInPlace)) __obj.updateDynamic("transitionSpeedInPlace")(transitionSpeedInPlace.get.asInstanceOf[js.Any])
    if (zoomContainerBorder != null) __obj.updateDynamic("zoomContainerBorder")(zoomContainerBorder.asInstanceOf[js.Any])
    if (zoomContainerBoxShadow != null) __obj.updateDynamic("zoomContainerBoxShadow")(zoomContainerBoxShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideBySideMagnifierProps]
  }
}

