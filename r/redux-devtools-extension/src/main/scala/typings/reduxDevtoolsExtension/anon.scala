package typings.reduxDevtoolsExtension

import typings.redux.mod.Func0
import typings.redux.mod.Func1
import typings.redux.mod.Func2
import typings.redux.mod.Func3
import typings.reduxDevtoolsExtension.reduxDevtoolsExtensionStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Date extends StObject {
    
    var date: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[Boolean] = js.native
    
    var function: js.UndefOr[Boolean | js.Function] = js.native
    
    var map: js.UndefOr[Boolean] = js.native
    
    var regex: js.UndefOr[Boolean] = js.native
    
    var set: js.UndefOr[Boolean] = js.native
    
    var symbol: js.UndefOr[Boolean] = js.native
    
    var undefined: js.UndefOr[Boolean] = js.native
  }
  object Date {
    
    @scala.inline
    def apply(): Date = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFunction(value: Boolean | js.Function): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setUndefined(value: Boolean): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefinedUndefined: Self = StObject.set(x, "undefined", js.undefined)
    }
  }
  
  @js.native
  trait Dispatch extends StObject {
    
    /**
      * dispatch custom actions or action creators
      */
    var dispatch: js.UndefOr[Boolean] = js.native
    
    /**
      * export history of actions in a file
      */
    var export: js.UndefOr[Boolean | custom] = js.native
    
    /**
      * import history of actions from a file
      */
    var `import`: js.UndefOr[Boolean | custom] = js.native
    
    /**
      * jump back and forth (time travelling)
      */
    var jump: js.UndefOr[Boolean] = js.native
    
    /**
      * lock/unlock dispatching actions and side effects
      */
    var lock: js.UndefOr[Boolean] = js.native
    
    /**
      * start/pause recording of dispatched actions
      */
    var pause: js.UndefOr[Boolean] = js.native
    
    /**
      * persist states on page reloading
      */
    var persist: js.UndefOr[Boolean] = js.native
    
    /**
      * drag and drop actions in the history list
      */
    var reorder: js.UndefOr[Boolean] = js.native
    
    /**
      * skip (cancel) actions
      */
    var skip: js.UndefOr[Boolean] = js.native
    
    /**
      * generate tests for the selected actions
      */
    var test: js.UndefOr[Boolean] = js.native
  }
  object Dispatch {
    
    @scala.inline
    def apply(): Dispatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dispatch]
    }
    
    @scala.inline
    implicit class DispatchMutableBuilder[Self <: Dispatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispatch(value: Boolean): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchUndefined: Self = StObject.set(x, "dispatch", js.undefined)
      
      @scala.inline
      def setExport(value: Boolean | custom): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      @scala.inline
      def setImport(value: Boolean | custom): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
      
      @scala.inline
      def setJump(value: Boolean): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
      
      @scala.inline
      def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      @scala.inline
      def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      @scala.inline
      def setReorder(value: Boolean): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
      
      @scala.inline
      def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): js.Function1[/* a */ js.Any, _] = js.native
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
