package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.Appearance.AppearanceListener
import typings.reactNative.mod.ColorSchemeName
import typings.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Appearance {
  
  @JSImport("react-native-sensor-manager", "Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChangeListener(listener: AppearanceListener): NativeEventSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addChangeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[NativeEventSubscription]
  
  inline def getColorScheme(): ColorSchemeName = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorScheme")().asInstanceOf[ColorSchemeName]
}
