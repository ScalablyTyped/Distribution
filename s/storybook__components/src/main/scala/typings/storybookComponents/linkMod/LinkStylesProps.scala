package typings.storybookComponents.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkStylesProps extends js.Object {
  var inverse: js.UndefOr[Boolean] = js.native
  var isButton: js.UndefOr[Boolean] = js.native
  var nochrome: js.UndefOr[Boolean] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
  var tertiary: js.UndefOr[Boolean] = js.native
}

object LinkStylesProps {
  @scala.inline
  def apply(): LinkStylesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkStylesProps]
  }
  @scala.inline
  implicit class LinkStylesPropsOps[Self <: LinkStylesProps] (val x: Self) extends AnyVal {
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
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    @scala.inline
    def setIsButton(value: Boolean): Self = this.set("isButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsButton: Self = this.set("isButton", js.undefined)
    @scala.inline
    def setNochrome(value: Boolean): Self = this.set("nochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNochrome: Self = this.set("nochrome", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    @scala.inline
    def setTertiary(value: Boolean): Self = this.set("tertiary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiary: Self = this.set("tertiary", js.undefined)
  }
  
}

