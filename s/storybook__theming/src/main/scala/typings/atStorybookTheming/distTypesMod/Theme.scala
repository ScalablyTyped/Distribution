package typings.atStorybookTheming.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookTheming.Anon_BackgroundBorder
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
  var input: Anon_BackgroundBorder
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
    input: Anon_BackgroundBorder,
    layoutMargin: Double,
    typography: Typography,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Theme = {
    val __obj = js.Dynamic.literal(animation = animation, appBorderColor = appBorderColor, appBorderRadius = appBorderRadius, background = background, barBg = barBg, barSelectedColor = barSelectedColor, barTextColor = barTextColor, brand = brand, code = code, color = color, easing = easing, input = input, layoutMargin = layoutMargin, typography = typography)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Theme]
  }
}

