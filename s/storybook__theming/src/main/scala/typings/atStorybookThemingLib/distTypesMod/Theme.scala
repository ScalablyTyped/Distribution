package typings
package atStorybookThemingLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var animation: Animation
  var appBorderColor: java.lang.String
  var appBorderRadius: scala.Double
  var background: Background
  var barBg: java.lang.String
  var barSelectedColor: java.lang.String
  var barTextColor: java.lang.String
  var brand: Brand
  var code: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Object]
  var color: Color
  var easing: Easing
  var input: atStorybookThemingLib.Anon_BackgroundBorder
  var layoutMargin: scala.Double
  var typography: Typography
}

object Theme {
  @scala.inline
  def apply(
    animation: Animation,
    appBorderColor: java.lang.String,
    appBorderRadius: scala.Double,
    background: Background,
    barBg: java.lang.String,
    barSelectedColor: java.lang.String,
    barTextColor: java.lang.String,
    brand: Brand,
    code: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Object],
    color: Color,
    easing: Easing,
    input: atStorybookThemingLib.Anon_BackgroundBorder,
    layoutMargin: scala.Double,
    typography: Typography,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Theme = {
    val __obj = js.Dynamic.literal(animation = animation, appBorderColor = appBorderColor, appBorderRadius = appBorderRadius, background = background, barBg = barBg, barSelectedColor = barSelectedColor, barTextColor = barTextColor, brand = brand, code = code, color = color, easing = easing, input = input, layoutMargin = layoutMargin, typography = typography)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Theme]
  }
}

