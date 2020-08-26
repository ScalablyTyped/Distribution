package typings.reactImageMagnify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmallImageType extends CommonImageType {
  var alt: js.UndefOr[String] = js.native
  /**
    * Required if isFluidWidth is not set
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Default: false
    */
  var isFluidWidth: Boolean = js.native
  /**
    * Required if isFluidWidth is not set
    */
  var width: js.UndefOr[Double] = js.native
}

object SmallImageType {
  @scala.inline
  def apply(isFluidWidth: Boolean, src: String): SmallImageType = {
    val __obj = js.Dynamic.literal(isFluidWidth = isFluidWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallImageType]
  }
  @scala.inline
  implicit class SmallImageTypeOps[Self <: SmallImageType] (val x: Self) extends AnyVal {
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
    def setIsFluidWidth(value: Boolean): Self = this.set("isFluidWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

