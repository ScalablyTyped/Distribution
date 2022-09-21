package typings.reactNativeTabView

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.PressableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformPressableMod {
  
  @JSImport("react-native-tab-view/lib/typescript/PlatformPressable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasAndroid_ripplePressColorPressOpacityStyleRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasAndroid_ripplePressColorPressOpacityStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with PressableProps {
    
    @JSName("children")
    var children_Props: ReactNode
    
    var pressColor: js.UndefOr[String] = js.undefined
    
    var pressOpacity: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
      
      inline def setPressColorUndefined: Self = StObject.set(x, "pressColor", js.undefined)
      
      inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
      
      inline def setPressOpacityUndefined: Self = StObject.set(x, "pressOpacity", js.undefined)
    }
  }
}
