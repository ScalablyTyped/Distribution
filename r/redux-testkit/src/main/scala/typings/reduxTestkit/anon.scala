package typings.reduxTestkit

import typings.redux.mod.Action
import typings.reduxTestkit.mod.ReducerTestkit
import typings.reduxTestkit.mod.ThunkTestkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Execute extends StObject {
    
    def execute(state: js.Any, args: js.Any*): js.Any
    
    def expect(state: js.Any, args: js.Any*): ToReturn
  }
  object Execute {
    
    inline def apply(
      execute: (js.Any, /* repeated */ js.Any) => js.Any,
      expect: (js.Any, /* repeated */ js.Any) => ToReturn
    ): Execute = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
      __obj.asInstanceOf[Execute]
    }
    
    extension [Self <: Execute](x: Self) {
      
      inline def setExecute(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      inline def setExpect(value: (js.Any, /* repeated */ js.Any) => ToReturn): Self = StObject.set(x, "expect", js.Any.fromFunction2(value))
    }
  }
  
  trait Flush extends StObject {
    
    def flush(): Unit
    
    def reset(): Unit
  }
  object Flush {
    
    inline def apply(flush: () => Unit, reset: () => Unit): Flush = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Flush]
    }
    
    extension [Self <: Flush](x: Self) {
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
  trait ReducerTestkitwithStatest extends StObject {
    
    def execute(action: Action[js.Any]): js.Any
    
    def expect(action: Action[js.Any]): ToChangeInState
    
    def withState(state: js.Any): ReducerTestkit
  }
  object ReducerTestkitwithStatest {
    
    inline def apply(
      execute: Action[js.Any] => js.Any,
      expect: Action[js.Any] => ToChangeInState,
      withState: js.Any => ReducerTestkit
    ): ReducerTestkitwithStatest = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ReducerTestkitwithStatest]
    }
    
    extension [Self <: ReducerTestkitwithStatest](x: Self) {
      
      inline def setExecute(value: Action[js.Any] => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExpect(value: Action[js.Any] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
      
      inline def setWithState(value: js.Any => ReducerTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
  trait ThunkTestkitwithStatestat extends StObject {
    
    def execute(args: js.Any*): js.Any
    
    def withState(state: js.Any): ThunkTestkit
  }
  object ThunkTestkitwithStatestat {
    
    inline def apply(execute: /* repeated */ js.Any => js.Any, withState: js.Any => ThunkTestkit): ThunkTestkitwithStatestat = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ThunkTestkitwithStatestat]
    }
    
    extension [Self <: ThunkTestkitwithStatestat](x: Self) {
      
      inline def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setWithState(value: js.Any => ThunkTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  trait ToChangeInState extends StObject {
    
    def toChangeInState(expectedChanges: js.Any): Unit
    
    def toReturnState(expected: js.Any): Unit
    
    def toStayTheSame(): Unit
  }
  object ToChangeInState {
    
    inline def apply(toChangeInState: js.Any => Unit, toReturnState: js.Any => Unit, toStayTheSame: () => Unit): ToChangeInState = {
      val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
      __obj.asInstanceOf[ToChangeInState]
    }
    
    extension [Self <: ToChangeInState](x: Self) {
      
      inline def setToChangeInState(value: js.Any => Unit): Self = StObject.set(x, "toChangeInState", js.Any.fromFunction1(value))
      
      inline def setToReturnState(value: js.Any => Unit): Self = StObject.set(x, "toReturnState", js.Any.fromFunction1(value))
      
      inline def setToStayTheSame(value: () => Unit): Self = StObject.set(x, "toStayTheSame", js.Any.fromFunction0(value))
    }
  }
  
  trait ToReturn extends StObject {
    
    def toReturn(expected: js.Any): Unit
  }
  object ToReturn {
    
    inline def apply(toReturn: js.Any => Unit): ToReturn = {
      val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
      __obj.asInstanceOf[ToReturn]
    }
    
    extension [Self <: ToReturn](x: Self) {
      
      inline def setToReturn(value: js.Any => Unit): Self = StObject.set(x, "toReturn", js.Any.fromFunction1(value))
    }
  }
}
