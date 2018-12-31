package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePropsAndroid extends js.Object {
  /**
    * Duration of fade in animation.
    */
  var fadeDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Required if loading images via 'uri' from drawable folder on Android
    * Explanation: https://medium.com/@adamjacobb/react-native-performance-images-adf5843e120
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The mechanism that should be used to resize the image when the image's dimensions
    * differ from the image view's dimensions. Defaults to auto.
    *
    * 'auto': Use heuristics to pick between resize and scale.
    *
    * 'resize': A software operation which changes the encoded image in memory before it gets decoded.
    * This should be used instead of scale when the image is much larger than the view.
    *
    * 'scale': The image gets drawn downscaled or upscaled. Compared to resize, scale is faster (usually hardware accelerated)
    * and produces higher quality images. This should be used if the image is smaller than the view.
    * It should also be used if the image is slightly bigger than the view.
    */
  var resizeMethod: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.resize | reactDashNativeLib.reactDashNativeLibStrings.scale
  ] = js.undefined
  /**
    * Required if loading images via 'uri' from drawable folder on Android.
    * Explanation: https://medium.com/@adamjacobb/react-native-performance-images-adf5843e120
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

