package typings.storybookTheming.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.AnonBackgroundBorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme
  extends /* key */ StringDictionary[js.Any] {
  var animation: Animation
  var appBorderColor: String
  var appBorderRadius: Double
  var background: Background
  var barBg: String
  var barSelectedColor: String
  var barTextColor: String
  var brand: Brand
  var code: StringDictionary[String | js.Object]
  var color: Color
  var easing: Easing
  var input: AnonBackgroundBorder
  var layoutMargin: Double
  var typography: Typography
}

object Theme {
  @scala.inline
  def apply(
    animation: Animation,
    appBorderColor: String,
    appBorderRadius: Double,
    background: Background,
    barBg: String,
    barSelectedColor: String,
    barTextColor: String,
    brand: Brand,
    code: StringDictionary[String | js.Object],
    color: Color,
    easing: Easing,
    input: AnonBackgroundBorder,
    layoutMargin: Double,
    typography: Typography,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Theme = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], appBorderColor = appBorderColor.asInstanceOf[js.Any], appBorderRadius = appBorderRadius.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], barBg = barBg.asInstanceOf[js.Any], barSelectedColor = barSelectedColor.asInstanceOf[js.Any], barTextColor = barTextColor.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layoutMargin = layoutMargin.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Theme]
  }
}

