package typings.streamingIterables

import typings.std.AsyncGenerator
import typings.std.AsyncIterableIterator
import typings.streamingIterables.mod.AnyIterable
import typings.streamingIterables.mod.FlatMapValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0[T, R] extends StObject {
    
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncIterableIterator[R]] = js.native
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncIterableIterator[R] = js.native
  }
  
  @js.native
  trait FnCall[T, R] extends StObject {
    
    def apply(func: js.Function1[/* data */ T, FlatMapValue[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
    def apply(func: js.Function1[/* data */ T, FlatMapValue[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
  }
  
  @js.native
  trait FnCallFuncIterable[T, R] extends StObject {
    
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]]): js.Function1[/* iterable */ AnyIterable[T], AsyncGenerator[R, _, _]] = js.native
    def apply(func: js.Function1[/* data */ T, R | js.Promise[R]], iterable: AnyIterable[T]): AsyncGenerator[R, _, _] = js.native
  }
  
  @js.native
  trait FnCallStartIterable[B, T] extends StObject {
    
    def apply(start: B): js.Function1[/* iterable */ AnyIterable[T], js.Promise[B]] = js.native
    def apply(start: B, iterable: AnyIterable[T]): js.Promise[B] = js.native
  }
}
