package typings.reactMdMenu

import typings.react.mod.Dispatch
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.reactMdMenu.anon.ReadonlyMenuVisibilityCon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuVisibilityProviderMod {
  
  @JSImport("@react-md/menu/types/MenuVisibilityProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuVisibilityProvider(param0: MenuVisibilityProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuVisibilityProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useMenuVisibility(): ReadonlyMenuVisibilityCon = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuVisibility")().asInstanceOf[ReadonlyMenuVisibilityCon]
  
  /* Inlined std.Pick<@react-md/utils.@react-md/utils.HoverModeHookReturnValue, 'visible' | 'setVisible'> */
  trait MenuVisibilityContext extends StObject {
    
    var setVisible: Dispatch[SetStateAction[Boolean]]
    
    var visible: Boolean
  }
  object MenuVisibilityContext {
    
    inline def apply(setVisible: SetStateAction[Boolean] => Unit, visible: Boolean): MenuVisibilityContext = {
      val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuVisibilityContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuVisibilityContext] (val x: Self) extends AnyVal {
      
      inline def setSetVisible(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuVisibilityProviderProps
    extends StObject
       with MenuVisibilityContext {
    
    var children: ReactNode
  }
  object MenuVisibilityProviderProps {
    
    inline def apply(setVisible: SetStateAction[Boolean] => Unit, visible: Boolean): MenuVisibilityProviderProps = {
      val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1(setVisible), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuVisibilityProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuVisibilityProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
