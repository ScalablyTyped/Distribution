package typings.reactNavigationStack

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerBackgroundMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasStyleRest: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStyleRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props
    extends StObject
       with ViewProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("style")
    var style_Props: js.UndefOr[WithAnimatedValue[StyleProp[ViewStyle]]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStyle(value: WithAnimatedValue[StyleProp[ViewStyle]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
