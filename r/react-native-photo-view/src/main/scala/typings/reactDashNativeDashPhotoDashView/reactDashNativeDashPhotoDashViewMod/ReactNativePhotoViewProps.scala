package typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewMod

import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typings.reactDashNativeDashPhotoDashView.Anon_X
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.center
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.centerCrop
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.centerInside
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.fitCenter
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.fitEnd
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.fitStart
import typings.reactDashNativeDashPhotoDashView.reactDashNativeDashPhotoDashViewStrings.fitXY
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
  var onTap: js.UndefOr[js.Function2[/* point */ Anon_X, /* target */ js.UndefOr[ReactElement], Unit]] = js.undefined
  var onViewTap: js.UndefOr[js.Function2[/* point */ Anon_X, /* target */ js.UndefOr[ReactElement], Unit]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[ImageSourcePropType] = js.undefined
}

object ReactNativePhotoViewProps {
  @scala.inline
  def apply(
    androidScaleType: center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY = null,
    androidZoomTransitionDuration: Int | Double = null,
    fadeDuration: Int | Double = null,
    loadingIndicatorSource: ImageSourcePropType = null,
    maximumZoomScale: Int | Double = null,
    minimumZoomScale: Int | Double = null,
    onLoad: () => Unit = null,
    onLoadEnd: () => Unit = null,
    onLoadStart: () => Unit = null,
    onProgress: (/* loaded */ Double, /* total */ Double) => Unit = null,
    onScale: (/* scale */ Double, /* target */ js.UndefOr[ReactElement]) => Unit = null,
    onTap: (/* point */ Anon_X, /* target */ js.UndefOr[ReactElement]) => Unit = null,
    onViewTap: (/* point */ Anon_X, /* target */ js.UndefOr[ReactElement]) => Unit = null,
    scale: Int | Double = null,
    showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    source: ImageSourcePropType = null
  ): ReactNativePhotoViewProps = {
    val __obj = js.Dynamic.literal()
    if (androidScaleType != null) __obj.updateDynamic("androidScaleType")(androidScaleType.asInstanceOf[js.Any])
    if (androidZoomTransitionDuration != null) __obj.updateDynamic("androidZoomTransitionDuration")(androidZoomTransitionDuration.asInstanceOf[js.Any])
    if (fadeDuration != null) __obj.updateDynamic("fadeDuration")(fadeDuration.asInstanceOf[js.Any])
    if (loadingIndicatorSource != null) __obj.updateDynamic("loadingIndicatorSource")(loadingIndicatorSource.asInstanceOf[js.Any])
    if (maximumZoomScale != null) __obj.updateDynamic("maximumZoomScale")(maximumZoomScale.asInstanceOf[js.Any])
    if (minimumZoomScale != null) __obj.updateDynamic("minimumZoomScale")(minimumZoomScale.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadEnd != null) __obj.updateDynamic("onLoadEnd")(js.Any.fromFunction0(onLoadEnd))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction0(onLoadStart))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction2(onProgress))
    if (onScale != null) __obj.updateDynamic("onScale")(js.Any.fromFunction2(onScale))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction2(onTap))
    if (onViewTap != null) __obj.updateDynamic("onViewTap")(js.Any.fromFunction2(onViewTap))
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showsHorizontalScrollIndicator)) __obj.updateDynamic("showsHorizontalScrollIndicator")(showsHorizontalScrollIndicator)
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactNativePhotoViewProps]
  }
}

