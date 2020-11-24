package typings.stacktraceJs

import typings.stacktraceJs.StackTrace.StackFrame
import typings.stacktraceJs.StackTrace.StackTraceOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object StackTrace extends js.Object {
    
    def deinstrument[TFunc /* <: js.Function */](fn: TFunc): TFunc = js.native
    
    def fromError(error: Error): js.Promise[js.Array[StackFrame]] = js.native
    def fromError(error: Error, options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
    
    def generateArtificially(): js.Promise[js.Array[StackFrame]] = js.native
    def generateArtificially(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
    
    def get(): js.Promise[js.Array[StackFrame]] = js.native
    def get(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
    
    def getSync(): js.Array[StackFrame] = js.native
    def getSync(options: StackTraceOptions): js.Array[StackFrame] = js.native
    
    def instrument[TFunc /* <: js.Function */](fn: TFunc, callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit]): TFunc = js.native
    def instrument[TFunc /* <: js.Function */](
      fn: TFunc,
      callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
      errback: js.UndefOr[scala.Nothing],
      thisArg: js.Any
    ): TFunc = js.native
    def instrument[TFunc /* <: js.Function */](
      fn: TFunc,
      callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
      errback: js.Function1[/* error */ Error, Unit]
    ): TFunc = js.native
    def instrument[TFunc /* <: js.Function */](
      fn: TFunc,
      callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
      errback: js.Function1[/* error */ Error, Unit],
      thisArg: js.Any
    ): TFunc = js.native
    
    def report(stackframes: js.Array[StackFrame], url: String): js.Promise[_] = js.native
    def report(
      stackframes: js.Array[StackFrame],
      url: String,
      errorMsg: js.UndefOr[scala.Nothing],
      requestOptions: js.Object
    ): js.Promise[_] = js.native
    def report(stackframes: js.Array[StackFrame], url: String, errorMsg: String): js.Promise[_] = js.native
    def report(stackframes: js.Array[StackFrame], url: String, errorMsg: String, requestOptions: js.Object): js.Promise[_] = js.native
  }
}
