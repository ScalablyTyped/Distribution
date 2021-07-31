package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appearance {
  
  @JSImport("react-native", "Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addChangeListener(listener: AppearanceListener): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  @scala.inline
  def getColorScheme(): ColorSchemeName = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScheme")().asInstanceOf[ColorSchemeName]
  
  @scala.inline
  def removeChangeListener(listener: AppearanceListener): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  type AppearanceListener = js.Function1[/* preferences */ AppearancePreferences, Unit]
  
  trait AppearancePreferences extends StObject {
    
    var colorScheme: ColorSchemeName
  }
  object AppearancePreferences {
    
    @scala.inline
    def apply(): AppearancePreferences = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppearancePreferences]
    }
    
    @scala.inline
    implicit class AppearancePreferencesMutableBuilder[Self <: AppearancePreferences] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorScheme(value: ColorSchemeName): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSchemeNull: Self = StObject.set(x, "colorScheme", null)
      
      @scala.inline
      def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    }
  }
}
