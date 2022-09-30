package typings.reduxTestUtils

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatchMockMod {
  
  @JSImport("redux-test-utils/dist/utils/DispatchMock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockDispatch[T /* <: AnyAction */](): MockDispatch[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockDispatch")().asInstanceOf[MockDispatch[T]]
  
  trait MockDispatch[T /* <: AnyAction */] extends StObject {
    
    def dispatch[T /* <: T */](action: T): T
    @JSName("dispatch")
    var dispatch_Original: Dispatch[T]
    
    def getAction(`type`: Any): js.UndefOr[AnyAction]
    
    def getActions(): js.Array[AnyAction]
    
    def isActionDispatched(action: AnyAction): Boolean
    
    def isActionTypeDispatched(`type`: Any): Boolean
  }
  object MockDispatch {
    
    inline def apply[T /* <: AnyAction */](
      dispatch: T => T,
      getAction: Any => js.UndefOr[AnyAction],
      getActions: () => js.Array[AnyAction],
      isActionDispatched: AnyAction => Boolean,
      isActionTypeDispatched: Any => Boolean
    ): MockDispatch[T] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getAction = js.Any.fromFunction1(getAction), getActions = js.Any.fromFunction0(getActions), isActionDispatched = js.Any.fromFunction1(isActionDispatched), isActionTypeDispatched = js.Any.fromFunction1(isActionTypeDispatched))
      __obj.asInstanceOf[MockDispatch[T]]
    }
    
    extension [Self <: MockDispatch[?], T /* <: AnyAction */](x: Self & MockDispatch[T]) {
      
      inline def setDispatch(value: T => T): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setGetAction(value: Any => js.UndefOr[AnyAction]): Self = StObject.set(x, "getAction", js.Any.fromFunction1(value))
      
      inline def setGetActions(value: () => js.Array[AnyAction]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setIsActionDispatched(value: AnyAction => Boolean): Self = StObject.set(x, "isActionDispatched", js.Any.fromFunction1(value))
      
      inline def setIsActionTypeDispatched(value: Any => Boolean): Self = StObject.set(x, "isActionTypeDispatched", js.Any.fromFunction1(value))
    }
  }
}
