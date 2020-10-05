package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePropsIOS extends js.Object {
  /**
    * blurRadius: the blur radius of the blur filter added to the image
    * @platform ios
    */
  var blurRadius: js.UndefOr[Double] = js.native
  /**
    * When the image is resized, the corners of the size specified by capInsets will stay a fixed size,
    * but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    * More info on Apple documentation
    */
  var capInsets: js.UndefOr[Insets] = js.native
  /**
    * Invoked when a partial load of the image is complete. The definition of
    * what constitutes a "partial load" is loader specific though this is meant
    * for progressive JPEG loads.
    * @platform ios
    */
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Invoked on download progress with {nativeEvent: {loaded, total}}
    */
  var onProgress: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]] = js.native
}

object ImagePropsIOS {
  @scala.inline
  def apply(): ImagePropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropsIOS]
  }
  @scala.inline
  implicit class ImagePropsIOSOps[Self <: ImagePropsIOS] (val x: Self) extends AnyVal {
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
    def setBlurRadius(value: Double): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    @scala.inline
    def setCapInsets(value: Insets): Self = this.set("capInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapInsets: Self = this.set("capInsets", js.undefined)
    @scala.inline
    def setOnPartialLoad(value: () => Unit): Self = this.set("onPartialLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPartialLoad: Self = this.set("onPartialLoad", js.undefined)
    @scala.inline
    def setOnProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
  }
  
}

