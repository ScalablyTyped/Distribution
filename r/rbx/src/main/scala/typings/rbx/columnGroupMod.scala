package typings.rbx

import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.KinVariablesbreakpointsto
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.rbxNumbers.`0`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
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
import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.tablet
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import typings.rbx.rbxStrings.widescreen
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnGroupMod {
  
  object COLUMN_GROUP_DEFAULTS {
    
    @JSImport("rbx/grid/columns/column-group", "COLUMN_GROUP_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/grid/columns/column-group", "COLUMN_GROUP_DEFAULTS.gapSizes")
    @js.native
    def gapSizes: js.Tuple9[`0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`] = js.native
    @scala.inline
    def gapSizes_=(x: js.Tuple9[`0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapSizes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rbx/grid/columns/column-group", "ColumnGroup")
  @js.native
  val ColumnGroup: ForwardRefAsExoticComponent[typings.rbx.anon.ColumnGroupProps, ElementType[js.Any]] = js.native
  
  @js.native
  trait ColumnGroupBreakpointOptions extends StObject {
    
    var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  }
  object ColumnGroupBreakpointOptions {
    
    @scala.inline
    def apply(): ColumnGroupBreakpointOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupBreakpointOptions]
    }
    
    @scala.inline
    implicit class ColumnGroupBreakpointOptionsMutableBuilder[Self <: ColumnGroupBreakpointOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    }
  }
  
  @js.native
  trait ColumnGroupModifierProps extends StObject {
    
    var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.native
    
    var centered: js.UndefOr[Boolean] = js.native
    
    var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
    
    var gapless: js.UndefOr[Boolean] = js.native
    
    var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var multiline: js.UndefOr[Boolean] = js.native
    
    var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var vcentered: js.UndefOr[Boolean] = js.native
    
    var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  }
  object ColumnGroupModifierProps {
    
    @scala.inline
    def apply(): ColumnGroupModifierProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupModifierProps]
    }
    
    @scala.inline
    implicit class ColumnGroupModifierPropsMutableBuilder[Self <: ColumnGroupModifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setDesktop(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setFullhd(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
      
      @scala.inline
      def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      @scala.inline
      def setGapless(value: Boolean): Self = StObject.set(x, "gapless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaplessUndefined: Self = StObject.set(x, "gapless", js.undefined)
      
      @scala.inline
      def setMobile(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setTablet(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      @scala.inline
      def setTouch(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setVcentered(value: Boolean): Self = StObject.set(x, "vcentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVcenteredUndefined: Self = StObject.set(x, "vcentered", js.undefined)
      
      @scala.inline
      def setWidescreen(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
    }
  }
  
  @js.native
  trait ColumnGroupProps extends StObject {
    
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
    
    var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.native
    
    var centered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var clearfix: js.UndefOr[Boolean] = js.native
    
    var clipped: js.UndefOr[Boolean] = js.native
    
    var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
    
    var gapless: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var invisible: js.UndefOr[Boolean] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var marginless: js.UndefOr[Boolean] = js.native
    
    var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var multiline: js.UndefOr[Boolean] = js.native
    
    var overlay: js.UndefOr[Boolean] = js.native
    
    var paddingless: js.UndefOr[Boolean] = js.native
    
    var pull: js.UndefOr[left | right] = js.native
    
    var radiusless: js.UndefOr[Boolean] = js.native
    
    var relative: js.UndefOr[Boolean] = js.native
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.native
    
    var shadowless: js.UndefOr[Boolean] = js.native
    
    var srOnly: js.UndefOr[Boolean] = js.native
    
    var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
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
    
    var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
    
    var unselectable: js.UndefOr[Boolean] = js.native
    
    var vcentered: js.UndefOr[Boolean] = js.native
    
    var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.native
  }
  object ColumnGroupProps {
    
    @scala.inline
    def apply(): ColumnGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    @scala.inline
    implicit class ColumnGroupPropsMutableBuilder[Self <: ColumnGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBadge(value: Double | String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
      
      @scala.inline
      def setBadgeOutlined(value: Boolean): Self = StObject.set(x, "badgeOutlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeOutlinedUndefined: Self = StObject.set(x, "badgeOutlined", js.undefined)
      
      @scala.inline
      def setBadgeRounded(value: Boolean): Self = StObject.set(x, "badgeRounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRoundedUndefined: Self = StObject.set(x, "badgeRounded", js.undefined)
      
      @scala.inline
      def setBadgeSize(value: small | medium | large): Self = StObject.set(x, "badgeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeSizeUndefined: Self = StObject.set(x, "badgeSize", js.undefined)
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearfix(value: Boolean): Self = StObject.set(x, "clearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearfixUndefined: Self = StObject.set(x, "clearfix", js.undefined)
      
      @scala.inline
      def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      @scala.inline
      def setDesktop(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      @scala.inline
      def setFullhd(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
      
      @scala.inline
      def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      @scala.inline
      def setGapless(value: Boolean): Self = StObject.set(x, "gapless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGaplessUndefined: Self = StObject.set(x, "gapless", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setMarginless(value: Boolean): Self = StObject.set(x, "marginless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginlessUndefined: Self = StObject.set(x, "marginless", js.undefined)
      
      @scala.inline
      def setMobile(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPaddingless(value: Boolean): Self = StObject.set(x, "paddingless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddinglessUndefined: Self = StObject.set(x, "paddingless", js.undefined)
      
      @scala.inline
      def setPull(value: left | right): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      @scala.inline
      def setRadiusless(value: Boolean): Self = StObject.set(x, "radiusless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiuslessUndefined: Self = StObject.set(x, "radiusless", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      @scala.inline
      def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
      
      @scala.inline
      def setTablet(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      @scala.inline
      def setTextAlign(value: centered | justified | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      @scala.inline
      def setTextTransform(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      @scala.inline
      def setTextWeight(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWeightUndefined: Self = StObject.set(x, "textWeight", js.undefined)
      
      @scala.inline
      def setTooltip(value: Double | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActive(value: Boolean): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      @scala.inline
      def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "tooltipColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipColorUndefined: Self = StObject.set(x, "tooltipColor", js.undefined)
      
      @scala.inline
      def setTooltipMultiline(value: Boolean): Self = StObject.set(x, "tooltipMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipMultilineUndefined: Self = StObject.set(x, "tooltipMultiline", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      @scala.inline
      def setTooltipResponsive(value: KinVariablesbreakpointsto): Self = StObject.set(x, "tooltipResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipResponsiveUndefined: Self = StObject.set(x, "tooltipResponsive", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTouch(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setVcentered(value: Boolean): Self = StObject.set(x, "vcentered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVcenteredUndefined: Self = StObject.set(x, "vcentered", js.undefined)
      
      @scala.inline
      def setWidescreen(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/types.Prefer<rbx.rbx/grid/columns/column-group.ColumnGroupVariablesOverrides, rbx.rbx/grid/columns/column-group.ColumnGroupVariablesDefaults> */
  @js.native
  trait ColumnGroupVariables extends StObject {
    
    var gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = js.native
  }
  object ColumnGroupVariables {
    
    @scala.inline
    def apply(gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): ColumnGroupVariables = {
      val __obj = js.Dynamic.literal(gapSizes = gapSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupVariables]
    }
    
    @scala.inline
    implicit class ColumnGroupVariablesMutableBuilder[Self <: ColumnGroupVariables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGapSizes(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSizes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnGroupVariablesDefaults extends StObject {
    
    var gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = js.native
  }
  object ColumnGroupVariablesDefaults {
    
    @scala.inline
    def apply(gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): ColumnGroupVariablesDefaults = {
      val __obj = js.Dynamic.literal(gapSizes = gapSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupVariablesDefaults]
    }
    
    @scala.inline
    implicit class ColumnGroupVariablesDefaultsMutableBuilder[Self <: ColumnGroupVariablesDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGapSizes(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSizes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ColumnGroupVariablesOverrides extends StObject
}
