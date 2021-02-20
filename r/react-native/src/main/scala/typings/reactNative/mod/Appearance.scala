package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appearance {
  
  @JSImport("react-native", "Appearance.addChangeListener")
  @js.native
  def addChangeListener(listener: AppearanceListener): EventSubscription = js.native
  
  @JSImport("react-native", "Appearance.getColorScheme")
  @js.native
  def getColorScheme(): ColorSchemeName = js.native
  
  @JSImport("react-native", "Appearance.removeChangeListener")
  @js.native
  def removeChangeListener(listener: AppearanceListener): EventSubscription = js.native
  
  type AppearanceListener = js.Function1[/* preferences */ AppearancePreferences, Unit]
  
  @js.native
  trait AppearancePreferences extends StObject {
    
    var colorScheme: ColorSchemeName = js.native
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
