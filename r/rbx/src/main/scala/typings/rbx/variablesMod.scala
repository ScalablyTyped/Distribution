package typings.rbx

import typings.rbx.anon.ReadonlyArraystringnumber
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
import typings.rbx.rbxStrings.`inline-block`
import typings.rbx.rbxStrings.`inline-flex`
import typings.rbx.rbxStrings.`inline`
import typings.rbx.rbxStrings.`white-bis`
import typings.rbx.rbxStrings.`white-ter`
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.block
import typings.rbx.rbxStrings.bold
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.capitalized
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.flex
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variablesMod {
  
  object DEFAULTS {
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.badgeSizes")
    @js.native
    def badgeSizes: js.Tuple3[small, medium, large] = js.native
    @scala.inline
    def badgeSizes_=(x: js.Tuple3[small, medium, large]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badgeSizes")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.breakpoints")
    @js.native
    def breakpoints: js.Tuple6[mobile, tablet, desktop, widescreen, fullhd, touch] = js.native
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.breakpointsLimited")
    @js.native
    def breakpointsLimited: js.Tuple3[mobile, fullhd, touch] = js.native
    @scala.inline
    def breakpointsLimited_=(x: js.Tuple3[mobile, fullhd, touch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakpointsLimited")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def breakpoints_=(x: js.Tuple6[mobile, tablet, desktop, widescreen, fullhd, touch]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.colors")
    @js.native
    def colors: js.Tuple10[primary, success, info, warning, danger, light, dark, white, black, link] = js.native
    @scala.inline
    def colors_=(x: js.Tuple10[primary, success, info, warning, danger, light, dark, white, black, link]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.displays")
    @js.native
    def displays: js.Tuple5[block, flex, `inline`, `inline-block`, `inline-flex`] = js.native
    @scala.inline
    def displays_=(x: js.Tuple5[block, flex, `inline`, `inline-block`, `inline-flex`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displays")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.floatPulledAlignments")
    @js.native
    def floatPulledAlignments: js.Tuple2[left, right] = js.native
    @scala.inline
    def floatPulledAlignments_=(x: js.Tuple2[left, right]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("floatPulledAlignments")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.shades")
    @js.native
    def shades: js.Tuple9[
        `black-bis`, 
        `black-ter`, 
        `grey-darker`, 
        `grey-dark`, 
        grey, 
        `grey-light`, 
        `grey-lighter`, 
        `white-ter`, 
        `white-bis`
      ] = js.native
    @scala.inline
    def shades_=(
      x: js.Tuple9[
          `black-bis`, 
          `black-ter`, 
          `grey-darker`, 
          `grey-dark`, 
          grey, 
          `grey-light`, 
          `grey-lighter`, 
          `white-ter`, 
          `white-bis`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shades")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.textAlignments")
    @js.native
    def textAlignments: js.Tuple4[centered, justified, left, right] = js.native
    @scala.inline
    def textAlignments_=(x: js.Tuple4[centered, justified, left, right]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textAlignments")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.textSizes")
    @js.native
    def textSizes: js.Tuple7[`1`, `2`, `3`, `4`, `5`, `6`, `7`] = js.native
    @scala.inline
    def textSizes_=(x: js.Tuple7[`1`, `2`, `3`, `4`, `5`, `6`, `7`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textSizes")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.textTransforms")
    @js.native
    def textTransforms: js.Tuple3[capitalized, lowercase, uppercase] = js.native
    @scala.inline
    def textTransforms_=(x: js.Tuple3[capitalized, lowercase, uppercase]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textTransforms")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.textWeights")
    @js.native
    def textWeights: js.Tuple5[light, medium, normal, semibold, bold] = js.native
    @scala.inline
    def textWeights_=(x: js.Tuple5[light, medium, normal, semibold, bold]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textWeights")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/base/helpers/variables", "DEFAULTS.tooltipPositions")
    @js.native
    def tooltipPositions: js.Tuple4[top, right, bottom, left] = js.native
    @scala.inline
    def tooltipPositions_=(x: js.Tuple4[top, right, bottom, left]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipPositions")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined rbx.rbx/types.Prefer<rbx.rbx/base/helpers/variables.VariablesOverrides, rbx.rbx/base/helpers/variables.VariablesDefaults> */
  trait Variables extends StObject {
    
    var badgeSizes: small | medium | large
    
    var breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch
    
    var breakpointsLimited: mobile | fullhd | touch
    
    var colors: primary | success | info | warning | danger | light | dark | white | black | link
    
    var displays: block | flex | `inline` | `inline-block` | `inline-flex`
    
    var floatPulledAlignments: left | right
    
    var shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    
    var textAlignments: centered | justified | left | right
    
    var textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7`
    
    var textTransforms: capitalized | lowercase | uppercase
    
    var textWeights: light | medium | normal | semibold | bold
    
    var tooltipPositions: top | right | bottom | left
  }
  object Variables {
    
    @scala.inline
    def apply(
      badgeSizes: small | medium | large,
      breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch,
      breakpointsLimited: mobile | fullhd | touch,
      colors: primary | success | info | warning | danger | light | dark | white | black | link,
      displays: block | flex | `inline` | `inline-block` | `inline-flex`,
      floatPulledAlignments: left | right,
      shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`,
      textAlignments: centered | justified | left | right,
      textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7`,
      textTransforms: capitalized | lowercase | uppercase,
      textWeights: light | medium | normal | semibold | bold,
      tooltipPositions: top | right | bottom | left
    ): Variables = {
      val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variables]
    }
    
    @scala.inline
    implicit class VariablesMutableBuilder[Self <: Variables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadgeSizes(value: small | medium | large): Self = StObject.set(x, "badgeSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpoints(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsLimited(value: mobile | fullhd | touch): Self = StObject.set(x, "breakpointsLimited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplays(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatPulledAlignments(value: left | right): Self = StObject.set(x, "floatPulledAlignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShades(
        value: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "shades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignments(value: centered | justified | left | right): Self = StObject.set(x, "textAlignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizes(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "textSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransforms(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWeights(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositions(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPositions", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariablesDefaults extends StObject {
    
    var badgeSizes: small | medium | large
    
    var breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch
    
    var breakpointsLimited: mobile | fullhd | touch
    
    var colors: primary | success | info | warning | danger | light | dark | white | black | link
    
    var displays: block | flex | `inline` | `inline-block` | `inline-flex`
    
    var floatPulledAlignments: left | right
    
    var shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    
    var textAlignments: centered | justified | left | right
    
    var textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7`
    
    var textTransforms: capitalized | lowercase | uppercase
    
    var textWeights: light | medium | normal | semibold | bold
    
    var tooltipPositions: top | right | bottom | left
  }
  object VariablesDefaults {
    
    @scala.inline
    def apply(
      badgeSizes: small | medium | large,
      breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch,
      breakpointsLimited: mobile | fullhd | touch,
      colors: primary | success | info | warning | danger | light | dark | white | black | link,
      displays: block | flex | `inline` | `inline-block` | `inline-flex`,
      floatPulledAlignments: left | right,
      shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`,
      textAlignments: centered | justified | left | right,
      textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7`,
      textTransforms: capitalized | lowercase | uppercase,
      textWeights: light | medium | normal | semibold | bold,
      tooltipPositions: top | right | bottom | left
    ): VariablesDefaults = {
      val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariablesDefaults]
    }
    
    @scala.inline
    implicit class VariablesDefaultsMutableBuilder[Self <: VariablesDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadgeSizes(value: small | medium | large): Self = StObject.set(x, "badgeSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpoints(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsLimited(value: mobile | fullhd | touch): Self = StObject.set(x, "breakpointsLimited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplays(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatPulledAlignments(value: left | right): Self = StObject.set(x, "floatPulledAlignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShades(
        value: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "shades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignments(value: centered | justified | left | right): Self = StObject.set(x, "textAlignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizes(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "textSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransforms(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWeights(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositions(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPositions", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariablesDefinitions extends StObject {
    
    var badgeSizes: ReadonlyArraystringnumber
    
    var breakpoints: ReadonlyArraystringnumber
    
    var breakpointsLimited: ReadonlyArraystringnumber
    
    var colors: ReadonlyArraystringnumber
    
    var displays: ReadonlyArraystringnumber
    
    var floatPulledAlignments: ReadonlyArraystringnumber
    
    var shades: ReadonlyArraystringnumber
    
    var textAlignments: ReadonlyArraystringnumber
    
    var textSizes: ReadonlyArraystringnumber
    
    var textTransforms: ReadonlyArraystringnumber
    
    var textWeights: ReadonlyArraystringnumber
    
    var tooltipPositions: ReadonlyArraystringnumber
  }
  object VariablesDefinitions {
    
    @scala.inline
    def apply(
      badgeSizes: ReadonlyArraystringnumber,
      breakpoints: ReadonlyArraystringnumber,
      breakpointsLimited: ReadonlyArraystringnumber,
      colors: ReadonlyArraystringnumber,
      displays: ReadonlyArraystringnumber,
      floatPulledAlignments: ReadonlyArraystringnumber,
      shades: ReadonlyArraystringnumber,
      textAlignments: ReadonlyArraystringnumber,
      textSizes: ReadonlyArraystringnumber,
      textTransforms: ReadonlyArraystringnumber,
      textWeights: ReadonlyArraystringnumber,
      tooltipPositions: ReadonlyArraystringnumber
    ): VariablesDefinitions = {
      val __obj = js.Dynamic.literal(badgeSizes = badgeSizes.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], breakpointsLimited = breakpointsLimited.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], floatPulledAlignments = floatPulledAlignments.asInstanceOf[js.Any], shades = shades.asInstanceOf[js.Any], textAlignments = textAlignments.asInstanceOf[js.Any], textSizes = textSizes.asInstanceOf[js.Any], textTransforms = textTransforms.asInstanceOf[js.Any], textWeights = textWeights.asInstanceOf[js.Any], tooltipPositions = tooltipPositions.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariablesDefinitions]
    }
    
    @scala.inline
    implicit class VariablesDefinitionsMutableBuilder[Self <: VariablesDefinitions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadgeSizes(value: ReadonlyArraystringnumber): Self = StObject.set(x, "badgeSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpoints(value: ReadonlyArraystringnumber): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsLimited(value: ReadonlyArraystringnumber): Self = StObject.set(x, "breakpointsLimited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors(value: ReadonlyArraystringnumber): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplays(value: ReadonlyArraystringnumber): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatPulledAlignments(value: ReadonlyArraystringnumber): Self = StObject.set(x, "floatPulledAlignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShades(value: ReadonlyArraystringnumber): Self = StObject.set(x, "shades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignments(value: ReadonlyArraystringnumber): Self = StObject.set(x, "textAlignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizes(value: ReadonlyArraystringnumber): Self = StObject.set(x, "textSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransforms(value: ReadonlyArraystringnumber): Self = StObject.set(x, "textTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWeights(value: ReadonlyArraystringnumber): Self = StObject.set(x, "textWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositions(value: ReadonlyArraystringnumber): Self = StObject.set(x, "tooltipPositions", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariablesOverrides extends StObject
}
