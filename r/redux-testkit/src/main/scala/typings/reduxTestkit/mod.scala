package typings.reduxTestkit

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxTestkit.anon.Execute
import typings.reduxTestkit.anon.Flush
import typings.reduxTestkit.anon.ReducerTestkitwithStatest
import typings.reduxTestkit.anon.ThunkTestkitwithStatestat
import typings.reduxTestkit.anon.ToChangeInState
import typings.reduxThunk.mod.ThunkAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-testkit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object FlushThunks {
    
    @JSImport("redux-testkit", "FlushThunks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMiddleware(): (Middleware[js.Object, js.Any, Dispatch[AnyAction]]) & Flush = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")().asInstanceOf[(Middleware[js.Object, js.Any, Dispatch[AnyAction]]) & Flush]
  }
  
  inline def Reducer(action: typings.redux.mod.Reducer[js.Any, AnyAction]): ReducerTestkitwithStatest = ^.asInstanceOf[js.Dynamic].applyDynamic("Reducer")(action.asInstanceOf[js.Any]).asInstanceOf[ReducerTestkitwithStatest]
  
  inline def Selector(selector: js.Function2[/* state */ js.Any, /* action */ js.Any, js.Any]): Execute = ^.asInstanceOf[js.Dynamic].applyDynamic("Selector")(selector.asInstanceOf[js.Any]).asInstanceOf[Execute]
  
  inline def Thunk(thunkFunc: ThunkAction[js.Any, js.Any, js.Any, js.Any]): ThunkTestkitwithStatestat = ^.asInstanceOf[js.Dynamic].applyDynamic("Thunk")(thunkFunc.asInstanceOf[js.Any]).asInstanceOf[ThunkTestkitwithStatestat]
  inline def Thunk(thunkFunc: ThunkAction[js.Any, js.Any, js.Any, js.Any], extraArg: js.Any): ThunkTestkitwithStatestat = (^.asInstanceOf[js.Dynamic].applyDynamic("Thunk")(thunkFunc.asInstanceOf[js.Any], extraArg.asInstanceOf[js.Any])).asInstanceOf[ThunkTestkitwithStatestat]
  
  trait ReducerTestkit extends StObject {
    
    def execute(action: Action[js.Any]): js.Any
    
    def expect(action: Action[js.Any]): ToChangeInState
  }
  object ReducerTestkit {
    
    inline def apply(execute: Action[js.Any] => js.Any, expect: Action[js.Any] => ToChangeInState): ReducerTestkit = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect))
      __obj.asInstanceOf[ReducerTestkit]
    }
    
    extension [Self <: ReducerTestkit](x: Self) {
      
      inline def setExecute(value: Action[js.Any] => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExpect(value: Action[js.Any] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
    }
  }
  
  trait ThunkTestkit extends StObject {
    
    def execute(args: js.Any*): js.Any
  }
  object ThunkTestkit {
    
    inline def apply(execute: /* repeated */ js.Any => js.Any): ThunkTestkit = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
      __obj.asInstanceOf[ThunkTestkit]
    }
    
    extension [Self <: ThunkTestkit](x: Self) {
      
      inline def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    }
  }
}
