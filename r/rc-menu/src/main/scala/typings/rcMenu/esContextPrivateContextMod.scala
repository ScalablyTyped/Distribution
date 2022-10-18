package typings.rcMenu

import org.scalablytyped.runtime.Shortcut
import typings.rcMenu.anon.Active
import typings.rcMenu.anon.Selected
import typings.react.mod.Context
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextPrivateContextMod extends Shortcut {
  
  @JSImport("rc-menu/es/context/PrivateContext", JSImport.Default)
  @js.native
  val default: Context[PrivateContextProps] = js.native
  
  trait PrivateContextProps extends StObject {
    
    var _internalRenderMenuItem: js.UndefOr[
        js.Function3[
          /* originNode */ ReactElement, 
          /* menuItemProps */ Any, 
          /* stateProps */ Selected, 
          ReactElement
        ]
      ] = js.undefined
    
    var _internalRenderSubMenuItem: js.UndefOr[
        js.Function3[
          /* originNode */ ReactElement, 
          /* subMenuItemProps */ Any, 
          /* stateProps */ Active, 
          ReactElement
        ]
      ] = js.undefined
  }
  object PrivateContextProps {
    
    inline def apply(): PrivateContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrivateContextProps]
    }
    
    extension [Self <: PrivateContextProps](x: Self) {
      
      inline def set_internalRenderMenuItem(
        value: (/* originNode */ ReactElement, /* menuItemProps */ Any, /* stateProps */ Selected) => ReactElement
      ): Self = StObject.set(x, "_internalRenderMenuItem", js.Any.fromFunction3(value))
      
      inline def set_internalRenderMenuItemUndefined: Self = StObject.set(x, "_internalRenderMenuItem", js.undefined)
      
      inline def set_internalRenderSubMenuItem(
        value: (/* originNode */ ReactElement, /* subMenuItemProps */ Any, /* stateProps */ Active) => ReactElement
      ): Self = StObject.set(x, "_internalRenderSubMenuItem", js.Any.fromFunction3(value))
      
      inline def set_internalRenderSubMenuItemUndefined: Self = StObject.set(x, "_internalRenderSubMenuItem", js.undefined)
    }
  }
  
  type _To = Context[PrivateContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextPrivateContextMod.foo` */
  override def _to: Context[PrivateContextProps] = default
}
