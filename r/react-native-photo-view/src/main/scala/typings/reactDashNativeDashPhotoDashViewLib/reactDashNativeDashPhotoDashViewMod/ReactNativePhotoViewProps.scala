package typings
package reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactNativePhotoViewProps extends js.Object {
  var androidScaleType: js.UndefOr[
    reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.center | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.centerCrop | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.centerInside | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitCenter | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitStart | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitEnd | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitXY
  ] = js.undefined
  var androidZoomTransitionDuration: js.UndefOr[scala.Double] = js.undefined
  var fadeDuration: js.UndefOr[scala.Double] = js.undefined
  var loadingIndicatorSource: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageSourcePropType] = js.undefined
  var maximumZoomScale: js.UndefOr[scala.Double] = js.undefined
  var minimumZoomScale: js.UndefOr[scala.Double] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoadEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function2[/* loaded */ scala.Double, /* total */ scala.Double, scala.Unit]] = js.undefined
  var onScale: js.UndefOr[
    js.Function2[
      /* scale */ scala.Double, 
      /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var onTap: js.UndefOr[
    js.Function2[
      /* point */ reactDashNativeDashPhotoDashViewLib.Anon_X, 
      /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var onViewTap: js.UndefOr[
    js.Function2[
      /* point */ reactDashNativeDashPhotoDashViewLib.Anon_X, 
      /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageSourcePropType] = js.undefined
}

object ReactNativePhotoViewProps {
  @scala.inline
  def apply(
    androidScaleType: reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.center | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.centerCrop | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.centerInside | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitCenter | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitStart | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitEnd | reactDashNativeDashPhotoDashViewLib.reactDashNativeDashPhotoDashViewLibStrings.fitXY = null,
    androidZoomTransitionDuration: scala.Int | scala.Double = null,
    fadeDuration: scala.Int | scala.Double = null,
    loadingIndicatorSource: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType = null,
    maximumZoomScale: scala.Int | scala.Double = null,
    minimumZoomScale: scala.Int | scala.Double = null,
    onLoad: () => scala.Unit = null,
    onLoadEnd: () => scala.Unit = null,
    onLoadStart: () => scala.Unit = null,
    onProgress: (/* loaded */ scala.Double, /* total */ scala.Double) => scala.Unit = null,
    onScale: (/* scale */ scala.Double, /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]]) => scala.Unit = null,
    onTap: (/* point */ reactDashNativeDashPhotoDashViewLib.Anon_X, /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]]) => scala.Unit = null,
    onViewTap: (/* point */ reactDashNativeDashPhotoDashViewLib.Anon_X, /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]]) => scala.Unit = null,
    scale: scala.Int | scala.Double = null,
    showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    source: reactDashNativeLib.reactDashNativeMod.ImageSourcePropType = null
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

