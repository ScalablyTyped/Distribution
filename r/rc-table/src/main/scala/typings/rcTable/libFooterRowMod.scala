package typings.rcTable

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFooterRowMod {
  
  @JSImport("rc-table/lib/Footer/Row", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: FooterRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FooterRowProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FooterRowProps {
    
    inline def apply(): FooterRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterRowProps]
    }
    
    extension [Self <: FooterRowProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
