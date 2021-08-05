package typings.reduxTestUtils

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-test-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockDispatch(): mockDispatch[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockDispatch")().asInstanceOf[mockDispatch[js.Any]]
  
  inline def createMockStore(): mockStore[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockStore")().asInstanceOf[mockStore[js.Any]]
  inline def createMockStore(state: js.Any): mockStore[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockStore")(state.asInstanceOf[js.Any]).asInstanceOf[mockStore[js.Any]]
  
  trait mockDispatch[S] extends StObject {
    
    def dispatch[T /* <: S */](action: T): T
    @JSName("dispatch")
    var dispatch_Original: Dispatch[S]
    
    def getAction(`type`: js.Any): js.UndefOr[AnyAction]
    
    def getActions(): js.Array[AnyAction]
    
    def isActionDispatched(action: AnyAction): Boolean
    
    def isActionTypeDispatched(`type`: js.Any): Boolean
  }
  object mockDispatch {
    
    inline def apply[S](
      dispatch: S => S,
      getAction: js.Any => js.UndefOr[AnyAction],
      getActions: () => js.Array[AnyAction],
      isActionDispatched: AnyAction => Boolean,
      isActionTypeDispatched: js.Any => Boolean
    ): mockDispatch[S] = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getAction = js.Any.fromFunction1(getAction), getActions = js.Any.fromFunction0(getActions), isActionDispatched = js.Any.fromFunction1(isActionDispatched), isActionTypeDispatched = js.Any.fromFunction1(isActionTypeDispatched))
      __obj.asInstanceOf[mockDispatch[S]]
    }
    
    extension [Self <: mockDispatch[?], S](x: Self & mockDispatch[S]) {
      
      inline def setDispatch(value: S => S): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setGetAction(value: js.Any => js.UndefOr[AnyAction]): Self = StObject.set(x, "getAction", js.Any.fromFunction1(value))
      
      inline def setGetActions(value: () => js.Array[AnyAction]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setIsActionDispatched(value: AnyAction => Boolean): Self = StObject.set(x, "isActionDispatched", js.Any.fromFunction1(value))
      
      inline def setIsActionTypeDispatched(value: js.Any => Boolean): Self = StObject.set(x, "isActionTypeDispatched", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reduxTestUtils.mod.mockDispatch because var conflicts: dispatch_Original. Inlined getActions, getAction, isActionTypeDispatched, isActionDispatched */ @js.native
  trait mockStore[S]
    extends StObject
       with Store[S, AnyAction] {
    
    def getAction(`type`: js.Any): js.UndefOr[AnyAction] = js.native
    
    def getActions(): js.Array[AnyAction] = js.native
    
    def isActionDispatched(action: AnyAction): Boolean = js.native
    
    def isActionTypeDispatched(`type`: js.Any): Boolean = js.native
  }
}
