package typings.reactFoundation.buttonMod

import typings.reactFoundation.enumsMod.ButtonSizes
import typings.reactFoundation.utilsMod.FlexboxPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonPropsCommon extends FlexboxPropTypes {
  var isArrowOnly: js.UndefOr[Boolean] = js.native
  var isDisabled: js.UndefOr[Boolean] = js.native
  var isDropdown: js.UndefOr[Boolean] = js.native
  var isExpanded: js.UndefOr[Boolean] = js.native
  var isHollow: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[ButtonSizes] = js.native
}

object ButtonPropsCommon {
  @scala.inline
  def apply(): ButtonPropsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonPropsCommon]
  }
  @scala.inline
  implicit class ButtonPropsCommonOps[Self <: ButtonPropsCommon] (val x: Self) extends AnyVal {
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
    def setIsArrowOnly(value: Boolean): Self = this.set("isArrowOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsArrowOnly: Self = this.set("isArrowOnly", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsDropdown(value: Boolean): Self = this.set("isDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDropdown: Self = this.set("isDropdown", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setIsHollow(value: Boolean): Self = this.set("isHollow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsHollow: Self = this.set("isHollow", js.undefined)
    @scala.inline
    def setSize(value: ButtonSizes): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

