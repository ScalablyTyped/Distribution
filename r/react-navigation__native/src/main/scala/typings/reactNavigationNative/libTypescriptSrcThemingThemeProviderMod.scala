package typings.reactNavigationNative

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNavigationNative.libTypescriptSrcTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcThemingThemeProviderMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/theming/ThemeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var value: Theme
  }
  object Props {
    
    inline def apply(value: Theme): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: Theme): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
