package typings.reactNativePaper

import typings.reactNative.mod.Animated.Value
import typings.reactNativePaper.anon.ShadowColor
import typings.reactNativePaper.anon.ShadowOffset
import typings.reactNativePaper.anon.ShadowOpacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowMod {
  
  @JSImport("react-native-paper/lib/typescript/styles/shadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ShadowColor | ShadowOffset | ShadowOpacity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ShadowColor | ShadowOffset | ShadowOpacity]
  inline def default(elevation: Double): ShadowColor | ShadowOffset | ShadowOpacity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any]).asInstanceOf[ShadowColor | ShadowOffset | ShadowOpacity]
  inline def default(elevation: Value): ShadowColor | ShadowOffset | ShadowOpacity = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elevation.asInstanceOf[js.Any]).asInstanceOf[ShadowColor | ShadowOffset | ShadowOpacity]
}
