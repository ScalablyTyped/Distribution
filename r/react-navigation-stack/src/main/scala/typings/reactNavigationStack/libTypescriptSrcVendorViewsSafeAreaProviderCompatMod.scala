package typings.reactNavigationStack

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsSafeAreaProviderCompatMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/SafeAreaProviderCompat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildren: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var children: ReactNode
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
