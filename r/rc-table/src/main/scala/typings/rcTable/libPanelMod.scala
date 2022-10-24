package typings.rcTable

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelMod {
  
  @JSImport("rc-table/lib/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: TitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TitleProps extends StObject {
    
    var children: ReactNode
    
    var className: String
  }
  object TitleProps {
    
    inline def apply(className: String): TitleProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleProps]
    }
    
    extension [Self <: TitleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
}
