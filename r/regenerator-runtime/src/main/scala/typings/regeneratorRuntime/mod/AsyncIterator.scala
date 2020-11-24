package typings.regeneratorRuntime.mod

import typings.std.AsyncGenerator
import typings.std.Generator
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regenerator-runtime", "AsyncIterator")
@js.native
class AsyncIterator[TYield, TReturn, TNext] protected () extends AsyncGenerator[TYield, TReturn, TNext] {
  def this(
    generator: Generator[
        TYield | js.Thenable[TYield] | awrap[_], 
        TReturn | js.Thenable[TReturn] | awrap[_], 
        _
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
