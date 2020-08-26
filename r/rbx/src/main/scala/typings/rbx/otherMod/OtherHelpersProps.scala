package typings.rbx.otherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherHelpersProps extends js.Object {
  var marginless: js.UndefOr[Boolean] = js.native
  var paddingless: js.UndefOr[Boolean] = js.native
  var radiusless: js.UndefOr[Boolean] = js.native
  var relative: js.UndefOr[Boolean] = js.native
  var shadowless: js.UndefOr[Boolean] = js.native
  var unselectable: js.UndefOr[Boolean] = js.native
}

object OtherHelpersProps {
  @scala.inline
  def apply(): OtherHelpersProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherHelpersProps]
  }
  @scala.inline
  implicit class OtherHelpersPropsOps[Self <: OtherHelpersProps] (val x: Self) extends AnyVal {
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
    def setMarginless(value: Boolean): Self = this.set("marginless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginless: Self = this.set("marginless", js.undefined)
    @scala.inline
    def setPaddingless(value: Boolean): Self = this.set("paddingless", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingless: Self = this.set("paddingless", js.undefined)
    @scala.inline
    def setRadiusless(value: Boolean): Self = this.set("radiusless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiusless: Self = this.set("radiusless", js.undefined)
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    @scala.inline
    def setShadowless(value: Boolean): Self = this.set("shadowless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowless: Self = this.set("shadowless", js.undefined)
    @scala.inline
    def setUnselectable(value: Boolean): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
  }
  
}

