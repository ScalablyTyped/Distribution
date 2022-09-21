package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPress extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  
  var title: ReactNode
  
  var titleRef: js.UndefOr[RefObject[Text]] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object OnPress {
  
  inline def apply(theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): OnPress = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPress]
  }
  
  extension [Self <: OnPress](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStyleNull: Self = StObject.set(x, "subtitleStyle", null)
    
    inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleRef(value: RefObject[Text]): Self = StObject.set(x, "titleRef", value.asInstanceOf[js.Any])
    
    inline def setTitleRefUndefined: Self = StObject.set(x, "titleRef", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
