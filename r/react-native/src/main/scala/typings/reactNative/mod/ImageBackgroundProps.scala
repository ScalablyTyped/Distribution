package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageBackgroundProps extends ImagePropsBase {
  var imageRef: js.UndefOr[js.Function1[/* image */ Image, Unit]] = js.native
  var imageStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object ImageBackgroundProps {
  @scala.inline
  def apply(source: ImageSourcePropType): ImageBackgroundProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBackgroundProps]
  }
  @scala.inline
  implicit class ImageBackgroundPropsOps[Self <: ImageBackgroundProps] (val x: Self) extends AnyVal {
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
    def setImageRef(value: /* image */ Image => Unit): Self = this.set("imageRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteImageRef: Self = this.set("imageRef", js.undefined)
    @scala.inline
    def setImageStyle(value: StyleProp[ImageStyle]): Self = this.set("imageStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageStyle: Self = this.set("imageStyle", js.undefined)
    @scala.inline
    def setImageStyleNull: Self = this.set("imageStyle", null)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

