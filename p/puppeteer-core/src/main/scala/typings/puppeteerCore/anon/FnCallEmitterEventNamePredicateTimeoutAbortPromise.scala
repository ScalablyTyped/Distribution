package typings.puppeteerCore.anon

import typings.puppeteerCore.eventEmitterMod.CommonEventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallEmitterEventNamePredicateTimeoutAbortPromise extends StObject {
  
  def apply[T /* <: js.Any */](
    emitter: CommonEventEmitter,
    eventName: String,
    predicate: js.Function1[/* event */ T, Boolean],
    timeout: Double,
    abortPromise: js.Promise[Error]
  ): js.Promise[T] = js.native
  def apply[T /* <: js.Any */](
    emitter: CommonEventEmitter,
    eventName: js.Symbol,
    predicate: js.Function1[/* event */ T, Boolean],
    timeout: Double,
    abortPromise: js.Promise[Error]
  ): js.Promise[T] = js.native
}
