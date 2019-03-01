package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePropsIOS extends js.Object {
  /**
    * blurRadius: the blur radius of the blur filter added to the image
    * @platform ios
    */
  var blurRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * When the image is resized, the corners of the size specified by capInsets will stay a fixed size,
    * but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    * More info on Apple documentation
    */
  var capInsets: js.UndefOr[Insets] = js.undefined
  /**
    * Invoked when a partial load of the image is complete. The definition of
    * what constitutes a "partial load" is loader specific though this is meant
    * for progressive JPEG loads.
    * @platform ios
    */
  var onPartialLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Invoked on download progress with {nativeEvent: {loaded, total}}
    */
  var onProgress: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], scala.Unit]
  ] = js.undefined
}

object ImagePropsIOS {
  @scala.inline
  def apply(
    blurRadius: scala.Int | scala.Double = null,
    capInsets: Insets = null,
    onPartialLoad: js.Function0[scala.Unit] = null,
    onProgress: js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], scala.Unit] = null
  ): ImagePropsIOS = {
    val __obj = js.Dynamic.literal()
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (capInsets != null) __obj.updateDynamic("capInsets")(capInsets)
    if (onPartialLoad != null) __obj.updateDynamic("onPartialLoad")(onPartialLoad)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    __obj.asInstanceOf[ImagePropsIOS]
  }
}

