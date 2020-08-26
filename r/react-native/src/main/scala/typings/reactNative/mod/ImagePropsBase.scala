package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePropsBase
  extends AccessibilityProps
     with ImagePropsIOS
     with ImagePropsAndroid {
  var borderBottomLeftRadius: js.UndefOr[Double] = js.native
  var borderBottomRightRadius: js.UndefOr[Double] = js.native
  var borderRadius: js.UndefOr[Double] = js.native
  var borderTopLeftRadius: js.UndefOr[Double] = js.native
  var borderTopRightRadius: js.UndefOr[Double] = js.native
  /**
    * A static image to display while downloading the final image off the network.
    */
  var defaultSource: js.UndefOr[ImageURISource | Double] = js.native
  /**
    * similarly to `source`, this property represents the resource used to render
    * the loading indicator for the image, displayed until image is ready to be
    * displayed, typically after when it got downloaded from network.
    */
  var loadingIndicatorSource: js.UndefOr[ImageURISource] = js.native
  /**
    * Invoked on load error with {nativeEvent: {error}}
    */
  var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], Unit]] = js.native
  /**
    * onLayout function
    *
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height} }}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  /**
    * Invoked when load completes successfully
    * { source: { url, height, width } }.
    */
  var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], Unit]] = js.native
  /**
    * Invoked when load either succeeds or fails
    */
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Invoked on load start
    */
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.native
  var progressiveRenderingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Determines how to resize the image when the frame doesn't match the raw
    * image dimensions.
    *
    * 'cover': Scale the image uniformly (maintain the image's aspect ratio)
    * so that both dimensions (width and height) of the image will be equal
    * to or larger than the corresponding dimension of the view (minus padding).
    *
    * 'contain': Scale the image uniformly (maintain the image's aspect ratio)
    * so that both dimensions (width and height) of the image will be equal to
    * or less than the corresponding dimension of the view (minus padding).
    *
    * 'stretch': Scale width and height independently, This may change the
    * aspect ratio of the src.
    *
    * 'repeat': Repeat the image to cover the frame of the view.
    * The image will keep it's size and aspect ratio. (iOS only)
    *
    * 'center': Scale the image down so that it is completely visible,
    * if bigger than the area of the view.
    * The image will not be scaled up.
    */
  var resizeMode: js.UndefOr[ImageResizeMode] = js.native
  /**
    * The image source (either a remote URL or a local file resource).
    *
    * This prop can also contain several remote URLs, specified together with their width and height and potentially with scale/other URI arguments.
    * The native side will then choose the best uri to display based on the measured size of the image container.
    * A cache property can be added to control how networked request interacts with the local cache.
    *
    * The currently supported formats are png, jpg, jpeg, bmp, gif, webp (Android only), psd (iOS only).
    */
  var source: ImageSourcePropType = js.native
  /**
    * A unique identifier for this element to be used in UI Automation testing scripts.
    */
  var testID: js.UndefOr[String] = js.native
}

object ImagePropsBase {
  @scala.inline
  def apply(source: ImageSourcePropType): ImagePropsBase = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagePropsBase]
  }
  @scala.inline
  implicit class ImagePropsBaseOps[Self <: ImagePropsBase] (val x: Self) extends AnyVal {
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
    def setSourceVarargs(value: ImageURISource*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    @scala.inline
    def setDefaultSource(value: ImageURISource | Double): Self = this.set("defaultSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSource: Self = this.set("defaultSource", js.undefined)
    @scala.inline
    def setLoadingIndicatorSource(value: ImageURISource): Self = this.set("loadingIndicatorSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIndicatorSource: Self = this.set("loadingIndicatorSource", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ NativeSyntheticEvent[ImageErrorEventData] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setOnLoad(value: /* event */ NativeSyntheticEvent[ImageLoadEventData] => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
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
    def setProgressiveRenderingEnabled(value: Boolean): Self = this.set("progressiveRenderingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressiveRenderingEnabled: Self = this.set("progressiveRenderingEnabled", js.undefined)
    @scala.inline
    def setResizeMode(value: ImageResizeMode): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
  }
  
}

