package typings.rbx

import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.KinVariablesbreakpointsto
import typings.rbx.baseExoticMod.ForwardRefAsExoticComponent
import typings.rbx.rbxInts.`0`
import typings.rbx.rbxInts.`1`
import typings.rbx.rbxInts.`2`
import typings.rbx.rbxInts.`3`
import typings.rbx.rbxInts.`4`
import typings.rbx.rbxInts.`5`
import typings.rbx.rbxInts.`6`
import typings.rbx.rbxInts.`7`
import typings.rbx.rbxInts.`8`
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridColumnsColumnGroupMod {
  
  object COLUMN_GROUP_DEFAULTS {
    
    @JSImport("rbx/grid/columns/column-group", "COLUMN_GROUP_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/grid/columns/column-group", "COLUMN_GROUP_DEFAULTS.gapSizes")
    @js.native
    def gapSizes: js.Tuple9[`0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`] = js.native
    inline def gapSizes_=(x: js.Tuple9[`0`, `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gapSizes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rbx/grid/columns/column-group", "ColumnGroup")
  @js.native
  val ColumnGroup: ForwardRefAsExoticComponent[typings.rbx.anon.ColumnGroupProps, ElementType[Any]] = js.native
  
  trait ColumnGroupBreakpointOptions extends StObject {
    
    var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  }
  object ColumnGroupBreakpointOptions {
    
    inline def apply(): ColumnGroupBreakpointOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupBreakpointOptions]
    }
    
    extension [Self <: ColumnGroupBreakpointOptions](x: Self) {
      
      inline def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    }
  }
  
  trait ColumnGroupModifierProps extends StObject {
    
    var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
    
    var gapless: js.UndefOr[Boolean] = js.undefined
    
    var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var vcentered: js.UndefOr[Boolean] = js.undefined
    
    var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  }
  object ColumnGroupModifierProps {
    
    inline def apply(): ColumnGroupModifierProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupModifierProps]
    }
    
    extension [Self <: ColumnGroupModifierProps](x: Self) {
      
      inline def setBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setDesktop(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setFullhd(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
      
      inline def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
      
      inline def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      inline def setGapless(value: Boolean): Self = StObject.set(x, "gapless", value.asInstanceOf[js.Any])
      
      inline def setGaplessUndefined: Self = StObject.set(x, "gapless", js.undefined)
      
      inline def setMobile(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setTablet(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setTouch(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setVcentered(value: Boolean): Self = StObject.set(x, "vcentered", value.asInstanceOf[js.Any])
      
      inline def setVcenteredUndefined: Self = StObject.set(x, "vcentered", js.undefined)
      
      inline def setWidescreen(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
    }
  }
  
  trait ColumnGroupProps extends StObject {
    
    var backgroundColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.undefined
    
    var badge: js.UndefOr[Double | String] = js.undefined
    
    var badgeColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var badgeOutlined: js.UndefOr[Boolean] = js.undefined
    
    var badgeRounded: js.UndefOr[Boolean] = js.undefined
    
    var badgeSize: js.UndefOr[small | medium | large] = js.undefined
    
    var breakpoint: js.UndefOr[mobile | tablet | desktop | widescreen | fullhd | touch] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearfix: js.UndefOr[Boolean] = js.undefined
    
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    var desktop: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var fullhd: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var gapSize: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
    
    var gapless: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var marginless: js.UndefOr[Boolean] = js.undefined
    
    var mobile: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var paddingless: js.UndefOr[Boolean] = js.undefined
    
    var pull: js.UndefOr[left | right] = js.undefined
    
    var radiusless: js.UndefOr[Boolean] = js.undefined
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
    
    var shadowless: js.UndefOr[Boolean] = js.undefined
    
    var srOnly: js.UndefOr[Boolean] = js.undefined
    
    var tablet: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var textAlign: js.UndefOr[centered | justified | left | right] = js.undefined
    
    var textColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.undefined
    
    var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.undefined
    
    var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
    
    var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.undefined
    
    var tooltip: js.UndefOr[Double | String] = js.undefined
    
    var tooltipActive: js.UndefOr[Boolean] = js.undefined
    
    var tooltipColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var tooltipMultiline: js.UndefOr[Boolean] = js.undefined
    
    var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.undefined
    
    var touch: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
    
    var unselectable: js.UndefOr[Boolean] = js.undefined
    
    var vcentered: js.UndefOr[Boolean] = js.undefined
    
    var widescreen: js.UndefOr[ColumnGroupBreakpointOptions] = js.undefined
  }
  object ColumnGroupProps {
    
    inline def apply(): ColumnGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    extension [Self <: ColumnGroupProps](x: Self) {
      
      inline def setBackgroundColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBadge(value: Double | String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      inline def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
      
      inline def setBadgeOutlined(value: Boolean): Self = StObject.set(x, "badgeOutlined", value.asInstanceOf[js.Any])
      
      inline def setBadgeOutlinedUndefined: Self = StObject.set(x, "badgeOutlined", js.undefined)
      
      inline def setBadgeRounded(value: Boolean): Self = StObject.set(x, "badgeRounded", value.asInstanceOf[js.Any])
      
      inline def setBadgeRoundedUndefined: Self = StObject.set(x, "badgeRounded", js.undefined)
      
      inline def setBadgeSize(value: small | medium | large): Self = StObject.set(x, "badgeSize", value.asInstanceOf[js.Any])
      
      inline def setBadgeSizeUndefined: Self = StObject.set(x, "badgeSize", js.undefined)
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setBreakpoint(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearfix(value: Boolean): Self = StObject.set(x, "clearfix", value.asInstanceOf[js.Any])
      
      inline def setClearfixUndefined: Self = StObject.set(x, "clearfix", js.undefined)
      
      inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setDesktop(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setFullhd(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
      
      inline def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
      
      inline def setGapSize(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      inline def setGapless(value: Boolean): Self = StObject.set(x, "gapless", value.asInstanceOf[js.Any])
      
      inline def setGaplessUndefined: Self = StObject.set(x, "gapless", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      inline def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      inline def setMarginless(value: Boolean): Self = StObject.set(x, "marginless", value.asInstanceOf[js.Any])
      
      inline def setMarginlessUndefined: Self = StObject.set(x, "marginless", js.undefined)
      
      inline def setMobile(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setPaddingless(value: Boolean): Self = StObject.set(x, "paddingless", value.asInstanceOf[js.Any])
      
      inline def setPaddinglessUndefined: Self = StObject.set(x, "paddingless", js.undefined)
      
      inline def setPull(value: left | right): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setRadiusless(value: Boolean): Self = StObject.set(x, "radiusless", value.asInstanceOf[js.Any])
      
      inline def setRadiuslessUndefined: Self = StObject.set(x, "radiusless", js.undefined)
      
      inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      inline def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      inline def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      inline def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      inline def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
      
      inline def setTablet(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setTextAlign(value: centered | justified | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      inline def setTextTransform(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextWeight(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeight", value.asInstanceOf[js.Any])
      
      inline def setTextWeightUndefined: Self = StObject.set(x, "textWeight", js.undefined)
      
      inline def setTooltip(value: Double | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipActive(value: Boolean): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      inline def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      inline def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "tooltipColor", value.asInstanceOf[js.Any])
      
      inline def setTooltipColorUndefined: Self = StObject.set(x, "tooltipColor", js.undefined)
      
      inline def setTooltipMultiline(value: Boolean): Self = StObject.set(x, "tooltipMultiline", value.asInstanceOf[js.Any])
      
      inline def setTooltipMultilineUndefined: Self = StObject.set(x, "tooltipMultiline", js.undefined)
      
      inline def setTooltipPosition(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      inline def setTooltipResponsive(value: KinVariablesbreakpointsto): Self = StObject.set(x, "tooltipResponsive", value.asInstanceOf[js.Any])
      
      inline def setTooltipResponsiveUndefined: Self = StObject.set(x, "tooltipResponsive", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTouch(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      inline def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      inline def setVcentered(value: Boolean): Self = StObject.set(x, "vcentered", value.asInstanceOf[js.Any])
      
      inline def setVcenteredUndefined: Self = StObject.set(x, "vcentered", js.undefined)
      
      inline def setWidescreen(value: ColumnGroupBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/types.Prefer<rbx.rbx/grid/columns/column-group.ColumnGroupVariablesOverrides, rbx.rbx/grid/columns/column-group.ColumnGroupVariablesDefaults> */
  trait ColumnGroupVariables extends StObject {
    
    var gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`
  }
  object ColumnGroupVariables {
    
    inline def apply(gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): ColumnGroupVariables = {
      val __obj = js.Dynamic.literal(gapSizes = gapSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupVariables]
    }
    
    extension [Self <: ColumnGroupVariables](x: Self) {
      
      inline def setGapSizes(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSizes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnGroupVariablesDefaults extends StObject {
    
    var gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`
  }
  object ColumnGroupVariablesDefaults {
    
    inline def apply(gapSizes: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): ColumnGroupVariablesDefaults = {
      val __obj = js.Dynamic.literal(gapSizes = gapSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupVariablesDefaults]
    }
    
    extension [Self <: ColumnGroupVariablesDefaults](x: Self) {
      
      inline def setGapSizes(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "gapSizes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnGroupVariablesOverrides extends StObject
}
