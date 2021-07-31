package typings.regeneratorRuntime

import org.scalablytyped.runtime.StringDictionary
import typings.regeneratorRuntime.anon.ReadonlyCompletionRecord
import typings.regeneratorRuntime.anon.`0`
import typings.regeneratorRuntime.anon.readonlytryLocrootOmitTry
import typings.regeneratorRuntime.regeneratorRuntimeStrings.`return`
import typings.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
import typings.regeneratorRuntime.regeneratorRuntimeStrings.break
import typings.regeneratorRuntime.regeneratorRuntimeStrings.continue
import typings.regeneratorRuntime.regeneratorRuntimeStrings.end
import typings.regeneratorRuntime.regeneratorRuntimeStrings.next
import typings.std.ArrayLike
import typings.std.AsyncGenerator
import typings.std.Exclude
import typings.std.Generator
import typings.std.GeneratorFunction
import typings.std.Iterable
import typings.std.Iterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("regenerator-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("regenerator-runtime", "AsyncIterator")
  @js.native
  class AsyncIterator[TYield, TReturn, TNext] protected ()
    extends StObject
       with AsyncGenerator[TYield, TReturn, TNext] {
    def this(
      generator: Generator[
            TYield | js.Thenable[TYield] | awrap[js.Any], 
            TReturn | js.Thenable[TReturn] | awrap[js.Any], 
            js.Any
          ],
      PromiseImpl: ResolvablePromiseConstructorLike
    ) = this()
    
    @JSName("return")
    def return_MAsyncIterator(value: TReturn): js.Promise[IteratorResult[TYield, TReturn]] = js.native
    @JSName("return")
    def return_MAsyncIterator(value: js.Thenable[TReturn]): js.Promise[IteratorResult[TYield, TReturn]] = js.native
    
    @JSName("throw")
    def throw_MAsyncIterator(e: js.Any): js.Promise[IteratorResult[TYield, TReturn]] = js.native
  }
  
  @scala.inline
  def async[T, TReturn](innerFn: InnerFunction[T, js.Any, TReturn, js.Any]): js.Promise[TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: TryLocationsList
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TReturn](
    innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
  @scala.inline
  def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction, self: T): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, js.Any],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, js.Any],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: TryLocationsList
  ): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, js.Any],
    outerFn: GeneratorFunction,
    self: T,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, js.Any],
    outerFn: GeneratorFunction,
    self: Unit,
    tryLocsList: Unit,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, js.Any],
    outerFn: GeneratorFunction,
    self: Unit,
    tryLocsList: TryLocationsList
  ): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  @scala.inline
  def async[T, TYield, TReturn](
    innerFn: InnerFunction[T, TYield, TReturn, js.Any],
    outerFn: GeneratorFunction,
    self: Unit,
    tryLocsList: TryLocationsList,
    PromiseImpl: ResolvablePromiseConstructorLike
  ): AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[AsyncIterator[Exclude[TYield, awrap[js.Any]], Exclude[TReturn, awrap[js.Any]], js.Any]]
  
  @JSImport("regenerator-runtime", "awrap")
  @js.native
  class awrap[V] protected () extends StObject {
    def this(arg: V) = this()
    
    val __await: V = js.native
    
    // Used to tell TypeScript that this class is to be treated as a nominal type:
    val `private`: js.Any = js.native
  }
  object awrap {
    
    @JSImport("regenerator-runtime", "awrap")
    @js.native
    def apply[V](arg: V): awrap[V] = js.native
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
      
      @scala.inline
      def async[T, TReturn](innerFn: InnerFunction[T, js.Any, TReturn, js.Any]): js.Promise[TReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: Unit,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: TryLocationsList
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TReturn](
        innerFn: InnerFunction[T, js.Any, TReturn, js.Any],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: TryLocationsList,
        PromiseImpl: ResolvablePromiseConstructorLike
      ): js.Promise[TReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any], PromiseImpl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TReturn]]
      @scala.inline
      def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction): typings.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            js.Any
          ]]
      @scala.inline
      def async[T, TYield, TReturn](innerFn: InnerFunction[T, TYield, TReturn, js.Any], outerFn: GeneratorFunction, self: T): typings.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            js.Any
          ] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[typings.regeneratorRuntime.mod.AsyncIterator[
            Exclude[TYield, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            Exclude[TReturn, typings.regeneratorRuntime.mod.awrap[js.Any]], 
            js.Any
          ]]
      @scala.inline
      def async[T, TYield, TReturn](
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
      @scala.inline
      def async[T, TYield, TReturn](
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
      @scala.inline
      def async[T, TYield, TReturn](
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
      @scala.inline
      def async[T, TYield, TReturn](
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
      @scala.inline
      def async[T, TYield, TReturn](
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
      @scala.inline
      def async[T, TYield, TReturn](
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
      
      @scala.inline
      def isGeneratorFunction(func: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
      
      @scala.inline
      def keys(`object`: js.Object): js.Function0[IteratorResult[String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[IteratorResult[String, Unit]]]
      
      @scala.inline
      def mark[F /* <: js.Function */](genFun: F): F & GeneratorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(genFun.asInstanceOf[js.Any]).asInstanceOf[F & GeneratorFunction]
      
      @scala.inline
      def values[T](iterableOrArrayLike: ArrayLike[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
      @scala.inline
      def values[T](iterableOrArrayLike: Iterable[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
      @scala.inline
      def values[I /* <: Iterator[js.Any, js.Any, js.Any] */](iterable: typings.regeneratorRuntime.anon.Iterator[I]): I = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterable.asInstanceOf[js.Any]).asInstanceOf[I]
      
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any]).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: js.Function,
        self: Unit,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Null,
        self: Unit,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: T,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
      @scala.inline
      def wrap[T, TYield, TReturn, TNext](
        innerFn: InnerFunction[T, TYield, TReturn, TNext],
        // tslint:disable-next-line: ban-types
      outerFn: Unit,
        self: Unit,
        tryLocsList: TryLocationsList
      ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
    }
  }
  
  @scala.inline
  def isGeneratorFunction(func: js.Any): /* is std.GeneratorFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratorFunction")(func.asInstanceOf[js.Any]).asInstanceOf[/* is std.GeneratorFunction */ Boolean]
  
  @scala.inline
  def keys(`object`: js.Object): js.Function0[IteratorResult[String, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Function0[IteratorResult[String, Unit]]]
  
  @scala.inline
  def mark[F /* <: js.Function */](genFun: F): F & GeneratorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("mark")(genFun.asInstanceOf[js.Any]).asInstanceOf[F & GeneratorFunction]
  
  @scala.inline
  def values[T](iterableOrArrayLike: ArrayLike[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
  @scala.inline
  def values[T](iterableOrArrayLike: Iterable[T]): Iterator[T, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterableOrArrayLike.asInstanceOf[js.Any]).asInstanceOf[Iterator[T, js.Any, js.Any]]
  @scala.inline
  def values[I /* <: Iterator[js.Any, js.Any, js.Any] */](iterable: typings.regeneratorRuntime.anon.Iterator[I]): I = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(iterable.asInstanceOf[js.Any]).asInstanceOf[I]
  
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](innerFn: InnerFunction[T, TYield, TReturn, TNext]): Generator[TYield, TReturn, TNext] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any]).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: js.Function,
    self: Unit,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Null,
    self: Unit,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: T,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  @scala.inline
  def wrap[T, TYield, TReturn, TNext](
    innerFn: InnerFunction[T, TYield, TReturn, TNext],
    // tslint:disable-next-line: ban-types
  outerFn: Unit,
    self: Unit,
    tryLocsList: TryLocationsList
  ): Generator[TYield, TReturn, TNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(innerFn.asInstanceOf[js.Any], outerFn.asInstanceOf[js.Any], self.asInstanceOf[js.Any], tryLocsList.asInstanceOf[js.Any])).asInstanceOf[Generator[TYield, TReturn, TNext]]
  
  trait CompletionRecord extends StObject {
    
    var arg: js.Any
    
    var `type`: CompletionType
  }
  object CompletionRecord {
    
    @scala.inline
    def apply(arg: js.Any, `type`: CompletionType): CompletionRecord = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionRecord]
    }
    
    @scala.inline
    implicit class CompletionRecordMutableBuilder[Self <: CompletionRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CompletionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.regeneratorRuntime.regeneratorRuntimeStrings.normal
    - typings.regeneratorRuntime.regeneratorRuntimeStrings.`return`
    - typings.regeneratorRuntime.regeneratorRuntimeStrings.`throw`
    - typings.regeneratorRuntime.regeneratorRuntimeStrings.break
    - typings.regeneratorRuntime.regeneratorRuntimeStrings.continue
  */
  trait CompletionType extends StObject
  object CompletionType {
    
    @scala.inline
    def break: typings.regeneratorRuntime.regeneratorRuntimeStrings.break = "break".asInstanceOf[typings.regeneratorRuntime.regeneratorRuntimeStrings.break]
    
    @scala.inline
    def continue: typings.regeneratorRuntime.regeneratorRuntimeStrings.continue = "continue".asInstanceOf[typings.regeneratorRuntime.regeneratorRuntimeStrings.continue]
    
    @scala.inline
    def normal: typings.regeneratorRuntime.regeneratorRuntimeStrings.normal = "normal".asInstanceOf[typings.regeneratorRuntime.regeneratorRuntimeStrings.normal]
    
    @scala.inline
    def `return`: typings.regeneratorRuntime.regeneratorRuntimeStrings.`return` = "return".asInstanceOf[typings.regeneratorRuntime.regeneratorRuntimeStrings.`return`]
    
    @scala.inline
    def `throw`: typings.regeneratorRuntime.regeneratorRuntimeStrings.`throw` = "throw".asInstanceOf[typings.regeneratorRuntime.regeneratorRuntimeStrings.`throw`]
  }
  
  @js.native
  trait Context[TYield, TReturn, TNext]
    extends StObject
       with /* temp */ StringDictionary[js.Any] {
    
    /**
      * @param type The completion type.
      * @param arg The [[Value]] or [[Target]] of the completion record.
      */
    def abrupt(`type`: CompletionType): js.Any = js.native
    def abrupt(`type`: CompletionType, arg: js.Any): js.Any = js.native
    /**
      * @param type The completion type.
      * @param nextLoc The location label to resume iteration at.
      */
    @JSName("abrupt")
    def abrupt_break(`type`: break, nextLoc: Double): js.Any = js.native
    @JSName("abrupt")
    def abrupt_continue(`type`: continue, nextLoc: Double): js.Any = js.native
    /**
      * @param type The completion type.
      * @param rval The return value.
      */
    @JSName("abrupt")
    def abrupt_return(`type`: `return`): js.Any = js.native
    @JSName("abrupt")
    def abrupt_return(`type`: `return`, rval: TReturn): js.Any = js.native
    /**
      * @param type The completion type.
      * @param exception The exception to throw.
      */
    @JSName("abrupt")
    def abrupt_throw(`type`: `throw`): scala.Nothing = js.native
    @JSName("abrupt")
    def abrupt_throw(`type`: `throw`, exception: js.Any): scala.Nothing = js.native
    
    /**
      * The argument passed to the generator method.
      */
    var arg: js.Any = js.native
    
    /**
      * Used to obtain the exception that was thrown in the associated try block.
      *
      * @param tryLoc The label of the beginning of the try block.
      */
    def `catch`(tryLoc: Double): js.Any = js.native
    
    /**
      * @param record The completion record.
      * @param afterLoc The location to resume the generator at, only used by normal completions.
      */
    def complete(record: ReadonlyCompletionRecord): js.Any = js.native
    def complete(record: ReadonlyCompletionRecord, afterLoc: ContextLocation): js.Any = js.native
    
    /**
      * If truthy, then it contains information about the currently `yield*` delegated iterator.
      */
    var delegate: js.UndefOr[DelegatedIterator] = js.native
    
    /**
      * @param iterable The iterable to delegate to.
      * @param resultName The name of the property to assign to on this context.
      * @param nextLoc The label of the location where to resume iteration.
      */
    def delegateYield(iterable: `0`[TYield], resultName: String, nextLoc: ContextLocation): js.Any = js.native
    
    /**
      * Dispatches an exception to `innerFn`
      *
      * @param exception The exception to dispatch.
      */
    def dispatchException(exception: js.Any): Boolean = js.native
    
    /**
      * Whether the generator has finished.
      */
    var done: Boolean = js.native
    
    /**
      * Used to signify the end of a finally block.
      *
      * @param finallyLoc The label of the beginning of the finally block.
      */
    def finish(finallyLoc: Double): js.Any = js.native
    
    /**
      * The generator method.
      */
    var method: next | `return` | `throw` = js.native
    
    /**
      * The label of the next location, is set to `'end'` when the generator needs to close abruptly.
      */
    var next: Double | end = js.native
    
    /**
      * The label of the previous location, needs to be set to `next` at the start of user code.
      */
    var prev: js.Any = js.native
    
    def reset(): Unit = js.native
    def reset(skipTempReset: Boolean): Unit = js.native
    
    /**
      * The return value, set by `abrupt("return")`.
      */
    var rval: TReturn = js.native
    
    /**
      * The value passed to `next()`.
      */
    var sent: TNext = js.native
    
    /**
      * Ends the iteration.
      */
    def stop(): TReturn = js.native
    
    val tryEntries: Array[readonlytryLocrootOmitTry | TryEntry] = js.native
  }
  
  type ContextLocation = Double | end
  
  trait DelegatedIterator extends StObject {
    
    var iterator: Iterator[js.Any, js.Any, js.Any]
  }
  object DelegatedIterator {
    
    @scala.inline
    def apply(iterator: Iterator[js.Any, js.Any, js.Any]): DelegatedIterator = {
      val __obj = js.Dynamic.literal(iterator = iterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelegatedIterator]
    }
    
    @scala.inline
    implicit class DelegatedIteratorMutableBuilder[Self <: DelegatedIterator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIterator(value: Iterator[js.Any, js.Any, js.Any]): Self = StObject.set(x, "iterator", value.asInstanceOf[js.Any])
    }
  }
  
  type InnerFunction[T, TYield, TReturn, TNext] = js.ThisFunction1[/* this */ T, /* context */ Context[TYield, TReturn, TNext], js.Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new <T>(executor : (resolve : (value : T | std.PromiseLike<T>): void, reject : (reason : any | undefined): void): void): std.PromiseLike<T> */ @js.native
  trait ResolvablePromiseConstructorLike extends StObject {
    
    def resolve[T](): js.Thenable[T] = js.native
    def resolve[T](value: T): js.Thenable[T] = js.native
  }
  
  trait TryEntry extends StObject {
    
    val afterLoc: js.UndefOr[ContextLocation] = js.undefined
    
    val catchLoc: js.UndefOr[Double] = js.undefined
    
    var completion: js.UndefOr[CompletionRecord] = js.undefined
    
    val finallyLoc: js.UndefOr[Double] = js.undefined
    
    val tryLoc: Double
  }
  object TryEntry {
    
    @scala.inline
    def apply(tryLoc: Double): TryEntry = {
      val __obj = js.Dynamic.literal(tryLoc = tryLoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[TryEntry]
    }
    
    @scala.inline
    implicit class TryEntryMutableBuilder[Self <: TryEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterLoc(value: ContextLocation): Self = StObject.set(x, "afterLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterLocUndefined: Self = StObject.set(x, "afterLoc", js.undefined)
      
      @scala.inline
      def setCatchLoc(value: Double): Self = StObject.set(x, "catchLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchLocUndefined: Self = StObject.set(x, "catchLoc", js.undefined)
      
      @scala.inline
      def setCompletion(value: CompletionRecord): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      @scala.inline
      def setFinallyLoc(value: Double): Self = StObject.set(x, "finallyLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinallyLocUndefined: Self = StObject.set(x, "finallyLoc", js.undefined)
      
      @scala.inline
      def setTryLoc(value: Double): Self = StObject.set(x, "tryLoc", value.asInstanceOf[js.Any])
    }
  }
  
  type TryLocationsList = js.Array[
    (js.Tuple2[Double, Double]) | (js.Tuple4[Double, js.UndefOr[Double], Double, ContextLocation])
  ]
}
