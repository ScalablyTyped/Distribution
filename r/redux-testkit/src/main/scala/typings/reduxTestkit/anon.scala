package typings.reduxTestkit

import typings.redux.mod.Action
import typings.reduxTestkit.mod.ReducerTestkit
import typings.reduxTestkit.mod.ThunkTestkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Execute extends StObject {
    
    def execute(state: Any, args: Any*): Any
    
    def expect(state: Any, args: Any*): ToReturn
  }
  object Execute {
    
    inline def apply(execute: (Any, /* repeated */ Any) => Any, expect: (Any, /* repeated */ Any) => ToReturn): Execute = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
      __obj.asInstanceOf[Execute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Execute] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      inline def setExpect(value: (Any, /* repeated */ Any) => ToReturn): Self = StObject.set(x, "expect", js.Any.fromFunction2(value))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Flush] (val x: Self) extends AnyVal {
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
  trait ReducerTestkitwithStatest extends StObject {
    
    def execute(action: Action[Any]): Any
    
    def expect(action: Action[Any]): ToChangeInState
    
    def withState(state: Any): ReducerTestkit
  }
  object ReducerTestkitwithStatest {
    
    inline def apply(
      execute: Action[Any] => Any,
      expect: Action[Any] => ToChangeInState,
      withState: Any => ReducerTestkit
    ): ReducerTestkitwithStatest = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ReducerTestkitwithStatest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReducerTestkitwithStatest] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: Action[Any] => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExpect(value: Action[Any] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
      
      inline def setWithState(value: Any => ReducerTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
  trait ThunkTestkitwithStatestat extends StObject {
    
    def execute(args: Any*): Any
    
    def withState(state: Any): ThunkTestkit
  }
  object ThunkTestkitwithStatestat {
    
    inline def apply(execute: /* repeated */ Any => Any, withState: Any => ThunkTestkit): ThunkTestkitwithStatestat = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ThunkTestkitwithStatestat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThunkTestkitwithStatestat] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: /* repeated */ Any => Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setWithState(value: Any => ThunkTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  trait ToChangeInState extends StObject {
    
    def toChangeInState(expectedChanges: Any): Unit
    
    def toReturnState(expected: Any): Unit
    
    def toStayTheSame(): Unit
  }
  object ToChangeInState {
    
    inline def apply(toChangeInState: Any => Unit, toReturnState: Any => Unit, toStayTheSame: () => Unit): ToChangeInState = {
      val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
      __obj.asInstanceOf[ToChangeInState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToChangeInState] (val x: Self) extends AnyVal {
      
      inline def setToChangeInState(value: Any => Unit): Self = StObject.set(x, "toChangeInState", js.Any.fromFunction1(value))
      
      inline def setToReturnState(value: Any => Unit): Self = StObject.set(x, "toReturnState", js.Any.fromFunction1(value))
      
      inline def setToStayTheSame(value: () => Unit): Self = StObject.set(x, "toStayTheSame", js.Any.fromFunction0(value))
    }
  }
  
  trait ToReturn extends StObject {
    
    def toReturn(expected: Any): Unit
  }
  object ToReturn {
    
    inline def apply(toReturn: Any => Unit): ToReturn = {
      val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
      __obj.asInstanceOf[ToReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToReturn] (val x: Self) extends AnyVal {
      
      inline def setToReturn(value: Any => Unit): Self = StObject.set(x, "toReturn", js.Any.fromFunction1(value))
    }
  }
}
