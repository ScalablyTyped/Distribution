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
import scala.scalajs.js.annotation._

trait VariablesDefaults extends js.Object {
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
}

