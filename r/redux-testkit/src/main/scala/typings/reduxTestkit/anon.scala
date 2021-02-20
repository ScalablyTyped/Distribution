package typings.reduxTestkit

import typings.redux.mod.Action
import typings.reduxTestkit.mod.ReducerTestkit
import typings.reduxTestkit.mod.ThunkTestkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Execute extends StObject {
    
    def execute(state: js.Any, args: js.Any*): js.Any = js.native
    
    def expect(state: js.Any, args: js.Any*): ToReturn = js.native
  }
  object Execute {
    
    @scala.inline
    def apply(
      execute: (js.Any, /* repeated */ js.Any) => js.Any,
      expect: (js.Any, /* repeated */ js.Any) => ToReturn
    ): Execute = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), expect = js.Any.fromFunction2(expect))
      __obj.asInstanceOf[Execute]
    }
    
    @scala.inline
    implicit class ExecuteMutableBuilder[Self <: Execute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExpect(value: (js.Any, /* repeated */ js.Any) => ToReturn): Self = StObject.set(x, "expect", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Flush extends StObject {
    
    def flush(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  object Flush {
    
    @scala.inline
    def apply(flush: () => Unit, reset: () => Unit): Flush = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[Flush]
    }
    
    @scala.inline
    implicit class FlushMutableBuilder[Self <: Flush] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ReducerTestkit & {withState (state : any): redux-testkit.redux-testkit.ReducerTestkit} */
  @js.native
  trait ReducerTestkitwithStatest extends StObject {
    
    def execute(action: Action[_]): js.Any = js.native
    
    def expect(action: Action[_]): ToChangeInState = js.native
    
    def withState(state: js.Any): ReducerTestkit = js.native
  }
  object ReducerTestkitwithStatest {
    
    @scala.inline
    def apply(
      execute: Action[_] => js.Any,
      expect: Action[_] => ToChangeInState,
      withState: js.Any => ReducerTestkit
    ): ReducerTestkitwithStatest = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ReducerTestkitwithStatest]
    }
    
    @scala.inline
    implicit class ReducerTestkitwithStatestMutableBuilder[Self <: ReducerTestkitwithStatest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: Action[_] => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpect(value: Action[_] => ToChangeInState): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWithState(value: js.Any => ReducerTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined redux-testkit.redux-testkit.ThunkTestkit & {withState (state : any): redux-testkit.redux-testkit.ThunkTestkit} */
  @js.native
  trait ThunkTestkitwithStatestat extends StObject {
    
    def execute(args: js.Any*): js.Any = js.native
    
    def withState(state: js.Any): ThunkTestkit = js.native
  }
  object ThunkTestkitwithStatestat {
    
    @scala.inline
    def apply(execute: /* repeated */ js.Any => js.Any, withState: js.Any => ThunkTestkit): ThunkTestkitwithStatestat = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), withState = js.Any.fromFunction1(withState))
      __obj.asInstanceOf[ThunkTestkitwithStatestat]
    }
    
    @scala.inline
    implicit class ThunkTestkitwithStatestatMutableBuilder[Self <: ThunkTestkitwithStatestat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWithState(value: js.Any => ThunkTestkit): Self = StObject.set(x, "withState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ToChangeInState extends StObject {
    
    def toChangeInState(expectedChanges: js.Any): Unit = js.native
    
    def toReturnState(expected: js.Any): Unit = js.native
    
    def toStayTheSame(): Unit = js.native
  }
  object ToChangeInState {
    
    @scala.inline
    def apply(toChangeInState: js.Any => Unit, toReturnState: js.Any => Unit, toStayTheSame: () => Unit): ToChangeInState = {
      val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
      __obj.asInstanceOf[ToChangeInState]
    }
    
    @scala.inline
    implicit class ToChangeInStateMutableBuilder[Self <: ToChangeInState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToChangeInState(value: js.Any => Unit): Self = StObject.set(x, "toChangeInState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToReturnState(value: js.Any => Unit): Self = StObject.set(x, "toReturnState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToStayTheSame(value: () => Unit): Self = StObject.set(x, "toStayTheSame", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ToReturn extends StObject {
    
    def toReturn(expected: js.Any): Unit = js.native
  }
  object ToReturn {
    
    @scala.inline
    def apply(toReturn: js.Any => Unit): ToReturn = {
      val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
      __obj.asInstanceOf[ToReturn]
    }
    
    @scala.inline
    implicit class ToReturnMutableBuilder[Self <: ToReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToReturn(value: js.Any => Unit): Self = StObject.set(x, "toReturn", js.Any.fromFunction1(value))
    }
  }
}
