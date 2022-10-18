package typings.reactNavigationStack

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsMaskedViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/MaskedView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildren: Props): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait Props extends StObject {
    
    var children: ReactElement
    
    var maskElement: ReactElement
  }
  object Props {
    
    inline def apply(children: ReactElement, maskElement: ReactElement): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], maskElement = maskElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setMaskElement(value: ReactElement): Self = StObject.set(x, "maskElement", value.asInstanceOf[js.Any])
    }
  }
}
