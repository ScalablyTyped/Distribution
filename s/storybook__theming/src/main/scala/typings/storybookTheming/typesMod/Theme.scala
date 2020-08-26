package typings.storybookTheming.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.anon.Border
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme
  extends /* key */ StringDictionary[js.Any] {
  var animation: Animation = js.native
  var appBorderColor: String = js.native
  var appBorderRadius: Double = js.native
  var background: Background = js.native
  var barBg: String = js.native
  var barSelectedColor: String = js.native
  var barTextColor: String = js.native
  var brand: Brand = js.native
  var code: StringDictionary[String | js.Object] = js.native
  var color: Color = js.native
  var easing: Easing = js.native
  var input: Border = js.native
  var layoutMargin: Double = js.native
  var typography: Typography = js.native
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
    input: Border,
    layoutMargin: Double,
    typography: Typography
  ): Theme = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], appBorderColor = appBorderColor.asInstanceOf[js.Any], appBorderRadius = appBorderRadius.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], barBg = barBg.asInstanceOf[js.Any], barSelectedColor = barSelectedColor.asInstanceOf[js.Any], barTextColor = barTextColor.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layoutMargin = layoutMargin.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppBorderColor(value: String): Self = this.set("appBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppBorderRadius(value: Double): Self = this.set("appBorderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: Background): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarBg(value: String): Self = this.set("barBg", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarSelectedColor(value: String): Self = this.set("barSelectedColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBarTextColor(value: String): Self = this.set("barTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrand(value: Brand): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: StringDictionary[String | js.Object]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Border): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutMargin(value: Double): Self = this.set("layoutMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypography(value: Typography): Self = this.set("typography", value.asInstanceOf[js.Any])
  }
  
}

