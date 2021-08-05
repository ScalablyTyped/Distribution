package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appearance {
  
  @JSImport("react-native", "Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChangeListener(listener: AppearanceListener): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  inline def getColorScheme(): ColorSchemeName = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScheme")().asInstanceOf[ColorSchemeName]
  
  inline def removeChangeListener(listener: AppearanceListener): EventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("removeChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[EventSubscription]
  
  type AppearanceListener = js.Function1[/* preferences */ AppearancePreferences, Unit]
  
  trait AppearancePreferences extends StObject {
    
    var colorScheme: ColorSchemeName
  }
  object AppearancePreferences {
    
    inline def apply(): AppearancePreferences = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppearancePreferences]
    }
    
    extension [Self <: AppearancePreferences](x: Self) {
      
      inline def setColorScheme(value: ColorSchemeName): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeNull: Self = StObject.set(x, "colorScheme", null)
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    }
  }
}
