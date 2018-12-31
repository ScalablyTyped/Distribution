package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePropsBase
  extends AccessibilityProps
     with ImagePropsIOS
     with ImagePropsAndroid {
  var borderBottomLeftRadius: js.UndefOr[scala.Double] = js.undefined
  var borderBottomRightRadius: js.UndefOr[scala.Double] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var borderTopLeftRadius: js.UndefOr[scala.Double] = js.undefined
  var borderTopRightRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * A static image to display while downloading the final image off the network.
    */
  var defaultSource: js.UndefOr[ImageURISource | scala.Double] = js.undefined
  /**
    * similarly to `source`, this property represents the resource used to render
    * the loading indicator for the image, displayed until image is ready to be
    * displayed, typically after when it got downloaded from network.
    */
  var loadingIndicatorSource: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Invoked on load error with {nativeEvent: {error}}
    */
  var onError: js.UndefOr[js.Function1[/* error */ NativeSyntheticEvent[ImageErrorEventData], scala.Unit]] = js.undefined
  /**
    * onLayout function
    *
    * Invoked on mount and layout changes with
    *
    * {nativeEvent: { layout: {x, y, width, height} }}.
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, scala.Unit]] = js.undefined
  /**
    * Invoked when load completes successfully
    * { source: { url, height, width } }.
    */
  var onLoad: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageLoadEventData], scala.Unit]] = js.undefined
  /**
    * Invoked when load either succeeds or fails
    */
  var onLoadEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Invoked on load start
    */
  var onLoadStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var progressiveRenderingEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
  var resizeMode: js.UndefOr[ImageResizeMode] = js.undefined
  /**
    * The image source (either a remote URL or a local file resource).
    *
    * This prop can also contain several remote URLs, specified together with their width and height and potentially with scale/other URI arguments.
    * The native side will then choose the best uri to display based on the measured size of the image container.
    * A cache property can be added to control how networked request interacts with the local cache.
    *
    * The currently supported formats are png, jpg, jpeg, bmp, gif, webp (Android only), psd (iOS only).
    */
  var source: ImageSourcePropType
  /**
    * A unique identifier for this element to be used in UI Automation testing scripts.
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

