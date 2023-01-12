package typings.reactMdUtils

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import typings.reactMdUtils.typesKeyboardMovementActiveDescendantContextMod.ActiveDescendantContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementActiveDescendantMovementProviderMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/ActiveDescendantMovementProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ActiveDescendantMovementProvider(param0: ActiveDescendantMovementProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ActiveDescendantMovementProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ActiveDescendantMovementProviderProps
    extends StObject
       with ActiveDescendantContext {
    
    var children: ReactNode
  }
  object ActiveDescendantMovementProviderProps {
    
    inline def apply(activeId: String, setActiveId: SetStateAction[String] => Unit): ActiveDescendantMovementProviderProps = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId))
      __obj.asInstanceOf[ActiveDescendantMovementProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveDescendantMovementProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
