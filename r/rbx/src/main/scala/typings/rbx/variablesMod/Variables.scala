package typings.rbx.variablesMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/base/helpers/variables.VariablesOverrides, rbx.rbx/base/helpers/variables.VariablesDefaults> */
@js.native
trait Variables extends js.Object {
  
  var badgeSizes: small | medium | large = js.native
  
  var breakpoints: mobile | tablet | desktop | widescreen | fullhd | touch = js.native
  
  var breakpointsLimited: mobile | fullhd | touch = js.native
  
  var colors: primary | success | info | warning | danger | light | dark | white | black | link = js.native
  
  var displays: block | flex | `inline` | `inline-block` | `inline-flex` = js.native
  
  var floatPulledAlignments: left | right = js.native
  
  var shades: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis` = js.native
  
  var textAlignments: centered | justified | left | right = js.native
  
  var textSizes: `1` | `2` | `3` | `4` | `5` | `6` | `7` = js.native
  
  var textTransforms: capitalized | lowercase | uppercase = js.native
  
  var textWeights: light | medium | normal | semibold | bold = js.native
  
  var tooltipPositions: top | right | bottom | left = js.native
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
  implicit class VariablesOps[Self <: Variables] (val x: Self) extends AnyVal {
    
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
    def setBadgeSizes(value: small | medium | large): Self = this.set("badgeSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpoints(value: mobile | tablet | desktop | widescreen | fullhd | touch): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsLimited(value: mobile | fullhd | touch): Self = this.set("breakpointsLimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColors(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplays(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = this.set("displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatPulledAlignments(value: left | right): Self = this.set("floatPulledAlignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShades(
      value: `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
    ): Self = this.set("shades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignments(value: centered | justified | left | right): Self = this.set("textAlignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizes(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = this.set("textSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTransforms(value: capitalized | lowercase | uppercase): Self = this.set("textTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextWeights(value: light | medium | normal | semibold | bold): Self = this.set("textWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPositions(value: top | right | bottom | left): Self = this.set("tooltipPositions", value.asInstanceOf[js.Any])
  }
}
