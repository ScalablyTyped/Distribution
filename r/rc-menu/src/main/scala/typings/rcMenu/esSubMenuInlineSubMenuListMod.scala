package typings.rcMenu

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuInlineSubMenuListMod {
  
  @JSImport("rc-menu/es/SubMenu/InlineSubMenuList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: InlineSubMenuListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait InlineSubMenuListProps extends StObject {
    
    var children: ReactNode
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyPath: js.Array[String]
    
    var open: Boolean
  }
  object InlineSubMenuListProps {
    
    inline def apply(keyPath: js.Array[String], open: Boolean): InlineSubMenuListProps = {
      val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineSubMenuListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlineSubMenuListProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
