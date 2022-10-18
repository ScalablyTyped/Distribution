package typings.reactNativeElements

import typings.reactNativeElements.anon.Black
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigFontsMod {
  
  object default {
    
    @JSImport("react-native-elements/dist/config/fonts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config/fonts", "default.android")
    @js.native
    def android: Black = js.native
    inline def android_=(x: Black): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("android")(x.asInstanceOf[js.Any])
  }
}
