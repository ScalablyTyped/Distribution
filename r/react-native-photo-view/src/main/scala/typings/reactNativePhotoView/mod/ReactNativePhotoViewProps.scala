package typings.reactNativePhotoView.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNativePhotoView.anon.X
import typings.reactNativePhotoView.reactNativePhotoViewStrings.center
import typings.reactNativePhotoView.reactNativePhotoViewStrings.centerCrop
import typings.reactNativePhotoView.reactNativePhotoViewStrings.centerInside
import typings.reactNativePhotoView.reactNativePhotoViewStrings.fitCenter
import typings.reactNativePhotoView.reactNativePhotoViewStrings.fitEnd
import typings.reactNativePhotoView.reactNativePhotoViewStrings.fitStart
import typings.reactNativePhotoView.reactNativePhotoViewStrings.fitXY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativePhotoViewProps extends js.Object {
  var androidScaleType: js.UndefOr[center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY] = js.undefined
  var androidZoomTransitionDuration: js.UndefOr[Double] = js.undefined
  var fadeDuration: js.UndefOr[Double] = js.undefined
  var loadingIndicatorSource: js.UndefOr[ImageSourcePropType] = js.undefined
  var maximumZoomScale: js.UndefOr[Double] = js.undefined
  var minimumZoomScale: js.UndefOr[Double] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
  var onScale: js.UndefOr[js.Function2[/* scale */ Double, /* target */ js.UndefOr[ReactElement], Unit]] = js.undefined
  var onTap: js.UndefOr[js.Function2[/* point */ X, /* target */ js.UndefOr[ReactElement], Unit]] = js.undefined
  var onViewTap: js.UndefOr[js.Function2[/* point */ X, /* target */ js.UndefOr[ReactElement], Unit]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[ImageSourcePropType] = js.undefined
}

object ReactNativePhotoViewProps {
  @scala.inline
  def apply(
    androidScaleType: center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY = null,
    androidZoomTransitionDuration: js.UndefOr[Double] = js.undefined,
    fadeDuration: js.UndefOr[Double] = js.undefined,
    loadingIndicatorSource: ImageSourcePropType = null,
    maximumZoomScale: js.UndefOr[Double] = js.undefined,
    minimumZoomScale: js.UndefOr[Double] = js.undefined,
    onLoad: () => Unit = null,
    onLoadEnd: () => Unit = null,
    onLoadStart: () => Unit = null,
    onProgress: (/* loaded */ Double, /* total */ Double) => Unit = null,
    onScale: (/* scale */ Double, /* target */ js.UndefOr[ReactElement]) => Unit = null,
    onTap: (/* point */ X, /* target */ js.UndefOr[ReactElement]) => Unit = null,
    onViewTap: (/* point */ X, /* target */ js.UndefOr[ReactElement]) => Unit = null,
    scale: js.UndefOr[Double] = js.undefined,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    source: ImageSourcePropType = null
  ): ReactNativePhotoViewProps = {
    val __obj = js.Dynamic.literal()
    if (androidScaleType != null) __obj.updateDynamic("androidScaleType")(androidScaleType.asInstanceOf[js.Any])
    if (!js.isUndefined(androidZoomTransitionDuration)) __obj.updateDynamic("androidZoomTransitionDuration")(androidZoomTransitionDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeDuration)) __obj.updateDynamic("fadeDuration")(fadeDuration.get.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumZoomScale)) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumZoomScale)) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.get.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(js.Any.fromFunction0(onLoadEnd))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction0(onLoadStart))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction2(onProgress))
    if (onScale != null) __obj.updateDynamic("onScale")(js.Any.fromFunction2(onScale))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction2(onTap))
    if (onViewTap != null) __obj.updateDynamic("onViewTap")(js.Any.fromFunction2(onViewTap))
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativePhotoViewProps]
  }
}

