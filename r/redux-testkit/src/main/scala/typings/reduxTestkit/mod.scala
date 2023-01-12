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
import typings.reduxThunk.esTypesMod.ThunkAction
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
    
    inline def createMiddleware(): (Middleware[js.Object, Any, Dispatch[AnyAction]]) & Flush = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")().asInstanceOf[(Middleware[js.Object, Any, Dispatch[AnyAction]]) & Flush]
  }
  
  inline def Reducer(action: typings.redux.mod.Reducer[Any, AnyAction]): ReducerTestkitwithStatest = ^.asInstanceOf[js.Dynamic].applyDynamic("Reducer")(action.asInstanceOf[js.Any]).asInstanceOf[ReducerTestkitwithStatest]
  
  inline def Selector(selector: js.Function2[/* state */ Any, /* action */ Any, Any]): Execute = ^.asInstanceOf[js.Dynamic].applyDynamic("Selector")(selector.asInstanceOf[js.Any]).asInstanceOf[Execute]
  
  inline def Thunk(thunkFunc: ThunkAction[Any, Any, Any, Any]): ThunkTestkitwithStatestat = ^.asInstanceOf[js.Dynamic].applyDynamic("Thunk")(thunkFunc.asInstanceOf[js.Any]).asInstanceOf[ThunkTestkitwithStatestat]
  inline def Thunk(thunkFunc: ThunkAction[Any, Any, Any, Any], extraArg: Any): ThunkTestkitwithStatestat = (^.asInstanceOf[js.Dynamic].applyDynamic("Thunk")(thunkFunc.asInstanceOf[js.Any], extraArg.asInstanceOf[js.Any])).asInstanceOf[ThunkTestkitwithStatestat]
  
  trait ReducerTestkit extends StObject {
    
    def execute(action: Action[Any]): Any
    
    def expect(action: Action[Any]): ToChangeInState
  }
  object ReducerTestkit {
    
    inline def apply(execute: Action[Any] => Any, expect: Action[Any] => ToChangeInState): ReducerTestkit = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect))
      __obj.asInstanceOf[ReducerTestkit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReducerTestkit] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: Action[Any] => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExpect(value: Action[Any] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
    }
  }
  
  trait ThunkTestkit extends StObject {
    
    def execute(args: Any*): Any
  }
  object ThunkTestkit {
    
    inline def apply(execute: /* repeated */ Any => Any): ThunkTestkit = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
      __obj.asInstanceOf[ThunkTestkit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThunkTestkit] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: /* repeated */ Any => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    }
  }
}
