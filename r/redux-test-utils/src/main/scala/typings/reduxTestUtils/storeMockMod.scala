package typings.reduxTestUtils

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Reducer
import typings.redux.mod.Unsubscribe
import typings.reduxTestUtils.anon.OmitStoreAnyActionSymbolo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeMockMod {
  
  @JSImport("redux-test-utils/dist/utils/StoreMock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockStore[S, T /* <: AnyAction */](state: S): MockStore[S, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockStore")(state.asInstanceOf[js.Any]).asInstanceOf[MockStore[S, T]]
  
  inline def emptyStore(): OmitStoreAnyActionSymbolo = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyStore")().asInstanceOf[OmitStoreAnyActionSymbolo]
  
  /* Inlined parent std.Omit<redux.redux.Store<S, T>, 'Symbol.observable'> */
  /* Inlined parent redux-test-utils.redux-test-utils/dist/utils/DispatchMock.MockDispatch<T> */
  trait MockStore[S, T /* <: AnyAction */] extends StObject {
    
    def dispatch[T /* <: T */](action: T): T
    @JSName("dispatch")
    var dispatch_Original: (js.Function1[/* action */ Any, Any]) & Dispatch[T]
    
    def getAction(`type`: Any): js.UndefOr[AnyAction]
    
    def getActions(): js.Array[AnyAction]
    
    def getState(): S
    @JSName("getState")
    var getState_Original: js.Function0[S]
    
    def isActionDispatched(action: AnyAction): Boolean
    
    def isActionTypeDispatched(`type`: Any): Boolean
    
    def replaceReducer(nextReducer: Reducer[S, T]): /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any
    @JSName("replaceReducer")
    var replaceReducer_Original: js.Function1[
        /* nextReducer */ Reducer[S, T], 
        /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any
      ]
    
    def subscribe(listener: js.Function0[Unit]): Unsubscribe
    @JSName("subscribe")
    var subscribe_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe]
  }
  object MockStore {
    
    inline def apply[S, T /* <: AnyAction */](
      dispatch: (js.Function1[/* action */ Any, Any]) & Dispatch[T],
      getAction: Any => js.UndefOr[AnyAction],
      getActions: () => js.Array[AnyAction],
      getState: () => S,
      isActionDispatched: AnyAction => Boolean,
      isActionTypeDispatched: Any => Boolean,
      replaceReducer: /* nextReducer */ Reducer[S, T] => /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any,
      subscribe: /* listener */ js.Function0[Unit] => Unsubscribe
    ): MockStore[S, T] = {
      val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any], getAction = js.Any.fromFunction1(getAction), getActions = js.Any.fromFunction0(getActions), getState = js.Any.fromFunction0(getState), isActionDispatched = js.Any.fromFunction1(isActionDispatched), isActionTypeDispatched = js.Any.fromFunction1(isActionTypeDispatched), replaceReducer = js.Any.fromFunction1(replaceReducer), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[MockStore[S, T]]
    }
    
    extension [Self <: MockStore[?, ?], S, T /* <: AnyAction */](x: Self & (MockStore[S, T])) {
      
      inline def setDispatch(value: (js.Function1[/* action */ Any, Any]) & Dispatch[T]): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setGetAction(value: Any => js.UndefOr[AnyAction]): Self = StObject.set(x, "getAction", js.Any.fromFunction1(value))
      
      inline def setGetActions(value: () => js.Array[AnyAction]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
      
      inline def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setIsActionDispatched(value: AnyAction => Boolean): Self = StObject.set(x, "isActionDispatched", js.Any.fromFunction1(value))
      
      inline def setIsActionTypeDispatched(value: Any => Boolean): Self = StObject.set(x, "isActionTypeDispatched", js.Any.fromFunction1(value))
      
      inline def setReplaceReducer(
        value: /* nextReducer */ Reducer[S, T] => /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any
      ): Self = StObject.set(x, "replaceReducer", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: /* listener */ js.Function0[Unit] => Unsubscribe): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
}
