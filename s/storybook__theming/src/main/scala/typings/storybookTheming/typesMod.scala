package typings.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import typings.emotionSerialize.mod.Keyframes
import typings.emotionUtils.mod.SerializedStyles
import typings.storybookTheming.anon.Base
import typings.storybookTheming.anon.Black
import typings.storybookTheming.anon.Border
import typings.storybookTheming.anon.Code
import typings.storybookTheming.storybookThemingStrings.dark
import typings.storybookTheming.storybookThemingStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Animation extends StObject {
    
    var float: Keyframes
    
    var glow: Keyframes
    
    var hoverable: SerializedStyles
    
    var inlineGlow: SerializedStyles
    
    var jiggle: Keyframes
    
    var rotate360: Keyframes
  }
  object Animation {
    
    inline def apply(
      float: Keyframes,
      glow: Keyframes,
      hoverable: SerializedStyles,
      inlineGlow: SerializedStyles,
      jiggle: Keyframes,
      rotate360: Keyframes
    ): Animation = {
      val __obj = js.Dynamic.literal(float = float.asInstanceOf[js.Any], glow = glow.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], inlineGlow = inlineGlow.asInstanceOf[js.Any], jiggle = jiggle.asInstanceOf[js.Any], rotate360 = rotate360.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setFloat(value: Keyframes): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setGlow(value: Keyframes): Self = StObject.set(x, "glow", value.asInstanceOf[js.Any])
      
      inline def setHoverable(value: SerializedStyles): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setInlineGlow(value: SerializedStyles): Self = StObject.set(x, "inlineGlow", value.asInstanceOf[js.Any])
      
      inline def setJiggle(value: Keyframes): Self = StObject.set(x, "jiggle", value.asInstanceOf[js.Any])
      
      inline def setRotate360(value: Keyframes): Self = StObject.set(x, "rotate360", value.asInstanceOf[js.Any])
    }
  }
  
  trait Background extends StObject {
    
    var app: String
    
    var bar: String
    
    var content: String
    
    var critical: String
    
    var gridCellSize: Double
    
    var hoverable: String
    
    var negative: String
    
    var positive: String
    
    var warning: String
  }
  object Background {
    
    inline def apply(
      app: String,
      bar: String,
      content: String,
      critical: String,
      gridCellSize: Double,
      hoverable: String,
      negative: String,
      positive: String,
      warning: String
    ): Background = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], gridCellSize = gridCellSize.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    extension [Self <: Background](x: Self) {
      
      inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setCritical(value: String): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setGridCellSize(value: Double): Self = StObject.set(x, "gridCellSize", value.asInstanceOf[js.Any])
      
      inline def setHoverable(value: String): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brand extends StObject {
    
    var image: js.UndefOr[String | Null] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String | Null] = js.undefined
  }
  object Brand {
    
    inline def apply(): Brand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Brand]
    }
    
    extension [Self <: Brand](x: Self) {
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Color extends StObject {
    
    var ancillary: String
    
    var border: String
    
    var critical: String
    
    var dark: String
    
    var darker: String
    
    var darkest: String
    
    var defaultText: String
    
    var gold: String
    
    var green: String
    
    var inverseText: String
    
    var light: String
    
    var lighter: String
    
    var lightest: String
    
    var medium: String
    
    var mediumdark: String
    
    var mediumlight: String
    
    var negative: String
    
    var orange: String
    
    var positive: String
    
    var primary: String
    
    var purple: String
    
    var seafoam: String
    
    var secondary: String
    
    var tertiary: String
    
    var ultraviolet: String
    
    var warning: String
  }
  object Color {
    
    inline def apply(
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
    
    extension [Self <: Color](x: Self) {
      
      inline def setAncillary(value: String): Self = StObject.set(x, "ancillary", value.asInstanceOf[js.Any])
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setCritical(value: String): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarker(value: String): Self = StObject.set(x, "darker", value.asInstanceOf[js.Any])
      
      inline def setDarkest(value: String): Self = StObject.set(x, "darkest", value.asInstanceOf[js.Any])
      
      inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
      
      inline def setGold(value: String): Self = StObject.set(x, "gold", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setInverseText(value: String): Self = StObject.set(x, "inverseText", value.asInstanceOf[js.Any])
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLighter(value: String): Self = StObject.set(x, "lighter", value.asInstanceOf[js.Any])
      
      inline def setLightest(value: String): Self = StObject.set(x, "lightest", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumdark(value: String): Self = StObject.set(x, "mediumdark", value.asInstanceOf[js.Any])
      
      inline def setMediumlight(value: String): Self = StObject.set(x, "mediumlight", value.asInstanceOf[js.Any])
      
      inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setOrange(value: String): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
      
      inline def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPurple(value: String): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
      
      inline def setSeafoam(value: String): Self = StObject.set(x, "seafoam", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setTertiary(value: String): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
      
      inline def setUltraviolet(value: String): Self = StObject.set(x, "ultraviolet", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait Easing extends StObject {
    
    var rubber: String
  }
  object Easing {
    
    inline def apply(rubber: String): Easing = {
      val __obj = js.Dynamic.literal(rubber = rubber.asInstanceOf[js.Any])
      __obj.asInstanceOf[Easing]
    }
    
    extension [Self <: Easing](x: Self) {
      
      inline def setRubber(value: String): Self = StObject.set(x, "rubber", value.asInstanceOf[js.Any])
    }
  }
  
  type TextSize = Double | String
  
  trait Theme
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
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
    
    var input: Border
    
    var layoutMargin: Double
    
    var typography: Typography
  }
  object Theme {
    
    inline def apply(
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
    
    extension [Self <: Theme](x: Self) {
      
      inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAppBorderColor(value: String): Self = StObject.set(x, "appBorderColor", value.asInstanceOf[js.Any])
      
      inline def setAppBorderRadius(value: Double): Self = StObject.set(x, "appBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBarBg(value: String): Self = StObject.set(x, "barBg", value.asInstanceOf[js.Any])
      
      inline def setBarSelectedColor(value: String): Self = StObject.set(x, "barSelectedColor", value.asInstanceOf[js.Any])
      
      inline def setBarTextColor(value: String): Self = StObject.set(x, "barTextColor", value.asInstanceOf[js.Any])
      
      inline def setBrand(value: Brand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setCode(value: StringDictionary[String | js.Object]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Border): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLayoutMargin(value: Double): Self = StObject.set(x, "layoutMargin", value.asInstanceOf[js.Any])
      
      inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeVars extends StObject {
    
    var appBg: js.UndefOr[String] = js.undefined
    
    var appBorderColor: js.UndefOr[String] = js.undefined
    
    var appBorderRadius: js.UndefOr[Double] = js.undefined
    
    var appContentBg: js.UndefOr[String] = js.undefined
    
    var barBg: js.UndefOr[String] = js.undefined
    
    var barSelectedColor: js.UndefOr[String] = js.undefined
    
    var barTextColor: js.UndefOr[String] = js.undefined
    
    var base: light | dark
    
    var brandImage: js.UndefOr[String] = js.undefined
    
    var brandTitle: js.UndefOr[String] = js.undefined
    
    var brandUrl: js.UndefOr[String] = js.undefined
    
    var colorPrimary: js.UndefOr[String] = js.undefined
    
    var colorSecondary: js.UndefOr[String] = js.undefined
    
    var fontBase: js.UndefOr[String] = js.undefined
    
    var fontCode: js.UndefOr[String] = js.undefined
    
    var gridCellSize: js.UndefOr[Double] = js.undefined
    
    var inputBg: js.UndefOr[String] = js.undefined
    
    var inputBorder: js.UndefOr[String] = js.undefined
    
    var inputBorderRadius: js.UndefOr[Double] = js.undefined
    
    var inputTextColor: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var textInverseColor: js.UndefOr[String] = js.undefined
    
    var textMutedColor: js.UndefOr[String] = js.undefined
  }
  object ThemeVars {
    
    inline def apply(base: light | dark): ThemeVars = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeVars]
    }
    
    extension [Self <: ThemeVars](x: Self) {
      
      inline def setAppBg(value: String): Self = StObject.set(x, "appBg", value.asInstanceOf[js.Any])
      
      inline def setAppBgUndefined: Self = StObject.set(x, "appBg", js.undefined)
      
      inline def setAppBorderColor(value: String): Self = StObject.set(x, "appBorderColor", value.asInstanceOf[js.Any])
      
      inline def setAppBorderColorUndefined: Self = StObject.set(x, "appBorderColor", js.undefined)
      
      inline def setAppBorderRadius(value: Double): Self = StObject.set(x, "appBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setAppBorderRadiusUndefined: Self = StObject.set(x, "appBorderRadius", js.undefined)
      
      inline def setAppContentBg(value: String): Self = StObject.set(x, "appContentBg", value.asInstanceOf[js.Any])
      
      inline def setAppContentBgUndefined: Self = StObject.set(x, "appContentBg", js.undefined)
      
      inline def setBarBg(value: String): Self = StObject.set(x, "barBg", value.asInstanceOf[js.Any])
      
      inline def setBarBgUndefined: Self = StObject.set(x, "barBg", js.undefined)
      
      inline def setBarSelectedColor(value: String): Self = StObject.set(x, "barSelectedColor", value.asInstanceOf[js.Any])
      
      inline def setBarSelectedColorUndefined: Self = StObject.set(x, "barSelectedColor", js.undefined)
      
      inline def setBarTextColor(value: String): Self = StObject.set(x, "barTextColor", value.asInstanceOf[js.Any])
      
      inline def setBarTextColorUndefined: Self = StObject.set(x, "barTextColor", js.undefined)
      
      inline def setBase(value: light | dark): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBrandImage(value: String): Self = StObject.set(x, "brandImage", value.asInstanceOf[js.Any])
      
      inline def setBrandImageUndefined: Self = StObject.set(x, "brandImage", js.undefined)
      
      inline def setBrandTitle(value: String): Self = StObject.set(x, "brandTitle", value.asInstanceOf[js.Any])
      
      inline def setBrandTitleUndefined: Self = StObject.set(x, "brandTitle", js.undefined)
      
      inline def setBrandUrl(value: String): Self = StObject.set(x, "brandUrl", value.asInstanceOf[js.Any])
      
      inline def setBrandUrlUndefined: Self = StObject.set(x, "brandUrl", js.undefined)
      
      inline def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
      
      inline def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      inline def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
      
      inline def setFontBase(value: String): Self = StObject.set(x, "fontBase", value.asInstanceOf[js.Any])
      
      inline def setFontBaseUndefined: Self = StObject.set(x, "fontBase", js.undefined)
      
      inline def setFontCode(value: String): Self = StObject.set(x, "fontCode", value.asInstanceOf[js.Any])
      
      inline def setFontCodeUndefined: Self = StObject.set(x, "fontCode", js.undefined)
      
      inline def setGridCellSize(value: Double): Self = StObject.set(x, "gridCellSize", value.asInstanceOf[js.Any])
      
      inline def setGridCellSizeUndefined: Self = StObject.set(x, "gridCellSize", js.undefined)
      
      inline def setInputBg(value: String): Self = StObject.set(x, "inputBg", value.asInstanceOf[js.Any])
      
      inline def setInputBgUndefined: Self = StObject.set(x, "inputBg", js.undefined)
      
      inline def setInputBorder(value: String): Self = StObject.set(x, "inputBorder", value.asInstanceOf[js.Any])
      
      inline def setInputBorderRadius(value: Double): Self = StObject.set(x, "inputBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setInputBorderRadiusUndefined: Self = StObject.set(x, "inputBorderRadius", js.undefined)
      
      inline def setInputBorderUndefined: Self = StObject.set(x, "inputBorder", js.undefined)
      
      inline def setInputTextColor(value: String): Self = StObject.set(x, "inputTextColor", value.asInstanceOf[js.Any])
      
      inline def setInputTextColorUndefined: Self = StObject.set(x, "inputTextColor", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextInverseColor(value: String): Self = StObject.set(x, "textInverseColor", value.asInstanceOf[js.Any])
      
      inline def setTextInverseColorUndefined: Self = StObject.set(x, "textInverseColor", js.undefined)
      
      inline def setTextMutedColor(value: String): Self = StObject.set(x, "textMutedColor", value.asInstanceOf[js.Any])
      
      inline def setTextMutedColorUndefined: Self = StObject.set(x, "textMutedColor", js.undefined)
    }
  }
  
  trait Typography extends StObject {
    
    var fonts: Base
    
    var size: Code
    
    var weight: Black
  }
  object Typography {
    
    inline def apply(fonts: Base, size: Code, weight: Black): Typography = {
      val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typography]
    }
    
    extension [Self <: Typography](x: Self) {
      
      inline def setFonts(value: Base): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Code): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Black): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
