package typings.reactNativeSvg.mod

import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProps
  extends ResponderProps
     with CommonMaskProps
     with ClipProps
     with TouchableProps {
  var height: js.UndefOr[NumberProp] = js.native
  var href: js.UndefOr[ImageSourcePropType] = js.native
  var id: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[NumberProp] = js.native
  var preserveAspectRatio: js.UndefOr[String] = js.native
  var width: js.UndefOr[NumberProp] = js.native
  var x: js.UndefOr[NumberProp] = js.native
  var xlinkHref: js.UndefOr[ImageSourcePropType] = js.native
  var y: js.UndefOr[NumberProp] = js.native
}

object ImageProps {
  @scala.inline
  def apply(): ImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProps]
  }
  @scala.inline
  implicit class ImagePropsOps[Self <: ImageProps] (val x: Self) extends AnyVal {
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
    def setHeight(value: NumberProp): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHrefVarargs(value: ImageURISource*): Self = this.set("href", js.Array(value :_*))
    @scala.inline
    def setHref(value: ImageSourcePropType): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOpacity(value: NumberProp): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    @scala.inline
    def setWidth(value: NumberProp): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: NumberProp): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setXlinkHrefVarargs(value: ImageURISource*): Self = this.set("xlinkHref", js.Array(value :_*))
    @scala.inline
    def setXlinkHref(value: ImageSourcePropType): Self = this.set("xlinkHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkHref: Self = this.set("xlinkHref", js.undefined)
    @scala.inline
    def setY(value: NumberProp): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

