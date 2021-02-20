package typings.stacktraceJs

import typings.stacktraceJs.StackTrace.StackFrame
import typings.stacktraceJs.StackTrace.StackTraceOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stacktrace-js", "deinstrument")
  @js.native
  def deinstrument[TFunc /* <: js.Function */](fn: TFunc): TFunc = js.native
  
  @JSImport("stacktrace-js", "fromError")
  @js.native
  def fromError(error: Error): js.Promise[js.Array[StackFrame]] = js.native
  @JSImport("stacktrace-js", "fromError")
  @js.native
  def fromError(error: Error, options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
  
  @JSImport("stacktrace-js", "generateArtificially")
  @js.native
  def generateArtificially(): js.Promise[js.Array[StackFrame]] = js.native
  @JSImport("stacktrace-js", "generateArtificially")
  @js.native
  def generateArtificially(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
  
  @JSImport("stacktrace-js", "get")
  @js.native
  def get(): js.Promise[js.Array[StackFrame]] = js.native
  @JSImport("stacktrace-js", "get")
  @js.native
  def get(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
  
  @JSImport("stacktrace-js", "getSync")
  @js.native
  def getSync(): js.Array[StackFrame] = js.native
  @JSImport("stacktrace-js", "getSync")
  @js.native
  def getSync(options: StackTraceOptions): js.Array[StackFrame] = js.native
  
  @JSImport("stacktrace-js", "instrument")
  @js.native
  def instrument[TFunc /* <: js.Function */](fn: TFunc, callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit]): TFunc = js.native
  @JSImport("stacktrace-js", "instrument")
  @js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
    errback: js.UndefOr[scala.Nothing],
    thisArg: js.Any
  ): TFunc = js.native
  @JSImport("stacktrace-js", "instrument")
  @js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
    errback: js.Function1[/* error */ Error, Unit]
  ): TFunc = js.native
  @JSImport("stacktrace-js", "instrument")
  @js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
    errback: js.Function1[/* error */ Error, Unit],
    thisArg: js.Any
  ): TFunc = js.native
  
  @JSImport("stacktrace-js", "report")
  @js.native
  def report(stackframes: js.Array[StackFrame], url: String): js.Promise[_] = js.native
  @JSImport("stacktrace-js", "report")
  @js.native
  def report(
    stackframes: js.Array[StackFrame],
    url: String,
    errorMsg: js.UndefOr[scala.Nothing],
    requestOptions: js.Object
  ): js.Promise[_] = js.native
  @JSImport("stacktrace-js", "report")
  @js.native
  def report(stackframes: js.Array[StackFrame], url: String, errorMsg: String): js.Promise[_] = js.native
  @JSImport("stacktrace-js", "report")
  @js.native
  def report(stackframes: js.Array[StackFrame], url: String, errorMsg: String, requestOptions: js.Object): js.Promise[_] = js.native
}
