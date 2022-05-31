package typings.regeneratorRuntime

import typings.regeneratorRuntime.mod.InnerFunction
import typings.regeneratorRuntime.mod.ResolvablePromiseConstructorLike
import typings.regeneratorRuntime.mod.TryLocationsList
import typings.std.ArrayLike
import typings.std.Exclude
import typings.std.Generator
import typings.std.GeneratorFunction
import typings.std.Iterable
import typings.std.Iterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object regeneratorRuntime {
    
    @JSGlobal("regeneratorRuntime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("regeneratorRuntime.AsyncIterator")
    @js.native
    class AsyncIterator[TYield, TReturn, TNext] protected ()
      extends typings.regeneratorRuntime.mod.AsyncIterator[TYield, TReturn, TNext] {
      def this(
        generator: Generator[
                TYield | js.Thenable[TYield] | typings.regeneratorRuntime.mod.awrap[js.Any], 
                TReturn | js.Thenable[TReturn] | typings.regeneratorRuntime.mod.awrap[js.Any], 
                js.Any
              ],
        PromiseImpl: ResolvablePromiseConstructorLike
      ) = this()
    }
    
    inline def async[T, TReturn](innerFn: InnerFunction[T, js.Any, TReturn, js.Any]): js.Promise[TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: T
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: T,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: T,
      tryLocsList: TryLocationsList
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: T,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: Unit,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: Unit,
      tryLocsList: TryLocationsList
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: Unit,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: T
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: T,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: T,
      tryLocsList: TryLocationsList
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: T,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: Unit,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: Unit,
      tryLocsList: TryLocationsList
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: Unit,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: T
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: T,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: T,
      tryLocsList: TryLocationsList
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: T,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: Unit,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: Unit,
      tryLocsList: TryLocationsList
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TReturn](
      innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: Unit,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
    inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction, self: T): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](
      innerFn: InnerFunction[T, TYield, TReturn, js.Any],
      outerFn: GeneratorFunction,
      self: T,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](
      innerFn: InnerFunction[T, TYield, TReturn, js.Any],
      outerFn: GeneratorFunction,
      self: T,
      tryLocsList: TryLocationsList
    ): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](
      innerFn: InnerFunction[T, TYield, TReturn, js.Any],
      outerFn: GeneratorFunction,
      self: T,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](
      innerFn: InnerFunction[T, TYield, TReturn, js.Any],
      outerFn: GeneratorFunction,
      self: Unit,
      tryLocsList: Unit,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](
      innerFn: InnerFunction[T, TYield, TReturn, js.Any],
      outerFn: GeneratorFunction,
      self: Unit,
      tryLocsList: TryLocationsList
    ): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    inline def async[T, TYield, TReturn](
      innerFn: InnerFunction[T, TYield, TReturn, js.Any],
      outerFn: GeneratorFunction,
      self: Unit,
      tryLocsList: TryLocationsList,
      PromiseImpl: ResolvablePromiseConstructorLike
    ): typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
        Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
        js.Any
      ]]
    
    @JSGlobal("regeneratorRuntime.awrap")
    @js.native
    class awrap[V] protected ()
      extends typings.regeneratorRuntime.mod.awrap[V] {
      def this(arg: V) = this()
    }
    object awrap {
      
      @JSGlobal("regeneratorRuntime.awrap")
      @js.native
      def apply[V](arg: V): typings.regeneratorRuntime.mod.awrap[V] = js.native
    }
    
    object global {
      
      /* was `typeof imported_regenerator-runtime` */
      object regeneratorRuntime {
        
        @JSGlobal("regeneratorRuntime")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("regeneratorRuntime.AsyncIterator")
        @js.native
        class AsyncIterator[TYield, TReturn, TNext] protected ()
          extends typings.regeneratorRuntime.mod.global.regeneratorRuntime.AsyncIterator[TYield, TReturn, TNext] {
          def this(
            generator: Generator[
                        TYield | js.Thenable[TYield] | typings.regeneratorRuntime.mod.awrap[js.Any], 
                        TReturn | js.Thenable[TReturn] | typings.regeneratorRuntime.mod.awrap[js.Any], 
                        js.Any
                      ],
            PromiseImpl: ResolvablePromiseConstructorLike
          ) = this()
        }
        
        inline def async[T, TReturn](innerFn: InnerFunction[T, js.Any, TReturn, js.Any]): js.Promise[TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: T
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: T,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: T,
          tryLocsList: TryLocationsList
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: T,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: Unit,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: Unit,
          tryLocsList: TryLocationsList
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: Unit,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: T
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: T,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: T,
          tryLocsList: TryLocationsList
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: T,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: Unit,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: Unit,
          tryLocsList: TryLocationsList
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: Unit,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: T
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: T,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: T,
          tryLocsList: TryLocationsList
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: T,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: Unit,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: Unit,
          tryLocsList: TryLocationsList
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TReturn](
          innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: Unit,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
        inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction, self: T): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](
          innerFn: InnerFunction[T, TYield, TReturn, js.Any],
          outerFn: GeneratorFunction,
          self: T,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](
          innerFn: InnerFunction[T, TYield, TReturn, js.Any],
          outerFn: GeneratorFunction,
          self: T,
          tryLocsList: TryLocationsList
        ): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](
          innerFn: InnerFunction[T, TYield, TReturn, js.Any],
          outerFn: GeneratorFunction,
          self: T,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](
          innerFn: InnerFunction[T, TYield, TReturn, js.Any],
          outerFn: GeneratorFunction,
          self: Unit,
          tryLocsList: Unit,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](
          innerFn: InnerFunction[T, TYield, TReturn, js.Any],
          outerFn: GeneratorFunction,
          self: Unit,
          tryLocsList: TryLocationsList
        ): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        inline def async[T, TYield, TReturn](
          innerFn: InnerFunction[T, TYield, TReturn, js.Any],
          outerFn: GeneratorFunction,
          self: Unit,
          tryLocsList: TryLocationsList,
          PromiseImpl: ResolvablePromiseConstructorLike
        ): typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
                Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
                js.Any
              ]]
        
        @JSGlobal("regeneratorRuntime.awrap")
        @js.native
        class awrap[V] protected ()
          extends typings.regeneratorRuntime.mod.global.regeneratorRuntime.awrap[V] {
          def this(arg: V) = this()
        }
        object awrap {
          
          @JSGlobal("regeneratorRuntime.awrap")
          @js.native
          def apply[V](arg: V): typings.regeneratorRuntime.mod.awrap[V] = js.native
        }
        
        inline def isGeneratorFunction(func: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
        
        inline def keys(`object`: js.Object): js.Function0[IteratorResult[String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[IteratorResult[String, Unit]]]
        
        inline def mark[F /* <: js.Function */](genFun: F): F & GeneratorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(genFun.asInstanceOf[js.Any]).asInstanceOf[F & GeneratorFunction]
        
        inline def values[T](iterableOrArrayLike: ArrayLike[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
        inline def values[T](iterableOrArrayLike: Iterable[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
        inline def values[I /* <: Iterator[js.Any, js.Any, js.Any] */](iterable: typings.regeneratorRuntime.anon.Iterator[I]): I = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterable.asInstanceOf[js.Any]).asInstanceOf[I]
        
        inline def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any]).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: T
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: T,
          tryLocsList: TryLocationsList
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: js.Function,
          self: Unit,
          tryLocsList: TryLocationsList
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: T
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: T,
          tryLocsList: TryLocationsList
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: Null,
          self: Unit,
          tryLocsList: TryLocationsList
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: T
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: T,
          tryLocsList: TryLocationsList
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
        inline def wrap[T, TYield, TReturn, TNext](
          innerFn: InnerFunction[T, TYield, TReturn, TNext],
          // tslint:disable-next-line: ban-types
        outerFn: Unit,
          self: Unit,
          tryLocsList: TryLocationsList
        ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      }
    }
    
    inline def isGeneratorFunction(func: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
    
    inline def keys(`object`: js.Object): js.Function0[IteratorResult[String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[IteratorResult[String, Unit]]]
    
    inline def mark[F /* <: js.Function */](genFun: F): F & GeneratorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(genFun.asInstanceOf[js.Any]).asInstanceOf[F & GeneratorFunction]
    
    inline def values[T](iterableOrArrayLike: ArrayLike[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
    inline def values[T](iterableOrArrayLike: Iterable[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
    inline def values[I /* <: Iterator[js.Any, js.Any, js.Any] */](iterable: typings.regeneratorRuntime.anon.Iterator[I]): I = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterable.asInstanceOf[js.Any]).asInstanceOf[I]
    
    inline def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any]).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: T
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: T,
      tryLocsList: TryLocationsList
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: js.Function,
      self: Unit,
      tryLocsList: TryLocationsList
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: T
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: T,
      tryLocsList: TryLocationsList
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: Null,
      self: Unit,
      tryLocsList: TryLocationsList
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: T
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: T,
      tryLocsList: TryLocationsList
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    inline def wrap[T, TYield, TReturn, TNext](
      innerFn: InnerFunction[T, TYield, TReturn, TNext],
      // tslint:disable-next-line: ban-types
    outerFn: Unit,
      self: Unit,
      tryLocsList: TryLocationsList
    ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  }
}
