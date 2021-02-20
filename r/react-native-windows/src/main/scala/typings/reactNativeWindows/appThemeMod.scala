package typings.reactNativeWindows

import typings.reactNative.mod.NativeEventEmitter
import typings.reactNativeWindows.appThemeTypesMod.AppThemeTypes
import typings.reactNativeWindows.appThemeTypesMod.IAppThemeChangedEvent
import typings.reactNativeWindows.appThemeTypesMod.IHighContrastChangedEvent
import typings.reactNativeWindows.appThemeTypesMod.IHighContrastColors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appThemeMod {
  
  @JSImport("react-native-windows/Libraries/AppTheme/AppTheme", "AppTheme")
  @js.native
  val AppTheme: AppThemeModule | MissingNativeAppThemeShim = js.native
  type AppTheme = AppThemeModule
  
  @js.native
  trait AppThemeModule extends NativeEventEmitter {
    
    var _currentTheme: js.Any = js.native
    
    var _highContrastColors: js.Any = js.native
    
    var _isHighContrast: js.Any = js.native
    
    def currentHighContrastColors: IHighContrastColors = js.native
    
    def currentTheme: AppThemeTypes = js.native
    
    var isAvailable: Boolean = js.native
    
    def isHighContrast: Boolean = js.native
  }
  
  @js.native
  trait MissingNativeAppThemeShim extends StObject {
    
    def addEventListener(): Unit = js.native
    
    def addListener(
      _eventType: String,
      _listener: js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]
    ): js.Any = js.native
    
    var currentHighContrastColors: IHighContrastColors = js.native
    
    var currentTheme: String = js.native
    
    var isAvailable: Boolean = js.native
    
    var isHighContrast: Boolean = js.native
    
    def removeAllListeners(): Unit = js.native
    
    def removeEventListener(): Unit = js.native
    
    def removeListener(
      _eventType: String,
      _listener: js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]
    ): Unit = js.native
    
    def removeSubscription(): Unit = js.native
  }
  object MissingNativeAppThemeShim {
    
    @scala.inline
    def apply(
      addEventListener: () => Unit,
      addListener: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => js.Any,
      currentHighContrastColors: IHighContrastColors,
      currentTheme: String,
      isAvailable: Boolean,
      isHighContrast: Boolean,
      removeAllListeners: () => Unit,
      removeEventListener: () => Unit,
      removeListener: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => Unit,
      removeSubscription: () => Unit
    ): MissingNativeAppThemeShim = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), addListener = js.Any.fromFunction2(addListener), currentHighContrastColors = currentHighContrastColors.asInstanceOf[js.Any], currentTheme = currentTheme.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], isHighContrast = isHighContrast.asInstanceOf[js.Any], removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeEventListener = js.Any.fromFunction0(removeEventListener), removeListener = js.Any.fromFunction2(removeListener), removeSubscription = js.Any.fromFunction0(removeSubscription))
      __obj.asInstanceOf[MissingNativeAppThemeShim]
    }
    
    @scala.inline
    implicit class MissingNativeAppThemeShimMutableBuilder[Self <: MissingNativeAppThemeShim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: () => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddListener(
        value: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => js.Any
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCurrentHighContrastColors(value: IHighContrastColors): Self = StObject.set(x, "currentHighContrastColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTheme(value: String): Self = StObject.set(x, "currentTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHighContrast(value: Boolean): Self = StObject.set(x, "isHighContrast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveAllListeners(value: () => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveEventListener(value: () => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveListener(
        value: (String, js.Function1[/* nativeEvent */ IAppThemeChangedEvent with IHighContrastChangedEvent, Unit]) => Unit
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveSubscription(value: () => Unit): Self = StObject.set(x, "removeSubscription", js.Any.fromFunction0(value))
    }
  }
}
