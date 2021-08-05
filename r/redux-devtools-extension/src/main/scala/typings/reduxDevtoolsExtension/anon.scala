package typings.reduxDevtoolsExtension

import typings.redux.mod.Func0
import typings.redux.mod.Func1
import typings.redux.mod.Func2
import typings.redux.mod.Func3
import typings.reduxDevtoolsExtension.reduxDevtoolsExtensionStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Date extends StObject {
    
    var date: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var function: js.UndefOr[Boolean | js.Function] = js.undefined
    
    var map: js.UndefOr[Boolean] = js.undefined
    
    var regex: js.UndefOr[Boolean] = js.undefined
    
    var set: js.UndefOr[Boolean] = js.undefined
    
    var symbol: js.UndefOr[Boolean] = js.undefined
    
    var undefined: js.UndefOr[Boolean] = js.undefined
  }
  object Date {
    
    inline def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    extension [Self <: Date](x: Self) {
      
      inline def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFunction(value: Boolean | js.Function): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setUndefined(value: Boolean): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      inline def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    }
  }
  
  trait Dispatch extends StObject {
    
    /**
      * dispatch custom actions or action creators
      */
    var dispatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * export history of actions in a file
      */
    var `export`: js.UndefOr[Boolean | custom] = js.undefined
    
    /**
      * import history of actions from a file
      */
    var `import`: js.UndefOr[Boolean | custom] = js.undefined
    
    /**
      * jump back and forth (time travelling)
      */
    var jump: js.UndefOr[Boolean] = js.undefined
    
    /**
      * lock/unlock dispatching actions and side effects
      */
    var lock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * start/pause recording of dispatched actions
      */
    var pause: js.UndefOr[Boolean] = js.undefined
    
    /**
      * persist states on page reloading
      */
    var persist: js.UndefOr[Boolean] = js.undefined
    
    /**
      * drag and drop actions in the history list
      */
    var reorder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * skip (cancel) actions
      */
    var skip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * generate tests for the selected actions
      */
    var test: js.UndefOr[Boolean] = js.undefined
  }
  object Dispatch {
    
    inline def apply(): Dispatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dispatch]
    }
    
    extension [Self <: Dispatch](x: Self) {
      
      inline def setDispatch(value: Boolean): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      inline def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      inline def setExport(value: Boolean | custom): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setImport(value: Boolean | custom): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      inline def setJump(value: Boolean): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setReorder(value: Boolean): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
      
      inline def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Function1[/* a */ js.Any, js.Any] = js.native
    def apply[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
    def apply[F /* <: js.Function */](f: F): F = js.native
    def apply[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
    def apply[A, R](f1: js.Function1[/* b */ A, R], f2: Func0[A]): Func0[R] = js.native
    def apply[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func0[A]): Func0[R] = js.native
    def apply[A, T1, R](f1: js.Function1[/* b */ A, R], f2: Func1[T1, A]): Func1[T1, R] = js.native
    def apply[A, B, C, R](
      f1: js.Function1[/* b */ C, R],
      f2: js.Function1[/* a */ B, C],
      f3: js.Function1[/* a */ A, B],
      f4: Func0[A]
    ): Func0[R] = js.native
    def apply[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func1[T1, A]): Func1[T1, R] = js.native
    def apply[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
    def apply[A, B, C, T1, R](
      f1: js.Function1[/* b */ C, R],
      f2: js.Function1[/* a */ B, C],
      f3: js.Function1[/* a */ A, B],
      f4: Func1[T1, A]
    ): Func1[T1, R] = js.native
    def apply[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
    def apply[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
    def apply[A, B, C, T1, T2, R](
      f1: js.Function1[/* b */ C, R],
      f2: js.Function1[/* a */ B, C],
      f3: js.Function1[/* a */ A, B],
      f4: Func2[T1, T2, A]
    ): Func2[T1, T2, R] = js.native
    def apply[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
    def apply[A, B, C, T1, T2, T3, R](
      f1: js.Function1[/* b */ C, R],
      f2: js.Function1[/* a */ B, C],
      f3: js.Function1[/* a */ A, B],
      f4: Func3[T1, T2, T3, A]
    ): Func3[T1, T2, T3, R] = js.native
  }
}
