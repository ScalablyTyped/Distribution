package typings.stacktraceDashJs

import typings.stacktraceDashJs.StackTrace.RequestOptions
import typings.stacktraceDashJs.StackTrace.StackTraceOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stacktrace-js", JSImport.Namespace)
@js.native
object stacktraceDashJsMod extends js.Object {
  @js.native
  class StackFrame protected ()
    extends typings.stacktraceDashJs.StackTrace.StackFrame {
    def this(functionName: String, args: js.Any, fileName: String, lineNumber: Double, columnNumber: Double) = this()
  }
  
  def deinstrument[TFunc /* <: js.Function */](fn: TFunc): TFunc = js.native
  def fromError(error: Error): js.Promise[js.Array[typings.stacktraceDashJs.StackTrace.StackFrame]] = js.native
  def fromError(error: Error, options: StackTraceOptions): js.Promise[js.Array[typings.stacktraceDashJs.StackTrace.StackFrame]] = js.native
  def generateArtificially(): js.Promise[js.Array[typings.stacktraceDashJs.StackTrace.StackFrame]] = js.native
  def generateArtificially(options: StackTraceOptions): js.Promise[js.Array[typings.stacktraceDashJs.StackTrace.StackFrame]] = js.native
  def get(): js.Promise[js.Array[typings.stacktraceDashJs.StackTrace.StackFrame]] = js.native
  def get(options: StackTraceOptions): js.Promise[js.Array[typings.stacktraceDashJs.StackTrace.StackFrame]] = js.native
  def getSync(): js.Array[typings.stacktraceDashJs.StackTrace.StackFrame] = js.native
  def getSync(options: StackTraceOptions): js.Array[typings.stacktraceDashJs.StackTrace.StackFrame] = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[typings.stacktraceDashJs.StackTrace.StackFrame], Unit]
  ): TFunc = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[typings.stacktraceDashJs.StackTrace.StackFrame], Unit],
    errback: js.Function1[/* error */ Error, Unit]
  ): TFunc = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[typings.stacktraceDashJs.StackTrace.StackFrame], Unit],
    errback: js.Function1[/* error */ Error, Unit],
    thisArg: js.Any
  ): TFunc = js.native
  def report(stackframes: js.Array[typings.stacktraceDashJs.StackTrace.StackFrame], url: String): js.Promise[String] = js.native
  def report(
    stackframes: js.Array[typings.stacktraceDashJs.StackTrace.StackFrame],
    url: String,
    message: String
  ): js.Promise[String] = js.native
  def report(
    stackframes: js.Array[typings.stacktraceDashJs.StackTrace.StackFrame],
    url: String,
    message: String,
    requestOptions: RequestOptions
  ): js.Promise[String] = js.native
}

