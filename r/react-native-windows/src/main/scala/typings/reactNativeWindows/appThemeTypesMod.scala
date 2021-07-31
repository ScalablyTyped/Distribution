package typings.reactNativeWindows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appThemeTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindows.reactNativeWindowsStrings.light
    - typings.reactNativeWindows.reactNativeWindowsStrings.dark
  */
  trait AppThemeTypes extends StObject
  object AppThemeTypes {
    
    @scala.inline
    def dark: typings.reactNativeWindows.reactNativeWindowsStrings.dark = "dark".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.dark]
    
    @scala.inline
    def light: typings.reactNativeWindows.reactNativeWindowsStrings.light = "light".asInstanceOf[typings.reactNativeWindows.reactNativeWindowsStrings.light]
  }
  
  trait IAppThemeChangedEvent extends StObject {
    
    var currentTheme: AppThemeTypes
  }
  object IAppThemeChangedEvent {
    
    @scala.inline
    def apply(currentTheme: AppThemeTypes): IAppThemeChangedEvent = {
      val __obj = js.Dynamic.literal(currentTheme = currentTheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAppThemeChangedEvent]
    }
    
    @scala.inline
    implicit class IAppThemeChangedEventMutableBuilder[Self <: IAppThemeChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentTheme(value: AppThemeTypes): Self = StObject.set(x, "currentTheme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IHighContrastChangedEvent extends StObject {
    
    var highContrastColors: IHighContrastColors
    
    var isHighContrast: Boolean
  }
  object IHighContrastChangedEvent {
    
    @scala.inline
    def apply(highContrastColors: IHighContrastColors, isHighContrast: Boolean): IHighContrastChangedEvent = {
      val __obj = js.Dynamic.literal(highContrastColors = highContrastColors.asInstanceOf[js.Any], isHighContrast = isHighContrast.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHighContrastChangedEvent]
    }
    
    @scala.inline
    implicit class IHighContrastChangedEventMutableBuilder[Self <: IHighContrastChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighContrastColors(value: IHighContrastColors): Self = StObject.set(x, "highContrastColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHighContrast(value: Boolean): Self = StObject.set(x, "isHighContrast", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class IHighContrastColorsMutableBuilder[Self <: IHighContrastColors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonFaceColor(value: String): Self = StObject.set(x, "ButtonFaceColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextColor(value: String): Self = StObject.set(x, "ButtonTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayTextColor(value: String): Self = StObject.set(x, "GrayTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightColor(value: String): Self = StObject.set(x, "HighlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightTextColor(value: String): Self = StObject.set(x, "HighlightTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotlightColor(value: String): Self = StObject.set(x, "HotlightColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowColor(value: String): Self = StObject.set(x, "WindowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTextColor(value: String): Self = StObject.set(x, "WindowTextColor", value.asInstanceOf[js.Any])
    }
  }
}
