package typings.storybookTheming.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var ancillary: String = js.native
  var border: String = js.native
  var critical: String = js.native
  var dark: String = js.native
  var darker: String = js.native
  var darkest: String = js.native
  var defaultText: String = js.native
  var gold: String = js.native
  var green: String = js.native
  var inverseText: String = js.native
  var light: String = js.native
  var lighter: String = js.native
  var lightest: String = js.native
  var medium: String = js.native
  var mediumdark: String = js.native
  var mediumlight: String = js.native
  var negative: String = js.native
  var orange: String = js.native
  var positive: String = js.native
  var primary: String = js.native
  var purple: String = js.native
  var seafoam: String = js.native
  var secondary: String = js.native
  var tertiary: String = js.native
  var ultraviolet: String = js.native
  var warning: String = js.native
}

object Color {
  @scala.inline
  def apply(
    ancillary: String,
    border: String,
    critical: String,
    dark: String,
    darker: String,
    darkest: String,
    defaultText: String,
    gold: String,
    green: String,
    inverseText: String,
    light: String,
    lighter: String,
    lightest: String,
    medium: String,
    mediumdark: String,
    mediumlight: String,
    negative: String,
    orange: String,
    positive: String,
    primary: String,
    purple: String,
    seafoam: String,
    secondary: String,
    tertiary: String,
    ultraviolet: String,
    warning: String
  ): Color = {
    val __obj = js.Dynamic.literal(ancillary = ancillary.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], darker = darker.asInstanceOf[js.Any], darkest = darkest.asInstanceOf[js.Any], defaultText = defaultText.asInstanceOf[js.Any], gold = gold.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], inverseText = inverseText.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], lighter = lighter.asInstanceOf[js.Any], lightest = lightest.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], mediumdark = mediumdark.asInstanceOf[js.Any], mediumlight = mediumlight.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], seafoam = seafoam.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], tertiary = tertiary.asInstanceOf[js.Any], ultraviolet = ultraviolet.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
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
    def setAncillary(value: String): Self = this.set("ancillary", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritical(value: String): Self = this.set("critical", value.asInstanceOf[js.Any])
    @scala.inline
    def setDark(value: String): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarker(value: String): Self = this.set("darker", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarkest(value: String): Self = this.set("darkest", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultText(value: String): Self = this.set("defaultText", value.asInstanceOf[js.Any])
    @scala.inline
    def setGold(value: String): Self = this.set("gold", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: String): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverseText(value: String): Self = this.set("inverseText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLight(value: String): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def setLighter(value: String): Self = this.set("lighter", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightest(value: String): Self = this.set("lightest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumdark(value: String): Self = this.set("mediumdark", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediumlight(value: String): Self = this.set("mediumlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setNegative(value: String): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrange(value: String): Self = this.set("orange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositive(value: String): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurple(value: String): Self = this.set("purple", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeafoam(value: String): Self = this.set("seafoam", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTertiary(value: String): Self = this.set("tertiary", value.asInstanceOf[js.Any])
    @scala.inline
    def setUltraviolet(value: String): Self = this.set("ultraviolet", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

