package typings.rbx.iconIconMod

import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.KinVariablesbreakpointsto
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxStrings.`black-bis`
import typings.rbx.rbxStrings.`black-ter`
import typings.rbx.rbxStrings.`grey-dark`
import typings.rbx.rbxStrings.`grey-darker`
import typings.rbx.rbxStrings.`grey-light`
import typings.rbx.rbxStrings.`grey-lighter`
import typings.rbx.rbxStrings.`white-bis`
import typings.rbx.rbxStrings.`white-ter`
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bold
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.capitalized
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/elements/icon/icon.IconModifierProps */
@js.native
trait IconProps extends js.Object {
  
  var align: js.UndefOr[left | right] = js.native
  
  var backgroundColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.native
  
  var badge: js.UndefOr[Double | String] = js.native
  
  var badgeColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var badgeOutlined: js.UndefOr[Boolean] = js.native
  
  var badgeRounded: js.UndefOr[Boolean] = js.native
  
  var badgeSize: js.UndefOr[small | medium | large] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var clearfix: js.UndefOr[Boolean] = js.native
  
  var clipped: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var invisible: js.UndefOr[Boolean] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var marginless: js.UndefOr[Boolean] = js.native
  
  var overlay: js.UndefOr[Boolean] = js.native
  
  var paddingless: js.UndefOr[Boolean] = js.native
  
  var pull: js.UndefOr[left | right] = js.native
  
  var radiusless: js.UndefOr[Boolean] = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
  
  var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
  
  var shadowless: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
  
  var srOnly: js.UndefOr[Boolean] = js.native
  
  var textAlign: js.UndefOr[centered | justified | left | right] = js.native
  
  var textColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
  ] = js.native
  
  var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  
  var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.native
  
  var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.native
  
  var tooltip: js.UndefOr[Double | String] = js.native
  
  var tooltipActive: js.UndefOr[Boolean] = js.native
  
  var tooltipColor: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.native
  
  var tooltipMultiline: js.UndefOr[Boolean] = js.native
  
  var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.native
  
  var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.native
  
  var unselectable: js.UndefOr[Boolean] = js.native
}
object IconProps {
  
  @scala.inline
  def apply(): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconProps]
  }
  
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBadge(value: Double | String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeColor: Self = this.set("badgeColor", js.undefined)
    
    @scala.inline
    def setBadgeOutlined(value: Boolean): Self = this.set("badgeOutlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeOutlined: Self = this.set("badgeOutlined", js.undefined)
    
    @scala.inline
    def setBadgeRounded(value: Boolean): Self = this.set("badgeRounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeRounded: Self = this.set("badgeRounded", js.undefined)
    
    @scala.inline
    def setBadgeSize(value: small | medium | large): Self = this.set("badgeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadgeSize: Self = this.set("badgeSize", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClearfix(value: Boolean): Self = this.set("clearfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearfix: Self = this.set("clearfix", js.undefined)
    
    @scala.inline
    def setClipped(value: Boolean): Self = this.set("clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipped: Self = this.set("clipped", js.undefined)
    
    @scala.inline
    def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setMarginless(value: Boolean): Self = this.set("marginless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginless: Self = this.set("marginless", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPaddingless(value: Boolean): Self = this.set("paddingless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingless: Self = this.set("paddingless", js.undefined)
    
    @scala.inline
    def setPull(value: left | right): Self = this.set("pull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePull: Self = this.set("pull", js.undefined)
    
    @scala.inline
    def setRadiusless(value: Boolean): Self = this.set("radiusless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusless: Self = this.set("radiusless", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setResponsive(value: BinVariablesbreakpointsLi): Self = this.set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    
    @scala.inline
    def setShadowless(value: Boolean): Self = this.set("shadowless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowless: Self = this.set("shadowless", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSrOnly(value: Boolean): Self = this.set("srOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrOnly: Self = this.set("srOnly", js.undefined)
    
    @scala.inline
    def setTextAlign(value: centered | justified | left | right): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextColor(
      value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = this.set("textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
    
    @scala.inline
    def setTextTransform(value: capitalized | lowercase | uppercase): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
    
    @scala.inline
    def setTextWeight(value: light | medium | normal | semibold | bold): Self = this.set("textWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWeight: Self = this.set("textWeight", js.undefined)
    
    @scala.inline
    def setTooltip(value: Double | String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipActive(value: Boolean): Self = this.set("tooltipActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipActive: Self = this.set("tooltipActive", js.undefined)
    
    @scala.inline
    def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("tooltipColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipColor: Self = this.set("tooltipColor", js.undefined)
    
    @scala.inline
    def setTooltipMultiline(value: Boolean): Self = this.set("tooltipMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipMultiline: Self = this.set("tooltipMultiline", js.undefined)
    
    @scala.inline
    def setTooltipPosition(value: top | right | bottom | left): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    
    @scala.inline
    def setTooltipResponsive(value: KinVariablesbreakpointsto): Self = this.set("tooltipResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipResponsive: Self = this.set("tooltipResponsive", js.undefined)
    
    @scala.inline
    def setUnselectable(value: Boolean): Self = this.set("unselectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectable: Self = this.set("unselectable", js.undefined)
  }
}
