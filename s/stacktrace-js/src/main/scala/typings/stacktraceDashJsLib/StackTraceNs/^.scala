package typings
package stacktraceDashJsLib.StackTraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StackTrace")
@js.native
object ^ extends js.Object {
  def deinstrument[TFunc /* <: js.Function */](fn: TFunc): TFunc = js.native
  def fromError(error: stdLib.Error): js.Promise[js.Array[StackFrame]] = js.native
  def fromError(error: stdLib.Error, options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
  def generateArtificially(): js.Promise[js.Array[StackFrame]] = js.native
  def generateArtificially(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
  def get(): js.Promise[js.Array[StackFrame]] = js.native
  def get(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = js.native
  def getSync(): js.Array[StackFrame] = js.native
  def getSync(options: StackTraceOptions): js.Array[StackFrame] = js.native
  def instrument[TFunc /* <: js.Function */](fn: TFunc, callback: js.Function1[/* stackFrames */ js.Array[StackFrame], scala.Unit]): TFunc = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], scala.Unit],
    errback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): TFunc = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[/* stackFrames */ js.Array[StackFrame], scala.Unit],
    errback: js.Function1[/* error */ stdLib.Error, scala.Unit],
    thisArg: js.Any
  ): TFunc = js.native
  def report(stackframes: js.Array[StackFrame], url: java.lang.String): js.Promise[java.lang.String] = js.native
  def report(stackframes: js.Array[StackFrame], url: java.lang.String, message: java.lang.String): js.Promise[java.lang.String] = js.native
  def report(
    stackframes: js.Array[StackFrame],
    url: java.lang.String,
    message: java.lang.String,
    requestOptions: RequestOptions
  ): js.Promise[java.lang.String] = js.native
}

