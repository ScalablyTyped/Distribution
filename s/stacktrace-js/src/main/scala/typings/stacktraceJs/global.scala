package typings.stacktraceJs

import typings.stacktraceJs.StackTrace.StackFrame
import typings.stacktraceJs.StackTrace.StackTraceOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object StackTrace {
    
    @JSGlobal("StackTrace")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deinstrument[TFunc /* <: js.Function */](fn: TFunc): TFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("deinstrument")(fn.asInstanceOf[js.Any]).asInstanceOf[TFunc]
    
    @scala.inline
    def fromError(error: Error): js.Promise[js.Array[StackFrame]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromError")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StackFrame]]]
    @scala.inline
    def fromError(error: Error, options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromError")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[StackFrame]]]
    
    @scala.inline
    def generateArtificially(): js.Promise[js.Array[StackFrame]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateArtificially")().asInstanceOf[js.Promise[js.Array[StackFrame]]]
    @scala.inline
    def generateArtificially(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateArtificially")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StackFrame]]]
    
    @scala.inline
    def get(): js.Promise[js.Array[StackFrame]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.Array[StackFrame]]]
    @scala.inline
    def get(options: StackTraceOptions): js.Promise[js.Array[StackFrame]] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[StackFrame]]]
    
    @scala.inline
    def getSync(): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")().asInstanceOf[js.Array[StackFrame]]
    @scala.inline
    def getSync(options: StackTraceOptions): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
    
    @scala.inline
    def instrument[TFunc /* <: js.Function */](fn: TFunc, callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit]): TFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TFunc]
    @scala.inline
    def instrument[TFunc /* <: js.Function */](
      fn: TFunc,
      callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
      errback: js.Function1[/* error */ Error, Unit]
    ): TFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any])).asInstanceOf[TFunc]
    @scala.inline
    def instrument[TFunc /* <: js.Function */](
      fn: TFunc,
      callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
      errback: js.Function1[/* error */ Error, Unit],
      thisArg: js.Any
    ): TFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[TFunc]
    @scala.inline
    def instrument[TFunc /* <: js.Function */](
      fn: TFunc,
      callback: js.Function1[/* stackFrames */ js.Array[StackFrame], Unit],
      errback: Unit,
      thisArg: js.Any
    ): TFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("instrument")(fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], errback.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[TFunc]
    
    @scala.inline
    def report(stackframes: js.Array[StackFrame], url: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(stackframes.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def report(stackframes: js.Array[StackFrame], url: String, errorMsg: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(stackframes.asInstanceOf[js.Any], url.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def report(stackframes: js.Array[StackFrame], url: String, errorMsg: String, requestOptions: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(stackframes.asInstanceOf[js.Any], url.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def report(stackframes: js.Array[StackFrame], url: String, errorMsg: Unit, requestOptions: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(stackframes.asInstanceOf[js.Any], url.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  }
}
