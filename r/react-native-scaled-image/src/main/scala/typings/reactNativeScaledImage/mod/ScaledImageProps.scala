package typings.reactNativeScaledImage.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaledImageProps extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var source: ImageSourcePropType = js.native
  var style: js.UndefOr[StyleProp[ImageStyle]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ScaledImageProps {
  @scala.inline
  def apply(source: ImageSourcePropType): ScaledImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledImageProps]
  }
  @scala.inline
  implicit class ScaledImagePropsOps[Self <: ScaledImageProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ImageStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

