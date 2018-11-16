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
      /* point */ reactDashNativeDashPhotoDashViewLib.Anon_Y, 
      /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var onViewTap: js.UndefOr[
    js.Function2[
      /* point */ reactDashNativeDashPhotoDashViewLib.Anon_Y, 
      /* target */ js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var showsHorizontalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageSourcePropType] = js.undefined
}

