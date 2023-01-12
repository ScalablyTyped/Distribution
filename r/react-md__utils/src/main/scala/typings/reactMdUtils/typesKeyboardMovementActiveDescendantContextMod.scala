package typings.reactMdUtils

import typings.react.mod.Dispatch
import typings.react.mod.Provider
import typings.react.mod.SetStateAction
import typings.reactMdUtils.anon.ReadonlyActiveDescendantC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementActiveDescendantContextMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/activeDescendantContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/keyboardMovement/activeDescendantContext", "ActiveDescendantContextProvider")
  @js.native
  val ActiveDescendantContextProvider: Provider[ActiveDescendantContext] = js.native
  
  inline def useActiveDescendantContext(): ReadonlyActiveDescendantC = ^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendantContext")().asInstanceOf[ReadonlyActiveDescendantC]
  
  trait ActiveDescendantContext extends StObject {
    
    var activeId: String
    
    var setActiveId: Dispatch[SetStateAction[String]]
  }
  object ActiveDescendantContext {
    
    inline def apply(activeId: String, setActiveId: SetStateAction[String] => Unit): ActiveDescendantContext = {
      val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId))
      __obj.asInstanceOf[ActiveDescendantContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveDescendantContext] (val x: Self) extends AnyVal {
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setSetActiveId(value: SetStateAction[String] => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
    }
  }
}
