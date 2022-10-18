package typings.reactQuery

import typings.reactQuery.typesCoreSubscribableMod.Listener
import typings.reactQuery.typesCoreSubscribableMod.Subscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreFocusManagerMod {
  
  @JSImport("react-query/types/core/focusManager", "FocusManager")
  @js.native
  open class FocusManager_ () extends Subscribable[Listener] {
    
    /* private */ var cleanup: Any = js.native
    
    /* private */ var focused: Any = js.native
    
    def isFocused(): Boolean = js.native
    
    def onFocus(): Unit = js.native
    
    def setEventListener(setup: SetupFn): Unit = js.native
    
    def setFocused(): Unit = js.native
    def setFocused(focused: Boolean): Unit = js.native
    
    /* private */ var setup: Any = js.native
  }
  
  @JSImport("react-query/types/core/focusManager", "focusManager")
  @js.native
  val focusManager: FocusManager_ = js.native
  
  type SetupFn = js.Function1[
    /* setFocused */ js.Function1[/* focused */ js.UndefOr[Boolean], Unit], 
    js.UndefOr[js.Function0[Unit]]
  ]
}
