package typings.storybookTheming.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.distCreateC2b2ce6dMod.Animation
import typings.storybookTheming.distCreateC2b2ce6dMod.Brand
import typings.storybookTheming.distCreateC2b2ce6dMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/theming.@storybook/theming.Theme> */
trait PartialTheme extends StObject {
  
  var animation: js.UndefOr[Animation] = js.undefined
  
  var appBorderColor: js.UndefOr[String] = js.undefined
  
  var appBorderRadius: js.UndefOr[Double] = js.undefined
  
  var background: js.UndefOr[typings.storybookTheming.distCreateC2b2ce6dMod.Background] = js.undefined
  
  var barBg: js.UndefOr[String] = js.undefined
  
  var barSelectedColor: js.UndefOr[String] = js.undefined
  
  var barTextColor: js.UndefOr[String] = js.undefined
  
  var brand: js.UndefOr[Brand] = js.undefined
  
  var code: js.UndefOr[StringDictionary[String | js.Object]] = js.undefined
  
  var color: js.UndefOr[typings.storybookTheming.distCreateC2b2ce6dMod.Color] = js.undefined
  
  var easing: js.UndefOr[Easing] = js.undefined
  
  var input: js.UndefOr[Background] = js.undefined
  
  var layoutMargin: js.UndefOr[Double] = js.undefined
  
  var typography: js.UndefOr[typings.storybookTheming.distCreateC2b2ce6dMod.Typography] = js.undefined
}
object PartialTheme {
  
  inline def apply(): PartialTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTheme] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppBorderColor(value: String): Self = StObject.set(x, "appBorderColor", value.asInstanceOf[js.Any])
    
    inline def setAppBorderColorUndefined: Self = StObject.set(x, "appBorderColor", js.undefined)
    
    inline def setAppBorderRadius(value: Double): Self = StObject.set(x, "appBorderRadius", value.asInstanceOf[js.Any])
    
    inline def setAppBorderRadiusUndefined: Self = StObject.set(x, "appBorderRadius", js.undefined)
    
    inline def setBackground(value: typings.storybookTheming.distCreateC2b2ce6dMod.Background): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBarBg(value: String): Self = StObject.set(x, "barBg", value.asInstanceOf[js.Any])
    
    inline def setBarBgUndefined: Self = StObject.set(x, "barBg", js.undefined)
    
    inline def setBarSelectedColor(value: String): Self = StObject.set(x, "barSelectedColor", value.asInstanceOf[js.Any])
    
    inline def setBarSelectedColorUndefined: Self = StObject.set(x, "barSelectedColor", js.undefined)
    
    inline def setBarTextColor(value: String): Self = StObject.set(x, "barTextColor", value.asInstanceOf[js.Any])
    
    inline def setBarTextColorUndefined: Self = StObject.set(x, "barTextColor", js.undefined)
    
    inline def setBrand(value: Brand): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCode(value: StringDictionary[String | js.Object]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setColor(value: typings.storybookTheming.distCreateC2b2ce6dMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setInput(value: Background): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLayoutMargin(value: Double): Self = StObject.set(x, "layoutMargin", value.asInstanceOf[js.Any])
    
    inline def setLayoutMarginUndefined: Self = StObject.set(x, "layoutMargin", js.undefined)
    
    inline def setTypography(value: typings.storybookTheming.distCreateC2b2ce6dMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
  }
}
