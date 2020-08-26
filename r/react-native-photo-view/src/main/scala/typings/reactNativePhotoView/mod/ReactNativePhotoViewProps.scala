package typings.reactNativePhotoView.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
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

@js.native
trait ReactNativePhotoViewProps extends js.Object {
  var androidScaleType: js.UndefOr[center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY] = js.native
  var androidZoomTransitionDuration: js.UndefOr[Double] = js.native
  var fadeDuration: js.UndefOr[Double] = js.native
  var loadingIndicatorSource: js.UndefOr[ImageSourcePropType] = js.native
  var maximumZoomScale: js.UndefOr[Double] = js.native
  var minimumZoomScale: js.UndefOr[Double] = js.native
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onProgress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.native
  var onScale: js.UndefOr[js.Function2[/* scale */ Double, /* target */ js.UndefOr[ReactElement], Unit]] = js.native
  var onTap: js.UndefOr[js.Function2[/* point */ X, /* target */ js.UndefOr[ReactElement], Unit]] = js.native
  var onViewTap: js.UndefOr[js.Function2[/* point */ X, /* target */ js.UndefOr[ReactElement], Unit]] = js.native
  var scale: js.UndefOr[Double] = js.native
  var showsHorizontalScrollIndicator: js.UndefOr[Boolean] = js.native
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[ImageSourcePropType] = js.native
}

object ReactNativePhotoViewProps {
  @scala.inline
  def apply(): ReactNativePhotoViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactNativePhotoViewProps]
  }
  @scala.inline
  implicit class ReactNativePhotoViewPropsOps[Self <: ReactNativePhotoViewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidScaleType(value: center | centerCrop | centerInside | fitCenter | fitStart | fitEnd | fitXY): Self = this.set("androidScaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidScaleType: Self = this.set("androidScaleType", js.undefined)
    @scala.inline
    def setAndroidZoomTransitionDuration(value: Double): Self = this.set("androidZoomTransitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidZoomTransitionDuration: Self = this.set("androidZoomTransitionDuration", js.undefined)
    @scala.inline
    def setFadeDuration(value: Double): Self = this.set("fadeDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeDuration: Self = this.set("fadeDuration", js.undefined)
    @scala.inline
    def setLoadingIndicatorSourceVarargs(value: ImageURISource*): Self = this.set("loadingIndicatorSource", js.Array(value :_*))
    @scala.inline
    def setLoadingIndicatorSource(value: ImageSourcePropType): Self = this.set("loadingIndicatorSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIndicatorSource: Self = this.set("loadingIndicatorSource", js.undefined)
    @scala.inline
    def setMaximumZoomScale(value: Double): Self = this.set("maximumZoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumZoomScale: Self = this.set("maximumZoomScale", js.undefined)
    @scala.inline
    def setMinimumZoomScale(value: Double): Self = this.set("minimumZoomScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumZoomScale: Self = this.set("minimumZoomScale", js.undefined)
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnLoadEnd(value: () => Unit): Self = this.set("onLoadEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoadEnd: Self = this.set("onLoadEnd", js.undefined)
    @scala.inline
    def setOnLoadStart(value: () => Unit): Self = this.set("onLoadStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoadStart: Self = this.set("onLoadStart", js.undefined)
    @scala.inline
    def setOnProgress(value: (/* loaded */ Double, /* total */ Double) => Unit): Self = this.set("onProgress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnScale(value: (/* scale */ Double, /* target */ js.UndefOr[ReactElement]) => Unit): Self = this.set("onScale", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnScale: Self = this.set("onScale", js.undefined)
    @scala.inline
    def setOnTap(value: (/* point */ X, /* target */ js.UndefOr[ReactElement]) => Unit): Self = this.set("onTap", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    @scala.inline
    def setOnViewTap(value: (/* point */ X, /* target */ js.UndefOr[ReactElement]) => Unit): Self = this.set("onViewTap", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnViewTap: Self = this.set("onViewTap", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setShowsHorizontalScrollIndicator(value: Boolean): Self = this.set("showsHorizontalScrollIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowsHorizontalScrollIndicator: Self = this.set("showsHorizontalScrollIndicator", js.undefined)
    @scala.inline
    def setShowsVerticalScrollIndicator(value: Boolean): Self = this.set("showsVerticalScrollIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowsVerticalScrollIndicator: Self = this.set("showsVerticalScrollIndicator", js.undefined)
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

