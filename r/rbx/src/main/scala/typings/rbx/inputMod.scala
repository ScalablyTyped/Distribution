package typings.rbx

import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.KinVariablesbreakpointsto
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
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
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.date
import typings.rbx.rbxStrings.email
import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.number
import typings.rbx.rbxStrings.password
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.search
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.tel
import typings.rbx.rbxStrings.text
import typings.rbx.rbxStrings.time
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  object INPUT_DEFAULTS {
    
    @JSImport("rbx/elements/form/input", "INPUT_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/elements/form/input", "INPUT_DEFAULTS.sizes")
    @js.native
    def sizes: js.Tuple3[small, medium, large] = js.native
    @scala.inline
    def sizes_=(x: js.Tuple3[small, medium, large]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sizes")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/input", "INPUT_DEFAULTS.states")
    @js.native
    def states: js.Tuple2[focused, hovered] = js.native
    @scala.inline
    def states_=(x: js.Tuple2[focused, hovered]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("states")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/input", "INPUT_DEFAULTS.types")
    @js.native
    def types: js.Tuple9[text, email, tel, password, number, search, color, date, time] = js.native
    @scala.inline
    def types_=(x: js.Tuple9[text, email, tel, password, number, search, color, date, time]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rbx/elements/form/input", "Input")
  @js.native
  val Input: ForwardRefAsExoticComponent[InputProps, ElementType[js.Any]] = js.native
  
  trait InputModifierProps extends StObject {
    
    var color: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var state: js.UndefOr[focused | hovered] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[text | email | tel | password | number | search | color | date | time] = js.undefined
  }
  object InputModifierProps {
    
    @scala.inline
    def apply(): InputModifierProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputModifierProps]
    }
    
    @scala.inline
    implicit class InputModifierPropsMutableBuilder[Self <: InputModifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setState(value: focused | hovered): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      @scala.inline
      def setType(value: text | email | tel | password | number | search | color | date | time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/elements/form/input.InputModifierProps */
  trait InputProps extends StObject {
    
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
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearfix: js.UndefOr[Boolean] = js.undefined
    
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var marginless: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var paddingless: js.UndefOr[Boolean] = js.undefined
    
    var pull: js.UndefOr[left | right] = js.undefined
    
    var radiusless: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var shadowless: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var srOnly: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[focused | hovered] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
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
    
    var `type`: js.UndefOr[text | email | tel | password | number | search | color | date | time] = js.undefined
    
    var unselectable: js.UndefOr[Boolean] = js.undefined
  }
  object InputProps {
    
    @scala.inline
    def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
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
      def setColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
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
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
      
      @scala.inline
      def setState(value: focused | hovered): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
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
      def setType(value: text | email | tel | password | number | search | color | date | time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/input.InputVariablesOverrides, rbx.rbx/elements/form/input.InputVariablesDefaults> */
  trait InputVariables extends StObject {
    
    var sizes: small | medium | large
    
    var states: focused | hovered
    
    var types: text | email | tel | password | number | search | color | date | time
  }
  object InputVariables {
    
    @scala.inline
    def apply(
      sizes: small | medium | large,
      states: focused | hovered,
      types: text | email | tel | password | number | search | color | date | time
    ): InputVariables = {
      val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputVariables]
    }
    
    @scala.inline
    implicit class InputVariablesMutableBuilder[Self <: InputVariables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSizes(value: small | medium | large): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStates(value: focused | hovered): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: text | email | tel | password | number | search | color | date | time): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputVariablesDefaults extends StObject {
    
    var sizes: small | medium | large
    
    var states: focused | hovered
    
    var types: text | email | tel | password | number | search | color | date | time
  }
  object InputVariablesDefaults {
    
    @scala.inline
    def apply(
      sizes: small | medium | large,
      states: focused | hovered,
      types: text | email | tel | password | number | search | color | date | time
    ): InputVariablesDefaults = {
      val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputVariablesDefaults]
    }
    
    @scala.inline
    implicit class InputVariablesDefaultsMutableBuilder[Self <: InputVariablesDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSizes(value: small | medium | large): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStates(value: focused | hovered): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: text | email | tel | password | number | search | color | date | time): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputVariablesOverrides extends StObject
}
