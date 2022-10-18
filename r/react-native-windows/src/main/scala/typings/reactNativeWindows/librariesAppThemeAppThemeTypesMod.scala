package typings.reactNativeWindows

import typings.reactNative.mod.EmitterSubscription
import typings.reactNativeWindows.reactNativeWindowsStrings.highContrastChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesAppThemeAppThemeTypesMod {
  
  trait AppTheme extends StObject {
    
    @JSName("addListener")
    def addListener_highContrastChanged(
      eventName: highContrastChanged,
      listener: js.Function1[/* nativeEvent */ IHighContrastChangedEvent, Unit]
    ): EmitterSubscription
    
    var currentHighContrastColors: IHighContrastColors
    
    var isHighContrast: Boolean
    
    @JSName("removeListener")
    def removeListener_highContrastChanged(
      eventName: highContrastChanged,
      listener: js.Function1[/* nativeEvent */ IHighContrastChangedEvent, Unit]
    ): Unit
  }
  object AppTheme {
    
    @JSImport("react-native-windows/Libraries/AppTheme/AppThemeTypes", "AppTheme")
    @js.native
    val ^ : AppTheme = js.native
    
    extension [Self <: AppTheme](x: Self) {
      
      inline def setAddListener(
        value: (highContrastChanged, js.Function1[/* nativeEvent */ IHighContrastChangedEvent, Unit]) => EmitterSubscription
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setCurrentHighContrastColors(value: IHighContrastColors): Self = StObject.set(x, "currentHighContrastColors", value.asInstanceOf[js.Any])
      
      inline def setIsHighContrast(value: Boolean): Self = StObject.set(x, "isHighContrast", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(
        value: (highContrastChanged, js.Function1[/* nativeEvent */ IHighContrastChangedEvent, Unit]) => Unit
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  trait IHighContrastChangedEvent extends StObject {
    
    var highContrastColors: IHighContrastColors
    
    var isHighContrast: Boolean
  }
  object IHighContrastChangedEvent {
    
    inline def apply(highContrastColors: IHighContrastColors, isHighContrast: Boolean): IHighContrastChangedEvent = {
      val __obj = js.Dynamic.literal(highContrastColors = highContrastColors.asInstanceOf[js.Any], isHighContrast = isHighContrast.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHighContrastChangedEvent]
    }
    
    extension [Self <: IHighContrastChangedEvent](x: Self) {
      
      inline def setHighContrastColors(value: IHighContrastColors): Self = StObject.set(x, "highContrastColors", value.asInstanceOf[js.Any])
      
      inline def setIsHighContrast(value: Boolean): Self = StObject.set(x, "isHighContrast", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHighContrastColors extends StObject {
    
    var ButtonFaceColor: String
    
    var ButtonTextColor: String
    
    var GrayTextColor: String
    
    var HighlightColor: String
    
    var HighlightTextColor: String
    
    var HotlightColor: String
    
    var WindowColor: String
    
    var WindowTextColor: String
  }
  object IHighContrastColors {
    
    inline def apply(
      ButtonFaceColor: String,
      ButtonTextColor: String,
      GrayTextColor: String,
      HighlightColor: String,
      HighlightTextColor: String,
      HotlightColor: String,
      WindowColor: String,
      WindowTextColor: String
    ): IHighContrastColors = {
      val __obj = js.Dynamic.literal(ButtonFaceColor = ButtonFaceColor.asInstanceOf[js.Any], ButtonTextColor = ButtonTextColor.asInstanceOf[js.Any], GrayTextColor = GrayTextColor.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], HighlightTextColor = HighlightTextColor.asInstanceOf[js.Any], HotlightColor = HotlightColor.asInstanceOf[js.Any], WindowColor = WindowColor.asInstanceOf[js.Any], WindowTextColor = WindowTextColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHighContrastColors]
    }
    
    extension [Self <: IHighContrastColors](x: Self) {
      
      inline def setButtonFaceColor(value: String): Self = StObject.set(x, "ButtonFaceColor", value.asInstanceOf[js.Any])
      
      inline def setButtonTextColor(value: String): Self = StObject.set(x, "ButtonTextColor", value.asInstanceOf[js.Any])
      
      inline def setGrayTextColor(value: String): Self = StObject.set(x, "GrayTextColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightColor(value: String): Self = StObject.set(x, "HighlightColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightTextColor(value: String): Self = StObject.set(x, "HighlightTextColor", value.asInstanceOf[js.Any])
      
      inline def setHotlightColor(value: String): Self = StObject.set(x, "HotlightColor", value.asInstanceOf[js.Any])
      
      inline def setWindowColor(value: String): Self = StObject.set(x, "WindowColor", value.asInstanceOf[js.Any])
      
      inline def setWindowTextColor(value: String): Self = StObject.set(x, "WindowTextColor", value.asInstanceOf[js.Any])
    }
  }
}
