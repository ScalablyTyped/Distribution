package typings.reduxTestUtils

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.redux.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<redux.redux.Store<{}, redux.redux.AnyAction>, 'Symbol.observable'> */
  trait OmitStoreAnyActionSymbolo extends StObject {
    
    def dispatch[T /* <: AnyAction */](action: T): T
    @JSName("dispatch")
    var dispatch_Original: js.Function1[/* action */ AnyAction, AnyAction]
    
    def getState(): js.Object
    @JSName("getState")
    var getState_Original: js.Function0[js.Object]
    
    def replaceReducer(nextReducer: Reducer[js.Object, AnyAction]): /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any
    @JSName("replaceReducer")
    var replaceReducer_Original: js.Function1[
        /* nextReducer */ Reducer[js.Object, AnyAction], 
        /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any
      ]
    
    def subscribe(listener: js.Function0[Unit]): Unsubscribe
    @JSName("subscribe")
    var subscribe_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe]
  }
  object OmitStoreAnyActionSymbolo {
    
    inline def apply(
      dispatch: /* action */ AnyAction => AnyAction,
      getState: () => js.Object,
      replaceReducer: /* nextReducer */ Reducer[js.Object, AnyAction] => /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any,
      subscribe: /* listener */ js.Function0[Unit] => Unsubscribe
    ): OmitStoreAnyActionSymbolo = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), getState = js.Any.fromFunction0(getState), replaceReducer = js.Any.fromFunction1(replaceReducer), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[OmitStoreAnyActionSymbolo]
    }
    
    extension [Self <: OmitStoreAnyActionSymbolo](x: Self) {
      
      inline def setDispatch(value: /* action */ AnyAction => AnyAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setGetState(value: () => js.Object): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setReplaceReducer(
        value: /* nextReducer */ Reducer[js.Object, AnyAction] => /* import warning: importer.ImportType#apply Failed type conversion: void[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any
      ): Self = StObject.set(x, "replaceReducer", js.Any.fromFunction1(value))
      
      inline def setSubscribe(value: /* listener */ js.Function0[Unit] => Unsubscribe): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
}
