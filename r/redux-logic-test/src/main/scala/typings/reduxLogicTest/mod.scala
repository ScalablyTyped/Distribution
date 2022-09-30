package typings.reduxLogicTest

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import typings.reduxLogicTest.anon.Enumerable
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-logic-test", "createMockStore")
  @js.native
  val createMockStore: CreateMockStore_ = js.native
  
  trait CreateMockStoreOptions[State /* <: js.Object */, Dependency /* <: js.Object */] extends StObject {
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var injectedDeps: js.UndefOr[Dependency] = js.undefined
    
    var logic: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logic<State, Dependency> */ Any
        ]
      ] = js.undefined
    
    var middleware: js.UndefOr[js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]] = js.undefined
    
    var reducer: js.UndefOr[Reducer[Any, AnyAction]] = js.undefined
  }
  object CreateMockStoreOptions {
    
    inline def apply[State /* <: js.Object */, Dependency /* <: js.Object */](): CreateMockStoreOptions[State, Dependency] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMockStoreOptions[State, Dependency]]
    }
    
    extension [Self <: CreateMockStoreOptions[?, ?], State /* <: js.Object */, Dependency /* <: js.Object */](x: Self & (CreateMockStoreOptions[State, Dependency])) {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setInjectedDeps(value: Dependency): Self = StObject.set(x, "injectedDeps", value.asInstanceOf[js.Any])
      
      inline def setInjectedDepsUndefined: Self = StObject.set(x, "injectedDeps", js.undefined)
      
      inline def setLogic(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logic<State, Dependency> */ Any
            ]
      ): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
      
      inline def setLogicUndefined: Self = StObject.set(x, "logic", js.undefined)
      
      inline def setLogicVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Logic<State, Dependency> */ Any)*
      ): Self = StObject.set(x, "logic", js.Array(value*))
      
      inline def setMiddleware(value: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setMiddlewareVarargs(value: (Middleware[js.Object, Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "middleware", js.Array(value*))
      
      inline def setReducer(value: (/* state */ js.UndefOr[Any], AnyAction) => Any): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
      
      inline def setReducerUndefined: Self = StObject.set(x, "reducer", js.undefined)
    }
  }
  
  type CreateMockStore_ = js.Function1[
    /* options */ js.UndefOr[CreateMockStoreOptions[js.Object, js.Object]], 
    MockStore[
      js.Object, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any
    ]
  ]
  
  @js.native
  trait MockStore[State /* <: js.Object */, Actions /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any */]
    extends StObject
       with Store[State, Actions] {
    
    var actions: Enumerable[Actions] = js.native
    
    var logicMiddleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LogicMiddleware */ Any = js.native
    
    def resetActions(): Unit = js.native
    
    def whenComplete(callback: js.Function0[Unit]): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LogicMiddleware * / any['whenComplete'] */ js.Any
      ] = js.native
  }
}
