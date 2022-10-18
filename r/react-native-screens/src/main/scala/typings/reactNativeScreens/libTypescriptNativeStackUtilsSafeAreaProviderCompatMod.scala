package typings.reactNativeScreens

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.Metrics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptNativeStackUtilsSafeAreaProviderCompatMod {
  
  object default {
    
    inline def apply(hasChildrenStyle: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-screens/lib/typescript/native-stack/utils/SafeAreaProviderCompat", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-screens/lib/typescript/native-stack/utils/SafeAreaProviderCompat", "default.initialMetrics")
    @js.native
    def initialMetrics: Metrics = js.native
    inline def initialMetrics_=(x: Metrics): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialMetrics")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
