package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedImigixAndSourceProps extends CommonProps {
  var attributeConfig: js.UndefOr[AttributeConfig] = js.native
  var disableLibraryParam: js.UndefOr[Boolean] = js.native
  var disableQualityByDPR: js.UndefOr[Boolean] = js.native
  var disableSrcSet: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var imgixParams: js.UndefOr[ImigixParams] = js.native
  var sizes: js.UndefOr[String] = js.native
  var src: String = js.native
  var width: js.UndefOr[Double] = js.native
}

object SharedImigixAndSourceProps {
  @scala.inline
  def apply(src: String): SharedImigixAndSourceProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImigixAndSourceProps]
  }
  @scala.inline
  implicit class SharedImigixAndSourcePropsOps[Self <: SharedImigixAndSourceProps] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeConfig(value: AttributeConfig): Self = this.set("attributeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeConfig: Self = this.set("attributeConfig", js.undefined)
    @scala.inline
    def setDisableLibraryParam(value: Boolean): Self = this.set("disableLibraryParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLibraryParam: Self = this.set("disableLibraryParam", js.undefined)
    @scala.inline
    def setDisableQualityByDPR(value: Boolean): Self = this.set("disableQualityByDPR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableQualityByDPR: Self = this.set("disableQualityByDPR", js.undefined)
    @scala.inline
    def setDisableSrcSet(value: Boolean): Self = this.set("disableSrcSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSrcSet: Self = this.set("disableSrcSet", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImgixParams(value: ImigixParams): Self = this.set("imgixParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgixParams: Self = this.set("imgixParams", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

