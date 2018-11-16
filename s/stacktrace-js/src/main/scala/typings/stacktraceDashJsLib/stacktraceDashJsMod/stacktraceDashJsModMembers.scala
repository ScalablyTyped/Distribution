package typings
package stacktraceDashJsLib.stacktraceDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stacktrace-js", JSImport.Namespace)
@js.native
object stacktraceDashJsModMembers extends js.Object {
  def deinstrument[TFunc /* <: js.Function */](fn: TFunc): TFunc = js.native
  def fromError(error: stdLib.Error): stdLib.Promise[js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame]] = js.native
  def fromError(error: stdLib.Error, options: stacktraceDashJsLib.StackTraceNs.StackTraceOptions): stdLib.Promise[js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame]] = js.native
  def generateArtificially(): stdLib.Promise[js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame]] = js.native
  def generateArtificially(options: stacktraceDashJsLib.StackTraceNs.StackTraceOptions): stdLib.Promise[js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame]] = js.native
  def get(): stdLib.Promise[js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame]] = js.native
  def get(options: stacktraceDashJsLib.StackTraceNs.StackTraceOptions): stdLib.Promise[js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame]] = js.native
  def getSync(): js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame] = js.native
  def getSync(options: stacktraceDashJsLib.StackTraceNs.StackTraceOptions): js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame] = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[
      /* stackFrames */ js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame], 
      scala.Unit
    ]
  ): TFunc = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[
      /* stackFrames */ js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame], 
      scala.Unit
    ],
    errback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): TFunc = js.native
  def instrument[TFunc /* <: js.Function */](
    fn: TFunc,
    callback: js.Function1[
      /* stackFrames */ js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame], 
      scala.Unit
    ],
    errback: js.Function1[/* error */ stdLib.Error, scala.Unit],
    thisArg: js.Any
  ): TFunc = js.native
  def report(stackframes: js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame], url: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def report(
    stackframes: js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame],
    url: java.lang.String,
    message: java.lang.String
  ): stdLib.Promise[java.lang.String] = js.native
  def report(
    stackframes: js.Array[stacktraceDashJsLib.StackTraceNs.StackFrame],
    url: java.lang.String,
    message: java.lang.String,
    requestOptions: stacktraceDashJsLib.StackTraceNs.RequestOptions
  ): stdLib.Promise[java.lang.String] = js.native
}

